package Monopoly;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Variables {
	
	protected JFrame frame;
	protected JTextField textField;
	protected static String command="";
	protected static String propertyDets ="";
	protected static int UserA=1;
	protected static int UserB=1;
	protected static int UserC=1;
	protected static int UserX=1;
	protected static int UserY=1;
	protected static int UserZ=1;
	protected static String UserNameA;
	protected static String UserNameB;
	protected static String UserNameC;
	protected static String UserNameX;
	protected static String UserNameY;
	protected static String UserNameZ;
	protected static String print;
	protected static int randomNum;
	protected static int colour;
	protected static int UserChooser=1;
	protected static int NumOfUsers=1;
	protected static JLabel lblA = new JLabel("A");
	protected static JLabel lblB = new JLabel("B");
	protected static JLabel lblC = new JLabel("C");
	protected static JLabel lblX = new JLabel("X");
	protected static JLabel lblY = new JLabel("Y");
	protected static JLabel lblZ = new JLabel("Z");
	protected static JTextPane txtpnInfo = new JTextPane();
	protected static JTextPane PropertyPane=new JTextPane();
	protected static JButton btnRollDice = new JButton("Roll Dice");
	protected static JInternalFrame HelpFrame = new JInternalFrame("List Of Commands");
	protected static JInternalFrame PropertyFrame = new JInternalFrame("Your Property Details");
	// http://www.java2s.com/Tutorial/Java/0240__Swing/CustomizingaJInternalFrameLookandFeel.htm //
	protected static int propertyNo=0;
	protected static BankAccount balanceA=new BankAccount(1500);
	protected static BankAccount balanceB=new BankAccount(0);
	protected static BankAccount balanceC=new BankAccount(2500);
	protected static BankAccount balanceX=new BankAccount(3500);
	protected static BankAccount balanceY=new BankAccount(4500);
	protected static BankAccount balanceZ=new BankAccount(5500);

	protected static int xCoOrdinate=614;
	protected static int yCoOrdinate=661;
	

//	protected static ArrayList<Property> properties = new ArrayList<Property>();
//	{
//		properties.add(0,new Property(1,"Start",0,0));
//		properties.add(1,new Property(2,"OldKentRd",60,0));
//		properties.add(2,new Property(3,"CommunityChest",0,0));
//		properties.add(3,new Property(4,"WhiteChapelRoad",60,0));
//		properties.add(4,new Property(5,"IncomeTax",0,0));
//		properties.add(5,new Property(6,"KingsCrossStation",60,0));
//		properties.add(6,new Property(7,"TheAngelIslington",100,0));
//	}
	
//	protected static Property prop[]=new Property[7];{
//	prop[0]=new Property(1,"Start",0,0);
//	prop[1]=new Property(2,"OldKentRd",60,0);
//	prop[2]=new Property(3,"CommunityChest",0,0);
//	prop[3]=new Property(4,"WhiteChapelRoad",60,0);
//	prop[4]=new Property(5,"IncomeTax",0,0);
//	prop[5]=new Property(6,"KingsCrossStation",60,0);
//	prop[6]=new Property(7,"TheAngelIslington",100,0);
//	}

	
	
	
	protected static ArrayList<Property> propertiesUserA = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserB = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserC = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserX = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserY = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserZ = new ArrayList<Property>();
	
	// (BlockID,BlockName,BlockPrice,BlockRent)
	

//		properties.add(0,new Property(1,Start,null,{2,10,30,90,160,250},));
//		properties.add(new Property(2,OldKentRd,60,{4,20,60,180,320,450},));
//		properties.add(Property(3,CommunityChest,null,));
//		properties.add(Property(4,WhiteChapelRoad,60,{6,30,90,270,400,550},));
//		properties.add(Property(5,IncomeTax,null,));
//		properties.add(Property(6,KingsCrossStation,null,));
//		properties.add(Property(7,TheAngelIslington,100,{6,30,90,270,400,550},));
//		properties.add(Property(8,Chance,null,));
//		properties.add(Property(9,EustonRoad,100,{8,40,100,300,450,600},));
//		properties.add(Property(10,PentovilleRoad,120,{10,50,150,450,625,750},))
//		properties.add(Property(11,Jail,null,))
//		properties.add(Property(12,PallMall,140,{10,50,150,450,625,750},))
//		properties.add(Property(13,ElectricCompany,null,))
//		properties.add(Property(14,WhiteHall,140,{12,60,180,500,700,900},))
//		properties.add(Property(15,NorthumberlandAvenue,160,{14,70,200,550,750,950},))
//		properties.add(Property(16,MaryleboneStation,null,))
//		properties.add(Property(17,BowStreet,180,{25,50,100,200,200,200},))
//		properties.add(Property(18,CommunityChest,null,))
//		properties.add(Property(19,MarlboroughStreet,180,{14,70,200,550,750,950},))
//		properties.add(Property(20,VineStreet,200,{16,80,220,600,800,1000},))
//		properties.add(Property(21,FreeParking,null,))
//		properties.add(Property(22,Strand,220,{18,90,250,700,875,1050},))
//		properties.add(Property(23,Chance,null,))
//		properties.add(Property(24,FleetSteet,220,{4,10,0,0,0,0},))
//		properties.add(Property(25,TrafalgarSquare,240,,{18,90,250,700,875,1050}))
//		properties.add(Property(26,FrenchurchStStation,null,))
//		properties.add(Property(27,LeicesterSquare,260,{20,100,300,750,925,1100},))
//		properties.add(Property(28,CoventrySteet,260,{22,110,330,800,975,1150},))
//		properties.add(Property(29,WaterWorks,null,))
//		properties.add(Property(30,Piccadilly,280,{22,110,330,800,975,1150},))
//		properties.add(Property(31,Go2Jail,null,))
//		properties.add(Property(32,RegentStreet,300,{22,120,360,850,1025,1200},))
//		properties.add(Property(33,OxfordStreet,300,{26,130,390,900,1100,1275},))
//		properties.add(Property(34,CommunityChest,null,))
//		properties.add(Property(35,BondStreet,320,{28,150,450,1000,1200,1400},))
//		properties.add(Property(36,LiverpoolStreetStation,null,))
//		properties.add(Property(37,Chance,null,))
//		properties.add(Property(38,ParkLane,350,{35,175,500,1100,1300,1500},))
//		properties.add(Property(49,Supertax,null,))
//		properties.add(Property(40,Mayfair,400,{40,200,550,2100,1400,1600}))
}

