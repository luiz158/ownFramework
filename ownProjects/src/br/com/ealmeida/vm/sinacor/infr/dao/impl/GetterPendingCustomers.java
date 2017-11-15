package br.com.ealmeida.vm.sinacor.infr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.ealmeida.vm.sinacor.infr.dao.IGetPendingCustomerBehavior;
import br.com.ealmeida.vm.sinacor.infr.vo.BasicProcessData;

public class GetterPendingCustomers implements IGetPendingCustomerBehavior{

	private final Connection POSTGRESQL_CONNECTION;
	
	public GetterPendingCustomers(Connection postgresSQLConnection) {
		this.POSTGRESQL_CONNECTION = postgresSQLConnection;
	}
	@SuppressWarnings("unused")
	@Override
	public Map<String, List<BasicProcessData>> getPendingCustomer() throws SQLException {
		Map<String, List<BasicProcessData>> pendingCustomersWithLabel = new HashMap<>();
		final String SQL = "SELECT * FROM tb_core_process INNER JOIN tb_core_process_checklist";
		try(PreparedStatement ps = POSTGRESQL_CONNECTION.prepareStatement(SQL)){
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				BasicProcessData pendCustomer = new BasicProcessData(
						rs.getInt("id_contract"), 
						rs.getInt("id_process"),
						rs.getInt("seq_customer"),
						rs.getInt("id_customer"),
						rs.getString("cd_backofficer_assignment"),
						rs.getString("cd_process_type"),
						rs.getString("cd_process_origin"));
				
				List<BasicProcessData> pendingCustomers = pendingCustomersWithLabel.get(pendCustomer.getCD_BACKOFFICER_ASSIGNMENT());
				if(pendCustomer == null) {
					pendingCustomers = new ArrayList<>();
					pendingCustomers.add(pendCustomer);
					pendingCustomersWithLabel.put(pendCustomer.getCD_BACKOFFICER_ASSIGNMENT(), pendingCustomers);
				}else {
					pendingCustomers.add(pendCustomer);
				}
			}
		}
		return pendingCustomersWithLabel;
	}

}
