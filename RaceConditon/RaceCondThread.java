package RaceConditon;

public class RaceCondThread extends Thread  {

	public static Account111 data = new Account111();
	String name = null;
	
	public RaceCondThread(String name) {
		this.name = name;
		
	}
	 public void run() {
		 for(int i=0;i<5;i++) {
			 data.deposit(name, 1000);
		 }
	 } 
	
}
