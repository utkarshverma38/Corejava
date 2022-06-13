package CollectionFarmeWork;
import java.util.*;

public class Iteratorrrr {

	public static void main(String[] args) {
	
		ArrayList al =new ArrayList();
		al.add("ram");
		al.add(22);
		
		Iterator i = al.iterator();
		
		while(i.hasNext()){
          Object a = i.next();
		System.out.println(a);
}
}

}