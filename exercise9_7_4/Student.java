package exercise9_7_4;

public class Student  extends Businessman implements RichMan {  
	
		public void donation()
		{
			System.out.println("Student Giving Donation");
		}
		public void party()
		{
			System.out.println("Student Giving Party");
		}
		public static void main(String[] args)
		{
			Businessman b=new Businessman();
			b.donation();
			b.party();
			
			/*
			 * RichMan r=new Student(); r.donation(); r.party();
			 */
			
			Student s=new Student();
			s.donation();
			s.party();
		}
	}


