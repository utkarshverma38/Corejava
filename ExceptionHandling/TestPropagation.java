package ExceptionHandling;

public class TestPropagation{

	public static void main(String[] args) throws MistakeException {
	try{
		first();
	} 
	catch (Exception e2){
		System.out.println(e2.getMessage());
	}
	}
	public static void first()throws MistakeException {

		try{

		 second();
		}
		catch(RuntimeException e){
			System.out.println(e.getMessage());
			}
	}
		
	public static void second() throws MistakeException{{
    MistakeException e= new MistakeException();
         
      throw e;
        		
			
		}
		
			}

}
