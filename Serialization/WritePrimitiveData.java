package Serialization;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class WritePrimitiveData {

	 public static void main(String[] args) throws Exception {
		
		FileOutputStream file= new FileOutputStream ("C:\\Users\\HP\\Downloads\\utkarsh.dat");
		DataOutputStream out= new DataOutputStream(file);
		
		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('U');
		out.writeDouble(3.3);
		 
		out.close();
		file.close();
		
		System.out.println("Primitive Data Successfully written");
	}
}
