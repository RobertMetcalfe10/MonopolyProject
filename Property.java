package Monopoly;

import java.util.ArrayList;

public class Property extends BankAccount{
	
	protected int propertyID;
	protected String propertyName;
	protected int propertyPrice;
	protected int propertyRent1;
	protected int propertyRent2;
	protected int propertyRent3;
	protected int propertyRent4;
	protected int propertyRent5;
	protected int propertyRent6;
	protected int housePrice;
	protected int mortgageValue;
	protected String propertyColour;
	protected boolean propertyOwned=false;
	protected int propertyHouseNo;
	
	Property()
	{
		
	}
	Property(int ID, String Name,int Price,int Rent1,int Rent2,int Rent3,int Rent4,int Rent5,int Rent6)
	{
		propertyID=ID;
		propertyName=Name;
		propertyPrice=Price;
		propertyRent1=Rent1;
		propertyRent2=Rent2;
		propertyRent3=Rent3;
		propertyRent4=Rent4;
		propertyRent5=Rent5;
		propertyRent6=Rent6;
		
	}
	
	
	
	
	
	void propertyDisplayAll (ArrayList<Property> propertiesUser){
		int r=propertiesUser.size();
		System.out.println(r);
		for(int i = 0; i < propertiesUser.size(); i++)
		{
			propertyDets+="propertyID "+propertiesUser.get(i).propertyID+"\n";
			propertyDets+="propertyName "+propertiesUser.get(i).propertyName+"\n";
			propertyDets+="propertyPrice "+propertiesUser.get(i).propertyPrice+"\n\n";
			PropertyPane.setText(propertyDets);
		}
		while(r!=0)
		{
			System.out.println(propertiesUser.toString());
			r--;
		}
			
		
	}
	
	void propertyDisplayCurrent(ArrayList<Property> propertiesUserA)
	{
		
	}
	
	void buyProperty(int rand){
		if(propertyOwned==false)
		{
			System.out.println(rand);
		propertyNo++;
		switch(UserChooser)
		{
		case 1:balanceA.withdraw(propertyPrice); properties.get(rand).propertyOwned=true; command=("You have just bought "+properties.get(rand).propertyName+"\n\n")+command;
		txtpnInfo.setText(command);
		propertiesUserA.add(properties.get(rand));

		break;
		case 2: balanceB.withdraw(propertyPrice); this.propertyOwned=true;propertiesUserB.add(properties.get(rand));
		break;
		case 3: balanceC.withdraw(propertyPrice);
		break;
		case 4: balanceX.withdraw(propertyPrice);
		break;
		case 5: balanceY.withdraw(propertyPrice);
		break;
		case 6: balanceZ.withdraw(propertyPrice);
		break;
		}
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
	
	@Override
	public String toString()
	{
		return this.propertyName;
	}
	
	
}