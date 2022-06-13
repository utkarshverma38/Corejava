package exercise7_3;
import java.text.SimpleDateFormat;
import java.util.*;

public class Question3 {
	
	public static void main (String[] args) throws Exception{
		
		String start= "03/02/2022";//Start Date
		String end = "01/02/2022";
		
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy") ;
        
		Date std = sdf1.parse(start);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy") ;
        Date edd = sdf2.parse(end);
	
        if (std.compareTo(edd)== 1) {
		System.err.println ("Error : End date is less than start date");

        }
		
	}

}
