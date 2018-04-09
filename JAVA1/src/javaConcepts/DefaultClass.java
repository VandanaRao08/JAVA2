package javaConcepts;

public class DefaultClass implements DefaultInterface 
{
	
	@Override
	public void show() 
	{
	   System.out.println("show method");	
	}

	public static void main(String[] args) 
	{
         DefaultInterface obj=new DefaultClass();
         obj.show();
         obj.showDefault();
	}

	

}
