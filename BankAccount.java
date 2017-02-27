// The class for the bank account information //

package Monopoly;

public class BankAccount extends Variables{
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
	
	// A function which eliminates a user if their balance is 0 or less 
	public void LoseGame(){
		switch(UserChooser)
		{
		case 1:if(balanceA.getBalance()<=0){lblA.setVisible(false);	UserChooser++;}break;
		case 2:if(balanceB.getBalance()<=0){lblB.setVisible(false);	UserChooser++;}break;
		case 3:if(balanceC.getBalance()<=0){lblC.setVisible(false);	UserChooser++;}break;
		case 4:if(balanceC.getBalance()<=0){lblC.setVisible(false);	UserChooser++;}break;
		case 5:if(balanceC.getBalance()<=0){lblC.setVisible(false);	UserChooser++;}break;
		case 6:if(balanceC.getBalance()<=0){lblC.setVisible(false);	UserChooser++;}break;
		} 
	}
}