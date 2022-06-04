package Serialization;
import java.io.Serializable;

public class Employee implements Serializable{
	
	private int id;
	private String firstName;
	private String lastName;
	private  transient String tempValue;

	// Transient variables will be discarded during Serialization.
	
	public Employee() {//Default Constructor}
		
	}
	public Employee(int id , String firstName, String lastName) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getTempValue() {
		return tempValue;
	}
	

}
