import java.util.Scanner;
public class nimiarvaus {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String arvattunimi = " ";
		int kierroslaskuri = 0;
		
		while (!arvattunimi.equals("Emma")){
			System.out.println("Guess my name (type stop to exit)");
			arvattunimi = in.nextLine();
			
//			if(!arvattunimi.equals("Emma")) {
//				System.out.println("Arvasit väärin.");
//			}
			
			if(arvattunimi.equals("stop")) {
				
				System.out.println("You guessed " + kierroslaskuri + " times.");
				
				break;
			}
			
			kierroslaskuri ++;
			
			
			if(arvattunimi.equals("Emma")) {
				System.out.println("Congratulations!\r\nYou guessed " + kierroslaskuri + " times.");
				break;
			}

		}
		
	in.close();

	}

}
