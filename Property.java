
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.JOptionPane;

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
	protected int housePrice;
	protected int mortgageValue;
	protected String propertyColour;
	protected int propertyHouseNo=0;
	protected int mortgaged=0;
	protected int mortgageprice=0;
	
	Property()
	{
		
	}
	Property(int ID, String Name,int Price,int Rent1,int Rent2,int Rent3,int Rent4,int Rent5,int Rent6, String colour,int house, int mort, int mortPrice)
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
		propertyColour=colour;
		housePrice=house;
		mortgaged=mort;
		mortgageprice=mortPrice;
	}
	
	
	
	void propertyDisplayAll (ArrayList<Property> propertiesUser){
		
		for(int i = 0; i < propertiesUser.size(); i++)
		{
			propertyDets+="propertyID "+propertiesUser.get(i).propertyID+"\n";
			propertyDets+="propertyName "+propertiesUser.get(i).propertyName+"\n";
			propertyDets+="propertyPrice "+propertiesUser.get(i).propertyPrice+"\n\n";
			PropertyPane.setText(propertyDets);
		}
			
		
	}
	
	String propertyDisplayCurrent(int rand)
	{
			
		propertyDets+="propertyID "+properties.get(rand).propertyID+"\n";
		propertyDets+="propertyName "+properties.get(rand).propertyName+"\n";
		propertyDets+="propertyPrice "+properties.get(rand).propertyPrice+"\n\n";
		propertyDets+="propertyUser"+properties.get(rand).propertyUser+"\n";
		command="\n\n"+propertyDets+command;
		propertyDets="";
		return propertyDets;
	}
	
	void buyProperty(int rand){
		if(properties.get(rand).propertyUser==0)
		{
		propertyNo++;
		switch(UserChooser)
		{
		case 1:balanceA.withdraw(properties.get(rand).propertyPrice);properties.get(rand).propertyUser=1;propertiesUserA.add(properties.get(rand));break;

		case 2:balanceB.withdraw(properties.get(rand).propertyPrice);properties.get(rand).propertyUser=2;propertiesUserB.add(properties.get(rand));break;
		

		case 3:balanceC.withdraw(properties.get(rand).propertyPrice);properties.get(rand).propertyUser=3;propertiesUserC.add(properties.get(rand));break;

		case 4:balanceX.withdraw(properties.get(rand).propertyPrice);properties.get(rand).propertyUser=4;propertiesUserX.add(properties.get(rand));break;
	
		case 5: balanceY.withdraw(properties.get(rand).propertyPrice);properties.get(rand).propertyUser=5;propertiesUserY.add(properties.get(rand));break;
		
		case 6: balanceZ.withdraw(properties.get(rand).propertyPrice);properties.get(rand).propertyUser=6;propertiesUserZ.add(properties.get(rand));break;
		}
		
		command=("You have just bought "+properties.get(rand).propertyName+"\n\n")+command;
		txtpnInfo.setText(command);
		}
		else
		{
			command="Property already owned\n"+command;
			txtpnInfo.setText(command);
		}
		
	}
	
	void payRent(int rand){
		stations();
		if(properties.get(rand).propertyUser!=0 && properties.get(rand).propertyUser!=UserChooser)
		{
			int positionToRent=rand;
			switch(UserChooser)
			{
			case 1:if(properties.get(rand).propertyHouseNo==0){balanceA.withdraw(properties.get(rand).propertyRent1);}
					else if(properties.get(rand).propertyHouseNo==1){balanceA.withdraw(properties.get(rand).propertyRent2);}
					else if(properties.get(rand).propertyHouseNo==2){balanceA.withdraw(properties.get(rand).propertyRent3);}
					else if(properties.get(rand).propertyHouseNo==3){balanceA.withdraw(properties.get(rand).propertyRent4);}
					else if(properties.get(rand).propertyHouseNo==4){balanceA.withdraw(properties.get(rand).propertyRent5);}
					else if(properties.get(rand).propertyHouseNo==5){balanceA.withdraw(properties.get(rand).propertyRent6);}break;
			
			case 2:if(properties.get(rand).propertyHouseNo==0){balanceB.withdraw(properties.get(rand).propertyRent1);}
					else if(properties.get(rand).propertyHouseNo==1){balanceB.withdraw(properties.get(rand).propertyRent2);}
					else if(properties.get(rand).propertyHouseNo==2){balanceB.withdraw(properties.get(rand).propertyRent3);}
					else if(properties.get(rand).propertyHouseNo==3){balanceB.withdraw(properties.get(rand).propertyRent4);}
					else if(properties.get(rand).propertyHouseNo==4){balanceB.withdraw(properties.get(rand).propertyRent5);}
					else if(properties.get(rand).propertyHouseNo==5){balanceB.withdraw(properties.get(rand).propertyRent6);}break;
			
			case 3:if(properties.get(rand).propertyHouseNo==0){balanceC.withdraw(properties.get(rand).propertyRent1);}
					else if(properties.get(rand).propertyHouseNo==1){balanceC.withdraw(properties.get(rand).propertyRent2);}
					else if(properties.get(rand).propertyHouseNo==2){balanceC.withdraw(properties.get(rand).propertyRent3);}
					else if(properties.get(rand).propertyHouseNo==3){balanceC.withdraw(properties.get(rand).propertyRent4);}
					else if(properties.get(rand).propertyHouseNo==4){balanceC.withdraw(properties.get(rand).propertyRent5);}
					else if(properties.get(rand).propertyHouseNo==5){balanceC.withdraw(properties.get(rand).propertyRent6);}break;
					
			case 4:if(properties.get(rand).propertyHouseNo==0){balanceX.withdraw(properties.get(rand).propertyRent1);}
					else if(properties.get(rand).propertyHouseNo==1){balanceX.withdraw(properties.get(rand).propertyRent2);}
					else if(properties.get(rand).propertyHouseNo==2){balanceX.withdraw(properties.get(rand).propertyRent3);}
					else if(properties.get(rand).propertyHouseNo==3){balanceX.withdraw(properties.get(rand).propertyRent4);}
					else if(properties.get(rand).propertyHouseNo==4){balanceX.withdraw(properties.get(rand).propertyRent5);}
					else if(properties.get(rand).propertyHouseNo==5){balanceX.withdraw(properties.get(rand).propertyRent6);}break;
			
			case 5:if(properties.get(rand).propertyHouseNo==0){balanceY.withdraw(properties.get(rand).propertyRent1);}
					else if(properties.get(rand).propertyHouseNo==1){balanceY.withdraw(properties.get(rand).propertyRent2);}
					else if(properties.get(rand).propertyHouseNo==2){balanceY.withdraw(properties.get(rand).propertyRent3);}
					else if(properties.get(rand).propertyHouseNo==3){balanceY.withdraw(properties.get(rand).propertyRent4);}
					else if(properties.get(rand).propertyHouseNo==4){balanceY.withdraw(properties.get(rand).propertyRent5);}
					else if(properties.get(rand).propertyHouseNo==5){balanceY.withdraw(properties.get(rand).propertyRent6);}break;
			
			case 6:if(properties.get(rand).propertyHouseNo==0){balanceZ.withdraw(properties.get(rand).propertyRent1);}
					else if(properties.get(rand).propertyHouseNo==1){balanceZ.withdraw(properties.get(rand).propertyRent2);}
					else if(properties.get(rand).propertyHouseNo==2){balanceZ.withdraw(properties.get(rand).propertyRent3);}
					else if(properties.get(rand).propertyHouseNo==3){balanceZ.withdraw(properties.get(rand).propertyRent4);}
					else if(properties.get(rand).propertyHouseNo==4){balanceZ.withdraw(properties.get(rand).propertyRent5);}
					else if(properties.get(rand).propertyHouseNo==5){balanceZ.withdraw(properties.get(rand).propertyRent6);}break;
			}
			
			switch(properties.get(rand).propertyUser)
			{
			case 1:if(properties.get(positionToRent).propertyHouseNo==0){balanceA.deposit(properties.get(positionToRent).propertyRent1);command=properties.get(positionToRent).propertyRent1+" payed to "+UserNameA+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==1){balanceA.deposit(properties.get(positionToRent).propertyRent2);command=properties.get(positionToRent).propertyRent2+" payed to "+UserNameA+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==2){balanceA.deposit(properties.get(positionToRent).propertyRent3);command=properties.get(positionToRent).propertyRent3+" payed to "+UserNameA+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==3){balanceA.deposit(properties.get(positionToRent).propertyRent4);command=properties.get(positionToRent).propertyRent4+" payed to "+UserNameA+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==4){balanceA.deposit(properties.get(positionToRent).propertyRent5);command=properties.get(positionToRent).propertyRent5+" payed to "+UserNameA+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==5){balanceA.deposit(properties.get(positionToRent).propertyRent6);command=properties.get(positionToRent).propertyRent6+" payed to "+UserNameA+"\n\n"+command;}break;
			
			case 2:if(properties.get(positionToRent).propertyHouseNo==0){balanceB.deposit(properties.get(positionToRent).propertyRent1);command=properties.get(positionToRent).propertyRent1+" payed to "+UserNameB+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==1){balanceB.deposit(properties.get(positionToRent).propertyRent2);command=properties.get(positionToRent).propertyRent2+" payed to "+UserNameB+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==2){balanceB.deposit(properties.get(positionToRent).propertyRent3);command=properties.get(positionToRent).propertyRent3+" payed to "+UserNameB+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==3){balanceB.deposit(properties.get(positionToRent).propertyRent4);command=properties.get(positionToRent).propertyRent4+" payed to "+UserNameB+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==4){balanceB.deposit(properties.get(positionToRent).propertyRent5);command=properties.get(positionToRent).propertyRent5+" payed to "+UserNameB+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==5){balanceB.deposit(properties.get(positionToRent).propertyRent6);command=properties.get(positionToRent).propertyRent6+" payed to "+UserNameB+"\n\n"+command;}break;
			
			case 3:if(properties.get(positionToRent).propertyHouseNo==0){balanceC.deposit(properties.get(positionToRent).propertyRent1);command=properties.get(positionToRent).propertyRent1+" payed to "+UserNameC+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==1){balanceC.deposit(properties.get(positionToRent).propertyRent2);command=properties.get(positionToRent).propertyRent2+" payed to "+UserNameC+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==2){balanceC.deposit(properties.get(positionToRent).propertyRent3);command=properties.get(positionToRent).propertyRent3+" payed to "+UserNameC+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==3){balanceC.deposit(properties.get(positionToRent).propertyRent4);command=properties.get(positionToRent).propertyRent4+" payed to "+UserNameC+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==4){balanceC.deposit(properties.get(positionToRent).propertyRent5);command=properties.get(positionToRent).propertyRent5+" payed to "+UserNameC+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==5){balanceC.deposit(properties.get(positionToRent).propertyRent6);command=properties.get(positionToRent).propertyRent6+" payed to "+UserNameC+"\n\n"+command;}break;
			
			case 4:if(properties.get(positionToRent).propertyHouseNo==0){balanceX.deposit(properties.get(positionToRent).propertyRent1);command=properties.get(positionToRent).propertyRent1+" payed to "+UserNameX+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==1){balanceX.deposit(properties.get(positionToRent).propertyRent2);command=properties.get(positionToRent).propertyRent2+" payed to "+UserNameX+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==2){balanceX.deposit(properties.get(positionToRent).propertyRent3);command=properties.get(positionToRent).propertyRent3+" payed to "+UserNameX+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==3){balanceX.deposit(properties.get(positionToRent).propertyRent4);command=properties.get(positionToRent).propertyRent4+" payed to "+UserNameX+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==4){balanceX.deposit(properties.get(positionToRent).propertyRent5);command=properties.get(positionToRent).propertyRent5+" payed to "+UserNameX+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==5){balanceX.deposit(properties.get(positionToRent).propertyRent6);command=properties.get(positionToRent).propertyRent6+" payed to "+UserNameX+"\n\n"+command;}break;
	
			case 5:if(properties.get(positionToRent).propertyHouseNo==0){balanceY.deposit(properties.get(positionToRent).propertyRent1);command=properties.get(positionToRent).propertyRent1+" payed to "+UserNameY+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==1){balanceY.deposit(properties.get(positionToRent).propertyRent2);command=properties.get(positionToRent).propertyRent2+" payed to "+UserNameY+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==2){balanceY.deposit(properties.get(positionToRent).propertyRent3);command=properties.get(positionToRent).propertyRent3+" payed to "+UserNameY+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==3){balanceY.deposit(properties.get(positionToRent).propertyRent4);command=properties.get(positionToRent).propertyRent4+" payed to "+UserNameY+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==4){balanceY.deposit(properties.get(positionToRent).propertyRent5);command=properties.get(positionToRent).propertyRent5+" payed to "+UserNameY+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==5){balanceY.deposit(properties.get(positionToRent).propertyRent6);command=properties.get(positionToRent).propertyRent6+" payed to "+UserNameY+"\n\n"+command;}break;

			case 6:if(properties.get(positionToRent).propertyHouseNo==0){balanceZ.deposit(properties.get(positionToRent).propertyRent1);command=properties.get(positionToRent).propertyRent1+" payed to "+UserNameZ+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==1){balanceZ.deposit(properties.get(positionToRent).propertyRent2);command=properties.get(positionToRent).propertyRent2+" payed to "+UserNameZ+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==2){balanceZ.deposit(properties.get(positionToRent).propertyRent3);command=properties.get(positionToRent).propertyRent3+" payed to "+UserNameZ+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==3){balanceZ.deposit(properties.get(positionToRent).propertyRent4);command=properties.get(positionToRent).propertyRent4+" payed to "+UserNameZ+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==4){balanceZ.deposit(properties.get(positionToRent).propertyRent5);command=properties.get(positionToRent).propertyRent5+" payed to "+UserNameZ+"\n\n"+command;}
					else if(properties.get(positionToRent).propertyHouseNo==5){balanceZ.deposit(properties.get(positionToRent).propertyRent6);command=properties.get(positionToRent).propertyRent6+" payed to "+UserNameZ+"\n\n"+command;}break;
			}
			txtpnInfo.setText(command);
		}
		else
		{
			command="You dont't owe rent\n\n"+command;
			txtpnInfo.setText(command);
		}
		
		
	}

	
