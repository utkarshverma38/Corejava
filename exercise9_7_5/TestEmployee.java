package exercise9_7_5;

public class TestEmployee {
	
		public static void main(String[] args)
		{
			Employee e=new Employee("2568-3465-2366-8792");
			String s= e.getAadharNumber();
			System.out.println("Aadhar Number is :- "+s);
		}
	}


