package javaConcepts;

public class Exception {
  static int age;
  static void eligible(int age)
   {
   if(age<18)
   {
   	throw new ArithmeticException("Not valid");
   }
   else
   {
   	System.out.println("valid");
   }
   }
	public static void main(String[] args) 
	{
        try
        {
        	int a=3/0;
        	System.out.println(a);
        }
        catch(ArithmeticException e)
        {
        	System.out.println(e);
        }
        finally
        {
        	System.out.println("finally block");
        }
        
        eligible(20);
        
	}

}
