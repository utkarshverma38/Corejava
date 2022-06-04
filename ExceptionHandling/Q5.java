package ExceptionHandling;

public class Q5 {
public static void main(String[] args) {

	String name ="Vijay";
    String s=null;
    
	try{
		System.out.println("length of name is "+name.length());
		System.out.println("charter at 7 th position is"+name.charAt(6));
	}
	catch(StringIndexOutOfBoundsException e){
		System.out.println("this is a String Index Out Of Bounds Exception ");
	}
	catch(NullPointerException r){
		System.out.println("this is a Null Pointer Exception ");
	}
	}

}
