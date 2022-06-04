 package in.uv.com;

public class MethodOverLoading {
	public static void main(String[] args) {
		
	
 MethodOverLoading m=new MethodOverLoading();
	System.out.println(m.add(20, 4.50d));
	}
	public int add(int a ,int b){
		return a+b;
	}
	
		public int add(int a ,int b,int c){
			return a+b+c;
		}
		
	    public int  add(int a,double b){
	    	double s = a+b;
		return (int )s;
	}
	    
			public int add(double a,double b){
			   double f=a+b;
				return (int) f;
			}
			
			
			public int add(int a,float b ){
				float w=a+b;
				return (int)w;
			}
			
			

			}
			
			
			
		
	
	

