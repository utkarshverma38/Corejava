package in.uv.com;
import java.text.ParseException;
public class TestPerson{ 
public static void main(String[] args) throws ParseException {
	Person s= new Person() ;
    s.setName("utkarsh verma");
	s.setDate("3/8/2002");
	s.setAddress("bhawarkua");
    
	s.getName();
	s.getDate();
	s.getAddress();
	
	
	System.out.println("name = "+s.getName());
    System.out.println("date of birth ="+s.getDate());
    System.out.println("Address = "+s.getAddress());
    System.out.println();


    
    
    
    Account a =new Account();
a.setNumber("7000162356");
a.setAccountType("saving account");
a.setBalance(10600.4567);

a.getNumber();
a.getAccountType();
a.getBalance();

System.out.println("Account number = "+a.getNumber());
System.out.println("Account Type = "+a.getAccountType());
System.out.println("Account Balance = "+a.getBalance());
System.out.println();

  Automobile am = new Automobile();
  
  am.setColor("blue");
  am.setSpeed(200);
  am.setMake("lamborgini");
   
  
  am.getColor();
  am.getSpeed();
  am.getMake();
  
  
  System.out.println(am.getColor());
  System.out.println(am.getSpeed());
  System.out.println(am.getMake());
  






    }
}


