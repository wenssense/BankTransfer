package net.springmvc.entity;

public class Transfer {
	
	
	private int loggedUserId;
	
	private String loggedUser;
	
	private int beneficiaryId;
	
	private String benefic;
	
	private int choosedAmount;
	
	private int available;

	public int getLoggedUserId() {
		return loggedUserId;
	}

	public void setLoggedUserId(int loggedUserId) {
		this.loggedUserId = loggedUserId;
	}

	public String getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(String loggedUser) {
		this.loggedUser = loggedUser;
	}

	public int getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getBenefic() {
		return benefic;
	}

	public void setBenefic(String benefic) {
		this.benefic = benefic;
	}

	public int getChoosedAmount() {
		return choosedAmount;
	}

	public void setChoosedAmount(int choosedAmount) {
		this.choosedAmount = choosedAmount;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

}
