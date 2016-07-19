import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 25th";
		String dadsBirthday = "April 28th";
		String myBirthday = "October 1st";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String a = JOptionPane.showInputDialog(null, "Which birthday do you want?(mom, dad, me, ect.");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, a);
		// 4. if user asked for "mom"
			//print mom's birthday
	if(a.equals("mom")){
		JOptionPane.showMessageDialog(null, momsBirthday);
		
	}else if(a.equals("dad")){
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}else if(a.equals("me")){
		JOptionPane.showMessageDialog(null, myBirthday);
	}else{ 
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
	}
	
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
