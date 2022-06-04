package Serialization;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class PrimitiveFileWrite {
	public static void main(String[] args) throws Exception {
		long dataposition = 0;//to be determined later
		RandomAccessFile in= new RandomAccessFile("C:\\Users\\HP\\Downloads\\utkarsh.dat","rw");
		in.writeLong(0);
		in.writeChars("one");
		
		dataposition = in.getFilePointer();
		in.writeInt(12345);
		in.writeBytes("second");
        
		in.seek(0);
		in.writeLong(dataposition);
		in.close();
		
	}

}
