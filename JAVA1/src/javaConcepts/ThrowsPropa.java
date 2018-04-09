package javaConcepts;

import java.io.IOException;

public class ThrowsPropa 
{
   void propM()throws IOException
   {
	   throw new IOException("device error");
   }
   
   void propN()throws IOException
   {
	   propM();
   }
   
   void propP()
   {
	   try
	   {
		   propN();
		   System.out.println("in try");
	   }
	   catch(IOException e)
	   {
		   System.out.println("in catch");
	   }
   }
	public static void main(String[] args) 
	{
		ThrowsPropa p1=new ThrowsPropa();
		p1.propP();
		System.out.println("main");
	}

}
