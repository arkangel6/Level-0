import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot jaja = new Robot();
		jaja.setSpeed(10);
		jaja.penDown();
		//K
		jaja.setX(200);
		jaja.setY(200);
		jaja.turn(180);
		jaja.move(400);
		jaja.turn(180);
		jaja.move(200);
		jaja.turn(40);
		jaja.move(250);
		jaja.turn(180);
		jaja.move(250);
		jaja.turn(-80);
		jaja.move(250);
		//E
		jaja.setX(500);
		jaja.setY(200);
		jaja.turn(40);
		jaja.move(400);
		jaja.turn(-90);
		jaja.move(200);
		jaja.setY(400);
		jaja.turn(180);
		jaja.move(200);
		jaja.setY(200);
		jaja.turn(180);
		jaja.move(200);
		
		
	}

}
