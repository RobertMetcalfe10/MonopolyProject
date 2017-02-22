package Monopoly;
import java.awt.EventQueue;


public class Mono extends Switch{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				try {
					Mono window = new Mono();
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
	public Mono() {
		initialize();
	}

	
}