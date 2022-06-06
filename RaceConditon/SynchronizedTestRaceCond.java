package RaceConditon;

import in.uv.com.Account;

public class SynchronizedTestRaceCond extends Thread {
 
	public static AccountSynchronized data = new AccountSynchronized ();
	
	public SynchronizedTestRaceCond(String name) {
		super(name);
		
	}
		
	public void run() {
	for(int i=0;i<5;i++) {
		data.deposit(getName(),1000);
	}
	
	}
	
	public static void main(String[] args) {
		SynchronizedTestRaceCond u1 = new SynchronizedTestRaceCond("ram");
		SynchronizedTestRaceCond u2 = new SynchronizedTestRaceCond("mohan");
		
		u1.start();
		u2.start();
	}
	
}