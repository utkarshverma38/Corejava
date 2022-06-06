package RaceConditon;

public class AccountSynchronized {
 private int balance =0;
 
   public synchronized void deposit(String message, int amount)  {
	   int bal =getBalance()+amount;
	   setBalance(bal);
	   System.out.println(message+" Now Bal "+bal);
	   
   }

public int getBalance() {
	databaseDelay();
	
	return balance;
}


public void setBalance(int balance) {
	databaseDelay();
	this.balance = balance;
}

public void databaseDelay() {

try {
	Thread.sleep(200);
	
}catch(InterruptedException e) {
	
}
	
}
}
 
	

