package InputOutputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class FileReaderChar {
public static void main(String[] args) throws Exception {
	FileReader reader = new FileReader("C://Users//HP//Downloads//utkarsh.txt");
	int ch=reader.read();
	char chr;
	
	while(ch!=-1) {
		chr = (char)ch;
		System.out.print(chr);
		ch=reader.read();
		
		
	}
}


}
