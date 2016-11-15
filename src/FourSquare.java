
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;


public class FourSquare {
	
	// 2. Create a new Robot
	Robot j = new Robot();
	


	void go() {
		// 4. Make the robot move as fast as possible

		j.setSpeed(10);
		// 5. Set the pen width to 5
		j.penDown();
		j.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			
		
		
			// 7. Set the pen color to random
			j.setRandomPenColor();
			// 1. Call the drawSquare() method
		drawSquare();
		j.turn(90);
			// 8. Turn the robot 90 degrees to the right
		
		}
	}


	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		
		for (int i = 0; i < 4; i++) {
			
		
		j.move(50);
		j.turn(90);
		}
		
		
	}


	public static void main(String[] args) {
		new FourSquare().go();
	}


}






