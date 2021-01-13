package gradleproj1;

import com.google.common.base.Predicate;
import java.util.regex.*;

public class UserRegistrationGradle {
	boolean checkName (String name)throws InvalidInputException
	{
		String regx ;
		Predicate<String>  matcher = n ->(n.matches( "^[A-Z]{1}[A-Za-z]{2,12}$"));
		
		if (matcher.test(name))
			return true;
		else
			throw new InvalidInputException("pls enter name");
		
	}

	
		boolean checkemail (String email)throws InvalidInputException
		{
			String regx ;
			Predicate<String>  matcher = n ->(n.matches( "^[a-zA-Z]{3}\\\\.[a-zA-Z]{1}@[a-zA-Z]{2}\\\\.([a-zA-Z]{2}\\\\.[a-zA-Z]{1,}$"));
			
			if (matcher.test(email))
				return true;
			else
				throw new InvalidInputException("pls enter the email");
			
		}
		
		

		boolean checkphonenum (String phonenum)throws InvalidInputException
		{
			String regx ;
			Predicate<String>  matcher = n ->(n.matches( "^[a-zA-Z]{3}\\\\.[a-zA-Z]{1}@[a-zA-Z]{2}\\\\.([a-zA-Z]{2}\\\\.[a-zA-Z]{1,}$"));
			
			if (matcher.test(phonenum))
				return true;
			else
				throw new InvalidInputException("pls enter the phoenum");
			
		}
		
		boolean checkpassword(String password)throws InvalidInputException
		{
			String regx ;
			Predicate<String>  matcher = n ->(n.matches( "^[a-zA-Z]{3}\\\\.[a-zA-Z]{1}@[a-zA-Z]{2}\\\\.([a-zA-Z]{2}\\\\.[a-zA-Z]{1,}$"));
			
			if (matcher.test(password))
				return true;
			else
				throw new InvalidInputException("pls enter the password");
			
		}
		
}




