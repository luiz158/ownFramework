package br.com.ealmeida.vm.sinacor.infr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ealmeida.vm.sinacor.infr.dao.IGetCdBackofficerAssignmentToProcessBehavior;

public class GetterCdBackOfficerAssignment implements IGetCdBackofficerAssignmentToProcessBehavior{

	private final Connection POSTGRESQL_CONNECTION;
	
	public GetterCdBackOfficerAssignment(Connection postgresSQLConnection) {
		this.POSTGRESQL_CONNECTION = postgresSQLConnection;
	}
	
	@Override
	public List<String> captureCdBackofficerAssignmentToProcess(String applicationName) throws SQLException{
		List<String> cdBackofficerAssignments = new ArrayList<>();
 
		final String SQL = "Select cd_backofficer_assignment FROM tb_vm_params "
				+ " WHERE is_active = true";
		
		try(PreparedStatement ps = POSTGRESQL_CONNECTION.prepareStatement(SQL)){
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				cdBackofficerAssignments.add(rs.getString("cd_backofficer_assignment"));
			}
		}
		return cdBackofficerAssignments;
	}

}
