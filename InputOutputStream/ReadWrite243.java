package InputOutputStream;
import java.io.File;
import java.util.Date;
public class ReadWrite243 {

	public static void main(String[] args) {
	File f=new File("C:\\Users\\HP\\Downloads");
	
	
	if(f.exists()) {
	System.out.println("Name = "+f.getName());	
	System.out.println("Absolute path = "+f.getAbsolutePath());
	System.out.println("Is writable = "+f.canWrite());
	System.out.println("Is readable = "+f.canRead());
	System.out.println("Is File = "+f.isFile());
    System.out.println("Is directory = "+f.isDirectory());
	System.out.println("Last Modified at = "+new Date(f.lastModified()));	
	System.out.println("Length = "+f.length()+"bytes long.");
		
		
	}
}
	
	
}
