
 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above

		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String a = JOptionPane.showInputDialog(null, "Guess a number between 1-100");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int number = (Integer.parseInt(a));
			// 5. if the guess is correct
			if(number == random){
				JOptionPane.showMessageDialog(null, "Win");
			}
				// 6. win
			// 7. if the guess is high
			else if(number >= random){
				JOptionPane.showMessageDialog(null, "It's too high");
			}
				// 8. tell them it's too high
			// 9. if the guess is low
			else if(number <= random){
				JOptionPane.showMessageDialog(null, "It's too low");
			}
				// 10. tell them it's too low
		}
		JOptionPane.showMessageDialog(null, "L");
		// 12. tell them they lose
	}

}


