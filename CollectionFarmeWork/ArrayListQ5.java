package CollectionFarmeWork;
import java.util.*;
public class ArrayListQ5 {

	public static void main(String[] args) {
		List l1= new ArrayList();
		add(100000,l1);
		
		HashSet h = new HashSet(l1); 
		 
		System.out.println(Math.random()*50);
		
		
	}
	private static void add(int range ,List l1){
		for(int i=0; i<=range;i++){
			l1.add(i);
		}
	}
	
}
