package BankAccount;

import java.util.Random;

import Exception.InsufficientBalanceException;
import Transaction.Transaction;
import Transaction.TransactionDetails;

public class BankAccount {
	
	private int actNumber;
	private String customerName;
	private int actBalance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accNumber, String customerName, int actBalance) {
		super();
		this.actNumber = accNumber;
		this.customerName = customerName;
		this.actBalance = actBalance;
	}
	public int getAccNumber() {
		return actNumber;
	}
	public void setAccNumber(int accNumber) {
		this.actNumber = accNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getActBalance() {
		return actBalance;
	}
	public void setActBalance(int actBalance) {
		this.actBalance = actBalance;
	}
	
	public void deposit(int depositAmount)
	{
		actBalance+=depositAmount;
		Random r=new Random();
		
		//after performing deposit we need to store the deposit details in
		//an object of Transaction class
		//and then store that object in some collection such as linked list for 
		//further reference
		
		Transaction t=new Transaction(r.nextInt(),actNumber,depositAmount,"Deposit",actBalance);
		
		TransactionDetails.addTransaction(t);
		System.out.println("Deposite completed and Transaction stored...");
	}
	
	public void withdraw(int withdrawAmount) throws InsufficientBalanceException
	{
		if(withdrawAmount>actBalance)
		{
			try {
				throw new InsufficientBalanceException();
			}catch(InsufficientBalanceException e) {
				e.printStackTrace();
			}
		}
		actBalance-=withdrawAmount;
		Random r=new Random();

		
		//after performing deposit we need to store the deposit details in
		//an object of Transaction class
		//and then store that object in some collection such as linked list for 
		//further reference
		
		Transaction t=new Transaction(r.nextInt(),actNumber,withdrawAmount,"Withdraw",actBalance);
		
		TransactionDetails.addTransaction(t);
		System.out.println("Withdraw completed and Transaction stored..");
	}
	
	
	

}
