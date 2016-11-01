import java.util.Random;

public class fibonacci11 {
	public static void main(String[] args) {
		int A = 0;
		int B = 1;
		int C;
		//0112358 13 21
		int x = new Random().nextInt(20);
		for (int i  = 0; i  < x; i ++) {
			C = A + B;
			System.out.println(C);
			A = B;
			B = C;
			
			
		}
		
		
	
	}

}
