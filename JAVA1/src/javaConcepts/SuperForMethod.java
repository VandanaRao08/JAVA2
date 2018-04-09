package javaConcepts;

class AA
{
     void showcolor()
     {
    	 System.out.println("class A color");
     }
}

class B extends AA
{
	void showcolor()
	{
		System.out.println("class B color");
	}
	void showABcolor()
	{
		super.showcolor();
		showcolor();
	}
}
public class SuperForMethod {

	public static void main(String[] args) 
	{
        B obj=new B();
        obj.showABcolor();
	}

}
