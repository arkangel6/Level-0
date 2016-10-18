import javax.swing.JOptionPane;

public class primenumbers {
	public static void main(String[] args) {
		String number2 = JOptionPane.showInputDialog(null, "type in number");
		int number = Integer.parseInt(number2);
		
		
			
			
				for (int i = 2; i < number; i++) {
					
					
					if(number % i == 0){
						
					

						JOptionPane.showMessageDialog(null, "not prime");
						System.exit(0);
					}else if(number % i != 0){
						JOptionPane.showMessageDialog(null, "prime");
						System.exit(0);
					}
					
				}
			}
		
		
		
		
		
		
		//for (int i = 1; i < number-1; i++) {
			//int x = number % i;
			//if(x == 0){
		
		
			//JOptionPane.showMessageDialog(null, "prime");
			//}else{
		//	JOptionPane.showMessageDialog(null, "not prime");
		//}
		//}
	}
//}
