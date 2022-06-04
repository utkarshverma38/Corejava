package InputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFileLinebyLine {
 
	public static void main(String[] args) throws Exception {
	
	 FileReader reader=new FileReader("C:\\Users\\HP\\Downloads\\utkarsh.txt");
	BufferedReader br=new BufferedReader(reader);
	
	String line =br.readLine();
	while(line!=null) {
	
		System.out.println(line);
		line = br.readLine();
		
	}
	reader.close();
	
	
}
}
