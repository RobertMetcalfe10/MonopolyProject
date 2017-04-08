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
	
	public void tax()
	{
		switch(UserChooser)
		{
		case 1: if(MovesA==4)
		{
			balanceA.withdraw(200);
			command="200 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
			txtpnInfo.setText(command);
		}
		else if(MovesA==38)
		{
			balanceA.withdraw(100);
			command="100 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
			txtpnInfo.setText(command);
		}
		break;
		case 2: if(MovesB==4)
		{
			balanceB.withdraw(200);
			command="200 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		else if(MovesB==38)
		{
			balanceB.withdraw(100);
			command="100 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		break;
		case 3: if(MovesC==4)
		{
			balanceC.withdraw(200);
			command="200 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		else if(MovesC==38)
		{
			balanceC.withdraw(100);
			command="100 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		break;
		case 4: if(MovesX==4)
		{
			balanceX.withdraw(200);
			command="200 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		else if(MovesX==38)
		{
			balanceX.withdraw(100);
			command="100 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		break;
		case 5: if(MovesY==4)
		{
			balanceY.withdraw(200);
			command="200 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		else if(MovesY==38)
		{
			balanceY.withdraw(100);
			command="100 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		break;
		case 6: if(MovesZ==4)
		{
			balanceZ.withdraw(200);
			command="200 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		else if(MovesZ==38)
		{
			balanceZ.withdraw(100);
			command="100 has been withdrawn from your balance\n\n"+command;
			command="User "+ UserChooser+", "+ command;
	        txtpnInfo.setText(command);
		}
		break;
		}
	}
	
}