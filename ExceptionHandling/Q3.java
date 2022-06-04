package ExceptionHandling;

public class Q3 {
 
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try{
			double c = a/b;
		}
		catch(RuntimeException e){
			System.out.println("this called a parent Exception");
		}
        catch(ArithmeticException p){
        	System.out.println();
        }	
	
	
	}
	
}
