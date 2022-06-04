package Serialization;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectSerialzation {
	
    public static void main(String[] args) throws Exception {
    	
	FileOutputStream file= new FileOutputStream("C:\\Users\\HP\\Downloads\\utkarsh.ser");
	ObjectOutputStream out= new ObjectOutputStream(file);
	
	Employee emp= new Employee(10,"utkarsh","verma");
	
	out.writeObject(emp);
	out.close();
	
	System.out.println("Object is successfully persisted");
	
	
}
}
