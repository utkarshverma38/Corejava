package exercise11_8_3;
import java.util.*;
public class TestMarksheet {


		public static void main(String[] args) {
			List m = new ArrayList();

			m.add(new Employee("Utkarsh", "Verma"));
			m.add(new Employee("aniket", "sirota"));
			m.add(new Employee("vaibhav", "Parmar"));
		
			OrderByName F = new OrderByName();
			Collections.sort(m, F);
			
	        for (Object o : m)
	        {
				System.out.println(o);
			}
		}
	}


