package Transaction;

public class Transaction {

	private int tranNUmber;
	private int actNumber;
	private  int tranAmount;
	private String tranType;
	private int balanceAfterThisTransaction;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int tranNUmber, int actNumber, int tranAmount, String tranType,
			int balanceAfterThisTransaction) {
		super();
		this.tranNUmber = tranNUmber;
		this.actNumber = actNumber;
		this.tranAmount = tranAmount;
		this.tranType = tranType;
		this.balanceAfterThisTransaction = balanceAfterThisTransaction;
	}
	public int getTranNUmber() {
		return tranNUmber;
	}
	public void setTranNUmber(int tranNUmber) {
		this.tranNUmber = tranNUmber;
	}
	public int getActNumber() {
		return actNumber;
	}
	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}
	public int getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(int tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public int getBalanceAfterThisTransaction() {
		return balanceAfterThisTransaction;
	}
	public void setBalanceAfterThisTransaction(int balanceAfterThisTransaction) {
		this.balanceAfterThisTransaction = balanceAfterThisTransaction;
	}
	
	
	
}
