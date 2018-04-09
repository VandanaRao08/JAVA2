package javaConcepts;

public class Strings 
{
	static String s="AAA";
	static String s1="BBB";
	static String s2="AAA";
	
	static void compare()
	{
		System.out.println(s.equals(s1));
		System.out.println(s2.equals(s));
		if(s==s2)
		{
			System.out.println("s equals to s2");
		}
		else
		{
			System.out.println("s not euals to s2");
		}
		System.out.println(s.substring(0, 1));
	}
	

	public static void main(String[] args) 
	{
              compare();
	}

}
