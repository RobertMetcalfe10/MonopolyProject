import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultCaret;

public class UI extends Property
{
	// Function for change of colour
	Color randColour()
	{
		Color SWColour = null;
		switch(UserChooser)
		{
		case 1:SWColour=Color.BLUE;break;
		case 2:SWColour=Color.RED;break;
		case 3:SWColour=Color.YELLOW;break;
		case 4:SWColour=Color.CYAN;break;
		case 5:SWColour=Color.GREEN;break;
		case 6:SWColour=Color.ORANGE;break;
		}
		return SWColour;
		
	}
	// Money collecting after passing go and movement
	void randNumAddition()
	{
		 Switch SW=new Switch();
		
		 switch(UserChooser)
	     {
	     case 1:UserA+=randomNum;if(UserA>40){UserA-=40;balanceA.deposit(200);}
	     MovesA+=randomNum;if(MovesA>40)MovesA-=40;
	     SW.switchUser(UserA);break;
	     case 2:UserB+=randomNum;if(UserB>40){UserB-=40;balanceB.deposit(200);}
	     MovesB+=randomNum;if(MovesB>40)MovesB-=40;
	     SW.switchUser(UserB);break;
	     case 3:UserC+=randomNum;if(UserC>40){UserC-=40;balanceC.deposit(200);}
	     MovesC+=randomNum;if(MovesC>40)MovesC-=40;
	     SW.switchUser(UserC);break;
	     case 4:UserX+=randomNum;if(UserX>40){UserX-=40;balanceX.deposit(200);}
	     MovesX+=randomNum;if(MovesX>40)MovesX-=40;
	     SW.switchUser(UserX);break;
	     case 5:UserY+=randomNum;if(UserY>40){UserY-=40;balanceY.deposit(200);}
	     MovesY+=randomNum;if(MovesY>40)MovesY-=40;
	     SW.switchUser(UserY);break;
	     case 6:UserZ+=randomNum;if(UserZ>40){UserZ-=40;balanceZ.deposit(200);}
	     MovesZ+=randomNum;if(MovesZ>40)MovesZ-=40;
	     SW.switchUser(UserZ);break;
	     }
		 randomNum=0;
	}
	
	// Function which asks us for the amount of players playing and their names
	void addUser()
	{
	NumOfUsers=Integer.parseInt(JOptionPane.showInputDialog("How many Users is there?",NumOfUsers));
	while(NumOfUsers<2||NumOfUsers>6)
	{
		JOptionPane.showMessageDialog(null, "Error\nInvalid number of users\nEnter a number between 2-6");
		NumOfUsers=Integer.parseInt(JOptionPane.showInputDialog("How many Users is there?",NumOfUsers));
	}
		for(int i=1;i<=NumOfUsers;i++)
		{
			
			switch(UserChooser)
			{
			case 1:UserNameA=JOptionPane.showInputDialog("Enter Username");break;
			case 2:UserNameB=JOptionPane.showInputDialog("Enter Username");
			while(UserNameB.equals(UserNameA)){
				JOptionPane.showMessageDialog(null,"Username taken");
				UserNameB=JOptionPane.showInputDialog("Enter Username");
				}
			break;
			case 3:UserNameC=JOptionPane.showInputDialog("Enter Username");
			while(UserNameC.equals(UserNameA)||UserNameC.equals(UserNameB)){
				JOptionPane.showMessageDialog(null,"Username taken");
				UserNameC=JOptionPane.showInputDialog("Enter Username");
				}break;
			case 4:UserNameX=JOptionPane.showInputDialog("Enter Username");
			while(UserNameX.equals(UserNameA)||UserNameX.equals(UserNameB)||UserNameX.equals(UserNameC)){
				JOptionPane.showMessageDialog(null,"Username taken");
				UserNameX=JOptionPane.showInputDialog("Enter Username");
				}break;
			case 5:UserNameY=JOptionPane.showInputDialog("Enter Username");
			while(UserNameY.equals(UserNameA)||UserNameY.equals(UserNameB)||UserNameY.equals(UserNameC)||UserNameY.equals(UserNameX)){
				JOptionPane.showMessageDialog(null,"Username taken");
				UserNameY=JOptionPane.showInputDialog("Enter Username");
				}break;
			case 6:UserNameZ=JOptionPane.showInputDialog("Enter Username");
			while(UserNameZ.equals(UserNameA)||UserNameZ.equals(UserNameB)||UserNameZ.equals(UserNameC)||UserNameZ.equals(UserNameX)||UserNameZ.equals(UserNameY)){
				JOptionPane.showMessageDialog(null,"Username taken");
				UserNameZ=JOptionPane.showInputDialog("Enter Username");
				}break;
			}
			UserChooser++;
			
		}
		UserChooser=1;
	}
	
