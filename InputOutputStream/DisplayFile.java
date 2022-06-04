package InputOutputStream;
import java.io.File;
public class DisplayFile {
public static void main(String[] args) {
	File Directory = new File("C:\\Users\\HP\\Downloads");
	
	String[] list = Directory.list();
	for(int i =0;i<list.length;i++) {
		System.out.println(( i + 1)+" : "+ list[i]);
		
	}
}
}
