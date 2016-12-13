import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class obidenttortoise {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		String shape = JOptionPane.showInputDialog("What shape do you want? triangle/square/circle");
		String color = JOptionPane.showInputDialog("What color do you want? Red/Blue/Green");
		if(color.equals("Red")){
			Tortoise.setPenColor(Color.red);
		}
		else if(color.equals("Blue")){
			Tortoise.setPenColor(Color.blue);
		}
		else if(color.equals("Green")){
			Tortoise.setPenColor(Color.green);
		}
		if(shape.equals("triangle")){
			drawTriangle();
		}
		else if(shape.equals("square")){
			drawSquare();
		}
		else if(shape.equals("circle")){
			drawCircle();
		}
	}



static void drawSquare(){
	for (int i = 0; i < 4; i++) {
		Tortoise.move(100);
		Tortoise.turn(90);
		
	}
}
static void drawTriangle(){
	for (int i = 0; i < 3; i++) {
		Tortoise.move(100);
		Tortoise.turn(120);
	
	
}
}
	static void drawCircle(){
		for (int i = 0; i < 360*4; i++) {
			Tortoise.move(0.5);
			Tortoise.turn(0.25);
		}
	
	}
}
