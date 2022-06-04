package in.uv.com;

public class TestShape {
 public static void main(String[] args) {
	
	 Shape a[] = new Shape[3];
	 
	 a[0] = new Rectangle(10,4);
	 a[1] = new Circle(5);
	 a[2] = new Triangle(45,56);
	 
	 add(a);
 }
	 private static void add(Shape[]a ){
		 for(int i=0;i<a.length;i++){
			 double d = a[i].area();
			 System.out.println(d);
		 }
	 }
 //System.out.println(a[0].area());
  //System.out.println(a[1].area());
  //System.out.println(a[2].area());
} 

