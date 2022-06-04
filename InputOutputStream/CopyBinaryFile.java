package InputOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class CopyBinaryFile {
 public static void main(String[] args) throws Exception {
	String ss="C:\\Users\\HP\\Pictures\\Camera Roll\\a.jpg";
	String ii ="C:\\Users\\HP\\Pictures\\Camera Roll\\b.jpg";
	FileInputStream reader = new FileInputStream(ss);
	FileOutputStream writer = new FileOutputStream(ii);
	
	int ch = reader.read();
	while(ch!=-1) {
		
		writer.write(ch);
		ch=reader.read();
	}
	writer.close();
	reader.close();
	System.out.println(ss+" Work done "+ii);
	
	
}
	
	
	
}
