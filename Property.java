
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

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
	protected int propertyHouseNo=1;
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
		if(properties.get(rand).propertyUser!=0 && properties.get(rand).propertyUser!=UserChooser)
		{
			int positionToRent=rand;
			switch(UserChooser)
			{
			case 1:balanceA.withdraw(properties.get(rand).propertyPrice);break;
			case 2:balanceB.withdraw(properties.get(rand).propertyPrice);break;
			case 3:balanceC.withdraw(properties.get(rand).propertyPrice);break;
			case 4:balanceX.withdraw(properties.get(rand).propertyPrice);break;
			case 5:balanceY.withdraw(properties.get(rand).propertyPrice);break;
			case 6:balanceZ.withdraw(properties.get(rand).propertyPrice);break;
			}
			
			switch(properties.get(rand).propertyUser)
			{
			case 1:balanceA.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameA+"\n\n"+command;break;
			case 2:balanceB.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameB+"\n\n"+command;break;
			case 3:balanceC.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameC+"\n\n"+command;break;
			case 4:balanceX.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameX+"\n\n"+command;break;
			case 5:balanceY.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameY+"\n\n"+command;break;
			case 6:balanceZ.deposit(properties.get(positionToRent).propertyPrice);command=properties.get(positionToRent).propertyPrice+" payed to "+UserNameZ+"\n\n"+command;break;
			}
			txtpnInfo.setText(command);
		}
		else
		{
			command="You dont't owe rent\n\n"+command;
			txtpnInfo.setText(command);
		}
		
		
	}

//	void demolishHouse()
//	{
//		command="What location would you like to demolish a house at\n\n"+command;
//		txtpnInfo.setText(command);
//		
//		EnterText.addActionListener( new ActionListener()
//		{
//			
//			public void actionPerformed(ActionEvent e)
//		    {
//				String location=EnterText.getText();
//				
//				switch(UserChooser)
//				{
//				case 1:if(match(propertiesUserA,location)!=null)
//				{
//					command="How many houses would you like to demolish\n\n"+command;
//					txtpnInfo.setText(command);
//
//					EnterText.addActionListener( new ActionListener()
//					{
//						
//						public void actionPerformed(ActionEvent e)
//					    {
//							
//							houses=Integer.parseInt(EnterText.getText());
//							propertiesUserA.get(0).propertyHouseNo-=houses;
//							if(propertiesUserA.get(0).propertyHouseNo<0)
//							{
//								command="You can only demolish houses you have\n\n"+command;
//								txtpnInfo.setText(command);
//							}
//					    }
//					});
//					
//					
//					int a=(propertiesUserA.get(0).housePrice*propertiesUserA.get(0).propertyHouseNo)/2;
//					balanceA.deposit(a);
//					System.out.println(balanceA.balance);
//					return;
//				}
//				else
//				{
//					System.out.println("worked");
//					return;
//				}
//				}
//				
//				
//		    }
//		});
//		
//		
//	}
	
	void buildHouse(){
		
		propertiesUserA.add(properties.get(0));
		
		command="What location would you like to build at?\nEnter location as a single word(CamelCase)\n\n"+command;
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
					if(match(propertiesUserA,location))
					{
						
						System.out.println("worked");
						return;
//						command="How many houses would you like to build\n\n"+command;
//						txtpnInfo.setText(command);
//	
//						EnterText.addActionListener( new ActionListener()
//						{
//							
//							public void actionPerformed(ActionEvent e)
//						    {
//								
//								houses=Integer.parseInt(EnterText.getText());
//								propertiesUserA.get(0).propertyHouseNo+=houses;
//								if(propertiesUserA.get(0).propertyHouseNo>5)
//								{
//									command="You can only have 4 houses and 1 hotel\n\n"+command;
//									txtpnInfo.setText(command);
//								}
//								int a=propertiesUserA.get(0).housePrice*propertiesUserA.get(0).propertyHouseNo;
//								balanceA.withdraw(a);
//								System.out.println(balanceA.balance);
//								return;
//						    }
//						});
						
						
						
					}
					else
					{
						System.out.println("didnt worke");
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
			if(check(location,propertiesUser.get(i)))
			{
				if(matchColour(propertiesUser.get(i),propertiesUserA))
				{
					return true;
				}
			}
		}
		return false;
		
	}

	
void mortgage(){
		
		propertiesUserA.add(properties.get(0));
		
		command="What property would you like to mortgage?\n\n"+command;
		txtpnInfo.setText(command);
		
		EnterText.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				String location=EnterText.getText();
				
				switch(UserChooser)
				{
				case 1:if(propertiesUserA.get(0).mortgaged == 1)
					{
						command="This property is already mortgaged\n\n"+command;
						txtpnInfo.setText(command);
					}
				break;
				}
				
				switch(UserChooser)
				{
				case 1:if(match(propertiesUserA,location) && (propertiesUserA.get(0).mortgaged == 0) ){
						
						propertiesUserA.get(0).mortgaged = 1;
						balanceA.deposit(propertiesUserA.get(0).mortgageprice);
						
						command="The property you mortgaged is :"+location +"\n\n" +command;
						txtpnInfo.setText(command);
						
				
					}
				break;
				}
				
				
		    }
		});
	}

void redeem(){
	
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
	
	
	
	
}