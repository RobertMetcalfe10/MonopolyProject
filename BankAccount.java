package Monopoly;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BankAccount extends Card{
	protected int balance=0;
	
	
	/**
	   Deposits money into the bank account.
	   @param amount the amount to deposit
	*/
	public void deposit(int amount) {  
	   balance+= amount;
	}

	/**
	   Withdraws money from the bank account.
	   @param amount the amount to withdraw
	*/ 
	public void withdraw(int amount) {  
	   balance-= amount;
	}

	/**
	   Gets the current balance of the bank account.
	   @return the current balance
	*/
	public int getBalance(){  
	   return balance; 
	}

	/**
	   Constructs a bank account with a zero balance.
	*/
	public BankAccount(){
		balance=0;
	}

	/**
	   Constructs a bank account with a given balance.
	   @param initialBalance the initial balance
	*/ 
	public BankAccount(int initialBalance){  
	   balance = initialBalance;
	}
	
	public void LoseGame(){
		switch(UserChooser)
		{
		case 1:if(balanceA.getBalance()<=0){lblA.setVisible(false); UserLoser.remove(0);a = true;}break;
		case 2:if(balanceB.getBalance()<=0){lblB.setVisible(false);	UserLoser.remove(1);b = true;}break;
		case 3:if(balanceC.getBalance()<=0){lblC.setVisible(false);	UserLoser.remove(2);c = true;}break;
		case 4:if(balanceC.getBalance()<=0){lblC.setVisible(false);	UserLoser.remove(3);d = true;}break;
		case 5:if(balanceC.getBalance()<=0){lblC.setVisible(false);	UserLoser.remove(4);e = true;}break;
		case 6:if(balanceC.getBalance()<=0){lblC.setVisible(false);	UserLoser.remove(5);f = true;}break;
		} 
		
		if(a)
		{
			UserChooser = 2;
			
		}
		if(b)
		{
			UserChooser = 3;
			
		}
		if(c)
		{
			UserChooser = 4;
			
		}
		if(d)
		{
			UserChooser = 5;
			
		}
		if(e)
		{
			UserChooser = 6;
			
		}
		if(f)
		{
			UserChooser = 1;
			
		}
		
		
		
		UserChooser++;
	}
}
