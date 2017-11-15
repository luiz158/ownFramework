package br.com.ealmeida.vm.sinacor.infr.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import br.com.ealmeida.vm.sinacor.infr.vo.BasicProcessData;

public interface IGetPendingCustomerBehavior {

	Map<String, List<BasicProcessData>> getPendingCustomer() throws SQLException;
}