	// Function which determines who rolls first based on highest roll
	void firstRoll()
	{
		Random rand = new Random();
		int a = 0,b = 0,c = 0,x = 0,y = 0,z = 0;
		int max = 0;
		for(UserChooser = 1;UserChooser<=NumOfUsers;UserChooser++){
	    	switch(UserChooser)
	    	{
	    	case 1: a = randomNum=rand.nextInt(11)+2;max = a;
			break;
	    	case 2: b = randomNum=rand.nextInt(11)+2;if (b > max)max = b;
	    	break;
	    	case 3: c = randomNum=rand.nextInt(11)+2;if (c > max)max = c;
	    	break;
	    	case 4: x = randomNum=rand.nextInt(11)+2;if (x > max)max = x;
	    	break;
	    	case 5: y = randomNum=rand.nextInt(11)+2;if (y > max)max = y;
	    	break;
	    	case 6: z = randomNum=rand.nextInt(11)+2;if (z > max)max = z;
	    	break;
	    	}
		}
		if (max==a && max==b || max==a && max==c || max==a && max==x || max==a && max==y || max==a && max==z || max==b && max==c || max==b && max==x || max==b && max==y || max==b && max==z || max==c && max==x || max==c && max==y || max==c && max==z || max==x && max==y || max==x && max==z || max==y && max==z){
			firstRoll();
		}
		
		else if (max == a)
		{
    JOptionPane.showMessageDialog(null,"User "+ UserNameA + " Got the highest number and rolls first");
			UserChooser = 1;
		}
		else if (max == b)
		{
    JOptionPane.showMessageDialog(null,"User "+ UserNameB + " Got the highest number and rolls first");
			UserChooser = 2;
		}
		else if (max == c)
		{
    JOptionPane.showMessageDialog(null,"User "+ UserNameC + " Got the highest number and rolls first");
			UserChooser = 3;
		}
		else if (max == x)
		{
    JOptionPane.showMessageDialog(null,"User "+ UserNameX + " Got the highest number and rolls first");
			UserChooser = 4;
		}
		else if (max == y)
		{
    JOptionPane.showMessageDialog(null,"User "+ UserNameY + " Got the highest number and rolls first");
			UserChooser = 5;
		}
		else if (max == z)
		{
    JOptionPane.showMessageDialog(null,"User "+ UserNameZ + " Got the highest number and rolls first");
			UserChooser = 6;
		}
	}
	
	// Initializing functions, JFrames, JPanes, tokens , information and user panel
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.getContentPane().setLayout(null);
		
		addUser();
		firstRoll();
		fillProperties();
		fillCards();
		fillLoseUser();
		
		JInternalFrame infoFrame = new JInternalFrame("Information Panel");
		infoFrame.setBounds(660, 0, 300, 500);
		frame.getContentPane().add(infoFrame);
		infoFrame.setFrameIcon(null); 
		
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInfo.setText(command);
		txtpnInfo.setEditable(false);
		txtpnInfo.setBackground(Color.BLACK);
		txtpnInfo.setForeground(randColour());
	
		infoFrame.getContentPane().add(txtpnInfo, BorderLayout.CENTER);
		infoFrame.setVisible(true);
		
