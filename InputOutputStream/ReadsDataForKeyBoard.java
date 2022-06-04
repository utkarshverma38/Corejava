package InputOutputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class ReadsDataForKeyBoard {

	public static void main(String[] args) throws IOException {
	 
	String s="C:\\Users\\HP\\Downloads\\utkarsh.txt";
	FileWriter fw= new FileWriter(s);
	PrintWriter pw=new PrintWriter(fw);
	
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(ir);
	
	String line =br.readLine();
	while(!line.equals("quit")) {
		pw.println(line);
        line = br.readLine();		
		
	}
	pw.close();
	ir.close();
	
	
	
	
	
	
}
	
	
}
