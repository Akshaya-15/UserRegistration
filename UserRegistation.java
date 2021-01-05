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
				   public static void firstName(String Fname) {
				      while (true) {
				         System.out.println("Enter FirstName : ");
				       String text = input.nextLine();
				         Pattern pattern = Pattern.compile(firstName);
				         Matcher matcher = pattern.matcher("Aks");
				         if ( pattern.matcher(Fname)!=null ) {
				        	 
				            System.out.println(">>>>Valid pattern>>>>");
				            	
				            break;
				         } else
				            System.out.println("*******Invalid firstName Pattern ********");
				         		
				      }
				   }

				   //LastName method
				   public static void lastName() {
					   	while (true) {
					   		System.out.println("Enter lastName : ");
				String  text = input.nextLine();
				Pattern pattern = Pattern.compile(lastName);
				Matcher matcher = pattern.matcher("Ads");
				if (pattern.matcher("Ads")!=null) {
					System.out.println(">>>>Valid pattern>>>>");
        	
					break;
				} else
					System.out.println("*******Invalid lastName Pattern ******");
     	
     		
					   	}


				   }
			
					//Email method
				public static void email() {
					while (true) {
						System.out.println("Enter email : ");
				String  text = input.nextLine();
				Pattern pattern = Pattern.compile(email);
				Matcher matcher = pattern.matcher("abc.xyz@bl.co.in");
				if (pattern.matcher("abc.xyz@bl.co.in")!=null) {
					System.out.println(">>>>Valid pattern>>>>");
					break;
				} else
					System.out.println("*******Invalid email Pattern******");
     	
  }

}
				//phonenum Method
			    public static void phonenum() {
			      while (true) {
			         System.out.println("Enter pnonenum : ");
			         String text = input.nextLine();
			         Pattern pattern = Pattern.compile(phonenum);
			         Matcher matcher = pattern.matcher("91+ 9821353995");
			         if ( pattern.matcher("91+ 9821353995")!=null) {
			            System.out.println(">>>>Valid pattern>>>>");
			                
			            break;
			         } else
			            System.out.println("*******Invalid phonenum Pattern******");
			         		
			      }

			   }
			  //password Method Rule1
			    public static void passwordR1() {
			      while (true) {
			         System.out.println("Enter passwordR1 : ");
			        String text = input.nextLine();
			         Pattern pattern = Pattern.compile(passwordR1);
			         Matcher matcher = pattern.matcher("Abc@1234");
			         if (pattern.matcher("Abc@1234")!=null) {
			            System.out.println(">>>>Valid pattern>>>>");
			            	
			            break;
			         } else
			            System.out.println("*******Invalid password Pattern ******");
			         		
			      }

			   }

			  //password Method Rule2
                public static void passwordR2() {
	      while (true) {
	         System.out.println("Enter passwordR2 : ");
	        String text = input.nextLine();
	         Pattern pattern = Pattern.compile(passwordR2);
	         Matcher matcher = pattern.matcher("Abc@1234");
	         if (pattern.matcher("Abc@1234")!=null) {
	            System.out.println(">>>>Valid pattern>>>>");
	            	
	            break;
	         } else
	            System.out.println("*******Invalid password Pattern******");
	         		
	      }

	   }
              //Password Method RuleR3
                public static void passwordR3() {
	      while (true) {
	         System.out.println("Enter passwordR3 : ");
	        String text = input.nextLine();
	         Pattern pattern = Pattern.compile(passwordR3);
	         Matcher matcher = pattern.matcher("Abc@1234");
	         if (pattern.matcher("Abc@1234")!=null) {
	            System.out.println(">>>>Valid pattern>>>>");
	            	
	            break;
	         } else
	            System.out.println("*******Invalid password Pattern******");
	         			 
	      }

	   }
              //Password Method RuleR4
                public static void passwordR4() {
	      while (true) {
	         System.out.println("Enter passwordR4 : ");
	        String text = input.nextLine();
	         Pattern pattern = Pattern.compile(passwordR4);
	         Matcher matcher = pattern.matcher("Abc@1234");
	         if (pattern.matcher("Abc@1234")!=null) {
	            System.out.println(">>>>Valid pattern>>>>");
	            	
	            break;
	         } else
	            System.out.println("*******Invalid password Pattern******");
	         		;
	      }
		

	   }

	
	
                //method for emailSample
    		public static void emailsample() {
    		Pattern pattern = Pattern.compile("^([a-zA-a0-9\\.\\-\\+]+)@([a-zA-Z0-9\\.]{1,5})([a-zA-Z\\.]+){1,3}([a-zA-Z]{1,3})$");  
    		Matcher match1 = pattern.matcher("abc@yahoo.com");
    		Matcher match2 = pattern.matcher("abc-100@yahoo.com");
    		Matcher match3 = pattern.matcher("abc.100@yahoo.com");
    		Matcher match4 = pattern.matcher("abc111@abc.com");
    		Matcher match5= pattern.matcher("abc-100@abc.net");
    		Matcher match6= pattern.matcher("abc.100@abc.com.au");
    		Matcher match7 = pattern.matcher("abc@1.com");
    		Matcher match8 = pattern.matcher("abc@gmail.com.com");
    		Matcher match9 = pattern.matcher("abc+100@gmail.com");
    		
    		boolean patternValidity1 = match1.matches();
    		boolean patternValidity2 = match2.matches();
    		boolean patternValidity3 = match3.matches();
    		boolean patternValidity4 = match4.matches();
    		boolean patternValidity5 = match5.matches();
    		boolean patternValidity6 = match6.matches();
    		boolean patternValidity7 = match7.matches();
    		boolean patternValidity8 = match8.matches();
    		boolean patternValidity9 = match9.matches();
    		
    		System.out.println(patternValidity1);
    		System.out.println(patternValidity2);
    		System.out.println(patternValidity3);
    		System.out.println(patternValidity4);
    		System.out.println(patternValidity5);
    		System.out.println(patternValidity6);
    		System.out.println(patternValidity7);
    		System.out.println(patternValidity8);
    		System.out.println(patternValidity9);
    		boolean patternValidity;
    	}

    	
    		
    		
    		
    		
    		


