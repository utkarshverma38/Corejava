package Java_8;


public class TestLambdaExpression {

	public static void main(String[] args) {
			
		LambdaExpression  c =(a,b) -> {
		  return a+b;
		
		}; 
        
		LambdaExpression d =(a,b) -> {
			return a-b;
			
		};
		
		LambdaExpression e =(a,b) -> {
			return a*b;
		};
		LambdaExpression f =(a,b) -> {
			return a/b;
			
		};
		
		int a=29;
		int b=25;
		
		
	System.out.println(c.add(a, b));  
	System.out.println(d.add(a, b));	
    System.out.println(e.add(a, b));
    System.out.println(f.add(a, b));
	
}
}