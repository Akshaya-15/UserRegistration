package RegexPattern1;
import java.util.regex.*;

import java .util.Scanner;

public class UserRegistation {
	public static void main(String[] args) {
		
	}
	
		static Scanner input = new Scanner(System.in);
				   //static Strin	g text;
				   static String firstName = "^[[:upper:]]{1}[[:lower:]]{3,}$'";
				   static String lastName = "^[[:upper:]]{1}[[:lower:]]{3,}$'";
				   static String email = "^[a-zA-Z]{3}\\.[a-zA-Z]{1}@[a-zA-Z]{2}\\.([a-zA-Z]{2}\\.[a-zA-Z]{1,}$";
				   static String phonenum ="^[91+][[:space:]][0-9]$";
		           static String passwordR1 = "^[a-zA-Z0-9]{8,}$";
			       static String passwordR2 = "^(?=.*[A-Z])[a-zA-Z0-9]{8,}$";
			       static String passwordR3 = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
			       static String passwordR4 = "^(?=*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
				  
			
				// FirstName method
				   public static void firstName() {
				      while (true) {
				         System.out.println("Enter FirstName : ");
				       String text = input.nextLine();
				         Pattern pattern = Pattern.compile(firstName);
				         Matcher matcher = pattern.matcher("Aks");
				         if ( pattern.matcher("Aks")!=null ) {
				        	 
				            System.out.println(">>>>Valid pattern>>>>");
				            	
				            break;
				         } else
				            System.out.println("*******Invalid firstName Pattern , Try Again********");
				         		
				      }
				   }
}

				   