//FirstName method
public static void firstName1() {
   while (true) {
      System.out.println("Enter FirstName : ");
    String text = input.nextLine();
      Pattern pattern = Pattern.compile(firstName);
      Matcher matcher = pattern.matcher("Aks");
      if ( pattern.matcher("Aks")!=null ) {
     	 
         System.out.println(">>>>Valid pattern>>>>");
         	String String ="Happy";
         break;
      } else
         System.out.println("*******Invalid firstName Pattern******");
      		String String="Sad";
   }
}
//LastName method
 public static void lastName1() {
   while (true) {
      System.out.println("Enter lastName : ");
   String  text = input.nextLine();
      Pattern pattern = Pattern.compile(lastName);
      Matcher matcher = pattern.matcher("Ads");
      if (pattern.matcher("Ads")!=null) {
         System.out.println(">>>>Valid pattern>>>>");
         	String String= "Happy";
         break;
      } else
         System.out.println("*******Invalid lastName Pattern******");
      		String String="Sad";
      		
   }
	

}

//Email method
 public static void email1() {
   while (true) {
      System.out.println("Enter email : ");
    String  text = input.nextLine();
      Pattern pattern = Pattern.compile(email);
      Matcher matcher = pattern.matcher("abc.xyz@bl.co.in");
      if (pattern.matcher("abc.xyz@bl.co.in")!=null) {
         System.out.println(">>>>Valid pattern>>>>");
         	String String="Happy";
         break;
      } else
         System.out.println("*******Invalid email Pattern******");
      		String String="Sad";
   }

}

//phonenum Method
 public static void phonenum1() {
   while (true) {
      System.out.println("Enter pnonenum : ");
      String text = input.nextLine();
      Pattern pattern = Pattern.compile(phonenum);
      Matcher matcher = pattern.matcher("91+ 9821353995");
      if ( pattern.matcher("91+ 9821353995")!=null) {
         System.out.println(">>>>Valid pattern>>>>");
             String String="Happy";
         break;
      } else
         System.out.println("*******Invalid phonenum Pattern**********");
      		String String="Sad";
   }

}



//password Method Rule1
 public static void password1() {
   while (true) {
      System.out.println("Enter passwordR1 : ");
     String text = input.nextLine();
      Pattern pattern = Pattern.compile(passwordR1);
      Matcher matcher = pattern.matcher("Abc@1234");
      if (pattern.matcher("Abc@1234")!=null) {
         System.out.println(">>>>Valid pattern>>>>");
         	String String="Happy";
         break;
      } else
         System.out.println("*******Invalid password Pattern **********");
      		String String="Sad";
   }

}

}