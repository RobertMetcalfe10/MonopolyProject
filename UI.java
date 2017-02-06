package Monopoly;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultCaret;

public class UI 
{
	protected JFrame frame;
	protected JTextField textField;
	protected static String command="";
	protected static int UserA=1;
	protected static int UserB=1;
	protected static int UserC=1;
	protected static int UserX=1;
	protected static int UserY=1;
	protected static int UserZ=1;
	protected static int randomNum;
	protected JLabel lblA = new JLabel("A");
	
	@SuppressWarnings("unused") 
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.getContentPane().setLayout(null);
		
		Icon monopoly=new ImageIcon(getClass().getResource("monopoly.png"));
		
		JInternalFrame infoFrame = new JInternalFrame("Information Panel");
		infoFrame.setBounds(675, 347, 299, 332);
		frame.getContentPane().add(infoFrame);
		
		command += "It is now player X's turn\n";
		command += "Enter roll dice into the command panel to roll your dice";
		
		JTextPane txtpnItIsNow = new JTextPane();
		txtpnItIsNow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnItIsNow.setText(command);
		txtpnItIsNow.setEditable(false);
	
		infoFrame.getContentPane().add(txtpnItIsNow, BorderLayout.CENTER);
		infoFrame.setVisible(true);
		
		JScrollPane scrollBar = new JScrollPane(txtpnItIsNow);
		infoFrame.getContentPane().add(scrollBar, BorderLayout.CENTER);
		
		
		JInternalFrame internalFrame = new JInternalFrame("User Panel");
		internalFrame.setBounds(716, 0, 268, 155);
		frame.getContentPane().add(internalFrame);
		internalFrame.setVisible(true);
				

		JTextField EnterText = new JTextField("");
		EnterText.setToolTipText("Enter Command Here");
		internalFrame.getContentPane().add(EnterText, BorderLayout.CENTER);
		
		
		
		textField = new JTextField("hello");
		internalFrame.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		
		lblA.setForeground(Color.RED);
		lblA.setBounds(600, 655, 10, 10);
		frame.getContentPane().add(lblA);
		lblA.setVisible(true);
		
		
		JLabel label = new JLabel();
		label.setBounds(0, 0, 660, 731);
		frame.getContentPane().add(label);
		label.setForeground(Color.BLACK);
		label.setIcon(monopoly);//add icon to JLabel
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		
		JButton btnRollDice = new JButton("Roll Dice");
		internalFrame.getContentPane().add(btnRollDice, BorderLayout.NORTH);
		
		//random num generator
		btnRollDice.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Random rand = new Random();
				randomNum=rand.nextInt(6)+1;
				int randomNum2=rand.nextInt(6)+1;
				randomNum+=randomNum2;
		        textField.setText(Integer.toString(randomNum));
		        command="User X rolls the dice, they moved "+randomNum+" places!\n\n"+command;
		        txtpnItIsNow.setText(command);
		        DefaultCaret caret = (DefaultCaret) txtpnItIsNow.getCaret();
		        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
		        
		        UserA+=randomNum;
		        if(UserA>40)
		        {
		        	UserA-=40;
		        }
		    
		    	
		    }
		});
		
		String RD="roll dice";
		EnterText.addActionListener( new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
		    {
		    	EnterText.setText(EnterText.getText());
		    	if(RD.equals(EnterText.getText()))
		    		{
		    		Random rand = new Random();
					randomNum=rand.nextInt(6)+1;
					int randomNum2=rand.nextInt(6)+1;
					randomNum+=randomNum2;
			        textField.setText(Integer.toString(randomNum));
			        command="User X rolls the dice, they moved "+randomNum+" places!\n\n"+command;
			        txtpnItIsNow.setText(command);
			        DefaultCaret caret = (DefaultCaret) txtpnItIsNow.getCaret();
			        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
			        
			        UserA+=randomNum;
			        if(UserA>40)
			        {
			        	UserA-=40;
			        }
		    		
			        
		    		}
			}
		});
	}
}