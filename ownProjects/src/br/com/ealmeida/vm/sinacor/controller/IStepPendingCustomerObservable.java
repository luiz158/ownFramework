package br.com.ealmeida.vm.sinacor.controller;

import br.com.ealmeida.vm.sinacor.service.IStepCustomerProcessConsumer;

public interface IStepPendingCustomerObservable {

	void add(IStepCustomerProcessConsumer processingPendingCustomerApplication);
	void remove(IStepCustomerProcessConsumer processingPendingCustomerApplication);
	void notifyPendingCustomer();
}
