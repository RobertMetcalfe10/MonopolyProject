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
	protected int propertyUser=0;
	protected boolean propertyOwned=true;
	protected int housePrice;
	protected int mortgageValue;
	protected String propertyColour;
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
	
	void propertyDisplayCurrent(int rand)
	{
			
		propertyDets+="propertyID "+properties.get(rand).propertyID+"\n";
		propertyDets+="propertyName "+properties.get(rand).propertyName+"\n";
		propertyDets+="propertyPrice "+properties.get(rand).propertyPrice+"\n\n";
		propertyDets+="propertyUser"+properties.get(rand).propertyUser+"\n";
		command="\n\n"+propertyDets+command;
		propertyDets="";
		
	}
	
	void buyProperty(int rand){
		if(properties.get(rand).propertyOwned=false)
		{
		propertyNo++;
		switch(UserChooser)
		{
		case 1:balanceA.withdraw(properties.get(rand).propertyPrice); properties.get(rand).propertyOwned=true; command=("You have just bought "+properties.get(rand).propertyName+"\n\n")+command;
		properties.get(rand).propertyUser=1;
		txtpnInfo.setText(command);
		propertiesUserA.add(properties.get(rand));

		break;
		case 2: balanceB.withdraw(propertyPrice); properties.get(rand).propertyOwned=true;command=("You have just bought "+properties.get(rand).propertyName+"\n\n")+command;
		txtpnInfo.setText(command);
		propertiesUserB.add(properties.get(rand));
		
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
		System.out.println(properties.get(rand).propertyUser);
		
		}
		else
		{
			command="Property already owned"+command;
			txtpnInfo.setText(command);
		}
		
	}
	
	void payRent(){
		if(properties.get(MovesA).propertyOwned=true)
		{
			int positionToRent=0;
			switch(UserChooser)
			{
			case 1:balanceA.withdraw(properties.get(MovesA).propertyPrice);positionToRent=MovesA;break;
			case 2:balanceB.withdraw(properties.get(MovesB).propertyPrice);positionToRent=MovesB;break;
			case 3:balanceC.withdraw(properties.get(MovesC).propertyPrice);positionToRent=MovesC;break;
			case 4:balanceX.withdraw(properties.get(MovesX).propertyPrice);positionToRent=MovesX;break;
			case 5:balanceY.withdraw(properties.get(MovesY).propertyPrice);positionToRent=MovesY;break;
			case 6:balanceZ.withdraw(properties.get(MovesZ).propertyPrice);positionToRent=MovesZ;break;
			}
			
			switch(propertyUser)
			{
			case 1:balanceA.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameA+"\n\n"+command;break;
			case 2:balanceB.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameB+"\n\n"+command;break;
			case 3:balanceC.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameC+"\n\n"+command;break;
			case 4:balanceX.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameX+"\n\n"+command;break;
			case 5:balanceY.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameY+"\n\n"+command;break;
			case 6:balanceZ.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameZ+"\n\n"+command;break;
			}
		}
		
		
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