package in.uv.com;
import java.text.ParseException;

import java.util.Date;
public class Account {
 
	
	  private String number;
	    private String accountType;
	    private double balance;


		
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void deposit(double d){
			balance = balance + d;
		}
		public void withdrawal (double d) {
			balance = getBalance() -d;
			
		}
		public void fundTransfer(double d){
			balance = getBalance() -d;
		}
		public void payBill(double d){
			balance =getBalance() -d;
		}
	}

