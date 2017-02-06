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

public class Monopoly {

	private JFrame frame;
	private JTextField textField;
	private String command="";
	private static int UserA=1,UserB=1,UserC=1,UserX=1,UserY=1,UserZ=1;
	private int randomNum;
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				try {
					Monopoly window = new Monopoly();
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
	public Monopoly() {
		initialize();
	}

	
	
	
	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Icon monopoly=new ImageIcon(getClass().getResource("monopoly.png"));
		frame.getContentPane().setLayout(null);
		
		
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
		
		
		
		JLabel lbl_2 = new JLabel("X");
		lbl_2.setForeground(Color.RED);
		lbl_2.setBounds(7, 216, 10, 10);
		frame.getContentPane().add(lbl_2);
		lbl_2.setVisible(false);
		
		JLabel lblY_2 = new JLabel("Y");
		lblY_2.setForeground(Color.RED);
		lblY_2.setBackground(Color.WHITE);
		lblY_2.setBounds(7, 228, 10, 10);
		frame.getContentPane().add(lblY_2);
		lblY_2.setVisible(false);
		
		JLabel label_10 = new JLabel("X");
		label_10.setForeground(Color.RED);
		label_10.setBounds(92, 62, 10, 10);
		frame.getContentPane().add(label_10);
		label_10.setVisible(false);
		
		JLabel lblZ_2 = new JLabel("Z");
		lblZ_2.setForeground(Color.RED);
		lblZ_2.setBounds(7, 239, 10, 10);
		frame.getContentPane().add(lblZ_2);
		lblZ_2.setVisible(false);
		
		JLabel lblA_2 = new JLabel("A");
		lblA_2.setForeground(Color.RED);
		lblA_2.setBackground(Color.WHITE);
		lblA_2.setBounds(64, 216, 10, 10);
		frame.getContentPane().add(lblA_2);
		lblA_2.setVisible(false);
		
		JLabel lblB_2 = new JLabel("B");
		lblB_2.setForeground(Color.RED);
		lblB_2.setBounds(64, 228, 10, 10);
		frame.getContentPane().add(lblB_2);
		lblB_2.setVisible(false);
		
		JLabel lblC_2 = new JLabel("C");
		lblC_2.setForeground(Color.RED);
		lblC_2.setBounds(64, 239, 10, 10);
		frame.getContentPane().add(lblC_2);
		lblC_2.setVisible(false);
		
		JLabel lblY = new JLabel("Y");
		lblY.setForeground(Color.RED);
		lblY.setBounds(103, 62, 10, 10);
		frame.getContentPane().add(lblY);
		lblY.setVisible(false);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.RED);
		lblA.setBounds(92, 105, 10, 10);
		frame.getContentPane().add(lblA);
		lblA.setVisible(false);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.RED);
		lblB.setBounds(103, 105, 10, 10);
		frame.getContentPane().add(lblB);
		lblB.setVisible(false);
		
		JLabel lblZ = new JLabel("Z");
		lblZ.setForeground(Color.RED);
		lblZ.setBackground(Color.WHITE);
		lblZ.setBounds(114, 62, 10, 10);
		frame.getContentPane().add(lblZ);
		lblZ.setVisible(false);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.RED);
		lblC.setBackground(Color.WHITE);
		lblC.setBounds(114, 105, 10, 10);
		frame.getContentPane().add(lblC);
		lblC.setVisible(false);
		
		JLabel label_20 = new JLabel("X");
		label_20.setForeground(Color.RED);
		label_20.setBounds(149, 62, 10, 10);
		frame.getContentPane().add(label_20);
		label_20.setVisible(false);
		
		JLabel label_21 = new JLabel("Y");
		label_21.setForeground(Color.RED);
		label_21.setBounds(160, 62, 10, 10);
		frame.getContentPane().add(label_21);
		label_21.setVisible(false);
		
		JLabel label_22 = new JLabel("A");
		label_22.setForeground(Color.RED);
		label_22.setBounds(149, 111, 10, 10);
		frame.getContentPane().add(label_22);
		label_22.setVisible(false);
		
		JLabel label_23 = new JLabel("B");
		label_23.setForeground(Color.RED);
		label_23.setBounds(160, 111, 10, 10);
		frame.getContentPane().add(label_23);
		label_23.setVisible(false);
		
		JLabel label_24 = new JLabel("Z");
		label_24.setForeground(Color.RED);
		label_24.setBackground(Color.WHITE);
		label_24.setBounds(171, 62, 10, 10);
		frame.getContentPane().add(label_24);
		label_24.setVisible(false);
		
		JLabel label_25 = new JLabel("C");
		label_25.setForeground(Color.RED);
		label_25.setBackground(Color.WHITE);
		label_25.setBounds(171, 111, 10, 10);
		frame.getContentPane().add(label_25);
		label_25.setVisible(false);
		
		JLabel label_32 = new JLabel("X");
		label_32.setForeground(Color.RED);
		label_32.setBounds(253, 62, 10, 10);
		frame.getContentPane().add(label_32);
		label_32.setVisible(false);
		
		JLabel label_33 = new JLabel("Y");
		label_33.setForeground(Color.RED);
		label_33.setBounds(264, 62, 10, 10);
		frame.getContentPane().add(label_33);
		label_33.setVisible(false);
		
		JLabel label_34 = new JLabel("A");
		label_34.setForeground(Color.RED);
		label_34.setBounds(253, 111, 10, 10);
		frame.getContentPane().add(label_34);
		label_34.setVisible(false);
		
		JLabel label_35 = new JLabel("B");
		label_35.setForeground(Color.RED);
		label_35.setBounds(264, 111, 10, 10);
		frame.getContentPane().add(label_35);
		label_35.setVisible(false);
		
		JLabel label_36 = new JLabel("Z");
		label_36.setForeground(Color.RED);
		label_36.setBackground(Color.WHITE);
		label_36.setBounds(275, 62, 10, 10);
		frame.getContentPane().add(label_36);
		label_36.setVisible(false);
		
		JLabel label_37 = new JLabel("C");
		label_37.setForeground(Color.RED);
		label_37.setBackground(Color.WHITE);
		label_37.setBounds(275, 111, 10, 10);
		frame.getContentPane().add(label_37);
		label_37.setVisible(false);
		
		JLabel label_38 = new JLabel("X");
		label_38.setForeground(Color.RED);
		label_38.setBounds(321, 62, 10, 10);
		frame.getContentPane().add(label_38);
		label_38.setVisible(false);
		
		JLabel label_39 = new JLabel("Y");
		label_39.setForeground(Color.RED);
		label_39.setBounds(332, 62, 10, 10);
		frame.getContentPane().add(label_39);
		label_39.setVisible(false);
		
		JLabel label_40 = new JLabel("A");
		label_40.setForeground(Color.RED);
		label_40.setBounds(321, 111, 10, 10);
		frame.getContentPane().add(label_40);
		label_40.setVisible(false);
		
		JLabel label_41 = new JLabel("B");
		label_41.setForeground(Color.RED);
		label_41.setBounds(332, 111, 10, 10);
		frame.getContentPane().add(label_41);
		label_41.setVisible(false);
		
		JLabel label_42 = new JLabel("Z");
		label_42.setForeground(Color.RED);
		label_42.setBackground(Color.WHITE);
		label_42.setBounds(343, 62, 10, 10);
		frame.getContentPane().add(label_42);
		label_42.setVisible(false);
		
		JLabel label_43 = new JLabel("C");
		label_43.setForeground(Color.RED);
		label_43.setBackground(Color.WHITE);
		label_43.setBounds(343, 111, 10, 10);
		frame.getContentPane().add(label_43);
		label_43.setVisible(false);
		
		JLabel label_50 = new JLabel("X");
		label_50.setForeground(Color.RED);
		label_50.setBounds(447, 62, 10, 10);
		frame.getContentPane().add(label_50);
		label_50.setVisible(false);
		
		JLabel label_51 = new JLabel("Y");
		label_51.setForeground(Color.RED);
		label_51.setBounds(458, 62, 10, 10);
		frame.getContentPane().add(label_51);
		label_51.setVisible(false);
		
		JLabel label_52 = new JLabel("A");
		label_52.setForeground(Color.RED);
		label_52.setBounds(447, 111, 10, 10);
		frame.getContentPane().add(label_52);
		label_52.setVisible(false);
		
		JLabel label_53 = new JLabel("B");
		label_53.setForeground(Color.RED);
		label_53.setBounds(458, 111, 10, 10);
		frame.getContentPane().add(label_53);
		label_53.setVisible(false);
		
		JLabel label_54 = new JLabel("Z");
		label_54.setForeground(Color.RED);
		label_54.setBackground(Color.WHITE);
		label_54.setBounds(469, 62, 10, 10);
		frame.getContentPane().add(label_54);
		label_54.setVisible(false);
		
		JLabel label_55 = new JLabel("C");
		label_55.setForeground(Color.RED);
		label_55.setBackground(Color.WHITE);
		label_55.setBounds(469, 111, 10, 10);
		frame.getContentPane().add(label_55);
		label_55.setVisible(false);
		
		JLabel label_56 = new JLabel("X");
		label_56.setForeground(Color.RED);
		label_56.setBounds(549, 62, 10, 10);
		frame.getContentPane().add(label_56);
		label_56.setVisible(false);
		
		JLabel label_57 = new JLabel("Y");
		label_57.setForeground(Color.RED);
		label_57.setBounds(560, 62, 10, 10);
		frame.getContentPane().add(label_57);
		label_57.setVisible(false);
		
		JLabel label_58 = new JLabel("A");
		label_58.setForeground(Color.RED);
		label_58.setBounds(549, 111, 10, 10);
		frame.getContentPane().add(label_58);
		label_58.setVisible(false);
		
		JLabel label_59 = new JLabel("B");
		label_59.setForeground(Color.RED);
		label_59.setBounds(560, 111, 10, 10);
		frame.getContentPane().add(label_59);
		label_59.setVisible(false);

		
		JLabel label_60 = new JLabel("Z");
		label_60.setForeground(Color.RED);
		label_60.setBackground(Color.WHITE);
		label_60.setBounds(571, 62, 10, 10);
		frame.getContentPane().add(label_60);
		label_60.setVisible(false);

		
		JLabel label_61 = new JLabel("C");
		label_61.setForeground(Color.RED);
		label_61.setBackground(Color.WHITE);
		label_61.setBounds(571, 111, 10, 10);
		frame.getContentPane().add(label_61);
		label_61.setVisible(false);

		
		JLabel label_68 = new JLabel("X");
		label_68.setForeground(Color.RED);
		label_68.setBounds(614, 62, 10, 10);
		frame.getContentPane().add(label_68);
		label_68.setVisible(false);

		
		JLabel label_69 = new JLabel("Y");
		label_69.setForeground(Color.RED);
		label_69.setBounds(625, 62, 10, 10);
		frame.getContentPane().add(label_69);
		label_69.setVisible(false);

		
		JLabel label_70 = new JLabel("A");
		label_70.setForeground(Color.RED);
		label_70.setBounds(614, 111, 10, 10);
		frame.getContentPane().add(label_70);
		label_70.setVisible(false);

		
		JLabel label_71 = new JLabel("B");
		label_71.setForeground(Color.RED);
		label_71.setBounds(625, 111, 10, 10);
		frame.getContentPane().add(label_71);
		label_71.setVisible(false);
		
		JLabel label_72 = new JLabel("Z");
		label_72.setForeground(Color.RED);
		label_72.setBackground(Color.WHITE);
		label_72.setBounds(636, 62, 10, 10);
		frame.getContentPane().add(label_72);
		label_72.setVisible(false);

		
		JLabel label_73 = new JLabel("C");
		label_73.setForeground(Color.RED);
		label_73.setBackground(Color.WHITE);
		label_73.setBounds(636, 111, 10, 10);
		frame.getContentPane().add(label_73);
		label_73.setVisible(false);

		
		JLabel label_9 = new JLabel("X");
		label_9.setForeground(Color.RED);
		label_9.setBounds(25, 62, 10, 10);
		frame.getContentPane().add(label_9);
		label_9.setVisible(false);

		
		JLabel label_74 = new JLabel("Y");
		label_74.setForeground(Color.RED);
		label_74.setBounds(36, 62, 10, 10);
		frame.getContentPane().add(label_74);
		label_74.setVisible(false);

		
		JLabel label_75 = new JLabel("A");
		label_75.setForeground(Color.RED);
		label_75.setBounds(25, 111, 10, 10);
		frame.getContentPane().add(label_75);
		label_75.setVisible(false);

		
		JLabel label_76 = new JLabel("B");
		label_76.setForeground(Color.RED);
		label_76.setBounds(36, 111, 10, 10);
		frame.getContentPane().add(label_76);
		label_76.setVisible(false);

		
		JLabel label_77 = new JLabel("Z");
		label_77.setForeground(Color.RED);
		label_77.setBackground(Color.WHITE);
		label_77.setBounds(47, 62, 10, 10);
		frame.getContentPane().add(label_77);
		label_77.setVisible(false);

		
		JLabel label_78 = new JLabel("C");
		label_78.setForeground(Color.RED);
		label_78.setBackground(Color.WHITE);
		label_78.setBounds(47, 111, 10, 10);
		frame.getContentPane().add(label_78);
		label_78.setVisible(false);

		
		JLabel label_79 = new JLabel("X");
		label_79.setForeground(Color.RED);
		label_79.setBounds(25, 132, 10, 10);
		frame.getContentPane().add(label_79);
		label_79.setVisible(false);

		JLabel label_80 = new JLabel("Y");
		label_80.setForeground(Color.RED);
		label_80.setBounds(36, 132, 10, 10);
		frame.getContentPane().add(label_80);
		label_80.setVisible(false);

		
		JLabel label_81 = new JLabel("A");
		label_81.setForeground(Color.RED);
		label_81.setBounds(25, 175, 10, 10);
		frame.getContentPane().add(label_81);
		label_81.setVisible(false);

		
		JLabel label_82 = new JLabel("B");
		label_82.setForeground(Color.RED);
		label_82.setBounds(36, 175, 10, 10);
		frame.getContentPane().add(label_82);
		label_82.setVisible(false);

		
		JLabel label_83 = new JLabel("Z");
		label_83.setForeground(Color.RED);
		label_83.setBackground(Color.WHITE);
		label_83.setBounds(47, 132, 10, 10);
		frame.getContentPane().add(label_83);
		label_83.setVisible(false);

		
		JLabel label_84 = new JLabel("C");
		label_84.setForeground(Color.RED);
		label_84.setBackground(Color.WHITE);
		label_84.setBounds(47, 175, 10, 10);
		frame.getContentPane().add(label_84);
		label_84.setVisible(false);

		
		JLabel label_85 = new JLabel("X");
		label_85.setForeground(Color.RED);
		label_85.setBounds(25, 612, 10, 10);
		frame.getContentPane().add(label_85);
		label_85.setVisible(false);

		
		JLabel label_86 = new JLabel("Y");
		label_86.setForeground(Color.RED);
		label_86.setBounds(36, 612, 10, 10);
		frame.getContentPane().add(label_86);
		label_86.setVisible(false);

		
		JLabel label_87 = new JLabel("A");
		label_87.setForeground(Color.RED);
		label_87.setBounds(25, 661, 10, 10);
		frame.getContentPane().add(label_87);
		label_87.setVisible(false);

		
		JLabel label_88 = new JLabel("B");
		label_88.setForeground(Color.RED);
		label_88.setBounds(36, 661, 10, 10);
		frame.getContentPane().add(label_88);
		label_88.setVisible(false);

		
		JLabel label_89 = new JLabel("Z");
		label_89.setForeground(Color.RED);
		label_89.setBackground(Color.WHITE);
		label_89.setBounds(47, 612, 10, 10);
		frame.getContentPane().add(label_89);
		label_89.setVisible(false);

		
		JLabel label_90 = new JLabel("C");
		label_90.setForeground(Color.RED);
		label_90.setBackground(Color.WHITE);
		label_90.setBounds(47, 661, 10, 10);
		frame.getContentPane().add(label_90);
		label_90.setVisible(false);

		
		JLabel label_91 = new JLabel("X");
		label_91.setForeground(Color.RED);
		label_91.setBounds(199, 612, 10, 10);
		frame.getContentPane().add(label_91);
		label_91.setVisible(false);

		
		JLabel label_92 = new JLabel("Y");
		label_92.setForeground(Color.RED);
		label_92.setBounds(210, 612, 10, 10);
		frame.getContentPane().add(label_92);
		label_92.setVisible(false);

		
		JLabel label_93 = new JLabel("A");
		label_93.setForeground(Color.RED);
		label_93.setBounds(199, 661, 10, 10);
		frame.getContentPane().add(label_93);
		label_93.setVisible(false);

		
		JLabel label_94 = new JLabel("B");
		label_94.setForeground(Color.RED);
		label_94.setBounds(210, 661, 10, 10);
		frame.getContentPane().add(label_94);
		label_94.setVisible(false);

		
		JLabel label_95 = new JLabel("Z");
		label_95.setForeground(Color.RED);
		label_95.setBackground(Color.WHITE);
		label_95.setBounds(221, 612, 10, 10);
		frame.getContentPane().add(label_95);
		label_95.setVisible(false);

		
		JLabel label_96 = new JLabel("C");
		label_96.setForeground(Color.RED);
		label_96.setBackground(Color.WHITE);
		label_96.setBounds(221, 661, 10, 10);
		frame.getContentPane().add(label_96);
		label_96.setVisible(false);

		
		JLabel label_97 = new JLabel("X");
		label_97.setForeground(Color.RED);
		label_97.setBounds(321, 612, 10, 10);
		frame.getContentPane().add(label_97);
		label_97.setVisible(false);

		
		JLabel label_98 = new JLabel("Y");
		label_98.setForeground(Color.RED);
		label_98.setBounds(332, 612, 10, 10);
		frame.getContentPane().add(label_98);
		label_98.setVisible(false);

		
		JLabel label_99 = new JLabel("A");
		label_99.setForeground(Color.RED);
		label_99.setBounds(321, 661, 10, 10);
		frame.getContentPane().add(label_99);
		label_99.setVisible(false);

		
		JLabel label_100 = new JLabel("B");
		label_100.setForeground(Color.RED);
		label_100.setBounds(332, 661, 10, 10);
		frame.getContentPane().add(label_100);
		label_100.setVisible(false);

		
		JLabel label_101 = new JLabel("Z");
		label_101.setForeground(Color.RED);
		label_101.setBackground(Color.WHITE);
		label_101.setBounds(343, 612, 10, 10);
		frame.getContentPane().add(label_101);
		label_101.setVisible(false);

		
		JLabel label_102 = new JLabel("C");
		label_102.setForeground(Color.RED);
		label_102.setBackground(Color.WHITE);
		label_102.setBounds(343, 661, 10, 10);
		frame.getContentPane().add(label_102);
		label_102.setVisible(false);

		
		JLabel label_103 = new JLabel("X");
		label_103.setForeground(Color.RED);
		label_103.setBounds(387, 612, 10, 10);
		frame.getContentPane().add(label_103);
		label_103.setVisible(false);

		
		JLabel label_104 = new JLabel("Y");
		label_104.setForeground(Color.RED);
		label_104.setBounds(398, 612, 10, 10);
		frame.getContentPane().add(label_104);
		label_104.setVisible(false);

		
		JLabel label_105 = new JLabel("A");
		label_105.setForeground(Color.RED);
		label_105.setBounds(387, 661, 10, 10);
		frame.getContentPane().add(label_105);
		label_105.setVisible(false);

		
		JLabel label_106 = new JLabel("B");
		label_106.setForeground(Color.RED);
		label_106.setBounds(398, 661, 10, 10);
		frame.getContentPane().add(label_106);
		label_106.setVisible(false);

		
		JLabel label_107 = new JLabel("Z");
		label_107.setForeground(Color.RED);
		label_107.setBackground(Color.WHITE);
		label_107.setBounds(409, 612, 10, 10);
		frame.getContentPane().add(label_107);
		label_107.setVisible(false);

		
		JLabel label_108 = new JLabel("C");
		label_108.setForeground(Color.RED);
		label_108.setBackground(Color.WHITE);
		label_108.setBounds(409, 661, 10, 10);
		frame.getContentPane().add(label_108);
		label_108.setVisible(false);

		
		JLabel label_109 = new JLabel("X");
		label_109.setForeground(Color.RED);
		label_109.setBounds(447, 612, 10, 10);
		frame.getContentPane().add(label_109);
		label_109.setVisible(false);

		
		JLabel label_110 = new JLabel("Y");
		label_110.setForeground(Color.RED);
		label_110.setBounds(458, 612, 10, 10);
		frame.getContentPane().add(label_110);
		label_110.setVisible(false);

		
		JLabel label_111 = new JLabel("A");
		label_111.setForeground(Color.RED);
		label_111.setBounds(447, 661, 10, 10);
		frame.getContentPane().add(label_111);
		label_111.setVisible(false);

		
		JLabel label_112 = new JLabel("B");
		label_112.setForeground(Color.RED);
		label_112.setBounds(458, 661, 10, 10);
		frame.getContentPane().add(label_112);
		label_112.setVisible(false);

		
		JLabel label_113 = new JLabel("Z");
		label_113.setForeground(Color.RED);
		label_113.setBackground(Color.WHITE);
		label_113.setBounds(469, 612, 10, 10);
		frame.getContentPane().add(label_113);
		label_113.setVisible(false);

		
		JLabel label_114 = new JLabel("C");
		label_114.setForeground(Color.RED);
		label_114.setBackground(Color.WHITE);
		label_114.setBounds(469, 661, 10, 10);
		frame.getContentPane().add(label_114);
		label_114.setVisible(false);

		
		JLabel label_115 = new JLabel("X");
		label_115.setForeground(Color.RED);
		label_115.setBounds(505, 612, 10, 10);
		frame.getContentPane().add(label_115);
		label_115.setVisible(false);

		
		JLabel label_116 = new JLabel("Y");
		label_116.setForeground(Color.RED);
		label_116.setBounds(516, 612, 10, 10);
		frame.getContentPane().add(label_116);
		label_116.setVisible(false);

		
		JLabel label_117 = new JLabel("A");
		label_117.setForeground(Color.RED);
		label_117.setBounds(505, 661, 10, 10);
		frame.getContentPane().add(label_117);
		label_117.setVisible(false);

		
		JLabel label_118 = new JLabel("B");
		label_118.setForeground(Color.RED);
		label_118.setBounds(516, 661, 10, 10);
		frame.getContentPane().add(label_118);
		label_118.setVisible(false);

		
		JLabel label_119 = new JLabel("Z");
		label_119.setForeground(Color.RED);
		label_119.setBackground(Color.WHITE);
		label_119.setBounds(527, 612, 10, 10);
		frame.getContentPane().add(label_119);
		label_119.setVisible(false);

		
		JLabel label_120 = new JLabel("C");
		label_120.setForeground(Color.RED);
		label_120.setBackground(Color.WHITE);
		label_120.setBounds(527, 661, 10, 10);
		frame.getContentPane().add(label_120);
		label_120.setVisible(false);
		
		JLabel label_121 = new JLabel("X");
		label_121.setForeground(Color.RED);
		label_121.setBounds(559, 612, 10, 10);
		frame.getContentPane().add(label_121);
		label_121.setVisible(false);

		
		JLabel label_122 = new JLabel("Y");
		label_122.setForeground(Color.RED);
		label_122.setBounds(570, 612, 10, 10);
		frame.getContentPane().add(label_122);
		label_122.setVisible(false);

		
		JLabel label_123 = new JLabel("A");
		label_123.setForeground(Color.RED);
		label_123.setBounds(559, 661, 10, 10);
		frame.getContentPane().add(label_123);
		label_123.setVisible(false);

		
		JLabel label_124 = new JLabel("B");
		label_124.setForeground(Color.RED);
		label_124.setBounds(570, 661, 10, 10);
		frame.getContentPane().add(label_124);
		label_124.setVisible(false);

		
		JLabel label_125 = new JLabel("Z");
		label_125.setForeground(Color.RED);
		label_125.setBackground(Color.WHITE);
		label_125.setBounds(581, 612, 10, 10);
		frame.getContentPane().add(label_125);
		label_125.setVisible(false);

		
		JLabel label_126 = new JLabel("C");
		label_126.setForeground(Color.RED);
		label_126.setBackground(Color.WHITE);
		label_126.setBounds(581, 661, 10, 10);
		frame.getContentPane().add(label_126);
		label_126.setVisible(false);

		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(Color.RED);
		lblX.setBounds(614, 612, 10, 10);
		frame.getContentPane().add(lblX);
		lblX.setVisible(false);

		
		JLabel lblY_1 = new JLabel("Y");
		lblY_1.setForeground(Color.RED);
		lblY_1.setBounds(625, 612, 10, 10);
		frame.getContentPane().add(lblY_1);
		lblY_1.setVisible(false);

		
		JLabel lblA_1 = new JLabel("A");
		lblA_1.setForeground(Color.RED);
		lblA_1.setBounds(614, 661, 10, 10);
		frame.getContentPane().add(lblA_1);
		lblA_1.setVisible(false);

		
		JLabel lblB_1 = new JLabel("B");
		lblB_1.setForeground(Color.RED);
		lblB_1.setBounds(625, 661, 10, 10);
		frame.getContentPane().add(lblB_1);
		lblB_1.setVisible(false);

		
		JLabel lblZ_1 = new JLabel("Z");
		lblZ_1.setForeground(Color.RED);
		lblZ_1.setBackground(Color.WHITE);
		lblZ_1.setBounds(636, 612, 10, 10);
		frame.getContentPane().add(lblZ_1);
		lblZ_1.setVisible(false);

		
		JLabel lblC_1 = new JLabel("C");
		lblC_1.setForeground(Color.RED);
		lblC_1.setBackground(Color.WHITE);
		lblC_1.setBounds(636, 661, 10, 10);
		frame.getContentPane().add(lblC_1);
		lblC_1.setVisible(false);

		
		JLabel label_127 = new JLabel("X");
		label_127.setForeground(Color.RED);
		label_127.setBounds(614, 413, 10, 10);
		frame.getContentPane().add(label_127);
		label_127.setVisible(false);

		
		JLabel label_128 = new JLabel("Y");
		label_128.setForeground(Color.RED);
		label_128.setBounds(625, 413, 10, 10);
		frame.getContentPane().add(label_128);
		label_128.setVisible(false);

		
		JLabel label_130 = new JLabel("A");
		label_130.setForeground(Color.RED);
		label_130.setBounds(614, 455, 10, 10);
		frame.getContentPane().add(label_130);
		label_130.setVisible(false);

		
		JLabel label_131 = new JLabel("B");
		label_131.setForeground(Color.RED);
		label_131.setBounds(625, 455, 10, 10);
		frame.getContentPane().add(label_131);
		label_131.setVisible(false);

		
		JLabel label_132 = new JLabel("Z");
		label_132.setForeground(Color.RED);
		label_132.setBackground(Color.WHITE);
		label_132.setBounds(636, 413, 10, 10);
		frame.getContentPane().add(label_132);
		label_132.setVisible(false);

		
		JLabel label_133 = new JLabel("C");
		label_133.setForeground(Color.RED);
		label_133.setBackground(Color.WHITE);
		label_133.setBounds(636, 455, 10, 10);
		frame.getContentPane().add(label_133);
		label_133.setVisible(false);

		
		JLabel label_134 = new JLabel("X");
		label_134.setForeground(Color.RED);
		label_134.setBounds(614, 195, 10, 10);
		frame.getContentPane().add(label_134);
		label_134.setVisible(false);

		
		JLabel label_135 = new JLabel("Y");
		label_135.setForeground(Color.RED);
		label_135.setBounds(625, 195, 10, 10);
		frame.getContentPane().add(label_135);
		label_135.setVisible(false);

		
		JLabel label_136 = new JLabel("A");
		label_136.setForeground(Color.RED);
		label_136.setBounds(614, 244, 10, 10);
		frame.getContentPane().add(label_136);
		label_136.setVisible(false);

		
		JLabel label_137 = new JLabel("B");
		label_137.setForeground(Color.RED);
		label_137.setBounds(625, 244, 10, 10);
		frame.getContentPane().add(label_137);
		label_137.setVisible(false);

		
		JLabel label_138 = new JLabel("Z");
		label_138.setForeground(Color.RED);
		label_138.setBackground(Color.WHITE);
		label_138.setBounds(636, 195, 10, 10);
		frame.getContentPane().add(label_138);
		label_138.setVisible(false);

		
		JLabel label_139 = new JLabel("C");
		label_139.setForeground(Color.RED);
		label_139.setBackground(Color.WHITE);
		label_139.setBounds(636, 244, 10, 10);
		frame.getContentPane().add(label_139);
		label_139.setVisible(false);

		
		JLabel label_140 = new JLabel("X");
		label_140.setForeground(Color.RED);
		label_140.setBounds(92, 612, 10, 10);
		frame.getContentPane().add(label_140);
		label_140.setVisible(false);

		
		JLabel label_141 = new JLabel("Y");
		label_141.setForeground(Color.RED);
		label_141.setBounds(103, 612, 10, 10);
		frame.getContentPane().add(label_141);
		label_141.setVisible(false);

		
		JLabel label_142 = new JLabel("A");
		label_142.setForeground(Color.RED);
		label_142.setBounds(92, 661, 10, 10);
		frame.getContentPane().add(label_142);
		label_142.setVisible(false);

		
		JLabel label_143 = new JLabel("B");
		label_143.setForeground(Color.RED);
		label_143.setBounds(103, 661, 10, 10);
		frame.getContentPane().add(label_143);
		label_143.setVisible(false);

		
		JLabel label_144 = new JLabel("Z");
		label_144.setForeground(Color.RED);
		label_144.setBackground(Color.WHITE);
		label_144.setBounds(114, 612, 10, 10);
		frame.getContentPane().add(label_144);
		label_144.setVisible(false);

		
		JLabel label_145 = new JLabel("C");
		label_145.setForeground(Color.RED);
		label_145.setBackground(Color.WHITE);
		label_145.setBounds(114, 661, 10, 10);
		frame.getContentPane().add(label_145);
		label_145.setVisible(false);

		
		JLabel label_3 = new JLabel("X");
		label_3.setForeground(Color.RED);
		label_3.setBounds(25, 346, 10, 10);
		frame.getContentPane().add(label_3);
		label_3.setVisible(false);

		
		JLabel label_146 = new JLabel("Y");
		label_146.setForeground(Color.RED);
		label_146.setBounds(36, 346, 10, 10);
		frame.getContentPane().add(label_146);
		label_146.setVisible(false);

		
		JLabel label_147 = new JLabel("A");
		label_147.setForeground(Color.RED);
		label_147.setBounds(25, 395, 10, 10);
		frame.getContentPane().add(label_147);
		label_147.setVisible(false);

		
		JLabel label_148 = new JLabel("B");
		label_148.setForeground(Color.RED);
		label_148.setBounds(36, 395, 10, 10);
		frame.getContentPane().add(label_148);
		label_148.setVisible(false);

		
		JLabel label_149 = new JLabel("Z");
		label_149.setForeground(Color.RED);
		label_149.setBackground(Color.WHITE);
		label_149.setBounds(47, 346, 10, 10);
		frame.getContentPane().add(label_149);
		label_149.setVisible(false);
		
		JLabel label_150 = new JLabel("C");
		label_150.setForeground(Color.RED);
		label_150.setBackground(Color.WHITE);
		label_150.setBounds(47, 395, 10, 10);
		frame.getContentPane().add(label_150);
		label_150.setVisible(false);

		
		JLabel label_1 = new JLabel("X");
		label_1.setForeground(Color.RED);
		label_1.setBounds(7, 262, 10, 10);
		frame.getContentPane().add(label_1);
		label_1.setVisible(false);

		
		JLabel label_2 = new JLabel("Y");
		label_2.setForeground(Color.RED);
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(7, 274, 10, 10);
		frame.getContentPane().add(label_2);
		label_2.setVisible(false);

		
		JLabel label_4 = new JLabel("Z");
		label_4.setForeground(Color.RED);
		label_4.setBounds(7, 285, 10, 10);
		frame.getContentPane().add(label_4);
		label_4.setVisible(false);

		
		JLabel label_5 = new JLabel("X");
		label_5.setForeground(Color.RED);
		label_5.setBounds(7, 308, 10, 10);
		frame.getContentPane().add(label_5);
		label_5.setVisible(false);

		
		JLabel label_6 = new JLabel("Y");
		label_6.setForeground(Color.RED);
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(7, 320, 10, 10);
		frame.getContentPane().add(label_6);
		label_6.setVisible(false);

		
		JLabel label_7 = new JLabel("Z");
		label_7.setForeground(Color.RED);
		label_7.setBounds(7, 331, 10, 10);
		frame.getContentPane().add(label_7);
		label_7.setVisible(false);

		
		JLabel label_8 = new JLabel("X");
		label_8.setForeground(Color.RED);
		label_8.setBounds(7, 439, 10, 10);
		frame.getContentPane().add(label_8);
		label_8.setVisible(false);

		
		JLabel label_11 = new JLabel("Y");
		label_11.setForeground(Color.RED);
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(7, 451, 10, 10);
		frame.getContentPane().add(label_11);
		label_11.setVisible(false);

		
		JLabel label_151 = new JLabel("Z");
		label_151.setForeground(Color.RED);
		label_151.setBounds(7, 462, 10, 10);
		frame.getContentPane().add(label_151);
		label_151.setVisible(false);

		
		JLabel label_152 = new JLabel("X");
		label_152.setForeground(Color.RED);
		label_152.setBounds(7, 479, 10, 10);
		frame.getContentPane().add(label_152);
		label_152.setVisible(false);
		
		JLabel label_153 = new JLabel("Y");
		label_153.setForeground(Color.RED);
		label_153.setBackground(Color.WHITE);
		label_153.setBounds(7, 491, 10, 10);
		frame.getContentPane().add(label_153);
		label_153.setVisible(false);

		
		JLabel label_154 = new JLabel("Z");
		label_154.setForeground(Color.RED);
		label_154.setBounds(7, 502, 10, 10);
		frame.getContentPane().add(label_154);
		label_154.setVisible(false);

		
		JLabel label_155 = new JLabel("X");
		label_155.setForeground(Color.RED);
		label_155.setBounds(18, 545, 10, 10);
		frame.getContentPane().add(label_155);
		label_155.setVisible(false);

		
		JLabel label_156 = new JLabel("Y");
		label_156.setForeground(Color.RED);
		label_156.setBackground(Color.WHITE);
		label_156.setBounds(7, 540, 10, 10);
		frame.getContentPane().add(label_156);
		label_156.setVisible(false);

		
		JLabel label_157 = new JLabel("Z");
		label_157.setForeground(Color.RED);
		label_157.setBounds(7, 551, 10, 10);
		frame.getContentPane().add(label_157);
		label_157.setVisible(false);

		
		JLabel label_158 = new JLabel("X");
		label_158.setForeground(Color.RED);
		label_158.setBounds(7, 569, 10, 10);
		frame.getContentPane().add(label_158);
		label_158.setVisible(false);

		
		JLabel label_159 = new JLabel("Y");
		label_159.setForeground(Color.RED);
		label_159.setBackground(Color.WHITE);
		label_159.setBounds(7, 581, 10, 10);
		frame.getContentPane().add(label_159);
		label_159.setVisible(false);

		
		JLabel label_160 = new JLabel("Z");
		label_160.setForeground(Color.RED);
		label_160.setBounds(7, 592, 10, 10);
		frame.getContentPane().add(label_160);
		label_160.setVisible(false);

		
		JLabel label_161 = new JLabel("X");
		label_161.setForeground(Color.RED);
		label_161.setBounds(603, 569, 10, 10);
		frame.getContentPane().add(label_161);
		label_161.setVisible(false);

		
		JLabel label_162 = new JLabel("Y");
		label_162.setForeground(Color.RED);
		label_162.setBackground(Color.WHITE);
		label_162.setBounds(603, 581, 10, 10);
		frame.getContentPane().add(label_162);
		label_162.setVisible(false);
		
		JLabel label_163 = new JLabel("Z");
		label_163.setForeground(Color.RED);
		label_163.setBounds(603, 592, 10, 10);
		frame.getContentPane().add(label_163);
		label_163.setVisible(false);

		
		JLabel label_164 = new JLabel("X");
		label_164.setForeground(Color.RED);
		label_164.setBounds(597, 525, 10, 10);
		frame.getContentPane().add(label_164);
		label_164.setVisible(false);

		
		JLabel label_165 = new JLabel("Y");
		label_165.setForeground(Color.RED);
		label_165.setBackground(Color.WHITE);
		label_165.setBounds(597, 537, 10, 10);
		frame.getContentPane().add(label_165);
		label_165.setVisible(false);

		
		JLabel label_166 = new JLabel("Z");
		label_166.setForeground(Color.RED);
		label_166.setBounds(597, 548, 10, 10);
		frame.getContentPane().add(label_166);
		label_166.setVisible(false);

		
		JLabel label_167 = new JLabel("X");
		label_167.setForeground(Color.RED);
		label_167.setBounds(614, 488, 10, 10);
		frame.getContentPane().add(label_167);
		label_167.setVisible(false);

		
		JLabel label_168 = new JLabel("Y");
		label_168.setForeground(Color.RED);
		label_168.setBackground(Color.WHITE);
		label_168.setBounds(603, 491, 10, 10);
		frame.getContentPane().add(label_168);
		label_168.setVisible(false);

		
		JLabel label_169 = new JLabel("Z");
		label_169.setForeground(Color.RED);
		label_169.setBounds(603, 502, 10, 10);
		frame.getContentPane().add(label_169);
		label_169.setVisible(false);

		
		JLabel label_170 = new JLabel("X");
		label_170.setForeground(Color.RED);
		label_170.setBounds(597, 360, 10, 10);
		frame.getContentPane().add(label_170);
		label_170.setVisible(false);

		
		JLabel label_171 = new JLabel("Y");
		label_171.setForeground(Color.RED);
		label_171.setBackground(Color.WHITE);
		label_171.setBounds(597, 382, 10, 10);
		frame.getContentPane().add(label_171);
		label_171.setVisible(false);

		
		JLabel label_172 = new JLabel("Z");
		label_172.setForeground(Color.RED);
		label_172.setBounds(597, 392, 10, 10);
		frame.getContentPane().add(label_172);
		label_172.setVisible(false);

		
		JLabel label_173 = new JLabel("X");
		label_173.setForeground(Color.RED);
		label_173.setBounds(614, 315, 10, 10);
		frame.getContentPane().add(label_173);
		label_173.setVisible(false);

		
		JLabel label_174 = new JLabel("Y");
		label_174.setForeground(Color.RED);
		label_174.setBackground(Color.WHITE);
		label_174.setBounds(603, 320, 10, 10);
		frame.getContentPane().add(label_174);
		label_174.setVisible(false);

		
		JLabel label_175 = new JLabel("Z");
		label_175.setForeground(Color.RED);
		label_175.setBounds(603, 331, 10, 10);
		frame.getContentPane().add(label_175);
		label_175.setVisible(false);

		
		JLabel label_176 = new JLabel("X");
		label_176.setForeground(Color.RED);
		label_176.setBounds(614, 270, 10, 10);
		frame.getContentPane().add(label_176);
		label_176.setVisible(false);

		
		JLabel label_177 = new JLabel("Y");
		label_177.setForeground(Color.RED);
		label_177.setBackground(Color.WHITE);
		label_177.setBounds(603, 274, 10, 10);
		frame.getContentPane().add(label_177);
		label_177.setVisible(false);

		
		JLabel label_178 = new JLabel("Z");
		label_178.setForeground(Color.RED);
		label_178.setBounds(603, 285, 10, 10);
		frame.getContentPane().add(label_178);
		label_178.setVisible(false);

		
		JLabel label_179 = new JLabel("X");
		label_179.setForeground(Color.RED);
		label_179.setBounds(603, 146, 10, 10);
		frame.getContentPane().add(label_179);
		label_179.setVisible(false);

		
		JLabel label_180 = new JLabel("Y");
		label_180.setForeground(Color.RED);
		label_180.setBackground(Color.WHITE);
		label_180.setBounds(603, 158, 10, 10);
		frame.getContentPane().add(label_180);
		label_180.setVisible(false);

		
		JLabel label_181 = new JLabel("Z");
		label_181.setForeground(Color.RED);
		label_181.setBounds(603, 169, 10, 10);
		frame.getContentPane().add(label_181);
		label_181.setVisible(false);

		
		JLabel label_129 = new JLabel("X");
		label_129.setForeground(Color.RED);
		label_129.setBounds(144, 627, 10, 10);
		frame.getContentPane().add(label_129);
		label_129.setVisible(false);

		
		JLabel label_182 = new JLabel("Y");
		label_182.setForeground(Color.RED);
		label_182.setBackground(Color.WHITE);
		label_182.setBounds(144, 639, 10, 10);
		frame.getContentPane().add(label_182);
		label_182.setVisible(false);

		
		JLabel label_183 = new JLabel("Z");
		label_183.setForeground(Color.RED);
		label_183.setBounds(144, 650, 10, 10);
		frame.getContentPane().add(label_183);
		label_183.setVisible(false);

		
		JLabel label_184 = new JLabel("X");
		label_184.setForeground(Color.RED);
		label_184.setBounds(239, 627, 10, 10);
		frame.getContentPane().add(label_184);
		label_184.setVisible(false);

		
		JLabel label_185 = new JLabel("Y");
		label_185.setForeground(Color.RED);
		label_185.setBackground(Color.WHITE);
		label_185.setBounds(239, 639, 10, 10);
		frame.getContentPane().add(label_185);
		label_185.setVisible(false);

		
		JLabel label_186 = new JLabel("Z");
		label_186.setForeground(Color.RED);
		label_186.setBounds(239, 650, 10, 10);
		frame.getContentPane().add(label_186);
		label_186.setVisible(false);

		
		JLabel label_12 = new JLabel("A");
		label_12.setForeground(Color.RED);
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(66, 262, 10, 10);
		frame.getContentPane().add(label_12);
		label_12.setVisible(false);

		
		JLabel label_13 = new JLabel("B");
		label_13.setForeground(Color.RED);
		label_13.setBounds(66, 274, 10, 10);
		frame.getContentPane().add(label_13);
		label_13.setVisible(false);

		
		JLabel label_14 = new JLabel("C");
		label_14.setForeground(Color.RED);
		label_14.setBounds(66, 285, 10, 10);
		frame.getContentPane().add(label_14);
		label_14.setVisible(false);

		
		JLabel label_187 = new JLabel("A");
		label_187.setForeground(Color.RED);
		label_187.setBackground(Color.WHITE);
		label_187.setBounds(64, 308, 10, 10);
		frame.getContentPane().add(label_187);
		label_187.setVisible(false);

		
		JLabel label_188 = new JLabel("B");
		label_188.setForeground(Color.RED);
		label_188.setBounds(64, 320, 10, 10);
		frame.getContentPane().add(label_188);
		label_188.setVisible(false);

		
		JLabel label_189 = new JLabel("C");
		label_189.setForeground(Color.RED);
		label_189.setBounds(64, 331, 10, 10);
		frame.getContentPane().add(label_189);
		label_189.setVisible(false);

		
		JLabel label_190 = new JLabel("A");
		label_190.setForeground(Color.RED);
		label_190.setBackground(Color.WHITE);
		label_190.setBounds(64, 439, 10, 10);
		frame.getContentPane().add(label_190);
		label_190.setVisible(false);

		
		JLabel label_191 = new JLabel("B");
		label_191.setForeground(Color.RED);
		label_191.setBounds(64, 451, 10, 10);
		frame.getContentPane().add(label_191);
		label_191.setVisible(false);

		
		JLabel label_192 = new JLabel("C");
		label_192.setForeground(Color.RED);
		label_192.setBounds(64, 462, 10, 10);
		frame.getContentPane().add(label_192);
		label_192.setVisible(false);

		
		JLabel label_193 = new JLabel("A");
		label_193.setForeground(Color.RED);
		label_193.setBackground(Color.WHITE);
		label_193.setBounds(64, 479, 10, 10);
		frame.getContentPane().add(label_193);
		label_193.setVisible(false);

		
		JLabel label_194 = new JLabel("B");
		label_194.setForeground(Color.RED);
		label_194.setBounds(64, 491, 10, 10);
		frame.getContentPane().add(label_194);
		label_194.setVisible(false);

		
		JLabel label_195 = new JLabel("C");
		label_195.setForeground(Color.RED);
		label_195.setBounds(64, 502, 10, 10);
		frame.getContentPane().add(label_195);
		label_195.setVisible(false);

		
		JLabel label_196 = new JLabel("A");
		label_196.setForeground(Color.RED);
		label_196.setBackground(Color.WHITE);
		label_196.setBounds(60, 545, 10, 10);
		frame.getContentPane().add(label_196);
		label_196.setVisible(false);

		
		JLabel label_197 = new JLabel("B");
		label_197.setForeground(Color.RED);
		label_197.setBounds(70, 540, 10, 10);
		frame.getContentPane().add(label_197);
		label_197.setVisible(false);

		
		JLabel label_198 = new JLabel("C");
		label_198.setForeground(Color.RED);
		label_198.setBounds(70, 551, 10, 10);
		frame.getContentPane().add(label_198);
		label_198.setVisible(false);

		
		JLabel label_199 = new JLabel("A");
		label_199.setForeground(Color.RED);
		label_199.setBackground(Color.WHITE);
		label_199.setBounds(64, 569, 10, 10);
		frame.getContentPane().add(label_199);
		label_199.setVisible(false);

		
		JLabel label_200 = new JLabel("B");
		label_200.setForeground(Color.RED);
		label_200.setBounds(64, 581, 10, 10);
		frame.getContentPane().add(label_200);
		label_200.setVisible(false);

		
		JLabel label_201 = new JLabel("C");
		label_201.setForeground(Color.RED);
		label_201.setBounds(64, 592, 10, 10);
		frame.getContentPane().add(label_201);
		label_201.setVisible(false);

		
		JLabel label_202 = new JLabel("A");
		label_202.setForeground(Color.RED);
		label_202.setBackground(Color.WHITE);
		label_202.setBounds(179, 627, 10, 10);
		frame.getContentPane().add(label_202);
		label_202.setVisible(false);

		
		JLabel label_203 = new JLabel("B");
		label_203.setForeground(Color.RED);
		label_203.setBounds(179, 639, 10, 10);
		frame.getContentPane().add(label_203);
		label_203.setVisible(false);

		
		JLabel label_204 = new JLabel("C");
		label_204.setForeground(Color.RED);
		label_204.setBounds(179, 650, 10, 10);
		frame.getContentPane().add(label_204);
		label_204.setVisible(false);

		
		JLabel label_205 = new JLabel("A");
		label_205.setForeground(Color.RED);
		label_205.setBackground(Color.WHITE);
		label_205.setBounds(292, 627, 10, 10);
		frame.getContentPane().add(label_205);
		label_205.setVisible(false);

		
		JLabel label_206 = new JLabel("B");
		label_206.setForeground(Color.RED);
		label_206.setBounds(292, 639, 10, 10);
		frame.getContentPane().add(label_206);
		label_206.setVisible(false);

		
		JLabel label_207 = new JLabel("C");
		label_207.setForeground(Color.RED);
		label_207.setBounds(292, 650, 10, 10);
		frame.getContentPane().add(label_207);
		label_207.setVisible(false);

		
		JLabel label_208 = new JLabel("A");
		label_208.setForeground(Color.RED);
		label_208.setBackground(Color.WHITE);
		label_208.setBounds(647, 569, 10, 10);
		frame.getContentPane().add(label_208);
		label_208.setVisible(false);

		
		JLabel label_209 = new JLabel("B");
		label_209.setForeground(Color.RED);
		label_209.setBounds(647, 581, 10, 10);
		frame.getContentPane().add(label_209);
		label_209.setVisible(false);

		
		JLabel label_210 = new JLabel("C");
		label_210.setForeground(Color.RED);
		label_210.setBounds(647, 592, 10, 10);
		frame.getContentPane().add(label_210);
		label_210.setVisible(false);

		
		JLabel label_211 = new JLabel("A");
		label_211.setForeground(Color.RED);
		label_211.setBackground(Color.WHITE);
		label_211.setBounds(650, 525, 10, 10);
		frame.getContentPane().add(label_211);
		label_211.setVisible(false);

		
		JLabel label_212 = new JLabel("B");
		label_212.setForeground(Color.RED);
		label_212.setBounds(650, 537, 10, 10);
		frame.getContentPane().add(label_212);
		label_212.setVisible(false);

		
		JLabel label_213 = new JLabel("C");
		label_213.setForeground(Color.RED);
		label_213.setBounds(650, 548, 10, 10);
		frame.getContentPane().add(label_213);
		label_213.setVisible(false);

		
		JLabel label_214 = new JLabel("A");
		label_214.setForeground(Color.RED);
		label_214.setBackground(Color.WHITE);
		label_214.setBounds(636, 488, 10, 10);
		frame.getContentPane().add(label_214);
		label_214.setVisible(false);

		
		JLabel label_215 = new JLabel("B");
		label_215.setForeground(Color.RED);
		label_215.setBounds(647, 491, 10, 10);
		frame.getContentPane().add(label_215);
		label_215.setVisible(false);

		
		JLabel label_216 = new JLabel("C");
		label_216.setForeground(Color.RED);
		label_216.setBounds(647, 502, 10, 10);
		frame.getContentPane().add(label_216);
		label_216.setVisible(false);

		
		JLabel label_217 = new JLabel("A");
		label_217.setForeground(Color.RED);
		label_217.setBackground(Color.WHITE);
		label_217.setBounds(647, 360, 10, 10);
		frame.getContentPane().add(label_217);
		label_217.setVisible(false);

		
		JLabel lblC_3 = new JLabel("C");
		lblC_3.setForeground(Color.RED);
		lblC_3.setBounds(647, 392, 10, 10);
		frame.getContentPane().add(lblC_3);
		lblC_3.setVisible(false);

		
		JLabel lblB_3 = new JLabel("B");
		lblB_3.setForeground(Color.RED);
		lblB_3.setBounds(647, 382, 10, 10);
		frame.getContentPane().add(lblB_3);
		lblB_3.setVisible(false);

		
		JLabel label_220 = new JLabel("A");
		label_220.setForeground(Color.RED);
		label_220.setBackground(Color.WHITE);
		label_220.setBounds(636, 315, 10, 10);
		frame.getContentPane().add(label_220);
		label_220.setVisible(false);

		
		JLabel label_221 = new JLabel("B");
		label_221.setForeground(Color.RED);
		label_221.setBounds(647, 320, 10, 10);
		frame.getContentPane().add(label_221);
		label_221.setVisible(false);

		
		JLabel label_222 = new JLabel("C");
		label_222.setForeground(Color.RED);
		label_222.setBounds(647, 331, 10, 10);
		frame.getContentPane().add(label_222);
		label_222.setVisible(false);

		
		JLabel label_223 = new JLabel("A");
		label_223.setForeground(Color.RED);
		label_223.setBackground(Color.WHITE);
		label_223.setBounds(636, 270, 10, 10);
		frame.getContentPane().add(label_223);
		label_223.setVisible(false);

		
		JLabel label_224 = new JLabel("B");
		label_224.setForeground(Color.RED);
		label_224.setBounds(647, 274, 10, 10);
		frame.getContentPane().add(label_224);
		label_224.setVisible(false);

		
		JLabel label_225 = new JLabel("C");
		label_225.setForeground(Color.RED);
		label_225.setBounds(647, 285, 10, 10);
		frame.getContentPane().add(label_225);
		label_225.setVisible(false);

		
		JLabel label_226 = new JLabel("A");
		label_226.setForeground(Color.RED);
		label_226.setBackground(Color.WHITE);
		label_226.setBounds(647, 146, 10, 10);
		frame.getContentPane().add(label_226);
		label_226.setVisible(false);

		
		JLabel label_227 = new JLabel("B");
		label_227.setForeground(Color.RED);
		label_227.setBounds(647, 158, 10, 10);
		frame.getContentPane().add(label_227);
		label_227.setVisible(false);

		
		JLabel label_228 = new JLabel("C");
		label_228.setForeground(Color.RED);
		label_228.setBounds(647, 169, 10, 10);
		frame.getContentPane().add(label_228);
		label_228.setVisible(false);

		
		JLabel label_26 = new JLabel("X");
		label_26.setForeground(Color.RED);
		label_26.setBounds(192, 73, 10, 10);
		frame.getContentPane().add(label_26);
		label_26.setVisible(false);

		
		JLabel label_27 = new JLabel("Y");
		label_27.setForeground(Color.RED);
		label_27.setBackground(Color.WHITE);
		label_27.setBounds(192, 85, 10, 10);
		frame.getContentPane().add(label_27);
		label_27.setVisible(false);

		
		JLabel label_28 = new JLabel("Z");
		label_28.setForeground(Color.RED);
		label_28.setBounds(192, 96, 10, 10);
		frame.getContentPane().add(label_28);
		label_28.setVisible(false);

		
		JLabel label_29 = new JLabel("A");
		label_29.setForeground(Color.RED);
		label_29.setBackground(Color.WHITE);
		label_29.setBounds(227, 73, 10, 10);
		frame.getContentPane().add(label_29);
		label_29.setVisible(false);

		
		JLabel label_30 = new JLabel("B");
		label_30.setForeground(Color.RED);
		label_30.setBounds(227, 85, 10, 10);
		frame.getContentPane().add(label_30);
		label_30.setVisible(false);

		
		JLabel label_31 = new JLabel("C");
		label_31.setForeground(Color.RED);
		label_31.setBounds(227, 96, 10, 10);
		frame.getContentPane().add(label_31);
		label_31.setVisible(false);

		
		JLabel label_62 = new JLabel("X");
		label_62.setForeground(Color.RED);
		label_62.setBounds(495, 73, 10, 10);
		frame.getContentPane().add(label_62);
		label_62.setVisible(false);

		
		JLabel label_63 = new JLabel("Y");
		label_63.setForeground(Color.RED);
		label_63.setBackground(Color.WHITE);
		label_63.setBounds(495, 85, 10, 10);
		frame.getContentPane().add(label_63);
		label_63.setVisible(false);

		
		JLabel label_64 = new JLabel("Z");
		label_64.setForeground(Color.RED);
		label_64.setBounds(495, 96, 10, 10);
		frame.getContentPane().add(label_64);
		label_64.setVisible(false);

		
		JLabel label_65 = new JLabel("A");
		label_65.setForeground(Color.RED);
		label_65.setBackground(Color.WHITE);
		label_65.setBounds(532, 73, 10, 10);
		frame.getContentPane().add(label_65);
		label_65.setVisible(false);

		
		JLabel label_66 = new JLabel("B");
		label_66.setForeground(Color.RED);
		label_66.setBounds(532, 85, 10, 10);
		frame.getContentPane().add(label_66);
		label_66.setVisible(false);

		
		JLabel label_67 = new JLabel("C");
		label_67.setForeground(Color.RED);
		label_67.setBounds(532, 96, 10, 10);
		frame.getContentPane().add(label_67);
		label_67.setVisible(false);

		
		JLabel label_44 = new JLabel("X");
		label_44.setForeground(Color.RED);
		label_44.setBounds(374, 73, 10, 10);
		frame.getContentPane().add(label_44);
		label_44.setVisible(false);
		
				
				JLabel label_45 = new JLabel("Y");
				label_45.setForeground(Color.RED);
				label_45.setBackground(Color.WHITE);
				label_45.setBounds(374, 85, 10, 10);
				frame.getContentPane().add(label_45);
				label_45.setVisible(false);

		
		JLabel label_46 = new JLabel("Z");
		label_46.setForeground(Color.RED);
		label_46.setBounds(374, 96, 10, 10);
		frame.getContentPane().add(label_46);
		label_46.setVisible(false);

		
		JLabel label_47 = new JLabel("A");
		label_47.setForeground(Color.RED);
		label_47.setBackground(Color.WHITE);
		label_47.setBounds(417, 73, 10, 10);
		frame.getContentPane().add(label_47);
		label_47.setVisible(false);

		
		JLabel label_48 = new JLabel("B");
		label_48.setForeground(Color.RED);
		label_48.setBounds(417, 85, 10, 10);
		frame.getContentPane().add(label_48);
		label_48.setVisible(false);

		
		JLabel label_49 = new JLabel("C");
		label_49.setForeground(Color.RED);
		label_49.setBounds(417, 96, 10, 10);
		frame.getContentPane().add(label_49);
		label_49.setVisible(false);
		
		JLabel label = new JLabel();
		label.setBounds(0, 0, 660, 731);
		frame.getContentPane().add(label);
		label.setForeground(Color.BLACK);
		label.setIcon(monopoly);//add icon to JLabel
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		
		

		
		
		List<JLabel> labels=Arrays.asList(lblA_1,label_123,label_117,label_111,label_105,label_99,label_205,
				label_93,label_202,label_142,label_87,label_199,label_196,label_193,label_190,label_147,
				label_187,label_12,lblA_2,label_81,label_75,lblA,label_22,label_29,label_34,label_40,label_47,
				label_52,label_65,label_58,label_70,label_226,label_136,label_223,label_220,label_217,label_130,
				label_214,label_211,label_208);
		
		List<JLabel> labels1=Arrays.asList(lblB_1,label_124,label_118,label_112,label_106,label_100,label_206,label_94,label_203,
				label_143,label_88,label_200,label_197,label_194,label_191,label_148,label_188,label_13,
				lblB_2,label_82,label_76,lblB,label_23,label_30,label_35,label_41,label_48,label_53,label_66,
				label_59,label_71,label_227,label_137,label_224,label_221,lblB_3,label_131,label_215,label_212,
				label_209);
		
		List<JLabel> labels2=Arrays.asList(lblC_1,label_126,label_120,label_114,label_108,label_102,label_207,label_96,label_204,
				label_145,label_90,label_201,label_198,label_195,label_192,label_150,label_189,label_14,
				lblC_2,label_84,label_78,lblC,label_25,label_31,label_37,label_43,label_49,label_55,label_67,
				label_61,label_73,label_228,label_139,label_225,label_222,lblC_3,label_133,label_216,label_213,
				label_210);
		
		lblA_1.setVisible(true);
		lblB_1.setVisible(true);
		lblC_1.setVisible(true);
		lblX.setVisible(true);
		lblY_1.setVisible(true);
		lblZ_1.setVisible(true);
		
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
			        	switch(UserA)
						{
				        case 1:for(JLabel label: labels){label.setVisible(false);}
				        	lblA_1.setVisible(true);
							break;
						case 2:for(JLabel label: labels){label.setVisible(false);}
							label_123.setVisible(true);
							break;
						case 3:for(JLabel label: labels){label.setVisible(false);}
							label_117.setVisible(true);
							break;
						case 4:for(JLabel label: labels){label.setVisible(false);}
							label_111.setVisible(true);
							break;
						case 5:for(JLabel label: labels){label.setVisible(false);}
							label_105.setVisible(true);
							break;
						case 6:for(JLabel label: labels){label.setVisible(false);}
							label_99.setVisible(true);
							break;
						case 7:for(JLabel label: labels){label.setVisible(false);}
							label_205.setVisible(true);
							break;
						case 8:for(JLabel label: labels){label.setVisible(false);}
							label_93.setVisible(true);
							break;
						case 9:for(JLabel label: labels){label.setVisible(false);}
							label_202.setVisible(true);
							break;
						case 10:for(JLabel label: labels){label.setVisible(false);}
							label_142.setVisible(true);
							break;
						case 11:for(JLabel label: labels){label.setVisible(false);}
							label_87.setVisible(true);
							break;
						case 12:for(JLabel label: labels){label.setVisible(false);}
							label_199.setVisible(true);
							break;
						case 13:for(JLabel label: labels){label.setVisible(false);}
							label_196.setVisible(true);
							break;
						case 14:for(JLabel label: labels){label.setVisible(false);}
							label_193.setVisible(true);
							break;
						case 15:for(JLabel label: labels){label.setVisible(false);}
							label_190.setVisible(true);
							break;
						case 16:for(JLabel label: labels){label.setVisible(false);}
							label_147.setVisible(true);
							break;
						case 17:for(JLabel label: labels){label.setVisible(false);}
							label_187.setVisible(true);
							break;
						case 18:for(JLabel label: labels){label.setVisible(false);}
							label_12.setVisible(true);
							break;
						case 19:for(JLabel label: labels){label.setVisible(false);}
							lblA_2.setVisible(true);
							break;
						case 20:for(JLabel label: labels){label.setVisible(false);}
							label_81.setVisible(true);
							break;
						case 21:for(JLabel label: labels){label.setVisible(false);}
							label_75.setVisible(true);
							break;
						case 22:for(JLabel label: labels){label.setVisible(false);}
							lblA.setVisible(true);
							break;
						case 23:for(JLabel label: labels){label.setVisible(false);}
							label_22.setVisible(true);
							break;
						case 24:for(JLabel label: labels){label.setVisible(false);}
							label_29.setVisible(true);
							break;
						case 25:for(JLabel label: labels){label.setVisible(false);}
							label_34.setVisible(true);
							break;
						case 26:for(JLabel label: labels){label.setVisible(false);}
							label_40.setVisible(true);
							break;
						case 27:for(JLabel label: labels){label.setVisible(false);}
							label_47.setVisible(true);
							break;
						case 28:for(JLabel label: labels){label.setVisible(false);}
							label_52.setVisible(true);
							break;
						case 29:for(JLabel label: labels){label.setVisible(false);}
							label_65.setVisible(true);
							break;
						case 30:for(JLabel label: labels){label.setVisible(false);}
							label_58.setVisible(true);
							break;
						case 31:for(JLabel label: labels){label.setVisible(false);}
							label_70.setVisible(true);
							break;
						case 32:for(JLabel label: labels){label.setVisible(false);}
							label_226.setVisible(true);
							break;
						case 33:for(JLabel label: labels){label.setVisible(false);}
							label_136.setVisible(true);
							break;
						case 34:for(JLabel label: labels){label.setVisible(false);}
							label_223.setVisible(true);
							break;
						case 35:for(JLabel label: labels){label.setVisible(false);}
							label_220.setVisible(true);
							break;
						case 36:for(JLabel label: labels){label.setVisible(false);}
							label_217.setVisible(true);
							break;
						case 37:for(JLabel label: labels){label.setVisible(false);}
							label_130.setVisible(true);
							break;
						case 38:for(JLabel label: labels){label.setVisible(false);}
							label_214.setVisible(true);
							break;
						case 39:for(JLabel label: labels){label.setVisible(false);}
							label_211.setVisible(true);
							break;
						case 40:for(JLabel label: labels){label.setVisible(false);}
							label_208.setVisible(true);
							break;
						}

			        	switch(UserB)
						{
						case 1:for(JLabel label1: labels1){label1.setVisible(false);}
							lblB_1.setVisible(true);
							break;
						case 2:for(JLabel label1: labels1){label1.setVisible(false);}
							label_124.setVisible(true);
							break;
						case 3:for(JLabel label1: labels1){label1.setVisible(false);}
							label_118.setVisible(true);
							break;
						case 4:for(JLabel label1: labels1){label1.setVisible(false);}
							label_112.setVisible(true);
							break;
						case 5:for(JLabel label1: labels1){label1.setVisible(false);}
							label_106.setVisible(true);
							break;
						case 6:for(JLabel label1: labels1){label1.setVisible(false);}
							label_100.setVisible(true);
							break;
						case 7:for(JLabel label1: labels1){label1.setVisible(false);}
							label_206.setVisible(true);
							break;
						case 8:for(JLabel label1: labels1){label1.setVisible(false);}
							label_94.setVisible(true);
							break;
						case 9:for(JLabel label1: labels1){label1.setVisible(false);}
							label_203.setVisible(true);
							break;
						case 10:for(JLabel label1: labels1){label1.setVisible(false);}
							label_143.setVisible(true);
							break;
						case 11:for(JLabel label1: labels1){label1.setVisible(false);}
							label_88.setVisible(true);
							break;
						case 12:for(JLabel label1: labels1){label1.setVisible(false);}
							label_200.setVisible(true);
							break;
						case 13:for(JLabel label1: labels1){label1.setVisible(false);}
							label_197.setVisible(true);
							break;
						case 14:for(JLabel label1: labels1){label1.setVisible(false);}
							label_194.setVisible(true);
							break;
						case 15:for(JLabel label1: labels1){label1.setVisible(false);}
							label_191.setVisible(true);
							break;
						case 16:for(JLabel label1: labels1){label1.setVisible(false);}
							label_148.setVisible(true);
							break;
						case 17:for(JLabel label1: labels1){label1.setVisible(false);}
							label_188.setVisible(true);
							break;
						case 18:for(JLabel label1: labels1){label1.setVisible(false);}
							label_13.setVisible(true);
							break;
						case 19:for(JLabel label1: labels1){label1.setVisible(false);}
							lblB_2.setVisible(true);
							break;
						case 20:for(JLabel label1: labels1){label1.setVisible(false);}
							label_82.setVisible(true);
							break;
						case 21:for(JLabel label1: labels1){label1.setVisible(false);}
							label_76.setVisible(true);
							break;
						case 22:for(JLabel label1: labels1){label1.setVisible(false);}
							lblB.setVisible(true);
							break;
						case 23:for(JLabel label1: labels1){label1.setVisible(false);}
							label_23.setVisible(true);
							break;
						case 24:for(JLabel label1: labels1){label1.setVisible(false);}
							label_30.setVisible(true);
							break;
						case 25:for(JLabel label1: labels1){label1.setVisible(false);}
							label_35.setVisible(true);
							break;
						case 26:for(JLabel label1: labels1){label1.setVisible(false);}
							label_41.setVisible(true);
							break;
						case 27:for(JLabel label1: labels1){label1.setVisible(false);}
							label_48.setVisible(true);
							break;
						case 28:for(JLabel label1: labels1){label1.setVisible(false);}
							label_53.setVisible(true);
							break;
						case 29:for(JLabel label1: labels1){label1.setVisible(false);}
							label_66.setVisible(true);
							break;
						case 30:for(JLabel label1: labels1){label1.setVisible(false);}
							label_59.setVisible(true);
							break;
						case 31:for(JLabel label1: labels1){label1.setVisible(false);}
							label_71.setVisible(true);
							break;
						case 32:for(JLabel label1: labels1){label1.setVisible(false);}
							label_227.setVisible(true);
							break;
						case 33:for(JLabel label1: labels1){label1.setVisible(false);}
							label_137.setVisible(true);
							break;
						case 34:for(JLabel label1: labels1){label1.setVisible(false);}
							label_224.setVisible(true);
							break;
						case 35:for(JLabel label1: labels1){label1.setVisible(false);}
							label_221.setVisible(true);
							break;
						case 36:for(JLabel label1: labels1){label1.setVisible(false);}
							lblB_3.setVisible(true);
							break;
						case 37:for(JLabel label1: labels1){label1.setVisible(false);}
							label_131.setVisible(true);
							break;
						case 38:for(JLabel label1: labels1){label1.setVisible(false);}
							label_215.setVisible(true);
							break;
						case 39:for(JLabel label1: labels1){label1.setVisible(false);}
							label_212.setVisible(true);
							break;
						case 40:for(JLabel label1: labels1){label1.setVisible(false);}
							label_209.setVisible(true);
							break;
						}
			        
			        	
						switch(UserC)
						{
						case 1:for(JLabel label2: labels2){label2.setVisible(false);}
							lblC_1.setVisible(true);
							break;
						case 2:for(JLabel label2: labels2){label2.setVisible(false);}
							label_126.setVisible(true);
							break;
						case 3:for(JLabel label2: labels2){label2.setVisible(false);}
							label_120.setVisible(true);
							break;
						case 4:for(JLabel label2: labels2){label2.setVisible(false);}
							label_114.setVisible(true);
							break;
						case 5:for(JLabel label2: labels2){label2.setVisible(false);}
							label_108.setVisible(true);
							break;
						case 6:for(JLabel label2: labels2){label2.setVisible(false);}
							label_102.setVisible(true);
							break;
						case 7:for(JLabel label2: labels2){label2.setVisible(false);}
							label_207.setVisible(true);
							break;
						case 8:for(JLabel label2: labels2){label2.setVisible(false);}
							label_96.setVisible(true);
							break;
						case 9:for(JLabel label2: labels2){label2.setVisible(false);}
							label_204.setVisible(true);
							break;
						case 10:for(JLabel label2: labels2){label2.setVisible(false);}
							label_145.setVisible(true);
							break;
						case 11:for(JLabel label2: labels2){label2.setVisible(false);}
							label_90.setVisible(true);
							break;
						case 12:for(JLabel label2: labels2){label2.setVisible(false);}
							label_201.setVisible(true);
							break;
						case 13:for(JLabel label2: labels2){label2.setVisible(false);}
							label_198.setVisible(true);
							break;
						case 14:for(JLabel label2: labels2){label2.setVisible(false);}
							label_195.setVisible(true);
							break;
						case 15:for(JLabel label2: labels2){label2.setVisible(false);}
							label_192.setVisible(true);
							break;
						case 16:for(JLabel label2: labels2){label2.setVisible(false);}
							label_150.setVisible(true);
							break;
						case 17:for(JLabel label2: labels2){label2.setVisible(false);}
							label_189.setVisible(true);
							break;
						case 18:for(JLabel label2: labels2){label2.setVisible(false);}
							label_14.setVisible(true);
							break;
						case 19:for(JLabel label2: labels2){label2.setVisible(false);}
							lblC_2.setVisible(true);
							break;
						case 20:for(JLabel label2: labels2){label2.setVisible(false);}
							label_84.setVisible(true);
							break;
						case 21:for(JLabel label2: labels2){label2.setVisible(false);}
							label_78.setVisible(true);
							break;
						case 22:for(JLabel label2: labels2){label2.setVisible(false);}
							lblC.setVisible(true);
							break;
						case 23:for(JLabel label2: labels2){label2.setVisible(false);}
							label_25.setVisible(true);
							break;
						case 24:for(JLabel label2: labels2){label2.setVisible(false);}
							label_31.setVisible(true);
							break;
						case 25:for(JLabel label2: labels2){label2.setVisible(false);}
							label_37.setVisible(true);
							break;
						case 26:for(JLabel label2: labels2){label2.setVisible(false);}
							label_43.setVisible(true);
							break;
						case 27:for(JLabel label2: labels2){label2.setVisible(false);}
							label_49.setVisible(true);
							break;
						case 28:for(JLabel label2: labels2){label2.setVisible(false);}
							label_55.setVisible(true);
							break;
						case 29:for(JLabel label2: labels2){label2.setVisible(false);}
							label_67.setVisible(true);
							break;
						case 30:for(JLabel label2: labels2){label2.setVisible(false);}
							label_61.setVisible(true);
							break;
						case 31:for(JLabel label2: labels2){label2.setVisible(false);}
							label_73.setVisible(true);
							break;
						case 32:for(JLabel label2: labels2){label2.setVisible(false);}
							label_228.setVisible(true);
							break;
						case 33:for(JLabel label2: labels2){label2.setVisible(false);}
							label_139.setVisible(true);
							break;
						case 34:for(JLabel label2: labels2){label2.setVisible(false);}
							label_225.setVisible(true);
							break;
						case 35:for(JLabel label2: labels2){label2.setVisible(false);}
							label_222.setVisible(true);
							break;
						case 36:for(JLabel label2: labels2){label2.setVisible(false);}
							lblC_3.setVisible(true);
							break;
						case 37:for(JLabel label2: labels2){label2.setVisible(false);}
							label_133.setVisible(true);
							break;
						case 38:for(JLabel label2: labels2){label2.setVisible(false);}
							label_216.setVisible(true);
							break;
						case 39:for(JLabel label2: labels2){label2.setVisible(false);}
							label_213.setVisible(true);
							break;
						case 40:for(JLabel label2: labels2){label2.setVisible(false);}
							label_210.setVisible(true);
							break;
						}
			        
					
					switch(UserX)
					{
					case 1:lblX.setVisible(true);
						break;
					case 2:label_121.setVisible(true);
						break;
					case 3:label_115.setVisible(true);
						break;
					case 4:label_109.setVisible(true);
						break;
					case 5:label_103.setVisible(true);
						break;
					case 6:label_97.setVisible(true);
						break;
					case 7:label_184.setVisible(true);
						break;
					case 8:label_91.setVisible(true);
						break;
					case 9:label_129.setVisible(true);
						break;
					case 10:label_140.setVisible(true);
						break;
					case 11:label_85.setVisible(true);
						break;
					case 12:label_158.setVisible(true);
						break;
					case 13:label_155.setVisible(true);
						break;
					case 14:label_152.setVisible(true);
						break;
					case 15:label_8.setVisible(true);
						break;
					case 16:label_3.setVisible(true);
						break;
					case 17:label_5.setVisible(true);
						break;
					case 18:label_1.setVisible(true);
						break;
					case 19:lbl_2.setVisible(true);
						break;
					case 20:label_79.setVisible(true);
						break;
					case 21:label_9.setVisible(true);
						break;
					case 22:label_10.setVisible(true);
						break;
					case 23:label_20.setVisible(true);
						break;
					case 24:label_26.setVisible(true);
						break;
					case 25:label_32.setVisible(true);
						break;
					case 26:label_38.setVisible(true);
						break;
					case 27:label_44.setVisible(true);
						break;
					case 28:label_50.setVisible(true);
						break;
					case 29:label_62.setVisible(true);
						break;
					case 30:label_56.setVisible(true);
						break;
					case 31:label_68.setVisible(true);
						break;
					case 32:label_179.setVisible(true);
						break;
					case 33:label_134.setVisible(true);
						break;
					case 34:label_176.setVisible(true);
						break;
					case 35:label_173.setVisible(true);
						break;
					case 36:label_170.setVisible(true);
						break;
					case 37:label_127.setVisible(true);
						break;
					case 38:label_167.setVisible(true);
						break;
					case 39:label_164.setVisible(true);
						break;
					case 40:label_161.setVisible(true);
						break;
					}
					
					
					switch(UserY)
					{
					case 1:lblY_1.setVisible(true);
						break;
					case 2:label_122.setVisible(true);
						break;
					case 3:label_116.setVisible(true);
						break;
					case 4:label_110.setVisible(true);
						break;
					case 5:label_104.setVisible(true);
						break;
					case 6:label_98.setVisible(true);
						break;
					case 7:label_185.setVisible(true);
						break;
					case 8:label_92.setVisible(true);
						break;
					case 9:label_182.setVisible(true);
						break;
					case 10:label_141.setVisible(true);
						break;
					case 11:label_86.setVisible(true);
						break;
					case 12:label_159.setVisible(true);
						break;
					case 13:label_156.setVisible(true);
						break;
					case 14:label_153.setVisible(true);
						break;
					case 15:label_11.setVisible(true);
						break;
					case 16:label_146.setVisible(true);
						break;
					case 17:label_6.setVisible(true);
						break;
					case 18:label_2.setVisible(true);
						break;
					case 19:lblY_2.setVisible(true);
						break;
					case 20:label_80.setVisible(true);
						break;
					case 21:label_74.setVisible(true);
						break;
					case 22:lblY.setVisible(true);
						break;
					case 23:label_21.setVisible(true);
						break;
					case 24:label_27.setVisible(true);
						break;
					case 25:label_33.setVisible(true);
						break;
					case 26:label_39.setVisible(true);
						break;
					case 27:label_45.setVisible(true);
						break;
					case 28:label_51.setVisible(true);
						break;
					case 29:label_63.setVisible(true);
						break;
					case 30:label_57.setVisible(true);
						break;
					case 31:label_69.setVisible(true);
						break;
					case 32:label_180.setVisible(true);
						break;
					case 33:label_135.setVisible(true);
						break;
					case 34:label_177.setVisible(true);
						break;
					case 35:label_174.setVisible(true);
						break;
					case 36:label_171.setVisible(true);
						break;
					case 37:label_128.setVisible(true);
						break;
					case 38:label_168.setVisible(true);
						break;
					case 39:label_165.setVisible(true);
						break;
					case 40:label_162.setVisible(true);
						break;
					}
					
					
					switch(UserZ)
					{
					case 1:lblZ_1.setVisible(true);
						break;
					case 2:label_125.setVisible(true);
						break;
					case 3:label_119.setVisible(true);
						break;
					case 4:label_113.setVisible(true);
						break;
					case 5:label_107.setVisible(true);
						break;
					case 6:label_101.setVisible(true);
						break;
					case 7:label_186.setVisible(true);
						break;
					case 8:label_95.setVisible(true);
						break;
					case 9:label_183.setVisible(true);
						break;
					case 10:label_144.setVisible(true);
						break;
					case 11:label_89.setVisible(true);
						break;
					case 12:label_160.setVisible(true);
						break;
					case 13:label_157.setVisible(true);
						break;
					case 14:label_154.setVisible(true);
						break;
					case 15:label_151.setVisible(true);
						break;
					case 16:label_149.setVisible(true);
						break;
					case 17:label_7.setVisible(true);
						break;
					case 18:label_4.setVisible(true);
						break;
					case 19:lblZ_2.setVisible(true);
						break;
					case 20:label_83.setVisible(true);
						break;
					case 21:label_77.setVisible(true);
						break;
					case 22:lblZ.setVisible(true);
						break;
					case 23:label_24.setVisible(true);
						break;
					case 24:label_28.setVisible(true);
						break;
					case 25:label_36.setVisible(true);
						break;
					case 26:label_42.setVisible(true);
						break;
					case 27:label_46.setVisible(true);
						break;
					case 28:label_54.setVisible(true);
						break;
					case 29:label_64.setVisible(true);
						break;
					case 30:label_60.setVisible(true);
						break;
					case 31:label_72.setVisible(true);
						break;
					case 32:label_181.setVisible(true);
						break;
					case 33:label_138.setVisible(true);
						break;
					case 34:label_178.setVisible(true);
						break;
					case 35:label_175.setVisible(true);
						break;
					case 36:label_172.setVisible(true);
						break;
					case 37:label_132.setVisible(true);
						break;
					case 38:label_169.setVisible(true);
						break;
					case 39:label_166.setVisible(true);
						break;
					case 40:label_163.setVisible(true);
						break;

					} 
					
				}
		}

	});
}
}
