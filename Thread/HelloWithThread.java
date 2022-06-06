package Thread;

public class HelloWithThread extends Thread {
 private String name = null;
 
 public HelloWithThread(String threadName) {
	 name = threadName;
	 
 }
	
 public void run () {

	 for(int i=0;i<50;i++) {
		 System.out.println(i+" Hello " +name);
	 }
	 
 }
 
  public static void main(String[] args) {
	
	  HelloWithThread t1 = new HelloWithThread("Utkarsh");
	  HelloWithThread t2 = new HelloWithThread("verma");
	  
	  t1.start();
	  t2.start();
	  
	  
	  
 
}
}