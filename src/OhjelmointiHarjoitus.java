import java.util.Scanner;

public class OhjelmointiHarjoitus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        String answer = "Emma";
        int guesses = 0;
        
        System.out.println("Guess my name (type stop to exit)");
        
        while (true) 
	        {
	            String guess = scanner.nextLine();
	
	            if (guess.equalsIgnoreCase(answer)) 
	            {
	            	guesses++;
	                System.out.println("Congratulations!");
	                break; 
	            }
    }
}
}
