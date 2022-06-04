package InputOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
public class CopyTextFile {
public static void main(String[] args) throws Exception {
	String ss="C:\\Users\\HP\\Downloads\\utkarsh.txt";
	String ii="C:\\Users\\HP\\Desktop\\NewFolder";
	
	FileReader reader =new FileReader(ss);
	FileWriter writer = new FileWriter(ii);
	
	int ch = reader.read();
	while(ch!= -1) {
		
		writer.write(ch);
		ch=reader.read();
		
	}
	writer.close();
	reader.close();
	System.out.println(ss+"Work Done"+ii);
	
	
}
}
