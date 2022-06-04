package in.uv.com;

public class Rectangle extends Shape {

	private int length;
	private int width;
    private Double area;
	
	public Double area(){
		return (double) length*width;
	}
	
	public int getLength() {
		return length;
	}
	public Rectangle(int length,int width) {
		this.length = length;
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	

	
	
}
