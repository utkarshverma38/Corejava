package in.uv.com;

public class Prime {
public static void main(String[] args) {
	int n=75;
	int u=0;
	for(int i=2;i<=n-1;i++){
		if(n%i==0)
		u=u+1;
		
	}
if(u==0){
	System.out.println(n+"is a prime number");
	
} else {
	System.out.println(n+"is not a prime number");
}
}
 
}
