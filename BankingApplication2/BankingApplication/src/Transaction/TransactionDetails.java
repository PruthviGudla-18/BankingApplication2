package Transaction;

import java.util.LinkedList;
import java.util.List;

public class TransactionDetails {
	
	public static List<Transaction> transactionList=new LinkedList<Transaction>();
	
	public static void addTransaction(Transaction t) {
		
		transactionList.add(t);
		
	}
	
	public static void showMiniStatement(int actNumber)
	{
		System.out.println("Mini Statement for account number : "+actNumber);
		System.out.println();
		
		for(Transaction t:transactionList)
		{
			if(t.getActNumber()==actNumber)
			{
				System.out.println("Transaction Number : "+t.getTranNUmber());
				System.out.println("Transaction Type :"+t.getTranType());
				System.out.println("Transaction Amount : "+t.getTranAmount());
				System.out.println("Balance After Transaction : "+t.getBalanceAfterThisTransaction());
				System.out.println("         -------        ");
			}
		}
	}
	

}
