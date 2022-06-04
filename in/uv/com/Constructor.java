package in.uv.com;

public class Constructor {

	private String color=null;
	private int borderWidth=0;

 
public Constructor(String c, int w){
		color=c;
		borderWidth=4;
		
	}
	
	public String getColor(){
		return color;
	}
	public int getborderWidth(){
		return borderWidth;
	}
	
}
