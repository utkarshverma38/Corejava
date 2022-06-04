package ExceptionHandling;

public class UserClass {

	
      LoginException e= new LoginException();{
    	  int val=0;
    	  
    	  
      if (val<1) 
       
    	try{
    	  throw e;
    	  }
      catch(LoginException e){
    	  
    	  System.out.println();
    	  e.printStackTrace();
      }
      
      }

}
