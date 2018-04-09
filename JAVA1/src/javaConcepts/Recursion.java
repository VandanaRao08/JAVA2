package javaConcepts;

public class Recursion 
{
	int count=0;

	public void showvalue()
	{
 count++;
 if(count<=5){
		System.out.println("Hello");
		showvalue();
		}
	}
	

	public static void main(String[] args) {
                Recursion r=new Recursion();
                r.showvalue();
	}

}
