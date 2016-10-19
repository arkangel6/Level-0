
public class fibonacci {
	public static void main(String[] args) {
		
			
			
		//0112358
		//A:0123456789
		//B:123456789
		//C:0
		
		int A=0;
		int B=1;
		int C;	
		for (int i = 0; i < 10; i++) {
		
		C=A+B;
		
		A = B;
		
		B = C;
		
		
		
		System.out.println(C);
		
		
		
		}
	}

}
