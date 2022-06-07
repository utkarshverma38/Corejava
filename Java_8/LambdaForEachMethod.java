package Java_8;
import java.util.*;
public class LambdaForEachMethod {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("utkarsh");
		al.add("verma");
		
		al.forEach(a -> System.out.println(a));
	}
}
