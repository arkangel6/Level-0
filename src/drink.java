import java.util.Random;

import javax.swing.JOptionPane;

public class drink {
	public static void main(String[] args) {
		String drink = JOptionPane.showInputDialog(null, "type of drink"); 
		Random number2 = new Random();
		int number = number2.nextInt(66666);
		for (int i = 1; i < number; i++) {
			System.out.println(number-i + " bottles of " + drink + " on the wall.");
			System.out.println();
			System.out.println(number-i + " bottles of " + drink );
			System.out.println("Take one down, pass it around.");
			System.out.println(number-1-i + " bottles of " + drink + " on the wall.");
			
		} 
	}

}
