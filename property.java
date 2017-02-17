package Monopoly;

public class Property extends BankAccount{
	
	protected static int propertyID;
	protected static String propertyName;
	protected static int propertyPrice;
	protected static int propertyRent;
	protected static int housePrice;
	protected static int mortgageValue;
	protected static String propertyColour;
	protected static boolean propertyOwned=true;
	protected static int propertyHouseNo;
	
	String propertyDisplay (){
		
		if (propertyOwned == false){
			propertyDets += "You don't own any property";
		}else {
			propertyDets += 	"Property ID - " + propertyID + "\n" +
								"Property Name - " + propertyName + "\n" +
								"Property Colour - " + propertyColour + "\n" +
								"Property Price - " + propertyPrice + "\n";	
		}
		return propertyDets;
	}
	void buyProperty(){
		propertyNo++;
		BankAccount WD=new BankAccount();
		WD.withdraw(propertyPrice);
	}
	
	void payRent(){
		BankAccount WD=new BankAccount();
		WD.withdraw(propertyRent);
		
		//Change user
		WD.deposit(propertyRent);
	}
	
	void buildHouse(){
		propertyHouseNo++;
		BankAccount WD=new BankAccount();
		WD.withdraw(housePrice);
	}
	
	
}
