package Java_8;

public interface LambdaDefaultAndStaticMethod {
  
  public static void add() {
	   System.out.println("Static Method");
	   
   }
	
	public default void defMethod() {
	 System.out.println("Default Method");
	}
	

	}

