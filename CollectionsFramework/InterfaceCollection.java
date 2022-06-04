package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;


public class InterfaceCollection {

	
public static void main(String[] args) {
	   Collection a=new ArrayList();
		Collection b= new ArrayList();
		
		a.add("utkarsh");
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
        
		b.add("utkarsh");
		b.add(2);
		b.add(2);
		b.add(3);
		b.add(566);
		
		
	
//		for(int i=0;i<a.size();i++)
		
	 System.out.println(a.contains("utkarsh"));
		System.out.println(b.containsAll(a));
		System.out.println(a.isEmpty());
		System.out.println(a.remove(4));
	      System.out.println(a.removeAll(a));
          System.out.println(b.retainAll(a));
		System.out.println(a.size());
		}



	
}


