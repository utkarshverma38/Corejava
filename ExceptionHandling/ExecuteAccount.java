package ExceptionHandling;

public class ExecuteAccount {
 public static void main(String[] args) throws Exception{
	InSufficientException e =new InSufficientException ();
	e.deposit(1000);
	e.withdrawal(600);
}
}
