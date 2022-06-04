package in.uv.com;

public class Triangle extends Shape {
 
	private int base;
	private int hight;

	
	public Double area(){
		return(double)((base*hight)/2);
	}
	
	
	public int getBase() {
		return base;
	}
	public Triangle(int ba,int hi) {
		this.base = ba;
		this.hight = hi;

	}
	public int getHight() {
		return hight;
	}
}
	
	
