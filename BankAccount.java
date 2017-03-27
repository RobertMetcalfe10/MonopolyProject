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
}