package Monopoly;

import java.util.ArrayList;

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
	
	Property()
	{
		
	}
	Property(int ID, String Name,int Price,int Rent)
	{
		propertyID=ID;
		propertyName=Name;
		propertyPrice=Price;
		propertyRent=Rent;
	}
	
	
	
	
	
	void propertyDisplayAll (ArrayList<Property> propertiesUser){
		for(int i = 0; i < propertiesUserA.size(); i++)
		{
			 propertyDets+="propertyID "+propertiesUser.get(i).propertyID+"\n";
			 propertyDets+="propertyName "+propertiesUser.get(i).propertyName+"\n";
			 propertyDets+="propertyPrice "+propertiesUser.get(i).propertyPrice+"\n";
			 PropertyPane.setText(command);
		}
			
		
	}
	
	void propertyDisplayCurrent(ArrayList<Property> propertiesUserA)
	{
		
	}
	
	void buyProperty(int rand){
		propertyNo++;
		switch(UserChooser)
		{
		case 1: balanceA.withdraw(propertyPrice);//propertiesUserA.add(properties.get(0));
		break;
		case 2: balanceB.withdraw(propertyPrice);//propertiesUserB.add(properties.get(0));
		break;
		case 3: balanceC.withdraw(propertyPrice);//propertiesUserC.add(properties.get(0));
		break;
		case 4: balanceX.withdraw(propertyPrice);//propertiesUserX.add(properties.get(0));
		break;
		case 5: balanceY.withdraw(propertyPrice);//propertiesUserY.add(properties.get(0));
		break;
		case 6: balanceZ.withdraw(propertyPrice);//propertiesUserZ.add(properties.get(0));
		break;
		}
		
		
	}
	
	void payRent(){
//		BankAccount WD=new BankAccount();
//		WD.withdraw(propertyRent);
//		
//		
//		
//		
//		WD.deposit(propertyRent);
	}
	
	void buildHouse(){
		propertyHouseNo++;
//		BankAccount WD=new BankAccount();
//		WD.withdraw(housePrice);
	}
	
	
}