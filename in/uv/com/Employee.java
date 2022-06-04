package in.uv.com;

public class Employee extends Person01 {

	private String designation=null;
	
	public void changeAddress(){
		System.out.println();
		super.changeAddress();
		System.out.println("bholaram ustad marg");
		
	}
	public Employee(){
		
		System.out.println("this is a employee default constructor");
	}
	public Employee(String fn,String ln,String des){
        super(fn,ln);
		this.designation= des;
		System.out.println("this is a 3 param constructor");
	}
	public static void main(String[] args) {
		Employee E= new Employee("ram ","shayam","mohan");
		E.changeAddress();
		
	}
}
