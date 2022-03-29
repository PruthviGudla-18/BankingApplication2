package Ui;

import java.util.Scanner;

import BankAccount.BankAccount;
import Exception.InsufficientBalanceException;
import Transaction.TransactionDetails;

public class BankMain {

	public static void main(String[] args) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		
		BankAccount b=new BankAccount(180,"Pruthvi",500);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1: Check Balance");
			System.out.println("2: Deposit");
			System.out.println("3: Withdraw");
			System.out.println("4: Mini Statement");
			System.out.println("5: Exit");
			
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				
			case 1:
				System.out.println("Balance= "+b.getActBalance());
				System.out.println();
				break;
				
			case 2:
				System.out.println("enter amount to be deposited:");
				int deposit=sc.nextInt();
				b.deposit(deposit);
				System.out.println();
				break;
				
			case 3:
				System.out.println("enter the amount to be withdrawn:");
				int withdraw=sc.nextInt();
				b.withdraw(withdraw);
				System.out.println();
				break;
				
			case 4:
				System.out.println("*********************Mini Statement*****************");
				System.out.println();
				TransactionDetails.showMiniStatement(b.getAccNumber());
				System.out.println("*****************************************************");
			}
			
			
		}
	}

}
