package Serialization;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class PrimitiveFileRead {
 
	public static void main(String[] args) throws Exception {
		long dataPosition = 0;
		int data =0;
		
		RandomAccessFile raf= new RandomAccessFile("C:\\Users\\HP\\Downloads\\utkarsh.dat","rw");
		dataPosition = raf.readLong();
		
	}
}
