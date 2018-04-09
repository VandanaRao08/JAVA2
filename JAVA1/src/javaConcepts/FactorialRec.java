package javaConcepts;

public class FactorialRec 
{
    int fact(int n)
    {
    	if(n==1)
    	{
    		return 1;
    	}
    	else
    	{
    	return (n*fact(n-1));
    	}   	
    }
	public static void main(String[] args) 
	{

		FactorialRec fr=new FactorialRec();
		System.out.println(fr.fact(5));
		
	}

}
