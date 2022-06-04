package ExceptionHandling;

public class InSufficientException extends Exception {

	private double balance =0;
	private double rB;
	
	
	public void deposit(double d){
		
		setBalnce(getBalance()+d);
	}
	
	public void withdrawal(double wA)throws InSufficientException{
	     rB=getBalance();
	try{
		if (rB-wA < 500){
	
	System.out.println("insufficient Balance");
	System.out.println("Remaining Balance "+balance );
	
		}
		else{
			setBalnce(getBalance()-wA);
			
			System.out.println("Transaction succesfully completed ");
			System.out.println("withdrawal Amount : "+ wA); 
			System.out.println("After transaction current balance : "+ getBalance());
			

		}

	}
	catch (Exception e){
		System.out.println("caught :"+e.getMessage());
		System.out.println("current balance is : "+balance);
	}
		}
	
	public void setBalnce(double d){
		this.balance=d;
		
	}
	
	public double getBalance(){
		return balance;
	}
	
}
