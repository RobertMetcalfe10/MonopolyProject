import java.util.Random;

import javax.swing.JOptionPane;

public class Card extends Variables{
	protected String text;
	protected int fine;
	protected int collect;
	protected int id;
	
	Card()
	{
		
	}
	
	
	Card(int ID,String caption,int collection, int tax)
	{
		id=ID;
		text=caption;
		collect=collection;
		fine=tax;

	}
	
	int DisplayCard(int CC)
	{
		Random rand = new Random();
		int R=rand.nextInt(16);
		
		if(CC==7||CC==22||CC==36)//Chance card
		{
			String cardText;
			cardText="\tYou've Pickd Up Card\n";
			cardText+=ChanceCard.get(R).text;
			chanceCards(R);
			CardPane.setText(cardText);
			return R;
		}
		else//community chest card
		{
			String cardText;
			cardText="\tYou've Pickd Up Card\n";
			cardText+=CommunityCard.get(R).text;
			communityCards(R);
			CardPane.setText(cardText);
			return R;
		}
		
	}
	
	boolean AllowCardPickUp(int rand)
	{
		switch(UserChooser)
		{
		case 1:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 2:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 3:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 4:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 5:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		case 6:if(rand==7||rand==22||rand==36||rand==2||rand==17||rand==33)
		{
			return true;
		}
		break;
		
		default:
			return false;
		}
		return false;
		
	}
	
	
	public void draw()
	{
		CardFrame.setBounds(200, 130, 300, 150);
		frame.getContentPane().add(CardFrame);
		CardFrame.getContentPane().add(CardPane);
		CardPane.setEditable(false);
		CardFrame.setVisible(false);
		boolean check=false;
		int Chance_Chest=0;
		
		switch(UserChooser)
		{
		case 1:check=AllowCardPickUp(MovesA);Chance_Chest=MovesA;
			break;
		case 2:check=AllowCardPickUp(MovesB);Chance_Chest=MovesB;
			break;
		case 3:check=AllowCardPickUp(MovesC);Chance_Chest=MovesC;
			break;
		case 4:check=AllowCardPickUp(MovesX);Chance_Chest=MovesX;
			break;
		case 5:check=AllowCardPickUp(MovesY);Chance_Chest=MovesY;
			break;
		case 6:check=AllowCardPickUp(MovesZ);Chance_Chest=MovesZ;
			break;
		}
		
		if(check)
		{
				CardFrame.setVisible(true);
				DisplayCard(Chance_Chest);
		}
	}
	
	void communityCards(int R){

		if (R == 3 || R == 4 || R == 5){
		switch(UserChooser)
		{
		case 1:balanceA.withdraw(CommunityCard.get(R).fine);command=CommunityCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 2:balanceB.withdraw(CommunityCard.get(R).fine);command=CommunityCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 3:balanceC.withdraw(CommunityCard.get(R).fine);command=CommunityCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 4:balanceX.withdraw(CommunityCard.get(R).fine);command=CommunityCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 5:balanceY.withdraw(CommunityCard.get(R).fine);command=CommunityCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 6:balanceZ.withdraw(CommunityCard.get(R).fine);command=CommunityCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		}
		}
		if (R == 6 || R == 7 || R == 8 || R == 9 || R == 10 || R == 11 || R == 12 || R == 13 ){
		switch(UserChooser)
		{
		case 1:balanceA.deposit(CommunityCard.get(R).collect);command=CommunityCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 2:balanceB.deposit(CommunityCard.get(R).collect);command=CommunityCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 3:balanceC.deposit(CommunityCard.get(R).collect);command=CommunityCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 4:balanceX.deposit(CommunityCard.get(R).collect);command=CommunityCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 5:balanceY.deposit(CommunityCard.get(R).collect);command=CommunityCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 6:balanceZ.deposit(CommunityCard.get(R).collect);command=CommunityCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		}
		}
		
		if (R == 0){
			advanceToGo();
		}
		if (R == 1){
			backToOldKentRoad();
		}
		if (R == 2){
			switch(Variables.UserChooser)
	    	{
	    	case 1:UI.lblA.setBounds(25, 661, 10, 10);UserA=11;break;
	    	case 2:UI.lblB.setBounds(36, 661, 10, 10);UserB=11;break;
	    	case 3:UI.lblC.setBounds(47, 661, 10, 10);UserC=11;break;
	    	case 4:UI.lblX.setBounds(25, 612, 10, 10);MovesX=11;break;
	    	case 5:UI.lblY.setBounds(36, 612, 10, 10);MovesY=11;break;
	    	case 6:UI.lblZ.setBounds(47, 612, 10, 10);MovesZ=11;break;
	    	}
	    	command="You landed in Jail\n\n"+command;
	    	txtpnInfo.setText(command);
		}
		if (R == 15){
			Chance10();
		}
	}
	
