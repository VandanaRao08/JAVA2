// 0 1 1 2 3 5 8 13
package javaConcepts;

public class FibonacciRec 
{
	static int a=0;
	static int b=1;
	static int c;
	
	static void fibo()
	{
		if(c<55)
		{
		c=a+b;
		if(c<55)
		{
		System.out.print("  "+c+"  ");
		}
		a=b;
		b=c;
		fibo();
		}
	}
  
	public static void main(String[] args) 
	{
              System.out.print(a+" "+b);
              fibo();
              
	}

}
