import java.util.Random;

public class randommmmm {
	public static void main(String[] args) {
		
		int l = 0;
		int k = 0;
		for (int i = 0; i < 9000000; i++) {
		int j = new Random().nextInt();
		if( j > k){
		
			
			k=j;
		}
		else if(l <j){
			j = l;
		}
		}
		
		System.out.println(k);
		
		

}
}