	void chanceCards(int R){
		if (R == 9 || R == 10 || R == 11){
		switch(UserChooser)
		{
		case 1:balanceA.withdraw(ChanceCard.get(R).fine);command=ChanceCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 2:balanceB.withdraw(ChanceCard.get(R).fine);command=ChanceCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 3:balanceC.withdraw(ChanceCard.get(R).fine);command=ChanceCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 4:balanceX.withdraw(ChanceCard.get(R).fine);command=ChanceCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 5:balanceY.withdraw(ChanceCard.get(R).fine);command=ChanceCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 6:balanceZ.withdraw(ChanceCard.get(R).fine);command=ChanceCard.get(R).fine+" Was taken out of your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		}
		}
		if (R == 12 || R == 13 || R == 14){
		switch(UserChooser)
		{
		case 1:balanceA.deposit(ChanceCard.get(R).collect);command=ChanceCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 2:balanceB.deposit(ChanceCard.get(R).collect);command=ChanceCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 3:balanceC.deposit(ChanceCard.get(R).collect);command=ChanceCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 4:balanceX.deposit(ChanceCard.get(R).collect);command=ChanceCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 5:balanceY.deposit(ChanceCard.get(R).collect);command=ChanceCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		case 6:balanceZ.deposit(ChanceCard.get(R).collect);command=ChanceCard.get(R).collect+" Was given to your account\n\n"+command;txtpnInfo.setText(command);txtpnInfo.setText(command);break;
		}
		}
		
		if (R == 0){
			advanceToGo();
		}
		if (R == 1){
			switch(Variables.UserChooser)
	    	{
	    	case 1:UI.lblA.setBounds(25, 661, 10, 10);UserA=11;break;
	    	case 2:UI.lblB.setBounds(36, 661, 10, 10);UserB=11;break;
	    	case 3:UI.lblC.setBounds(47, 661, 10, 10);UserC=11;break;
	    	case 4:UI.lblX.setBounds(25, 612, 10, 10);MovesX=11;break;
	    	case 5:UI.lblY.setBounds(36, 612, 10, 10);MovesY=11;break;
	    	case 6:UI.lblZ.setBounds(47, 612, 10, 10);MovesZ=11;break;
	    	}
	    	command="You landed in Jail\n\n"+command;
	    	txtpnInfo.setText(command);
		}
		if (R == 2){
			advanceToPallMall();
		}
		if (R == 3){
			tripToMaryleboneStation();
		}
		if (R == 4){
			advanceToTrafalgarSquare();
		}
		if (R == 5){
			advanceToMayfair();
		}
		if (R == 6){
			backThreeSpaces();
		}
		if (R == 7){
			generalRepairs();
		}
		if (R == 8){
			streetRepairs();
		}		
	}
			
	
	void advanceToGo(){
		
		Switch SW=new Switch();
		
		switch(UserChooser)
		{
		case 1:UserA=1;balanceA.deposit(200);SW.switchUser(UserA);command="You advanced to Go and collected 200\n\n"+command;txtpnInfo.setText(command);break;
		case 2:UserB=1;balanceB.deposit(200);SW.switchUser(UserB);command="You advanced to Go and collected 200\n\n"+command;txtpnInfo.setText(command);break;
		case 3:UserC=1;balanceC.deposit(200);SW.switchUser(UserC);command="You advanced to Go and collected 200\n\n"+command;txtpnInfo.setText(command);break;
		case 4:UserX=1;balanceX.deposit(200);SW.switchUser(UserX);command="You advanced to Go and collected 200\n\n"+command;txtpnInfo.setText(command);break;
		case 5:UserY=1;balanceY.deposit(200);SW.switchUser(UserY);command="You advanced to Go and collected 200\n\n"+command;txtpnInfo.setText(command);break;
		case 6:UserZ=1;balanceZ.deposit(200);SW.switchUser(UserZ);command="You advanced to Go and collected 200\n\n"+command;txtpnInfo.setText(command);break;
		}
	}
	
	void backToOldKentRoad(){
		
		Switch SW=new Switch();
		
		switch(UserChooser)
		{
		case 1:UserA=2;SW.switchUser(UserA);command="You went back to Old Kent Road\n\n"+command;txtpnInfo.setText(command);break;
		case 2:UserB=2;SW.switchUser(UserB);command="You went back to Old Kent Road\n\n"+command;txtpnInfo.setText(command);break;
		case 3:UserC=2;SW.switchUser(UserC);command="You went back to Old Kent Road\n\n"+command;txtpnInfo.setText(command);break;
		case 4:UserX=2;SW.switchUser(UserX);command="You went back to Old Kent Road\n\n"+command;txtpnInfo.setText(command);break;
		case 5:UserY=2;SW.switchUser(UserY);command="You went back to Old Kent Road\n\n"+command;txtpnInfo.setText(command);break;
		case 6:UserZ=2;SW.switchUser(UserZ);command="You went back to Old Kent Road\n\n"+command;txtpnInfo.setText(command);break;
		}
	}
	
	void advanceToPallMall(){
		
		Switch SW=new Switch();
		
		switch(UserChooser)
		{
		case 1:if(UserA>11){UserA=12;balanceA.deposit(200);SW.switchUser(UserA);command="You advanced to Pall Mall and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserA=12;SW.switchUser(UserA);command="You advanced to Pall Mall\n\n"+command;txtpnInfo.setText(command);}break;
		case 2:if(UserB>11){UserB=12;balanceB.deposit(200);SW.switchUser(UserB);command="You advanced to Pall Mall and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserB=12;SW.switchUser(UserB);command="You advanced to Pall Mall\n\n"+command;txtpnInfo.setText(command);}break;
		case 3:if(UserC>11){UserC=12;balanceC.deposit(200);SW.switchUser(UserC);command="You advanced to Pall Mall and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserC=12;SW.switchUser(UserB);command="You advanced to Pall Mall\n\n"+command;txtpnInfo.setText(command);}break;
		case 4:if(UserX>11){UserX=12;balanceX.deposit(200);SW.switchUser(UserX);command="You advanced to Pall Mall and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserX=12;SW.switchUser(UserX);command="You advanced to Pall Mall\n\n"+command;txtpnInfo.setText(command);}break;
		case 5:if(UserY>11){UserY=12;balanceY.deposit(200);SW.switchUser(UserY);command="You advanced to Pall Mall and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserY=12;SW.switchUser(UserY);command="You advanced to Pall Mall\n\n"+command;txtpnInfo.setText(command);}break;
		case 6:if(UserZ>11){UserZ=12;balanceZ.deposit(200);SW.switchUser(UserZ);command="You advanced to Pall Mall and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserZ=12;SW.switchUser(UserZ);command="You advanced to Pall Mall\n\n"+command;txtpnInfo.setText(command);}break;
		}
	}
	
	 void tripToMaryleboneStation(){
		 
			Switch SW=new Switch();
		 
		 switch(UserChooser)
			{
			case 1:if(UserA>15){UserA=16;balanceA.deposit(200);SW.switchUser(UserA);command="You advanced to Marylebone Station and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserA=16;SW.switchUser(UserA);command="You advanced to Marylebone Station\n\n"+command;txtpnInfo.setText(command);}break;
			case 2:if(UserB>15){UserB=16;balanceB.deposit(200);SW.switchUser(UserB);command="You advanced to Marylebone Station and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserB=16;SW.switchUser(UserB);command="You advanced to Marylebone Station\n\n"+command;txtpnInfo.setText(command);}break;
			case 3:if(UserC>15){UserC=16;balanceC.deposit(200);SW.switchUser(UserC);command="You advanced to Marylebone Station and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserC=16;SW.switchUser(UserC);command="You advanced to Marylebone Station\n\n"+command;txtpnInfo.setText(command);}break;
			case 4:if(UserX>15){UserX=16;balanceX.deposit(200);SW.switchUser(UserX);command="You advanced to Marylebone Station and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserX=16;SW.switchUser(UserX);command="You advanced to Marylebone Station\n\n"+command;txtpnInfo.setText(command);}break;
			case 5:if(UserY>15){UserY=16;balanceY.deposit(200);SW.switchUser(UserY);command="You advanced to Marylebone Station and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserY=16;SW.switchUser(UserY);command="You advanced to Marylebone Station\n\n"+command;txtpnInfo.setText(command);}break;
			case 6:if(UserZ>15){UserZ=16;balanceZ.deposit(200);SW.switchUser(UserZ);command="You advanced to Marylebone Station and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserZ=16;SW.switchUser(UserZ);command="You advanced to Marylebone Station\n\n"+command;txtpnInfo.setText(command);}break;
			}
	 }
	
	void advanceToTrafalgarSquare(){
		
		Switch SW=new Switch();
		
		switch(UserChooser)
		{
		case 1:if(UserA>24){UserA=25;balanceA.deposit(200);SW.switchUser(UserA);command="You advanced to Trafalgar Square and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserA=25;SW.switchUser(UserA);command="You advanced to Trafalgar Square\n\n"+command;txtpnInfo.setText(command);}break;
		case 2:if(UserB>24){UserB=25;balanceB.deposit(200);SW.switchUser(UserB);command="You advanced to Trafalgar Square and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserB=25;SW.switchUser(UserB);command="You advanced to Trafalgar Square\n\n"+command;txtpnInfo.setText(command);}break;
		case 3:if(UserC>24){UserC=25;balanceC.deposit(200);SW.switchUser(UserC);command="You advanced to Trafalgar Square and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserC=25;SW.switchUser(UserC);command="You advanced to Trafalgar Square\n\n"+command;txtpnInfo.setText(command);}break;
		case 4:if(UserX>24){UserX=25;balanceX.deposit(200);SW.switchUser(UserX);command="You advanced to Trafalgar Square and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserX=25;SW.switchUser(UserX);command="You advanced to Trafalgar Square\n\n"+command;txtpnInfo.setText(command);}break;
		case 5:if(UserY>24){UserY=25;balanceY.deposit(200);SW.switchUser(UserY);command="You advanced to Trafalgar Square and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserY=25;SW.switchUser(UserY);command="You advanced to Trafalgar Square\n\n"+command;txtpnInfo.setText(command);}break;
		case 6:if(UserZ>24){UserZ=25;balanceZ.deposit(200);SW.switchUser(UserZ);command="You advanced to Trafalgar Square and collected 200\n\n"+command;txtpnInfo.setText(command);}else{UserZ=25;SW.switchUser(UserZ);command="You advanced to Trafalgar Square\n\n"+command;txtpnInfo.setText(command);}break;
		}
	}
	
	void advanceToMayfair(){
		
		Switch SW=new Switch();
		
		switch(UserChooser)
		{
		case 1:UserA=40;SW.switchUser(UserA);command="You advanced to Mayfair\n\n"+command;txtpnInfo.setText(command);break;
		case 2:UserB=40;SW.switchUser(UserB);command="You advanced to Mayfair\n\n"+command;txtpnInfo.setText(command);break;
		case 3:UserC=40;SW.switchUser(UserC);command="You advanced to Mayfair\n\n"+command;txtpnInfo.setText(command);break;
		case 4:UserX=40;SW.switchUser(UserX);command="You advanced to Mayfair\n\n"+command;txtpnInfo.setText(command);break;
		case 5:UserY=40;SW.switchUser(UserY);command="You advanced to Mayfair\n\n"+command;txtpnInfo.setText(command);break;
		case 6:UserZ=40;SW.switchUser(UserZ);command="You advanced to Mayfair\n\n"+command;txtpnInfo.setText(command);break;
		}
	}
	
	void backThreeSpaces(){
		
		Switch SW=new Switch();
		
		switch(UserChooser)
		{
		case 1:UserA=UserA-3;SW.switchUser(UserA);command="You back three spaces\n\n"+command;txtpnInfo.setText(command);break;
		case 2:UserB=UserB-3;SW.switchUser(UserB);command="You back three spaces\n\n"+command;txtpnInfo.setText(command);break;
		case 3:UserC=UserC-3;SW.switchUser(UserC);command="You back three spaces\n\n"+command;txtpnInfo.setText(command);break;
		case 4:UserX=UserX-3;SW.switchUser(UserX);command="You back three spaces\n\n"+command;txtpnInfo.setText(command);break;
		case 5:UserY=UserY-3;SW.switchUser(UserY);command="You back three spaces\n\n"+command;txtpnInfo.setText(command);break;
		case 6:UserZ=UserZ-3;SW.switchUser(UserZ);command="You back three spaces\n\n"+command;txtpnInfo.setText(command);break;
		}
	}
	
	void generalRepairs(){
		switch(UserChooser)
		{
		
		case 1:	for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 2:	for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 3:	for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 4:	for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 5:	for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 6:	for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		
		}
	}
	
	void streetRepairs(){
		switch(UserChooser)
		{
		case 1:for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 2:for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 3:for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 4:for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 5:for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		case 6:for(int i=0; i<propertiesUserA.size();i++)
		{
			if(propertiesUserA.get(i).propertyHouseNo>=5)
			{balanceA.withdraw(100);}
			else
			{balanceA.withdraw(propertiesUserA.get(i).propertyHouseNo*25);}
		}break;
		}
	}
	
	void Chance10()
	{
		int a=JOptionPane.showConfirmDialog(null, "Get 10(yes) or pick up a chance(no)");
		switch(UserChooser)
		{
		case 1: if(a==0){balanceA.deposit(10);}else if(a==1){draw();}else{Chance10();}break;
		case 2: if(a==0){balanceB.deposit(10);}else if(a==1){draw();}else{Chance10();}break;
		case 3: if(a==0){balanceC.deposit(10);}else if(a==1){draw();}else{Chance10();}break;
		case 4: if(a==0){balanceX.deposit(10);}else if(a==1){draw();}else{Chance10();}break;
		case 5: if(a==0){balanceY.deposit(10);}else if(a==1){draw();}else{Chance10();}break;
		case 6: if(a==0){balanceZ.deposit(10);}else if(a==1){draw();}else{Chance10();}break;
		
		}
	}
	
	void getOutOfJail(){
		switch(UserChooser)
		{
		case 1: GOJA=true;
		case 2: GOJB=true;
		case 3: GOJC=true;
		case 4: GOJX=true;
		case 5: GOJY=true;
		case 6: GOJZ=true;
		}
	}
	
	
	
	void setJail()
	{
		switch(UserChooser)
		{
		case 1:jailedA=3; 
		case 2:jailedB=3; 
		case 3:jailedC=3;
		case 4:jailedX=3;
		case 5:jailedY=3;
		case 6:jailedZ=3; 
		}
	}
	
	int jailed()
	{
		switch(UserChooser)
		{
		case 1: if(jailedA!=0){jailedA--;actionJail();return jailedA;}
		case 2: if(jailedB!=0){jailedB--;actionJail();return jailedB;}
		case 3: if(jailedC!=0){jailedC--;actionJail();return jailedC;}
		case 4: if(jailedX!=0){jailedX--;actionJail();return jailedX;}
		case 5: if(jailedY!=0){jailedY--;actionJail();return jailedY;}
		case 6: if(jailedZ!=0){jailedZ--;actionJail();return jailedZ;}
		default: return 0;
		}
	}
	
	void actionJail()
	{
		Object[] possibleValues = { "Pay 50", "Use GetOutOfJail", "Roll a double" };
		Object selectedValue = JOptionPane.showInputDialog(null,
				"Choose an action to leave jail", "Input",
				JOptionPane.INFORMATION_MESSAGE, null,
				possibleValues, possibleValues[0]);
		
		switch(selectedValue.toString())
		{
		case "Pay 50": 
			
			switch(UserChooser)
			{
			case 1:balanceA.withdraw(50); jailedA=0; break;
			case 2:balanceB.withdraw(50); jailedB=0; break;
			case 3:balanceC.withdraw(50); jailedC=0; break;
			case 4:balanceX.withdraw(50); jailedX=0; break;
			case 5:balanceY.withdraw(50); jailedY=0; break;
			case 6:balanceZ.withdraw(50); jailedZ=0; break;
			}
			
			break;
			
		case "Use GetOutOfJail": 

			switch(UserChooser)
			{
			case 1: if(!GOJA){JOptionPane.showMessageDialog(null, "You don't own a GetOutOfJail card"); actionJail();}
			else{JOptionPane.showMessageDialog(null, "You are free from jail");jailedA=0;}break;
			case 2: if(!GOJB){JOptionPane.showMessageDialog(null, "You don't own a GetOutOfJail card"); actionJail();}
			else{JOptionPane.showMessageDialog(null, "You are free from jail");jailedB=0;}break;
			case 3: if(!GOJC){JOptionPane.showMessageDialog(null, "You don't own a GetOutOfJail card"); actionJail();}
			else{JOptionPane.showMessageDialog(null, "You are free from jail");jailedC=0;}break;
			case 4: if(!GOJX){JOptionPane.showMessageDialog(null, "You don't own a GetOutOfJail card"); actionJail();}
			else{JOptionPane.showMessageDialog(null, "You are free from jail");jailedX=0;}break;
			case 5: if(!GOJY){JOptionPane.showMessageDialog(null, "You don't own a GetOutOfJail card"); actionJail();}
			else{JOptionPane.showMessageDialog(null, "You are free from jail");jailedY=0;}break;
			case 6: if(!GOJZ){JOptionPane.showMessageDialog(null, "You don't own a GetOutOfJail card"); actionJail();}
			else{JOptionPane.showMessageDialog(null, "You are free from jail");jailedZ=0;}break;
			}
			
			break;
			
		case "Roll a double": 
			
			Random rand = new Random();
			randomNum=rand.nextInt(6)+1;
			int randomNum2=rand.nextInt(6)+1;
			if(randomNum==randomNum2){
				JOptionPane.showMessageDialog(null, "You are free from jail, you rolled a double");
				switch(UserChooser)
				{
				case 1:jailedA=0;break;
				case 2:jailedB=0;break;
				case 3:jailedC=0;break;
				case 4:jailedX=0;break;
				case 5:jailedY=0;break;
				case 6:jailedZ=0;break;
				}
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You didn't roll a double");
				UserChooser++;
		    	if(UserChooser>NumOfUsers)
		    	{
		    		UserChooser%=NumOfUsers;
		    	}
		    	switch(UserChooser)
		    	{
		    	case 1:if(UserChooser==1&&a){command="This user has been eliminated, please type done to continue to the next player\n\n"+command; txtpnInfo.setText(command);}
		    	else
		    	{
		    		print=UserNameA;
		    		command="It is now "+ print + "'s turn\n** TURN ENDED  **\n\n"+command;
			        txtpnInfo.setText(command);
		    	}
		    	break;
		    	case 2:if(UserChooser==2&&b){command="This user has been eliminated, please type done to continue to the next player\n\n"+command; txtpnInfo.setText(command);}
		    	else
		    	{
		    		print=UserNameB;
		    		command="It is now "+ print + "'s turn\n** TURN ENDED  **\n\n"+command;
			        txtpnInfo.setText(command);
		    	}
		    	break;
		    	case 3:if(UserChooser==3&&c){command="This user has been eliminated, please type done to continue to the next player\n\n"+command; txtpnInfo.setText(command);}
		    	else
		    	{
		    		print=UserNameC;
		    		command="It is now "+ print + "'s turn\n** TURN ENDED  **\n\n"+command;
			        txtpnInfo.setText(command);
		    	}
		    	break;
		    	case 4:if(UserChooser==4&&x){command="This user has been eliminated, please type done to continue to the next player\n\n"+command; txtpnInfo.setText(command);}
		    	else
		    	{
		    		print=UserNameX;
		    		command="It is now "+ print + "'s turn\n** TURN ENDED  **\n\n"+command;
			        txtpnInfo.setText(command);
		    	}
		    	break;
		    	case 5:if(UserChooser==5&&y){command="This user has been eliminated, please type done to continue to the next player\n\n"+command; txtpnInfo.setText(command);}
		    	else
		    	{
		    		print=UserNameY;
		    		command="It is now "+ print + "'s turn\n** TURN ENDED  **\n\n"+command;
			        txtpnInfo.setText(command);
		    	}
		    	break;
		    	case 6:if(UserChooser==6&&z){command="This user has been eliminated, please type done to continue to the next player\n\n"+command; txtpnInfo.setText(command);}
		    	else
		    	{
		    		print=UserNameZ;
		    		command="It is now "+ print + "'s turn\n** TURN ENDED  **\n\n"+command;
			        txtpnInfo.setText(command);
		    	}
		    	break;
		    	}
		    	
		    	
			}
			
			break;
		}
	}
	
	
}