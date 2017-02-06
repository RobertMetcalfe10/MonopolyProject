package Monopoly;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.DefaultCaret;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import java.util.*;



public class MonopolyROB extends UI{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				try {
					MonopolyROB window = new MonopolyROB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MonopolyROB() {
		initialize();
	}

	
}