package exercise7_3;
import java. util.Calendar;
import java.util.*;

public class Question2 {
  
	public static void main(String[] args) {
  
		Date d = new Date();
		
		Calendar cal = Calendar.getInstance();
		 cal.setTime(d);
		 
		 
		 System.out.println("Maintenance Date after 30 days");
         System.out.println();

       for(int i=0;i<12;i++){
    	   
    	   cal.add(Calendar.DATE,30);
    	   
    	   System.out.println(cal.getTime());
       }
       
	}
}	

