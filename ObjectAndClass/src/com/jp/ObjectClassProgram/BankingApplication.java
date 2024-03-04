package com.jp.ObjectClassProgram;

public class BankingApplication {
	int accountNumber ;
	String accountHolder ;
	int balance ;
	public void deposite ()
	{
		int addMoney = 500 ;
		System.out.println( "Deposite Money : " + addMoney);
	}
	public void withdraw()
	{
		int removeMoney = 300 ;
		System.out.println("Withdraw Money : " + removeMoney);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingApplication ba = new BankingApplication();
		ba.accountNumber = 456789;
		ba.accountHolder = "Sonali" ;
		ba.balance  = 30000;
		System.out.println("Account Number : " + ba.accountNumber);
		System.out.println("Account Holder Name : " + ba.accountHolder);
		System.out.println("Available Money : " + ba.balance);
		ba.deposite();
		ba.withdraw();

	}

}
