package InputOutputStream;
import java.io.File;
public class DisplayOnlyFile {
public static void main(String[] args) {
//		/*
//		 * File directory = new File("C:\\Users\\HP\\Downloads"); String[] list =
//		 * directory.list(); for(int i =0;i<list.length;i++) {
//		 * 
//		 * File f= new File("C:\\Users\\HP\\Downloads",list[i]); if(f.isFile()) {
//		 * System.out.println((i+1)+" : "+list[i]); } }
//		 */}


File directory = new File("C:\\Users\\HP\\Downloads");
File[] list = directory.listFiles();
for(int i=0 ; i<list.length;i++) {
if(list[i].isFile()) {
	
	System.out.println((i+1)+" : "+list[i].getName());
}



}








}
}