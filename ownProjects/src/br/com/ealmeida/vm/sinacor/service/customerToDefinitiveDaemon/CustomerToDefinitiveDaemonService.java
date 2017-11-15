package br.com.ealmeida.vm.sinacor.service.customerToDefinitiveDaemon;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ealmeida.vm.sinacor.controller.WatchingCustomerPending;
import br.com.ealmeida.vm.sinacor.infr.dao.IGetCdBackofficerAssignmentToProcessBehavior;
import br.com.ealmeida.vm.sinacor.infr.dao.impl.GetterCdBackOfficerAssignment;
import br.com.ealmeida.vm.sinacor.infr.vo.BasicProcessData;
import br.com.ealmeida.vm.sinacor.service.ICapturePedingCustomerBehavior;
import br.com.ealmeida.vm.sinacor.service.IStepCustomerProcessConsumer;

public class CustomerToDefinitiveDaemonService implements IStepCustomerProcessConsumer, ICapturePedingCustomerBehavior{

	private final WatchingCustomerPending PENDING_CUSTOMERS_WATCHER;
	private List<BasicProcessData> pendingCustomers;
	private final Connection CONNECTION;
	public CustomerToDefinitiveDaemonService(WatchingCustomerPending pendingCustomersWatcher,
			Connection connection) {
		this.PENDING_CUSTOMERS_WATCHER = pendingCustomersWatcher;
		this.CONNECTION = connection;
	}

	@Override
	public List<BasicProcessData> capturePendingCustomersToProcess(List<String> cdBackofficerAssignment) throws SQLException{
		IGetCdBackofficerAssignmentToProcessBehavior cdbackassignDAO = new GetterCdBackOfficerAssignment(CONNECTION);
		List<String> cdBackOfficers =  cdbackassignDAO.captureCdBackofficerAssignmentToProcess("CUSTOMER_TO_DEFINITIVE_DAEMON");
	}

	@Override
	public void hasPendingCustomer() {
		capturePendingCustomersToProcess(new ArrayList<>());
	}

}
