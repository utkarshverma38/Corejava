package Serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataInputStream;

public class ReadPrimitiveData {

	  public static void main(String[] args) throws Exception {
		  
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Downloads\\utkarsh.dat");
		DataInputStream in = new DataInputStream(file);
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		
		in.close();
		
		
		
	}
}
