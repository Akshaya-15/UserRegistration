package RegexPattern1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationGradle {
	
	//uc1

	public static String Uc1  (String firstNameuserInput) throws UserRegistationException {
		 Pattern firstName = Pattern.compile("^[[:upper:]]{1}[[:lower:]]{3,}$");
	      Matcher match = firstName.matcher("Aks");
	      boolean patternvalidity =match.matches();
	      try {
	      
		if ( patternvalidity==true ) 
	     	 return "Happy";
	         
	      else
	         return"Sad";
	   }
	      catch(NullPointerException e) {
	    	  throw new UserRegistationException("please enter valid firstname");
	      }
	}

	public String uc1(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	

//uc2
public static String Uc2  (String laststNameuserInput) throws UserRegistationException {
	 Pattern firstName = Pattern.compile("^[[:upper:]]{1}[[:lower:]]{3,}$");
     Matcher match = firstName.matcher("Ads");
     boolean patternvalidity =match.matches();
     try {
     
	if ( patternvalidity==true ) 
    	 return "Happy";
        
     else
        return"Sad";
  }
     catch(NullPointerException e) {
   	  throw new UserRegistationException("please enter valid lastname");
     }
}


public String uc2(String string) {
	// TODO Auto-generated method stub
	return null;
}

//UC3

public static String Uc3 (String emialuserInput) throws UserRegistationException {
	 Pattern firstName = Pattern.compile("^[a-zA-Z]{3}\\\\.[a-zA-Z]{1}@[a-zA-Z]{2}\\\\.([a-zA-Z]{2}\\\\.[a-zA-Z]{1,}$");
     Matcher match = firstName.matcher("abc.xyz@bl.co.in");
     boolean patternvalidity =match.matches();
     try {
     
	if ( patternvalidity==true ) 
    	 return "Happy";
        
     else
        return"Sad";
  }
     catch(NullPointerException e) {
   	  throw new UserRegistationException("please enter valid email");
     }
}

public String uc3(String string) {
	// TODO Auto-generated method stub
	return null;
}

public static String Uc4 (String phonenumuserInput) throws UserRegistationException {
	 Pattern firstName = Pattern.compile("^[91+][[:space:]][0-9]$");
    Matcher match = firstName.matcher("91+ 9821353995");
    boolean patternvalidity =match.matches();
    try {
    
	if ( patternvalidity==true ) 
   	 return "Happy";
       
    else
       return"Sad";
 }
    catch(NullPointerException e) {
  	  throw new UserRegistationException("please enter valid phonenum");
    }
}

public String uc4(String string) {
	// TODO Auto-generated method stub
	return null;
}

public static String Uc5 (String passwordR1Input) throws UserRegistationException {
	 Pattern firstName = Pattern.compile("^[a-zA-Z0-9]{8,}$");
    Matcher match = firstName.matcher("abc.xyz@bl.co.in");
    boolean patternvalidity =match.matches();
    try {
    
	if ( patternvalidity==true ) 
   	 return "Happy";
       
    else
       return"Sad";
 }
    catch(NullPointerException e) {
  	  throw new UserRegistationException("please enter valid password");
    }
}

public String uc5(String string) {
	// TODO Auto-generated method stub
	return null;
}
}