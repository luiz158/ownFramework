package br.com.ealmeida.vm.sinacor.controller;

import java.util.List;
import java.util.Map;

import br.com.ealmeida.vm.sinacor.infr.vo.BasicProcessData;
import br.com.ealmeida.vm.sinacor.service.IStepCustomerProcessConsumer;

public class WatchingCustomerPending implements IStepPendingCustomerObservable{

	private List<IStepCustomerProcessConsumer> pendingCustomersConsumers;
	private Map<String, List<BasicProcessData>> pendingCustomers;

	@Override
	public void add(IStepCustomerProcessConsumer processingPendingCustomerApplication) {
		this.pendingCustomersConsumers.add(processingPendingCustomerApplication);
	}

	@Override
	public void remove(IStepCustomerProcessConsumer processingPendingCustomerApplication) {
		this.pendingCustomersConsumers.remove(processingPendingCustomerApplication);
	}

	@Override
	public void notifyPendingCustomer() {
		pendingCustomersConsumers
		.stream()
		.forEach(pendingCustomer -> pendingCustomer.hasPendingCustomer());
	}
	
	public void getPendingCustomers() {
		
	}
}