void demolishHouse(int rand){
		
		//propertiesUserA.add(properties.get(3));
		
		command="What location would you like to demolish a house at?\nEnter location as a single word(CamelCase) and how many houses would you like to demolish? (space between location and number)\n\n"+command;
		txtpnInfo.setText(command);
		
		houses=0;
		
		
		
		EnterText.addActionListener( new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
		    {
				String location=EnterText.getText();
				
				switch(UserChooser)
				{
				case 1:
					if(matchnumber(propertiesUserA,location)!=null)
					{
								String num=matchnumber(propertiesUserA,location);
								int r=houseNo(location,propertiesUserA);
								houses=Integer.parseInt(num);
								propertiesUserA.get(r).propertyHouseNo-=houses;
								if(propertiesUserA.get(r).propertyHouseNo<0)
								{
									command="You cannot have a negative amount of houses\n\n"+command;
									txtpnInfo.setText(command);
								}
								int a=((propertiesUserA.get(r).housePrice)/2)*houses;
								balanceA.deposit(a);
								command="You demolished "+houses+" houses\n\n"+command;
								txtpnInfo.setText(command);
								return;
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 2:
					if(matchnumber(propertiesUserB,location)!=null)
					{
								String num=matchnumber(propertiesUserB,location);
								int r=houseNo(location,propertiesUserB);
								houses=Integer.parseInt(num);
								propertiesUserB.get(r).propertyHouseNo-=houses;
								if(propertiesUserB.get(r).propertyHouseNo<0)
								{
									command="You cannot have a negative amount of houses\n\n"+command;
									txtpnInfo.setText(command);
								}
								int a=((propertiesUserB.get(r).housePrice)/2)*houses;
								balanceB.deposit(a);
								command="You demolished "+houses+" houses\n\n"+command;
								txtpnInfo.setText(command);
								return;
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 3:
					if(matchnumber(propertiesUserC,location)!=null)
					{
								String num=matchnumber(propertiesUserC,location);
								int r=houseNo(location,propertiesUserC);
								houses=Integer.parseInt(num);
								propertiesUserC.get(r).propertyHouseNo-=houses;
								if(propertiesUserC.get(r).propertyHouseNo<0)
								{
									command="You cannot have a negative amount of houses\n\n"+command;
									txtpnInfo.setText(command);
								}
								int a=((propertiesUserC.get(r).housePrice)/2)*houses;
								balanceC.deposit(a);
								command="You demolished "+houses+" houses\n\n"+command;
								txtpnInfo.setText(command);
								return;
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 4:
					if(matchnumber(propertiesUserX,location)!=null)
					{
								String num=matchnumber(propertiesUserX,location);
								int r=houseNo(location,propertiesUserX);
								houses=Integer.parseInt(num);
								propertiesUserX.get(r).propertyHouseNo-=houses;
								if(propertiesUserX.get(r).propertyHouseNo<0)
								{
									command="You cannot have a negative amount of houses\n\n"+command;
									txtpnInfo.setText(command);
								}
								int a=((propertiesUserX.get(r).housePrice)/2)*houses;
								balanceX.deposit(a);
								command="You demolished "+houses+" houses\n\n"+command;
								txtpnInfo.setText(command);
								return;
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 5:
					if(matchnumber(propertiesUserY,location)!=null)
					{
								String num=matchnumber(propertiesUserY,location);
								int r=houseNo(location,propertiesUserY);
								houses=Integer.parseInt(num);
								propertiesUserY.get(r).propertyHouseNo-=houses;
								if(propertiesUserY.get(r).propertyHouseNo<0)
								{
									command="You cannot have a negative amount of houses\n\n"+command;
									txtpnInfo.setText(command);
								}
								int a=((propertiesUserY.get(r).housePrice)/2)*houses;
								balanceY.deposit(a);
								command="You demolished "+houses+" houses\n\n"+command;
								txtpnInfo.setText(command);
								return;
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 6:
					if(matchnumber(propertiesUserZ,location)!=null)
					{
								String num=matchnumber(propertiesUserZ,location);
								int r=houseNo(location,propertiesUserZ);
								houses=Integer.parseInt(num);
								propertiesUserZ.get(r).propertyHouseNo-=houses;
								if(propertiesUserZ.get(r).propertyHouseNo<0)
								{
									command="You cannot have a negative amount of houses\n\n"+command;
									txtpnInfo.setText(command);
								}
								int a=((propertiesUserZ.get(r).housePrice)/2)*houses;
								balanceZ.deposit(a);
								command="You demolished "+houses+" houses\n\n"+command;
								txtpnInfo.setText(command);
								return;
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				}
				
		    }
		});
	}


void buildHouse(int rand){
		
		//propertiesUserA.add(properties.get(3));
		
		command="What location would you like to build at?\nEnter location as a single word(CamelCase) and how many houses would you like to build? (space between location and number)\n\n"+command;
		txtpnInfo.setText(command);
		
		houses=0;
		
		
		
		EnterText.addActionListener( new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
		    {
				String location=EnterText.getText();
				
				switch(UserChooser)
				{
				case 1:
					if(matchnumber(propertiesUserA,location)!=null)
					{
						
								String num=matchnumber(propertiesUserA,location);
								int r=houseNo(location,propertiesUserA);
								houses=Integer.parseInt(num);
								
								if(matchColour(propertiesUserA.get(r),propertiesUserA))
								{
									propertiesUserA.get(r).propertyHouseNo+=houses;
									if(propertiesUserA.get(r).propertyHouseNo>5)
									{
										command="You can only have 4 houses and 1 hotel\n\n"+command;
										txtpnInfo.setText(command);
									}
									int a=propertiesUserA.get(r).housePrice*houses;
									balanceA.withdraw(a);
									command="You built "+ houses+" houses\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								else
								{
									command="You don't own all the properties in this colour group\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 2:
					if(matchnumber(propertiesUserB,location)!=null)
					{
						
								String num=matchnumber(propertiesUserB,location);
								int r=houseNo(location,propertiesUserB);
								houses=Integer.parseInt(num);
								
								if(matchColour(propertiesUserB.get(r),propertiesUserB))
								{
									propertiesUserB.get(r).propertyHouseNo+=houses;
									if(propertiesUserB.get(r).propertyHouseNo>5)
									{
										command="You can only have 4 houses and 1 hotel\n\n"+command;
										txtpnInfo.setText(command);
									}
									int a=propertiesUserB.get(r).housePrice*houses;
									balanceB.withdraw(a);
									command="You built "+ houses+" houses\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								else
								{
									command="You don't own all the properties in this colour group\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 3:
					if(matchnumber(propertiesUserC,location)!=null)
					{
						
								String num=matchnumber(propertiesUserC,location);
								int r=houseNo(location,propertiesUserC);
								houses=Integer.parseInt(num);
								
								if(matchColour(propertiesUserC.get(r),propertiesUserC))
								{
									propertiesUserC.get(r).propertyHouseNo+=houses;
									if(propertiesUserC.get(r).propertyHouseNo>5)
									{
										command="You can only have 4 houses and 1 hotel\n\n"+command;
										txtpnInfo.setText(command);
									}
									int a=propertiesUserC.get(r).housePrice*houses;
									balanceC.withdraw(a);
									command="You built "+ houses+" houses\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								else
								{
									command="You don't own all the properties in this colour group\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 4:
					if(matchnumber(propertiesUserX,location)!=null)
					{
						
								String num=matchnumber(propertiesUserX,location);
								int r=houseNo(location,propertiesUserX);
								houses=Integer.parseInt(num);
								
								if(matchColour(propertiesUserX.get(r),propertiesUserX))
								{
									propertiesUserX.get(r).propertyHouseNo+=houses;
									if(propertiesUserX.get(r).propertyHouseNo>5)
									{
										command="You can only have 4 houses and 1 hotel\n\n"+command;
										txtpnInfo.setText(command);
									}
									int a=propertiesUserX.get(r).housePrice*houses;
									balanceX.withdraw(a);
									command="You built "+ houses+" houses\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								else
								{
									command="You don't own all the properties in this colour group\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 5:
					if(matchnumber(propertiesUserY,location)!=null)
					{
						
								String num=matchnumber(propertiesUserY,location);
								int r=houseNo(location,propertiesUserY);
								houses=Integer.parseInt(num);
								
								if(matchColour(propertiesUserY.get(r),propertiesUserY))
								{
									propertiesUserY.get(r).propertyHouseNo+=houses;
									if(propertiesUserY.get(r).propertyHouseNo>5)
									{
										command="You can only have 4 houses and 1 hotel\n\n"+command;
										txtpnInfo.setText(command);
									}
									int a=propertiesUserY.get(r).housePrice*houses;
									balanceY.withdraw(a);
									command="You built "+ houses+" houses\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								else
								{
									command="You don't own all the properties in this colour group\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				case 6:
					if(matchnumber(propertiesUserZ,location)!=null)
					{
						
								String num=matchnumber(propertiesUserZ,location);
								int r=houseNo(location,propertiesUserZ);
								houses=Integer.parseInt(num);
								
								if(matchColour(propertiesUserZ.get(r),propertiesUserZ))
								{
									propertiesUserZ.get(r).propertyHouseNo+=houses;
									if(propertiesUserZ.get(r).propertyHouseNo>5)
									{
										command="You can only have 4 houses and 1 hotel\n\n"+command;
										txtpnInfo.setText(command);
									}
									int a=propertiesUserZ.get(r).housePrice*houses;
									balanceZ.withdraw(a);
									command="You built "+ houses+" houses\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								else
								{
									command="You don't own all the properties in this colour group\n\n"+command;
									txtpnInfo.setText(command);
									return;
								}
								
					}
					else
					{
						command="You don't own this property\n\n"+command;
						txtpnInfo.setText(command);
						return;
					}
				}
				
				
		    }
		});
		
		
		
	}
	
	@Override
	public String toString()
	{
		return this.propertyName;
	}
	
	
	public int houseNo(String location, ArrayList<Property> propertiesUser)
	{
		String t="";
		String f=location.substring(0,location.length()-2);
		for(int r=0;r<propertiesUser.size();r++)
		{	
			if(f.equals(propertiesUser.get(r).propertyName))
			{
				t=location;
			}
			
		}
		
	for(int r=0; r<propertiesUser.size();r++)
	{
		if(t.equals(propertiesUser.get(r).propertyName))
		{
			return r;
		}
	}
	return 0;
		
	}
	
	public boolean matchColour(Property prop,ArrayList<Property> propertiesUser)
	{
		if(prop==null)
		{
			command="You dont't own this property\n\n"+command;
			txtpnInfo.setText(command);
			return false;
		}
		String colour=prop.propertyColour;
		int coloursOwned=1;
		for(int i=0;i<propertiesUser.size();i++)
		{
			if(colour.equals(propertiesUser.get(i).propertyColour))
			{
				coloursOwned++;
			}
		}
		switch(colour)
		{
		case "brown": if(coloursOwned==2){return true;}else{return false;}
		case "blue": if(coloursOwned==3){return true;}else{return false;}
		case "purple": if(coloursOwned==3){return true;}else{return false;}
		case "orange": if(coloursOwned==3){return true;}else{return false;}
		case "red": if(coloursOwned==3){return true;}else{return false;}
		case "yellow": if(coloursOwned==3){return true;}else{return false;}
		case "green": if(coloursOwned==3){return true;}else{return false;}
		case "navy": if(coloursOwned==2){return true;}else{return false;}
		}
		return false;
	}
	
	
	public boolean check(String location, Property propertiesUser)
	{
		String t="";
		
			for(int i=0; i<location.length(); i++)
			{
				char a=location.charAt(i);
				char b=propertiesUser.propertyName.charAt(i);
				if(a==b)
				{
					t+=Character.toString(a) ;
				}
			}
		if(t.equals(location))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public boolean match(ArrayList<Property> propertiesUser, String location)
	{
		for(int i=0;i<propertiesUser.size();i++)
		{
			if(checknumber(location,propertiesUser.get(i))!=null)
			{
				if(matchColour(propertiesUser.get(i),propertiesUserA))
				{
					return true;
				}
			}
		}
		return false;
		
	}

	



public String checknumber(String location, Property propertiesUser)
{
	String t="";
	String num="";
	String sub=location.substring(0, location.length()-2);
	
		for(int i=0; i<sub.length(); i++)
		{
			char a=location.charAt(i);
			char b=propertiesUser.propertyName.charAt(i);
			if(a==b)
			{
				t+=Character.toString(a) ;
			}
		
		}
		num=location.substring(location.length()-1,location.length());
	if(t.equals(sub))
	{
		return num;
	}
	else
	{
		return null;
	}
	
}
	
public String matchnumber(ArrayList<Property> propertiesUser, String location)
{
	for(int i=0;i<propertiesUser.size();i++)
	{
		if(checknumber(location,propertiesUser.get(i))!=null)
		{
			return checknumber(location,propertiesUser.get(i));
		}
	}
	return null;
	
}


//new function finds location in main properties array, sets that property to mortgaged

	public boolean mortgaging(ArrayList<Property> properties, String location, int User)
	{
		for (int i=0;i<properties.size();i++)
		{
			if(check(location,properties.get(i))){
				properties.get(i).mortgaged = User;
				return true;
			}
		}
		return false;
	}

	
void mortgage(int rand){
		
//		propertiesUserA.add(properties.get(3));
		
		command="What property would you like to mortgage?\n\n"+command;
		txtpnInfo.setText(command);
		
		EnterText.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				String location=EnterText.getText();
				
				switch(UserChooser)
				{
				case 1:if(properties.get(rand).mortgaged == 1||properties.get(rand).mortgaged == 2||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 4||properties.get(rand).mortgaged == 5||properties.get(rand).mortgaged == 6)
					{
						command="This property is already mortgaged\n\n"+command;
						txtpnInfo.setText(command);
					}
				break;
				case 2:if(properties.get(rand).mortgaged == 1||properties.get(rand).mortgaged == 2||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 4||properties.get(rand).mortgaged == 5||properties.get(rand).mortgaged == 6)
				{
					command="This property is already mortgaged\n\n"+command;
					txtpnInfo.setText(command);
				}
				break;
				case 3:if(properties.get(rand).mortgaged == 1||properties.get(rand).mortgaged == 2||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 4||properties.get(rand).mortgaged == 5||properties.get(rand).mortgaged == 6)
				{
					command="This property is already mortgaged\n\n"+command;
					txtpnInfo.setText(command);
				}
				break;
				case 4:if(properties.get(rand).mortgaged == 1||properties.get(rand).mortgaged == 2||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 4||properties.get(rand).mortgaged == 5||properties.get(rand).mortgaged == 6)
				{
					command="This property is already mortgaged\n\n"+command;
					txtpnInfo.setText(command);
				}
				break;
				case 5:if(properties.get(rand).mortgaged == 1||properties.get(rand).mortgaged == 2||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 4||properties.get(rand).mortgaged == 5||properties.get(rand).mortgaged == 6)
				{
					command="This property is already mortgaged\n\n"+command;
					txtpnInfo.setText(command);
				}
				break;
				case 6:if(properties.get(rand).mortgaged == 1||properties.get(rand).mortgaged == 2||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 3||properties.get(rand).mortgaged == 4||properties.get(rand).mortgaged == 5||properties.get(rand).mortgaged == 6)
				{
					command="This property is already mortgaged\n\n"+command;
					txtpnInfo.setText(command);
				}
				break;
				}
				
				switch(UserChooser)
				{
				case 1:if(mortgaging(propertiesUserA,location,UserChooser)){
						int r=houseNo(location,propertiesUserA);
						balanceA.deposit(propertiesUserA.get(r).mortgageprice);
						propertiesUserA.remove(r);
						command="The property you mortgaged is :"+location +"\n\n" +command;
						txtpnInfo.setText(command);
					}
				break;
				case 2:if(mortgaging(propertiesUserB,location,UserChooser)){
					int r=houseNo(location,propertiesUserB);
					balanceB.deposit(propertiesUserB.get(r).mortgageprice);
					propertiesUserB.remove(r);
					command="The property you mortgaged is :"+location +"\n\n" +command;
					txtpnInfo.setText(command);
				}
				break;
				case 3:if(mortgaging(propertiesUserC,location,UserChooser)){
					int r=houseNo(location,propertiesUserC);
					balanceC.deposit(propertiesUserC.get(r).mortgageprice);
					propertiesUserC.remove(r);
					command="The property you mortgaged is :"+location +"\n\n" +command;
					txtpnInfo.setText(command);
				}
				break;
				case 4:if(mortgaging(propertiesUserX,location,UserChooser)){
					int r=houseNo(location,propertiesUserX);
					balanceX.deposit(propertiesUserX.get(r).mortgageprice);
					propertiesUserX.remove(r);
					command="The property you mortgaged is :"+location +"\n\n" +command;
					txtpnInfo.setText(command);
				}
				break;
				case 5:if(mortgaging(propertiesUserY,location,UserChooser)){
					int r=houseNo(location,propertiesUserY);
					balanceY.deposit(propertiesUserY.get(r).mortgageprice);
					propertiesUserY.remove(r);
					command="The property you mortgaged is :"+location +"\n\n" +command;
					txtpnInfo.setText(command);
				}
				break;
				case 6:if(mortgaging(propertiesUserZ,location,UserChooser)){
					int r=houseNo(location,propertiesUserZ);
					balanceZ.deposit(propertiesUserZ.get(r).mortgageprice);
					propertiesUserZ.remove(r);
					command="The property you mortgaged is :"+location +"\n\n" +command;
					txtpnInfo.setText(command);
				}
				break;
				}
				
				
		    }
		});
	}


public void redeeming(ArrayList<Property> properties, String location)
{
	for (int i=0;i<properties.size();i++)
	{
		if(check(location,properties.get(i))){
			
			properties.get(i).mortgaged = 0;
			
		}
	}
}


void redeem(int rand){
	
	propertiesUserA.add(properties.get(0));
	
	command="What property would you like to redeem?"+command;
	txtpnInfo.setText(command);
	
	EnterText.addActionListener( new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			
			String location=EnterText.getText();
			
			
			switch(UserChooser)
			{
			case 1:if(propertiesUserA.get(0).mortgaged == 1){
					
					propertiesUserA.get(0).mortgaged = 0;
					balanceA.deposit(propertiesUserA.get(0).mortgageprice);
					command="You now own property"+location+"\n\n"+command;
					txtpnInfo.setText(command);
			
				}
			else {
				command="This property is not mortgaged"+command;
				txtpnInfo.setText(command);
			}
			}
	    }
	});
}


void winner(){
	switch (NumOfUsers){
	
	case 2: if(!a && b){JOptionPane.showMessageDialog(null,UserNameA + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!b && a){JOptionPane.showMessageDialog(null,UserNameB + " has won the game");frame.setVisible(false);frame.dispose();}break;
	case 3: if(!a && b && c){JOptionPane.showMessageDialog(null,UserNameA + " has won the game");frame.setVisible(false);frame.dispose();}
		    if(!b && a && c){JOptionPane.showMessageDialog(null,UserNameB + " has won the game");frame.setVisible(false);frame.dispose();}
		    if(!c && a && b){JOptionPane.showMessageDialog(null,UserNameC + " has won the game");frame.setVisible(false);frame.dispose();}break;
	case 4: if(!a && b && c && x){JOptionPane.showMessageDialog(null,UserNameA + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!b && a && c && x){JOptionPane.showMessageDialog(null,UserNameB + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!c && a && b && x){JOptionPane.showMessageDialog(null,UserNameC + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!x && a && b && c){JOptionPane.showMessageDialog(null,UserNameX + " has won the game");frame.setVisible(false);frame.dispose();}break;
	case 5: if(!a && b && c && x && y){JOptionPane.showMessageDialog(null,UserNameA + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!b && a && c && x && y){JOptionPane.showMessageDialog(null,UserNameB + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!c && a && b && x && y){JOptionPane.showMessageDialog(null,UserNameC + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!x && a && b && c && y){JOptionPane.showMessageDialog(null,UserNameX + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!y && a && b && c && y){JOptionPane.showMessageDialog(null,UserNameY + " has won the game");frame.setVisible(false);frame.dispose();}break;
	case 6: if(!a && b && c && x && y && z){JOptionPane.showMessageDialog(null,UserNameA + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!b && a && c && x && y && z){JOptionPane.showMessageDialog(null,UserNameB + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!c && a && b && x && y && z){JOptionPane.showMessageDialog(null,UserNameC + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!x && a && b && c && y && z){JOptionPane.showMessageDialog(null,UserNameX + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!y && a && b && c && y && z){JOptionPane.showMessageDialog(null,UserNameY + " has won the game");frame.setVisible(false);frame.dispose();}
			if(!z && a && b && c && x && y){JOptionPane.showMessageDialog(null,UserNameZ + " has won the game");frame.setVisible(false);frame.dispose();}break;

}
}


void stations(){
	
	switch(UserChooser)
	{
	case 1:	if(match(propertiesUserA, "KingsCrossStation")){
				properties.get(5).propertyHouseNo=0;
			}
			if(match(propertiesUserA, "MaryleboneStation")){
				properties.get(15).propertyHouseNo=0;
			}
			if(match(propertiesUserA, "FrenchurchStStation")){
				properties.get(25).propertyHouseNo=0;
			}
			if(match(propertiesUserA, "LiverpoolStreetStation")){
				properties.get(35).propertyHouseNo=0;
			}
			if(match(propertiesUserA, "KingsCrossStation") && match(propertiesUserA, "MaryleboneStation")){
				properties.get(5).propertyHouseNo=1;
				properties.get(15).propertyHouseNo=1;
			}
			if(match(propertiesUserA, "KingsCrossStation") && match(propertiesUserA, "FrenchurchStStation")){
				properties.get(5).propertyHouseNo=1;
				properties.get(25).propertyHouseNo=1;
			}
			if(match(propertiesUserA, "KingsCrossStation") && match(propertiesUserA, "LiverpoolStreetStation")){
				properties.get(5).propertyHouseNo=1;
				properties.get(35).propertyHouseNo=1;
			}
			if(match(propertiesUserA, "MaryleboneStation") && match(propertiesUserA, "FrenchurchStStation")){
				properties.get(15).propertyHouseNo=1;
				properties.get(25).propertyHouseNo=1;
			}
			if(match(propertiesUserA, "MaryleboneStation") && match(propertiesUserA, "LiverpoolStreetStation")){
				properties.get(15).propertyHouseNo=1;
				properties.get(35).propertyHouseNo=1;
			}
			if(match(propertiesUserA, "FrenchurchStStation") && match(propertiesUserA, "LiverpoolStreetStation")){
				properties.get(25).propertyHouseNo=1;
				properties.get(35).propertyHouseNo=1;
			}
			if(match(propertiesUserA, "KingsCrossStation") && match(propertiesUserA, "MaryleboneStation") && match(propertiesUserA, "FrenchurchStStation")){
				properties.get(5).propertyHouseNo=2;
				properties.get(15).propertyHouseNo=2;
				properties.get(25).propertyHouseNo=2;
			}
			if(match(propertiesUserA, "KingsCrossStation") && match(propertiesUserA, "MaryleboneStation") && match(propertiesUserA, "LiverpoolStreetStation")){
				properties.get(5).propertyHouseNo=2;
				properties.get(15).propertyHouseNo=2;
				properties.get(35).propertyHouseNo=2;
			}
			if(match(propertiesUserA, "KingsCrossStation") && match(propertiesUserA, "FrenchurchStStation") && match(propertiesUserA, "LiverpoolStreetStation")){
				properties.get(5).propertyHouseNo=2;
				properties.get(25).propertyHouseNo=2;
				properties.get(35).propertyHouseNo=2;
			}
			if(match(propertiesUserA, "MaryleboneStation") && match(propertiesUserA, "FrenchurchStStation") && match(propertiesUserA, "LiverpoolStreetStation")){
				properties.get(15).propertyHouseNo=2;
				properties.get(25).propertyHouseNo=2;
				properties.get(35).propertyHouseNo=2;
			}
			if(match(propertiesUserA, "KingsCrossStation") && match(propertiesUserA, "MaryleboneStation") && match(propertiesUserA, "FrenchurchStStation") && match(propertiesUserA, "LiverpoolStreetStation")){
				properties.get(5).propertyHouseNo=3;
				properties.get(15).propertyHouseNo=3;
				properties.get(25).propertyHouseNo=3;
				properties.get(35).propertyHouseNo=3;
			}
			break;
	case 2:	if(match(propertiesUserB, "KingsCrossStation")){
		properties.get(5).propertyHouseNo=0;
	}
	if(match(propertiesUserB, "MaryleboneStation")){
		properties.get(15).propertyHouseNo=0;
	}
	if(match(propertiesUserB, "FrenchurchStStation")){
		properties.get(25).propertyHouseNo=0;
	}
	if(match(propertiesUserB, "LiverpoolStreetStation")){
		properties.get(35).propertyHouseNo=0;
	}
	if(match(propertiesUserB, "KingsCrossStation") && match(propertiesUserB, "MaryleboneStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(15).propertyHouseNo=1;
	}
	if(match(propertiesUserB, "KingsCrossStation") && match(propertiesUserB, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserB, "KingsCrossStation") && match(propertiesUserB, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserB, "MaryleboneStation") && match(propertiesUserB, "FrenchurchStStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserB, "MaryleboneStation") && match(propertiesUserB, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserB, "FrenchurchStStation") && match(propertiesUserB, "LiverpoolStreetStation")){
		properties.get(25).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserB, "KingsCrossStation") && match(propertiesUserB, "MaryleboneStation") && match(propertiesUserB, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
	}
	if(match(propertiesUserB, "KingsCrossStation") && match(propertiesUserB, "MaryleboneStation") && match(propertiesUserB, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserB, "KingsCrossStation") && match(propertiesUserB, "FrenchurchStStation") && match(propertiesUserB, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserB, "MaryleboneStation") && match(propertiesUserB, "FrenchurchStStation") && match(propertiesUserB, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserB, "KingsCrossStation") && match(propertiesUserB, "MaryleboneStation") && match(propertiesUserB, "FrenchurchStStation") && match(propertiesUserB, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=3;
		properties.get(15).propertyHouseNo=3;
		properties.get(25).propertyHouseNo=3;
		properties.get(35).propertyHouseNo=3;
	}
	break;
	case 3:	if(match(propertiesUserC, "KingsCrossStation")){
		properties.get(5).propertyHouseNo=0;
	}
	if(match(propertiesUserC, "MaryleboneStation")){
		properties.get(15).propertyHouseNo=0;
	}
	if(match(propertiesUserC, "FrenchurchStStation")){
		properties.get(25).propertyHouseNo=0;
	}
	if(match(propertiesUserC, "LiverpoolStreetStation")){
		properties.get(35).propertyHouseNo=0;
	}
	if(match(propertiesUserC, "KingsCrossStation") && match(propertiesUserC, "MaryleboneStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(15).propertyHouseNo=1;
	}
	if(match(propertiesUserC, "KingsCrossStation") && match(propertiesUserC, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserC, "KingsCrossStation") && match(propertiesUserC, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserC, "MaryleboneStation") && match(propertiesUserC, "FrenchurchStStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserC, "MaryleboneStation") && match(propertiesUserC, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserC, "FrenchurchStStation") && match(propertiesUserC, "LiverpoolStreetStation")){
		properties.get(25).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserC, "KingsCrossStation") && match(propertiesUserC, "MaryleboneStation") && match(propertiesUserC, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
	}
	if(match(propertiesUserC, "KingsCrossStation") && match(propertiesUserC, "MaryleboneStation") && match(propertiesUserC, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserC, "KingsCrossStation") && match(propertiesUserC, "FrenchurchStStation") && match(propertiesUserC, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserC, "MaryleboneStation") && match(propertiesUserC, "FrenchurchStStation") && match(propertiesUserC, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserC, "KingsCrossStation") && match(propertiesUserC, "MaryleboneStation") && match(propertiesUserC, "FrenchurchStStation") && match(propertiesUserC, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=3;
		properties.get(15).propertyHouseNo=3;
		properties.get(25).propertyHouseNo=3;
		properties.get(35).propertyHouseNo=3;
	}
	break;
	case 4:	if(match(propertiesUserX, "KingsCrossStation")){
		properties.get(5).propertyHouseNo=0;
	}
	if(match(propertiesUserX, "MaryleboneStation")){
		properties.get(15).propertyHouseNo=0;
	}
	if(match(propertiesUserX, "FrenchurchStStation")){
		properties.get(25).propertyHouseNo=0;
	}
	if(match(propertiesUserX, "LiverpoolStreetStation")){
		properties.get(35).propertyHouseNo=0;
	}
	if(match(propertiesUserX, "KingsCrossStation") && match(propertiesUserX, "MaryleboneStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(15).propertyHouseNo=1;
	}
	if(match(propertiesUserX, "KingsCrossStation") && match(propertiesUserX, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserX, "KingsCrossStation") && match(propertiesUserX, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserX, "MaryleboneStation") && match(propertiesUserX, "FrenchurchStStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserX, "MaryleboneStation") && match(propertiesUserX, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserX, "FrenchurchStStation") && match(propertiesUserX, "LiverpoolStreetStation")){
		properties.get(25).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserX, "KingsCrossStation") && match(propertiesUserX, "MaryleboneStation") && match(propertiesUserX, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
	}
	if(match(propertiesUserX, "KingsCrossStation") && match(propertiesUserX, "MaryleboneStation") && match(propertiesUserX, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserX, "KingsCrossStation") && match(propertiesUserX, "FrenchurchStStation") && match(propertiesUserX, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserX, "MaryleboneStation") && match(propertiesUserX, "FrenchurchStStation") && match(propertiesUserX, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserX, "KingsCrossStation") && match(propertiesUserX, "MaryleboneStation") && match(propertiesUserX, "FrenchurchStStation") && match(propertiesUserX, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=3;
		properties.get(15).propertyHouseNo=3;
		properties.get(25).propertyHouseNo=3;
		properties.get(35).propertyHouseNo=3;
	}
	break;
	case 5:	if(match(propertiesUserY, "KingsCrossStation")){
		properties.get(5).propertyHouseNo=0;
	}
	if(match(propertiesUserY, "MaryleboneStation")){
		properties.get(15).propertyHouseNo=0;
	}
	if(match(propertiesUserY, "FrenchurchStStation")){
		properties.get(25).propertyHouseNo=0;
	}
	if(match(propertiesUserY, "LiverpoolStreetStation")){
		properties.get(35).propertyHouseNo=0;
	}
	if(match(propertiesUserY, "KingsCrossStation") && match(propertiesUserY, "MaryleboneStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(15).propertyHouseNo=1;
	}
	if(match(propertiesUserY, "KingsCrossStation") && match(propertiesUserY, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserY, "KingsCrossStation") && match(propertiesUserY, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserY, "MaryleboneStation") && match(propertiesUserY, "FrenchurchStStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserY, "MaryleboneStation") && match(propertiesUserY, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserY, "FrenchurchStStation") && match(propertiesUserY, "LiverpoolStreetStation")){
		properties.get(25).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserY, "KingsCrossStation") && match(propertiesUserY, "MaryleboneStation") && match(propertiesUserY, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
	}
	if(match(propertiesUserY, "KingsCrossStation") && match(propertiesUserY, "MaryleboneStation") && match(propertiesUserY, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserY, "KingsCrossStation") && match(propertiesUserY, "FrenchurchStStation") && match(propertiesUserY, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserY, "MaryleboneStation") && match(propertiesUserY, "FrenchurchStStation") && match(propertiesUserY, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserY, "KingsCrossStation") && match(propertiesUserY, "MaryleboneStation") && match(propertiesUserY, "FrenchurchStStation") && match(propertiesUserY, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=3;
		properties.get(15).propertyHouseNo=3;
		properties.get(25).propertyHouseNo=3;
		properties.get(35).propertyHouseNo=3;
	}
	break;
	case 6:	if(match(propertiesUserZ, "KingsCrossStation")){
		properties.get(5).propertyHouseNo=0;
	}
	if(match(propertiesUserZ, "MaryleboneStation")){
		properties.get(15).propertyHouseNo=0;
	}
	if(match(propertiesUserZ, "FrenchurchStStation")){
		properties.get(25).propertyHouseNo=0;
	}
	if(match(propertiesUserZ, "LiverpoolStreetStation")){
		properties.get(35).propertyHouseNo=0;
	}
	if(match(propertiesUserZ, "KingsCrossStation") && match(propertiesUserZ, "MaryleboneStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(15).propertyHouseNo=1;
	}
	if(match(propertiesUserZ, "KingsCrossStation") && match(propertiesUserZ, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserZ, "KingsCrossStation") && match(propertiesUserZ, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserZ, "MaryleboneStation") && match(propertiesUserZ, "FrenchurchStStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(25).propertyHouseNo=1;
	}
	if(match(propertiesUserZ, "MaryleboneStation") && match(propertiesUserZ, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserZ, "FrenchurchStStation") && match(propertiesUserZ, "LiverpoolStreetStation")){
		properties.get(25).propertyHouseNo=1;
		properties.get(35).propertyHouseNo=1;
	}
	if(match(propertiesUserZ, "KingsCrossStation") && match(propertiesUserZ, "MaryleboneStation") && match(propertiesUserZ, "FrenchurchStStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
	}
	if(match(propertiesUserZ, "KingsCrossStation") && match(propertiesUserZ, "MaryleboneStation") && match(propertiesUserZ, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(15).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserZ, "KingsCrossStation") && match(propertiesUserZ, "FrenchurchStStation") && match(propertiesUserZ, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserZ, "MaryleboneStation") && match(propertiesUserZ, "FrenchurchStStation") && match(propertiesUserZ, "LiverpoolStreetStation")){
		properties.get(15).propertyHouseNo=2;
		properties.get(25).propertyHouseNo=2;
		properties.get(35).propertyHouseNo=2;
	}
	if(match(propertiesUserZ, "KingsCrossStation") && match(propertiesUserZ, "MaryleboneStation") && match(propertiesUserZ, "FrenchurchStStation") && match(propertiesUserZ, "LiverpoolStreetStation")){
		properties.get(5).propertyHouseNo=3;
		properties.get(15).propertyHouseNo=3;
		properties.get(25).propertyHouseNo=3;
		properties.get(35).propertyHouseNo=3;
	}
		
	break;
	
		}
	}


}