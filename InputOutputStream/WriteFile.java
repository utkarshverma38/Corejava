package InputOutputStream;
import java.io.FileWriter;
import java .io.IOException;
import java.io.PrintWriter;
public class WriteFile {

	public static void main(String[] args)throws Exception {
	FileWriter writer= new FileWriter ("C:\\Users\\HP\\Downloads\\utkarsh.txt",true);
	PrintWriter pw = new PrintWriter(writer);
	
	for(int i =0 ;i<5;i++) {
		pw.println(i+": line");
	}
	pw.close();
	writer.close();
	
	System.out.println("File successfully written P1 check C:\\Users\\HP\\Downloads\\utkarsh.txt");
}
}
