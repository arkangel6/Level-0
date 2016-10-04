import java.util.Scanner;

public class adventure {
	public static void main(String[] args) {
		Scanner ja = new Scanner(System.in);
		System.out.println("You wake up in a room, there is one door to your left and a window behind you. Pick one");
		String answer = ja.nextLine();
	if(answer.equals("door")){
		System.out.println("You exit the door and find stairs");
		System.out.println("Go up or down?");
		String answer1 = ja.nextLine();
	if(answer1.equals("up")){
		System.out.println("You climb onto the very top, the roof, and find you are a few thousand feet high.");
		System.out.println("It starts to rain.");
		System.out.println("acid rain...");
		System.out.println("You die before you can run back down the stairs.");
			
	}else if(answer1.equals("down")){
		System.out.println("You travel down until you reached the end and find yourself outside.");
		System.out.println("You see a man. Accept the giraffe from the man?(yes / no)");
		String answer2 = ja.nextLine();
		if(answer2.equals("yes")){
		System.out.println("You ride the giraffe down the stream.");
		System.out.println("The giraffe soon goes beserk and jumps into the river.");
		System.out.println("The giraffe drowns and you are drowning.");
		System.out.println("You see a log to your left and the giraffe to your right.");
		String answer3 = ja.nextLine();
		if(answer3.equals("giraffe")){
		System.out.println("You drown with the giraffe.");	
		}
		else if(answer3.equals("log")){
		System.out.println("You managed to grab on before you pass out.");
		System.out.println("You wake up on a beach and beg for money.");
		System.out.println("You manage to get enough money to take the bus home. The End.");
			
		}
		}
		else if(answer2.equals("no")){
		System.out.println("The man is insulted and feeds you to the giraffe.");
		}
		
			
			
			
		}
			
			
			
			
			
			
			
			
	}else if(answer.equals("window")){
		System.out.println("You fall and die");
		}
	
		
		
		
		
		
		
	}

}
