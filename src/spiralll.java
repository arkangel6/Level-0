import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

// Copyright Wintriss Technical Schools 2013
// Do the following 80 times
		//Move the Tortoise a distance of 4 multiplied by i
		//Turn the Tortoise 360/4

public class spiralll {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setAnimal(Animals.Unicorn);
		for (int i = 0; i < 80; i++) {
			Tortoise.move(4*i);
			Tortoise.turn(90);
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
