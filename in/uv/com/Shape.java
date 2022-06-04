package in.uv.com;

public class Shape {

	private String color;
	private int borderWidth;
	public Shape(){
	System.out.println("this is a defualt constructor");}
	
	
	public String getColor() {
		return color;
	}
	public Shape(String color,int borderWidth) {
		this.color = color;

	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public Double area(){
		System.out.println();
		return null;
	}
	
	
}
