package in.uv.com;


public class Circle extends Shape{
 
	private int radius;
    private static Double PI=3.14;
	
    public Double area (){
    	return PI*radius*radius;
    }
    
    public int getRadius() {
		return radius;
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
   

	
    
	
		
	}

