package util;

import org.testng.Assert;
import org.testng.Reporter;

public class Log {

	public static void step(String message){
		message= "<b>" + message + "</b>";
		message="&bull;"+"&nbsp;"+ message;
		Reporter.log(message);
	}
	public static void subStep(String message){
		message ="&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&bull;"+"&nbsp;"+message ;
		Reporter.log(message);
	}	
	public static void innerSubStep(String message){
		message="<FONT SIZE=\"2\">" + message + "</FONT>";
		message = "&nbsp;"+message;
		message = "&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&bull;"+message ;
		Reporter.log(message);
	}
	public static void errorMessage(String message){
		message="<FONT COLOR=\"RED\">" + message + "</FONT>";
		message= "<b>" + message + "</b>";
		message="&nbsp;"+"&nbsp;"+ message;	
		Reporter.log(message);
		Assert.fail();
	}	
	public static void verificationStep(String message){
		message="<FONT COLOR=\"GREEN\">" + message + "</FONT>";
		message= "<b>" + message + "</b>";
		message="&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+ message;	
		Reporter.log(message);
	}
	public static void errorMessageWithoutFail(String message){
		message="<FONT COLOR=\"RED\">" + message + "</FONT>";
		message= "<b>" + message + "</b>";
		message="&nbsp;"+"&nbsp;"+ message;
		Reporter.log(message);
	}	

	public static void innerErrorMessageWithoutFail(String message){
		message="<FONT COLOR=\"RED\">" + message + "</FONT>";
		message= "&nbsp;"+"&nbsp;"+"&bull;"+"&nbsp;"+message ;
		Reporter.log(message);
	}	
	public static void innerVerificationStep(String message){
		message="<FONT COLOR=\"GREEN\">" + message + "</FONT>";
		message="<FONT SIZE=\"2\">" + message + "</FONT>";
		message = "&nbsp;"+message;
		message = "&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&nbsp;"+"&bull;"+message ;
		Reporter.log(message);
	}
}
