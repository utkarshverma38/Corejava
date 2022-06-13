package CollectionFarmeWork;
import java.util.*;
public class TestMarksheet01 {
 
	public static void main(String[] args) {
		ArrayList Marksheets = new ArrayList();
		Marksheet01 m1 = new Marksheet01("10","utkarsh","verma",85);
		Marksheet01 m2 = new Marksheet01("9","shubham","sharma",55);
		Marksheet01 m3 = new Marksheet01("9","abhishek","shah",65);
		
		Marksheets.add(m1);
		Marksheets.add(m2);
		Marksheets.add(m3);
	
		
		
		Collections.sort(Marksheets);
		Iterator it= Marksheets.iterator();
		while(it.hasNext()){
			MarkSheet m=(MarkSheet) it.next();

			System.out.println(m.getRollNo());
			System.out.println(m.getName());

			
			
			
		}
			
			
}
		
	}
	
	


