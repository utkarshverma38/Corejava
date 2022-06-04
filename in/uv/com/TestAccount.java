package in.uv.com;

public class TestAccount {

	public static void main(String[] args) {
	 
		Account a = new Account();
		
		a.setNumber("7000162634");
		a.setAccountType("saving");
		a.setBalance(8000.50);
	    a.deposit(1000);
		a.withdrawal(2000);
		a.payBill(200);
		a.fundTransfer(500);
	    
	    
		a.getNumber();
		a.getAccountType();
		a.getBalance();
		
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
        	
}
}
