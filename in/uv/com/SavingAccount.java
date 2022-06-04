package in.uv.com;

public class SavingAccount extends AccountOverriding {
 
	public int getAmount (){
		
		int i= super.getAmount() +10;
		return i;
	}
}
