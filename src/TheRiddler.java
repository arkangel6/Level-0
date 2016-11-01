import javax.swing.JOptionPane;

public class TheRiddler {


	public static void main(String[] args) {


		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String question = JOptionPane.showInputDialog(null, "What is at the end of a rainbow?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		if(question.equals("w")){
			JOptionPane.showMessageDialog(null, "correct!");
		}else {
			JOptionPane.showMessageDialog(null, "wrong. the correct answer is w theres always a W at the end of rainbow.");
		}
		// 5. Otherwise, say "wrong" and tell them the answer


		// 6. Add some more riddles


		// 2. Make a pop up to show the score.
		
	}
}
