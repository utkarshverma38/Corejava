package Serialization;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileByScanner {

	 public static void main(String[] args) throws Exception {
		
		 FileReader reader = new FileReader("C:\\Users\\HP\\Downloads\\utkarsh.txt");
		 Scanner sc=new Scanner(reader);
		 
		 while(sc.hasNext()) {
			 
			 System.out.println(sc.nextLine());
			 
		 }	 
		 reader.close();
		 
	}
}
