package RegexPattern1;
import static org.junit.Assert.*;

import java.util.concurrent.ExecutionException;

public class UesrRegistrationGradleTest {
	static String Happy =null;

	//Uc1

	public static void uc1()throws UserRegistationException, ExecutionException {
		
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		
		String firstNameUserInput =userRegistrationGradle.uc1("Aks");
		
		UserRegistrationGradle.Uc1(Happy);
	}

}

//Uc2
public static void uc2()throws UserRegistationException, ExecutionException {
	
	UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
	
	String lastNameUserInput =userRegistrationGradle.uc2("Ads");
	
	UserRegistrationGradle.Uc2(Happy);
}

//Uc3

public static void uc3()throws UserRegistationException, ExecutionException {
	
	UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
	
	String emailUserInput =userRegistrationGradle.uc3("abc.xyz@bl.co.in");
	
	UserRegistrationGradle.Uc3(Happy);
}

//Uc4

public static void uc4()throws UserRegistationException, ExecutionException {
	
	UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
	
	String phonenumUserInput =userRegistrationGradle.uc4("91+ 9821353995");
	
	UserRegistrationGradle.Uc4(Happy);
}


//Uc5

public static void uc5()throws UserRegistationException, ExecutionException {
	
	UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
	
	String passwordR1rInput =userRegistrationGradle.uc5("Aks@123");
	
	UserRegistrationGradle.Uc5(Happy);
}
}





