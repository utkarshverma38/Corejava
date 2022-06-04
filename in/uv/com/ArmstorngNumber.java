package in.uv.com;

public class ArmstorngNumber {
public static void main(String[] args) {
	int a=153;
	int s =0;
	int r;
	int temp;
              temp = a;
	
    while (a>0){	
       r=a%10;
       s=(r*r*r)+s;
       a=a/10;
    }   
   if(temp==s){    
		
		System.out.println("Armstrong number = "+s);
		
	
   }else{
	   System.out.println("is not Armstrong number");
   }
}
}

