

	import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


	public class DizzyTortoise {


		public static void main(String[] args) {
					 
			 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
			String dizzy = JOptionPane.showInputDialog("How dizzy? 1-10");
			int diz = Integer.parseInt(dizzy);
	 // 1. Use the dance method to make the Tortoise spin.
			 dance(diz);


		}


		static void dance(int numberOfspins) {
			for (int i = 0; i < numberOfspins; i++) {
				Tortoise.turn(360);
			}
		}
	}


