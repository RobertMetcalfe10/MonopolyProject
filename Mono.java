// TeamTokens - (Erik Burka - 15507923)
//			  - (Robert Metcalfe - 15551647)
//			  -	(Vlad Ukhatyuk - 15430862)

// Our main class for Monopoly
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