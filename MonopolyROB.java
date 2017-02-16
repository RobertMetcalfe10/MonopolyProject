package Monopoly;
import java.awt.EventQueue;


public class MonopolyROB extends Switch{

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