<<<<<<< HEAD
=======
package Monopoly;
>>>>>>> origin/master
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
<<<<<<< HEAD
	
	public void LoseGame(){
		
		switch(UserChooser)
		{
		case 1:if(balanceA.getBalance()<=0){lblA.setVisible(false);UserChooser=Integer.parseInt(NumOfUsersStringSelection().nextToken());NumOfUsers--;}break;
		case 2:if(balanceB.getBalance()<=0){lblB.setVisible(false);UserChooser=Integer.parseInt(NumOfUsersStringSelection().nextToken());NumOfUsers--;}break;
		case 3:if(balanceC.getBalance()<=0){lblC.setVisible(false);UserChooser=Integer.parseInt(NumOfUsersStringSelection().nextToken());NumOfUsers--;}break;
		case 4:if(balanceC.getBalance()<=0){lblC.setVisible(false);	LoseUser.remove(3);NumOfUsers--;}break;
		case 5:if(balanceC.getBalance()<=0){lblC.setVisible(false);	LoseUser.remove(4);NumOfUsers--;}break;
		case 6:if(balanceC.getBalance()<=0){lblC.setVisible(false);	LoseUser.remove(5);NumOfUsers--;}break;
		}
		UserChooser=Integer.parseInt(NumOfUsersStringSelection().nextToken());
		System.out.println(UserChooser);
		if(!NumOfUsersStringSelection().hasMoreTokens())
		{
			NumOfUsersStringSelection();
		}
		//UserChooser++;
	}
}
=======
}
>>>>>>> origin/master
