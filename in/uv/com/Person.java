package in.uv.com;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Person {

	private String name;
    private Date Date;
    SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
    private String address;
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		String s1 = s.format(Date);
		return s1;
	}
	public void setDate(String s2) throws ParseException{
		Date = s.parse(s2);
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}  