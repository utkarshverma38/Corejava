package CollectionsFramework;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class TestMarkSheet {

	public static void main(String[] args) {
		List l=new ArrayList();
		MarkSheet m1 =new MarkSheet("1001234","ram",50,45,33);
		

		MarkSheet m2 = new MarkSheet("1001234","mohan",50,25,43);
		l.add(m1);
		l.add(m2);
		l.contains(m2);
		 
		Iterator i= l.iterator();
		
		while(i.hasNext()){
			MarkSheet m= null;
			m=(MarkSheet)i.next();
			
		System.out.print(m.getName()+" , ");
		System.out.print(m.getRollNo()+" , ");
		System.out.print(m.getChemistry()+" , ");
		System.out.print(m.getMaths()+ " , ");
		System.out.println(m.getPhysics());
		
	} 
	
}
}
