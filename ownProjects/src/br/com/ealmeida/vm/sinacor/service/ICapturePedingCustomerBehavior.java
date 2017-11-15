package br.com.ealmeida.vm.sinacor.service;

import java.sql.SQLException;
import java.util.List;

import br.com.ealmeida.vm.sinacor.infr.vo.BasicProcessData;

public interface ICapturePedingCustomerBehavior {
	
	List<BasicProcessData> capturePendingCustomersToProcess(List<String>  cdBackofficerAssignment) throws SQLException;

}