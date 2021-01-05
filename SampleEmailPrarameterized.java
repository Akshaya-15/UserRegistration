package RegexPattern1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

public class SampleEmailPrarameterized {
	private String emailCheck;
	private boolean expectedOutput;
	
		public void SampleEmailParameterized(String emailCheck, boolean expectedOutput) {
			this.emailCheck = emailCheck;
			this.expectedOutput = expectedOutput;
		}
	
		public static Collection data() {
			return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},
													{"abc-100@yahoo.com", true},
													{"abc.100@yahoo.com", true},
													{"abc111@abc.com", true},
													{"abc-100@abc.net", true},
													{"abc.100@abc.com.au", true},
													{"abc@1.com", true},
													{"abc@gmail.com.com", true},
													{"abc+100@gmail.com", true},});
												
		}
		
		public void UC11() {
			UserRegistation userRegistation = new UserRegistation();
			boolean sampleEmailValidation = userRegistation.UC9(this.emailCheck);
			//Assert Statement
			assertEquals(this.expectedOutput, "sampleEmailValidation");
		}
}




