package Monopoly;
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

public class UI extends Variables
{
	
	void randNumAddition()
	{
		 Switch SW=new Switch();
		 switch(UserChooser)
	     {
	     case 1:UserA+=randomNum;if(UserA>40)UserA-=40;SW.switchUser(UserA);break;
	     case 2:UserB+=randomNum;if(UserB>40)UserB-=40;SW.switchUser(UserB);break;
	     case 3:UserC+=randomNum;if(UserC>40)UserC-=40;SW.switchUser(UserC);break;
	     case 4:UserX+=randomNum;if(UserX>40)UserX-=40;SW.switchUser(UserX);break;
	     case 5:UserY+=randomNum;if(UserY>40)UserY-=40;SW.switchUser(UserY);break;
	     case 6:UserZ+=randomNum;if(UserZ>40)UserZ-=40;SW.switchUser(UserZ);break;
	     }
	}
	
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
	
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.getContentPane().setLayout(null);
		
		addUser();
		
		
		JInternalFrame infoFrame = new JInternalFrame("Information Panel");
		infoFrame.setBounds(660, 0, 300, 500);
		frame.getContentPane().add(infoFrame);
		infoFrame.setFrameIcon(null); 
		
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInfo.setText(command);
		txtpnInfo.setEditable(false);
		txtpnInfo.setBackground(Color.BLACK);
	
		infoFrame.getContentPane().add(txtpnInfo, BorderLayout.CENTER);
		infoFrame.setVisible(true);
		
		JScrollPane scrollBar = new JScrollPane(txtpnInfo);
		infoFrame.getContentPane().add(scrollBar, BorderLayout.CENTER);
		
		
		JInternalFrame internalFrame = new JInternalFrame("User Panel");
		internalFrame.setBounds(660, 500, 300, 177);
		frame.getContentPane().add(internalFrame);
		internalFrame.setVisible(true);
		internalFrame.setFrameIcon(null); 
				

		JTextField EnterText = new JTextField();
		EnterText.setToolTipText("Enter Command Here");
		internalFrame.getContentPane().add(EnterText, BorderLayout.CENTER);
		EnterText.setBackground(Color.BLACK);
		EnterText.setForeground(Color.WHITE);
		
		

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
		
		
		Icon monopoly=new ImageIcon(getClass().getResource("Monopoly.png"));
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
		    	UserChooser++;
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
		    	
		    	
		    }
		    
		});
		
		//random num generator
		btnRollDice.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Random rand = new Random();
				 randomNum=rand.nextInt(6)+1;
				int randomNum2=rand.nextInt(6)+1;
				
				if(randomNum==randomNum2){
					command=" looks like you rolled a double please re-roll again ";
			        txtpnInfo.setForeground(randColour());
			        EnterText.setForeground(randColour());
			        command="User "+UserChooser+command;
			        txtpnInfo.setText(command);
			        DefaultCaret caret = (DefaultCaret) txtpnInfo.getCaret();
			        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
			        
			        randNumAddition();
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
				}
		    }
		});
		
		
		EnterText.addActionListener( new ActionListener()
		{
			String RD="roll";
			String HELP="help";
			String PROPERTY="property";
			public void actionPerformed(ActionEvent e)
		    {
		    	EnterText.setText(EnterText.getText());
		    	if(RD.equals(EnterText.getText()))
		    		{
		    		Random rand = new Random();
					randomNum=rand.nextInt(6)+1;
					int randomNum2=rand.nextInt(6)+1;
					randomNum+=randomNum2;
			        command=" rolls the dice, they moved "+randomNum+" places!\n\n"+command;
			        //txtpnInfo.setForeground(randColour());
			        //EnterText.setForeground(randColour());
			        command="User "+UserChooser+command;
			        txtpnInfo.setText(command);
			        DefaultCaret caret = (DefaultCaret) txtpnInfo.getCaret();
			        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
			        
			        randNumAddition();

		    		}
		    	
		    	
		    	if(HELP.equals(EnterText.getText()))
		    	{
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
		    		try {
						HelpFrame.setClosed(false);
					} catch (PropertyVetoException e1) {
						e1.printStackTrace();
					}
		    		
		    		JTextPane HelpPane=new JTextPane();
		    		HelpPane.setFont(new Font("Verdana", Font.BOLD, 14));
		    		HelpPane.setText(HelpInfo);
		    		HelpPane.setEditable(false);
		    		HelpFrame.getContentPane().add(HelpPane);
		    		
		    	}
			if(PROPERTY.equals(EnterText.getText()))
		    	{
			    		
		    		PropertyFrame.setBounds(1000, 0, 350, 500);
		    		frame.getContentPane().add(PropertyFrame);
		    		PropertyFrame.setVisible(true);
		    		try {
		    			PropertyFrame.setClosed(false);
					} catch (PropertyVetoException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    		
		    		JTextPane HelpPane=new JTextPane();
		    		HelpPane.setFont(new Font("Verdana", Font.BOLD, 14));
		    		HelpPane.setText(propertyDets);
		    		HelpPane.setEditable(false);
		    		PropertyFrame.getContentPane().add(HelpPane);
		    		
		    	}
		    	if("done".equals(EnterText.getText()))
		    	{
		    		
			    	
		    		UserChooser++;
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
			    	txtpnInfo.setForeground(Color.RED);
			    	command="It is now "+ print + "'s turn\n** TURN ENDED  **\n\n"+command;
			        txtpnInfo.setText(command);
		    	}
		    	
			}
			
			
		});
	}
	
}
