package RaceConditon;

public class Account111 {

	private int balance=0;
    
	public void deposit(String message,int amount) {
		int bal = getBalance();
		setBalance(bal+1000);
		System.out.println(message+"Now Balance is "+getBalance());
	}

	public int getBalance() {
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {}
			return balance;
	}	
	
	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		}catch (InterruptedException e) {}
		this.balance = balance;
		
	} 
	
	
}
