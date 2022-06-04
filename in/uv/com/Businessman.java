package in.uv.com;

public class Businessman implements Richman , SocialWorker {
 private String name;
 private String address;
 
 public void earnMoney(){
	 System.out.println("Earning money by doing business");
 }	 
 
 public void donation(){
	 System.out.println("Giving donation");
	 
 }
 public void party(){
	 System.out.println("party in weekend");
 }

public void helpToOther() {
System.out.println("help to others");	
	
}
}
