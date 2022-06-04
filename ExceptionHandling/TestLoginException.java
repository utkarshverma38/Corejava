package ExceptionHandling;

public class TestLoginException {

	public static void main(String[] args) {
		 try{
			 authenticate("vijay");
		 }
	
	catch(LoginException ex){
		System.out.println("invalid id/password");
	}
		 
	
	}
	


public static void authenticate(String login) throws LoginException
{
	if (!"admin".equals(login)){
		LoginException e = new LoginException();
		throw e;
		
		
		
	}
}
}