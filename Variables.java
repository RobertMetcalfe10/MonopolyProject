package Monopoly;

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
	protected static int UserChooser=1;
	protected static int NumOfUsers=1;
	protected static JLabel lblA = new JLabel("A");
	protected static JLabel lblB = new JLabel("B");
	protected static JLabel lblC = new JLabel("C");
	protected static JLabel lblX = new JLabel("X");
	protected static JLabel lblY = new JLabel("Y");
	protected static JLabel lblZ = new JLabel("Z");
	protected static JTextPane txtpnItIsNow = new JTextPane();
	protected static JButton btnRollDice = new JButton("Roll Dice");
	protected static JInternalFrame HelpFrame = new JInternalFrame("List Of Commands");
}
