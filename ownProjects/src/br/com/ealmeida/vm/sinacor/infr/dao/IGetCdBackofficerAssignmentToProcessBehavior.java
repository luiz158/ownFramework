package br.com.ealmeida.vm.sinacor.infr.dao;

import java.sql.SQLException;
import java.util.List;

public interface IGetCdBackofficerAssignmentToProcessBehavior {

	List<String> captureCdBackofficerAssignmentToProcess(String applicationName) throws SQLException;
}
