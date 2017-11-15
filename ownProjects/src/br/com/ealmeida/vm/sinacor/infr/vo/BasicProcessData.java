package br.com.ealmeida.vm.sinacor.infr.vo;

public class BasicProcessData {

	private final Integer ID_CONTRACT;
	private final Integer ID_PROCESS;
	private final Integer SEQ_CUSTOMER;
	private final Integer ID_CUSTOMER;
	private final String CD_BACKOFFICER_ASSIGNMENT;
	private final String CD_PROCESS_TYPE;
	private final String CD_PROCESS_ORIGIN;

	public BasicProcessData(Integer iD_CONTRACT, Integer iD_PROCESS, Integer sEQ_CUSTOMER, Integer iD_CUSTOMER,
			String cD_BACKOFFICER_ASSIGNMENT, String cD_PROCESS_TYPE, String cD_PROCESS_ORIGIN) {
		ID_CONTRACT = iD_CONTRACT;
		ID_PROCESS = iD_PROCESS;
		SEQ_CUSTOMER = sEQ_CUSTOMER;
		ID_CUSTOMER = iD_CUSTOMER;
		CD_BACKOFFICER_ASSIGNMENT = cD_BACKOFFICER_ASSIGNMENT;
		CD_PROCESS_TYPE = cD_PROCESS_TYPE;
		CD_PROCESS_ORIGIN = cD_PROCESS_ORIGIN;
	}

	public Integer getID_CONTRACT() {
		return ID_CONTRACT;
	}

	public Integer getID_PROCESS() {
		return ID_PROCESS;
	}

	public Integer getSEQ_CUSTOMER() {
		return SEQ_CUSTOMER;
	}

	public Integer getID_CUSTOMER() {
		return ID_CUSTOMER;
	}

	public String getCD_BACKOFFICER_ASSIGNMENT() {
		return CD_BACKOFFICER_ASSIGNMENT;
	}

	public String getCD_PROCESS_TYPE() {
		return CD_PROCESS_TYPE;
	}

	public String getCD_PROCESS_ORIGIN() {
		return CD_PROCESS_ORIGIN;
	}

	@Override
	public String toString() {
		return "BasicProcessData [ID_CONTRACT=" + ID_CONTRACT + ", ID_PROCESS=" + ID_PROCESS + ", SEQ_CUSTOMER="
				+ SEQ_CUSTOMER + ", ID_CUSTOMER=" + ID_CUSTOMER + ", CD_BACKOFFICER_ASSIGNMENT="
				+ CD_BACKOFFICER_ASSIGNMENT + ", CD_PROCESS_TYPE=" + CD_PROCESS_TYPE + ", CD_PROCESS_ORIGIN="
				+ CD_PROCESS_ORIGIN + "]";
	}
}
