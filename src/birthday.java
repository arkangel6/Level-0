 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


public class birthday {


	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String johncena = "April 23rd";
		String randomperson = "June 35th";
		String myBirthday = "April 38th";
		String Trump = "June 14th";


		// 2. Find out which birthday the user wants and and store their response in a variable
		String a = JOptionPane.showInputDialog(null, "Which birthday do you want? \n John Cena, your birthday, Trump" );
		// 3. Print out what the user typed
		if(a.equals("John Cena")){
			JOptionPane.showMessageDialog(null, "        ");
			
		}else if (a.equals("your birthday")){
			
			JOptionPane.showMessageDialog(null, randomperson);
		}else if(a.equals("Trump")){
			JOptionPane.showMessageDialog(null, "July 17th");
			JOptionPane.showMessageDialog(null, "jk i lied");
			JOptionPane.showMessageDialog(null, Trump);
		
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"


	} 
}