		JScrollPane scrollBar = new JScrollPane(txtpnInfo);
		infoFrame.getContentPane().add(scrollBar, BorderLayout.CENTER);
		
		
		JInternalFrame internalFrame = new JInternalFrame("User Panel");
		internalFrame.setBounds(660, 500, 300, 177);
		frame.getContentPane().add(internalFrame);
		internalFrame.setVisible(true);
		internalFrame.setFrameIcon(null); 
				

		EnterText.setToolTipText("Enter Command Here");
		EnterText.setText(null);
		internalFrame.getContentPane().add(EnterText, BorderLayout.CENTER);
		EnterText.setBackground(Color.BLACK);
		EnterText.setForeground(randColour());
		
		EnterText.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				EnterText.setText(null);
				}			
		});
		
		

		lblA.setForeground(Color.RED);
		lblA.setBounds(614, 661, 10, 10);
		frame.getContentPane().add(lblA);
		lblA.setVisible(true);
		
		lblB.setForeground(Color.RED);
		lblB.setBounds(625, 661, 10, 10);
		frame.getContentPane().add(lblB);
		lblB.setVisible(true);
		
		lblC.setForeground(Color.RED);
		lblC.setBounds(636, 661, 10, 10);
		frame.getContentPane().add(lblC);
		if(NumOfUsers>2){
			lblC.setVisible(true);
		}else{
			lblC.setVisible(false);
		}
		
		lblX.setForeground(Color.RED);
		lblX.setBounds(614, 612, 10, 10);
		frame.getContentPane().add(lblX);
		
		if(NumOfUsers>3){
			lblX.setVisible(true);
		}else{
			lblX.setVisible(false);
		}
		
		lblY.setForeground(Color.RED);
		lblY.setBounds(625, 612, 10, 10);
		frame.getContentPane().add(lblY);
		
		if(NumOfUsers>4){
			lblY.setVisible(true);
		}else{
			lblY.setVisible(false);
		}
		
		lblZ.setForeground(Color.RED);
		lblZ.setBounds(636, 612, 10, 10);
		frame.getContentPane().add(lblZ);
		
		if(NumOfUsers == 6){
			lblZ.setVisible(true);
		}else{
			lblZ.setVisible(false);
		}
		
		JButton btnEndTurn=new JButton("End Turn");
		internalFrame.getContentPane().add(btnEndTurn,BorderLayout.EAST);
		
		JButton btnRollDice = new JButton("Roll Dice");
		internalFrame.getContentPane().add(btnRollDice, BorderLayout.NORTH);

		
		Icon monopoly=new ImageIcon(getClass().getResource("Monopoly.PNG"));
		JLabel label = new JLabel();
		label.setBounds(0, 0, 660, 731);
		frame.getContentPane().add(label);
		label.setForeground(Color.BLACK);
		label.setIcon(monopoly);//add icon to JLabel
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);		
		
		Icon monopoly2=new ImageIcon(getClass().getResource("background.jpg"));
		JLabel label2 = new JLabel();
		label2.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(label2);
		label2.setIcon(monopoly2);//add icon to JLabel
		label2.setHorizontalTextPosition(SwingConstants.CENTER);
		label2.setVerticalTextPosition(SwingConstants.BOTTOM);
		
	
		
		
		btnEndTurn.addActionListener( new ActionListener()
		{
			
		    public void actionPerformed(ActionEvent e)
		    {
		    	CardUsed=false;
		    	
		    	if(UserChooser>NumOfUsers)
		    	{
		    		UserChooser%=NumOfUsers;
		    	}
		    	try {
					HelpFrame.setClosed(true);
					PropertyFrame.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
		    	switch(UserChooser)
		    	{
		    	case 1:print=UserNameA;break;
		    	case 2:print=UserNameB;break;
		    	case 3:print=UserNameC;break;
		    	case 4:print=UserNameX;break;
		    	case 5:print=UserNameY;break;
		    	case 6:print=UserNameZ;break;
		    	}
		    	command="It is now "+ print + "'s turn\n** TURN ENDED  **\n\n"+command;
		        txtpnInfo.setText(command);
		    	
		        CardPane.setText("");
		    }
		    
		});
		
		// Function for rolling dice
		btnRollDice.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    	Random rand = new Random();
				 randomNum=rand.nextInt(6)+1;
				int randomNum2=rand.nextInt(6)+1;
				
				if(randomNum==randomNum2){
					randomNum+=randomNum2;
					command=" looks like you rolled a double, go ahead and roll again!\n\n"+command;
			        txtpnInfo.setForeground(randColour());
			        EnterText.setForeground(randColour());
			        command="User "+ UserChooser+ command;
			        txtpnInfo.setText(command);
			        DefaultCaret caret = (DefaultCaret) txtpnInfo.getCaret();
			        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
			        
			        randNumAddition();
			        
//			        txtpnInfo.setText(propertyDisplayCurrent(randomNum));
					}
				
				else{
		    	randomNum+=randomNum2;
		    	command=" rolls the dice, they moved "+randomNum+" places!\n\n"+command;
		        txtpnInfo.setForeground(randColour());
		        EnterText.setForeground(randColour());
		        command="User "+UserChooser+command;
		        txtpnInfo.setText(command);
		        DefaultCaret caret = (DefaultCaret) txtpnInfo.getCaret();
		        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
		        
		        randNumAddition();
		        
//		        txtpnInfo.setText(propertyDisplayCurrent(randomNum));
				}
		    }
		});
		
		
		EnterText.addActionListener( new ActionListener()
		{
			
			// Action listener which performs actions based on specific user input into the user panel
			public void actionPerformed(ActionEvent e)
		    {
				
				switch(EnterText.getText())
				{
				case "roll":
					if(roll&&jailedA==0||roll&&jailedB==0||roll&&jailedC==0||roll&&jailedX==0||roll&&jailedY==0||roll&&jailedZ==0)
					{
						roll=false;
						Random rand = new Random();
						randomNum=rand.nextInt(6)+1;
						int randomNum2=rand.nextInt(6)+1;
						if(randomNum==randomNum2){
							DoubleRoll++;
							if(DoubleRoll == 3){
								Switch sw=new Switch();
								switch(UserChooser)
								{
								case 1: UserA = 31;sw.switchUser(UserA);DoubleRoll=0;break;
								case 2:	UserB = 31;sw.switchUser(UserB);DoubleRoll=0;break;
								case 3: UserC = 31;sw.switchUser(UserC);DoubleRoll=0;break;
								case 4: UserX = 31;sw.switchUser(UserX);DoubleRoll=0;break;
								case 5: UserY = 31;sw.switchUser(UserY);DoubleRoll=0;break;
								case 6: UserZ = 31;sw.switchUser(UserZ);DoubleRoll=0;break;
								}
								return;
							
							}
							randomNum+=randomNum2;
							command=" looks like you rolled a double, go ahead and roll again!\n\n"+command;
					        txtpnInfo.setForeground(randColour());
					        EnterText.setForeground(randColour());
					        command="User "+ UserChooser+ command;
					        txtpnInfo.setText(command);
					        DefaultCaret caret = (DefaultCaret) txtpnInfo.getCaret();
					        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
					        //txtpnInfo.setText(propertyDisplayCurrent(randomNum));
					        randNumAddition();
					        draw();
					        tax();
					        roll=true;
					        
							}
						else{
				    	randomNum+=randomNum2;
				    	command=" rolls the dice, they moved "+randomNum+" places!\n\n"+command;
				        txtpnInfo.setForeground(randColour());
				        EnterText.setForeground(randColour());
				        command="User "+UserChooser+command;
				        txtpnInfo.setText(command);
				        DefaultCaret caret = (DefaultCaret) txtpnInfo.getCaret();
				        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
				       //txtpnInfo.setText(propertyDisplayCurrent(randomNum));
				        randNumAddition();
				        draw();
				        tax();
						}
					}
					else
					{
						 command="You have already rolled\n\n"+command;
					     txtpnInfo.setText(command);
					}
					
					break;
					
				case "help":
					
					String HelpInfo="'roll' = Die are rolled \n\n"
		    				+ "'done' = Finishes your turn and goes to the next player \n\n"
		    				+ "'balance' = displays the current users balance \n\n"
		    				+ "'pay rent' = Pay rent for the current property \n\n"
		    				+ "'buy' = Buy an unowned property you have landed on \n\n"
		    				+ "'property' = See all your owned property \n\n"
		    				+ "'quit' = Enter this command to finish the game \n\n"
		    				+ "**Click End Turn to close the Info Panel**";
	    		
					HelpFrame.setBounds(1000, 0, 350, 500);
					frame.getContentPane().add(HelpFrame);
					HelpFrame.setVisible(true);
					try
					{
						HelpFrame.setClosed(false);
					} catch (PropertyVetoException e1)
					{
						e1.printStackTrace();
					}
	    		
	    		JTextPane HelpPane=new JTextPane();
	    		HelpPane.setFont(new Font("Verdana", Font.BOLD, 14));
	    		HelpPane.setText(HelpInfo);
	    		HelpPane.setEditable(false);
	    		HelpFrame.getContentPane().add(HelpPane);
	    		break;
	    		
				case "property":
					
					PropertyFrame.setBounds(1000, 0, 350, 500);
		    		frame.getContentPane().add(PropertyFrame);
		    		PropertyFrame.setVisible(true);
		    		try {
		    			PropertyFrame.setClosed(false);
					} catch (PropertyVetoException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    		
		    		JScrollPane scrollBar2 = new JScrollPane(PropertyPane);
		    		PropertyFrame.getContentPane().add(scrollBar2, BorderLayout.CENTER);
		    		
		    		PropertyPane.setFont(new Font("Verdana", Font.BOLD, 14));
		    		
		    		propertyDets="";
		    		PropertyPane.setEditable(false);
		    		PropertyFrame.getContentPane().add(PropertyPane);
		    		
		    		switch(UserChooser)
		    		{
		    		case 1:propertyDisplayAll(propertiesUserA);break;
		    		case 2:propertyDisplayAll(propertiesUserB);break;
		    		case 3:propertyDisplayAll(propertiesUserC);break;
		    		case 4:propertyDisplayAll(propertiesUserX);break;
		    		case 5:propertyDisplayAll(propertiesUserY);break;
		    		case 6:propertyDisplayAll(propertiesUserZ);break;
		    		}
		    		
		    		break;
		    		
		    		
				case "bankrupt":
					int i=0;
					switch(UserChooser)
					{
					case 1: a = true;for(i=0;!propertiesUserA.isEmpty();i++){propertiesUserA.remove(i);i++;};lblA.setVisible(false);command="Player 1 has declared bankruptcy enter 'done' to continue\n\n"+command; txtpnInfo.setText(command);break;
					case 2: b = true;for(i=0;!propertiesUserB.isEmpty();i++){propertiesUserB.remove(i);i++;};lblB.setVisible(false);command="Player 2 has declared bankruptcy enter 'done' to continue\n\n"+command;lblB.setVisible(false);txtpnInfo.setText(command);break;
					case 3: c = true;for(i=0;!propertiesUserC.isEmpty();i++){propertiesUserC.remove(i);i++;};lblC.setVisible(false);command="Player 3 has declared bankruptcy enter 'done' to continue\n\n"+command;lblC.setVisible(false);txtpnInfo.setText(command);break;
					case 4: x = true;for(i=0;!propertiesUserX.isEmpty();i++){propertiesUserX.remove(i);i++;};lblX.setVisible(false);command="Player 4 has declared bankruptcy enter 'done' to continue\n\n"+command;lblX.setVisible(false);txtpnInfo.setText(command);break;
					case 5: y = true;for(i=0;!propertiesUserY.isEmpty();i++){propertiesUserY.remove(i);i++;};lblY.setVisible(false);command="Player 5 has declared bankruptcy enter 'done' to continue\n\n"+command;lblY.setVisible(false); txtpnInfo.setText(command);break;
					case 6: z = true;for(i=0;!propertiesUserZ.isEmpty();i++){propertiesUserZ.remove(i);i++;};lblZ.setVisible(false);command="Player 6 has declared bankruptcy enter 'done' to continue\n\n"+command;lblZ.setVisible(false); txtpnInfo.setText(command);break;
					}
					winner();					
					break;
					
				case "done":
					
					if (bankruptcy()){
					roll=true;
					CardUsed=false;
		    		UserChooser++;
		    		DoubleRoll = 0;
			    	if(UserChooser>NumOfUsers)
			    	{
			    		UserChooser%=NumOfUsers;
			    	}
			    	
			    	try {
						HelpFrame.setClosed(true);
						PropertyFrame.setClosed(true);
					} catch (PropertyVetoException e1) {
						e1.printStackTrace();
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
			    	txtpnInfo.setForeground(Color.RED);			        
			        CardPane.setText("");
			        jailed();
					
					}
					
					else{
						
						command="Please sell property or declare bankruptcy\n\n"+command;
				        txtpnInfo.setText(command);
				        endturn = true;
						
					}
					
					break;
				
					
				case "buy":
					
					switch(UserChooser)
					{
					case 1: buyProperty(MovesA);break;
					case 2: buyProperty(MovesB);break;
					case 3: buyProperty(MovesC);break;
					case 4: buyProperty(MovesX);break;
					case 5: buyProperty(MovesY);break;
					case 6: buyProperty(MovesZ);break;
					}
					
					break;
					
				
					
				case "balance": 
					
					int display = 0;
			    	
		    		switch(UserChooser){
		    		
		    		case 1:display = balanceA.getBalance();break;
		    		case 2:display = balanceB.getBalance();break;
		    		case 3:display = balanceC.getBalance();break;
		    		case 4:display = balanceX.getBalance();break;
		    		case 5:display = balanceY.getBalance();break;
		    		case 6:display = balanceZ.getBalance();break;
		    		
		    		}
		    		command= "Your balance is "+ display + "\n\n"+command;
			        txtpnInfo.setText(command);
			        break;
			        
				case "pay rent":
					switch(UserChooser)
					{
					case 1:payRent(MovesA);
						break;
					case 2:payRent(MovesB);
						break;
					case 3:payRent(MovesC);
						break;
					case 4:payRent(MovesX);
						break;
					case 5:payRent(MovesY);
						break;
					case 6:payRent(MovesZ);
						break;
					}
					
					break;
					
				
					
				case "quit":
					switch(NumOfUsers)
			    	{
			    	case 2:if(balanceA.getBalance()>balanceB.getBalance())
			    		{
			    		JOptionPane.showMessageDialog(null,"User "+ UserNameA + " has won the game");	
			    		}
			    	if(balanceB.getBalance()>balanceA.getBalance())
			    		{
			    		JOptionPane.showMessageDialog(null,"User "+ UserNameB + " has won the game");
			    		}
			    	else
			    		{
			    		JOptionPane.showMessageDialog(null,"One or more users have the same balance. No winner has been declared");
			    		}
			    	break;
					
			    	case 3:if(balanceA.getBalance()>balanceB.getBalance() && balanceA.getBalance()>balanceC.getBalance());
			    		{
			    		JOptionPane.showMessageDialog(null,"User "+ UserNameA + " has won the game");
			    		
			    		}
			    	 if(balanceB.getBalance()>balanceA.getBalance() && balanceB.getBalance()>balanceC.getBalance())
			    	 	{
			    		 JOptionPane.showMessageDialog(null,"User "+ UserNameB + " has won the game");
			    		}
			    	 
			    	 if(balanceC.getBalance()>balanceA.getBalance() && balanceC.getBalance()>balanceB.getBalance())
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameC + " has won the game");
				    	}
			    	 else
				    	{
				    		JOptionPane.showMessageDialog(null,"One or more users have the same balance. No winner has been declared");
				    	}
			    	 break;
			    	 
			    	 
			    	case 4:if(balanceA.getBalance()>balanceB.getBalance() && balanceA.getBalance()>balanceC.getBalance() && balanceA.getBalance()>balanceX.getBalance());
			    		{
			    		JOptionPane.showMessageDialog(null,"User "+ UserNameA + " has won the game");
			    		
			    		}
			    	 if(balanceB.getBalance()>balanceA.getBalance() && balanceB.getBalance()>balanceC.getBalance() && balanceB.getBalance()>balanceX.getBalance())
			    	 	{
			    		 JOptionPane.showMessageDialog(null,"User "+ UserNameB + " has won the game");
			    		}
			    	 
			    	 if(balanceC.getBalance()>balanceA.getBalance() && balanceC.getBalance()>balanceB.getBalance() && balanceC.getBalance()>balanceX.getBalance())
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameC + " has won the game");
				    	}
			    	 
			    	 if(balanceX.getBalance()>balanceA.getBalance() && balanceX.getBalance()>balanceB.getBalance() && balanceX.getBalance()>balanceC.getBalance())
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameX + " has won the game");
				    	}
			    	 
			    	 else
				    	{
				    		JOptionPane.showMessageDialog(null,"One or more users have the same balance. No winner has been declared");
				    	}
			    	 break;
			    	
			    	case 5:if(balanceA.getBalance()>balanceB.getBalance() && balanceA.getBalance()>balanceC.getBalance() && balanceA.getBalance()>balanceX.getBalance() && balanceA.getBalance()>balanceY.getBalance() );
			    		{
			    		JOptionPane.showMessageDialog(null,"User "+ UserNameA + " has won the game");
			    		
			    		}
			    	 if(balanceB.getBalance()>balanceA.getBalance() && balanceB.getBalance()>balanceC.getBalance() && balanceB.getBalance()>balanceX.getBalance() && balanceB.getBalance()>balanceY.getBalance())
			    	 	{
			    		 JOptionPane.showMessageDialog(null,"User "+ UserNameB + " has won the game");
			    	 	}
			    	 
			    	 if(balanceC.getBalance()>balanceA.getBalance() && balanceC.getBalance()>balanceB.getBalance() && balanceC.getBalance()>balanceX.getBalance() && balanceC.getBalance()>balanceY.getBalance())
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameC + " has won the game");
				    	}
			    	 
			    	 if(balanceX.getBalance()>balanceA.getBalance() && balanceX.getBalance()>balanceB.getBalance() && balanceX.getBalance()>balanceC.getBalance() && balanceX.getBalance()>balanceY.getBalance())
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameX + " has won the game");
				    	}
			    	 
			    	 if(balanceY.getBalance()>balanceA.getBalance() && balanceY.getBalance()>balanceB.getBalance() && balanceY.getBalance()>balanceC.getBalance() && balanceY.getBalance()>balanceX.getBalance())
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameY + " has won the game");
				    	}
			    	 
			    	 else
				    	{
				    		JOptionPane.showMessageDialog(null,"One or more users have the same balance. No winner has been declared");
				    	}
			    	 break;
			    	
			    	case 6:if(balanceA.getBalance()>balanceB.getBalance() && balanceA.getBalance()>balanceC.getBalance() && balanceA.getBalance()>balanceX.getBalance() && balanceA.getBalance()>balanceY.getBalance() && balanceA.getBalance()>balanceZ.getBalance() );
			    		{
			    		JOptionPane.showMessageDialog(null,"User "+ UserNameA + " has won the game");
			    		
			    		}
			    	 if(balanceB.getBalance()>balanceA.getBalance() && balanceB.getBalance()>balanceC.getBalance() && balanceB.getBalance()>balanceX.getBalance() && balanceB.getBalance()>balanceY.getBalance() && balanceB.getBalance()>balanceZ.getBalance())
			    	 	{
			    		 JOptionPane.showMessageDialog(null,"User "+ UserNameB + " has won the game");
			    	 	}
			    	 
			    	 if(balanceC.getBalance()>balanceA.getBalance() && balanceC.getBalance()>balanceB.getBalance() && balanceC.getBalance()>balanceX.getBalance() && balanceC.getBalance()>balanceY.getBalance() && balanceC.getBalance()>balanceZ.getBalance())
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameC + " has won the game");
				    	}
			    	 
			    	 if(balanceX.getBalance()>balanceA.getBalance() && balanceX.getBalance()>balanceB.getBalance() && balanceX.getBalance()>balanceC.getBalance() && balanceX.getBalance()>balanceY.getBalance() && balanceX.getBalance()>balanceZ.getBalance())
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameX + " has won the game");
				    	}
			    	 
			    	 if(balanceY.getBalance()>balanceA.getBalance() && balanceY.getBalance()>balanceB.getBalance() && balanceY.getBalance()>balanceC.getBalance() && balanceY.getBalance()>balanceX.getBalance() && balanceY.getBalance()>balanceZ.getBalance())
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameY + " has won the game");
				    	}
			    	 
			    	 if(balanceZ.getBalance()>balanceA.getBalance() && balanceZ.getBalance()>balanceB.getBalance() && balanceZ.getBalance()>balanceC.getBalance() && balanceZ.getBalance()>balanceX.getBalance() && balanceZ.getBalance()>balanceY.getBalance() )
				    	{
				    		 JOptionPane.showMessageDialog(null,"User "+ UserNameZ + " has won the game");
				    	}
			    	 
			    	 else
				    	{
				    		JOptionPane.showMessageDialog(null,"One or more users have the same balance. No winner has been declared");
				    	}
			    	 break;
			    	}
						frame.setVisible(false);
						frame.dispose();
						break;
						
						
				case "build":
					
					switch(UserChooser)
					{
					case 1:buildHouse(MovesA);
						break;
					case 2:buildHouse(MovesB);
						break;
					case 3:buildHouse(MovesC);
						break;
					case 4:buildHouse(MovesX);
						break;
					case 5:buildHouse(MovesY);
						break;
					case 6:buildHouse(MovesZ);
						break;
					}
					
					
					EIC=true;
					break;
					
				case "mortgage":
					
					switch(UserChooser)
					{
					case 1:mortgage(MovesA);
						break;
					case 2:mortgage(MovesB);
						break;
					case 3:mortgage(MovesC);
						break;
					case 4:mortgage(MovesX);
						break;
					case 5:mortgage(MovesY);
						break;
					case 6:mortgage(MovesZ);
						break;
					}
					
					EIC=true;
					break;
				
				case "demolish":
					
					switch(UserChooser)
					{
					case 1:demolishHouse(MovesA);
						break;
					case 2:demolishHouse(MovesB);
						break;
					case 3:demolishHouse(MovesC);
						break;
					case 4:demolishHouse(MovesX);
						break;
					case 5:demolishHouse(MovesY);
						break;
					case 6:demolishHouse(MovesZ);
						break;
					}
					EIC=true;
					break;
					
				case "redeem":
					
					switch(UserChooser)
					{
					case 1:redeem(MovesA);
						break;
					case 2:redeem(MovesB);
						break;
					case 3:redeem(MovesC);
						break;
					case 4:redeem(MovesX);
						break;
					case 5:redeem(MovesY);
						break;
					case 6:redeem(MovesZ);
						break;
					}
					EIC=true;
					break;
					
				default:
					command="Error, Invalid command\n\n"+command;
					txtpnInfo.setText(command);
				} 	
			}
		});
	}
	
	
	
	
}