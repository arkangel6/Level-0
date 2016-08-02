import java.io.IOException;

public class RocketShip {
	public static void main(String[] args) throws InterruptedException, IOException {
	
		for (int i = 10; i >= 0 ; i--) {
			
		
		Runtime.getRuntime().exec("say " + i).waitFor();
		System.out.println(i);
		}
		Runtime.getRuntime().exec("say " + "aaaaaaaa").waitFor();
		
		
		

	}
}
