package in.uv.com;

public class Person01 {
 
	private String firstname= null;
	private String lastname = null;
	private String address = null;
	
	public void changeAddress(){
		System.out.println("bhawarkua");
	}
	public Person01(){
		
		System.out.println("this is a default constractor");
	}
	
	public Person01(String fn,String ln){
	    this();
		firstname= fn;
		lastname = ln;
		
		System.out.println("this is a 1 param constractor");
	}
	
	public Person01(String fn,String ln, String ad){
		this(fn,ln);
	this.address= ad;
		System.out.println("this is a 2 param constractor");
	}	
	
	public static void main(String[] args) {
		Person01 p= new Person01("ram","shayam","indore");
		System.out.println();
	}
	
}
