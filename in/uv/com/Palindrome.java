package in.uv.com;

public class Palindrome {
 public static void main(String[] args) {
	int n=121;
	int s = 0;
	int r;
	int temp;
	temp=n;
	
	while(n>0){
		r=n%10;
		s=(s*10)+r;
		n=n/10;
		
	}
	if(temp==s){
		System.out.println(s+"it is a palindrome number ");
	}else{
		System.out.println(s+"it is not a palindrome number");
	}
	
}
}
