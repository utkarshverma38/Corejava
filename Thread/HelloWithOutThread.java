package Thread;

public class HelloWithOutThread {

	String name = null;
	public HelloWithOutThread(String ThreadName) {
		name = ThreadName;
	}
	
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(i+" Hello "+name);
		}
		
		
	}
	public static void main(String[] args) {
		 
		HelloWithOutThread t1 = new HelloWithOutThread("Dhoni");
		HelloWithOutThread t2 = new HelloWithOutThread("Virat");
		
		t1.run();
		t2.run();
	}
	
	
}
