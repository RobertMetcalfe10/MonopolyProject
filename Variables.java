import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;

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
	protected static int MovesA=0;
	protected static int MovesB=0;
	protected static int MovesC=0;
	protected static int MovesX=0;
	protected static int MovesY=0;
	protected static int MovesZ=0;
	protected static String UserNameA;
	protected static String UserNameB;
	protected static String UserNameC;
	protected static String UserNameX;
	protected static String UserNameY;
	protected static String UserNameZ;
	protected static String print;
	protected static int randomNum=0;
	protected static int colour;
	protected static int UserChooser=1;
	protected static int NumOfUsers=1;
	protected static boolean CardUsed=false;
	protected static JLabel lblA = new JLabel("A");
	protected static JLabel lblB = new JLabel("B");
	protected static JLabel lblC = new JLabel("C");
	protected static JLabel lblX = new JLabel("X");
	protected static JLabel lblY = new JLabel("Y");
	protected static JLabel lblZ = new JLabel("Z");
	protected static JTextPane txtpnInfo = new JTextPane();
	protected static JTextPane PropertyPane=new JTextPane();
	protected static JTextPane CardPane=new JTextPane();
	protected static JButton btnRollDice = new JButton("Roll Dice");
	protected static JInternalFrame CardFrame=new JInternalFrame();
	protected static JInternalFrame HelpFrame = new JInternalFrame("List Of Commands");
	protected static JInternalFrame PropertyFrame = new JInternalFrame("Your Property Details");

	protected static int propertyNo=0;
	protected static BankAccount balanceA=new BankAccount(1500);
	protected static BankAccount balanceB=new BankAccount(1500);
	protected static BankAccount balanceC=new BankAccount(1500);
	protected static BankAccount balanceX=new BankAccount(1500);
	protected static BankAccount balanceY=new BankAccount(1500);
	protected static BankAccount balanceZ=new BankAccount(1500);
	
	protected static int array[]={1,2,3,4,5,6};
	protected static ArrayList<Integer> LoseUser=new ArrayList<Integer>(6);
	protected static void fillLoseUser()
	{
		LoseUser.add(1);
		LoseUser.add(2);
		LoseUser.add(3);
		LoseUser.add(4);
		LoseUser.add(5);
		LoseUser.add(6);
	}

	protected static ArrayList<Property> properties = new ArrayList<Property>(40);
	protected static void fillProperties()
	{
		properties.add(new Property(0,"Start",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(1,"OldKentRoad",60,2,10,30,90,160,250,"brown",50,0,100));
		properties.add(new Property(2,"CommunityChest",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(3,"WhitechapelRoad",60,4,20,60,180,320,450,"brown",50,0,100));
		properties.add(new Property(4,"IncomeTax",0,0,0,0,0,0,0,"tax",0,0,0));
		properties.add(new Property(5,"KingsCrossStation",200,25,50,100,200,0,0,"station",50,0,100));
		properties.add(new Property(6,"TheAngelIslington",100,6,30,90,270,400,550,"blue",50,0,100));
		properties.add(new Property(7,"Chance",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(8,"EustonRoad",100,6,30,90,270,400,550,"blue",50,0,100));
		properties.add(new Property(9,"PentovilleRoad",120,8,40,100,300,450,600,"blue",50,0,100));
		properties.add(new Property(10,"Jail",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(11,"PallMall",140,10,50,150,450,625,750,"purple",50,0,100));
		properties.add(new Property(12,"ElectricCompany",150,0,0,0,0,0,0,"ecww",50,0,100));
		properties.add(new Property(13,"WhiteHall",140,10,50,150,450,625,750,"purple",50,0,100));
		properties.add(new Property(14,"NorthumberlandAvenue",160,12,60,180,500,700,900,"purple",50,0,100));
		properties.add(new Property(15,"MaryleboneStation",200,25,50,100,200,0,0,"station",50,0,100));
		properties.add(new Property(16,"BowStreet",180,14,70,200,550,750,950,"orange",50,0,100));
		properties.add(new Property(17,"CommunityChest",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(18,"MarlboroughStreet",180,14,70,200,550,750,950,"orange",50,0,100));
		properties.add(new Property(19,"VineStreet",200,16,80,220,600,800,1000,"orange",50,0,100));
		properties.add(new Property(20,"FreeParking",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(21,"Strand",220,18,90,250,700,875,1050,"red",50,0,100));
		properties.add(new Property(22,"Chance",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(23,"FleetSteet",220,18,90,250,700,875,1050,"red",50,0,100));
		properties.add(new Property(24,"TrafalgarSquare",240,18,90,250,700,875,1050,"red",50,0,100));
		properties.add(new Property(25,"FrenchurchStStation",200,25,50,100,200,0,0,"station",0,0,0));
		properties.add(new Property(26,"LeicesterSquare",260,20,100,300,750,925,1100,"yellow",50,0,100));
		properties.add(new Property(27,"CoventrySteet",260,20,100,300,750,925,1100,"yellow",50,0,100));
		properties.add(new Property(28,"WaterWorks",0,0,0,0,0,0,0,"ecww",50,0,100));
		properties.add(new Property(29,"Piccadilly",280,22,110,330,800,975,1150,"yellow",50,0,100));
		properties.add(new Property(30,"Go2Jail",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(31,"RegentStreet",300,26,130,390,900,1100,1275,"green",50,0,100));
		properties.add(new Property(32,"OxfordStreet",300,26,130,390,900,1100,1275,"green",50,0,100));
		properties.add(new Property(33,"CommunityChest",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(34,"BondStreet",320,28,150,450,1000,1200,1400,"green",50,0,100));
		properties.add(new Property(35,"LiverpoolStreetStation",200,25,50,100,200,0,0,"station",50,0,100));
		properties.add(new Property(36,"Chance",0,0,0,0,0,0,0,"white",0,0,0));
		properties.add(new Property(37,"ParkLane",350,35,175,500,1100,1300,1500,"navy",50,0,100));
		properties.add(new Property(38,"Supertax",100,0,0,0,0,0,0,"tax",0,0,0));
		properties.add(new Property(39,"Mayfair",400,50,200,600,1400,1700,2000,"navy",50,0,100));
	}	
	
	protected static ArrayList<Property> propertiesUserA = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserB = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserC = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserX = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserY = new ArrayList<Property>();
	protected static ArrayList<Property> propertiesUserZ = new ArrayList<Property>();
	
	
	protected static ArrayList<Card> ChanceCard = new ArrayList<Card>();
	protected static ArrayList<Card> CommunityCard = new ArrayList<Card>();
	protected static void fillCards()
	{
		ChanceCard.add(new Card(0,"test chance"));
		CommunityCard.add(new Card(0,"test chest"));
	}

	
	JTextField EnterText = new JTextField();
	protected int houses=0;
	
	protected static boolean a=false;
	protected static boolean b=false;
	protected static boolean c=false;
	protected static boolean x=false;
	protected static boolean y=false;
	protected static boolean z=false;

	protected static int user1=0;
	protected static int user2=0;
	protected static int user3=0;
	protected static int user4=0;
	protected static int user5=0;
	protected static int user6=0;
	
	
	protected static boolean EIC=false;
	protected static boolean loc=true;
	protected static String location="";
	protected static String str="";
	
}

