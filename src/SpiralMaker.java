
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;


public class SpiralMaker {


	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		// 3. Make a variable to hold the number of sides and set it to 0
		int sides = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String shape = JOptionPane.showInputDialog(null, "triangle, square, or pentagon?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if(shape.equals("square")){
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		for (int i = 0; i < 80; i++) {
			Tortoise.move(4*i);
			Tortoise.turn(90);
			
		}
		} 
		else if(shape.equals("triangle")){
		for (int k = 0; k < 60; k++) {
			Tortoise.move(3*k);
			Tortoise.turn(120);
			
		}
		}
		else if(shape.equals("p")){
			for (int j = 0; j < 1000; j++) {
			Tortoise.move(5*j);
			Tortoise.turn(360/);
				
			}
			
		}
			
			
			
		}
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}








