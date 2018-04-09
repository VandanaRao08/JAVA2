package javaConcepts;

public class Wrapper 
{
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=10;
    //   Integer j=new Integer(i); //boxing
       Integer j=i; //Autoboxing
       System.out.println(j);
       
    //  int k= j.intValue(); //unboxing
       int k=j;
       System.out.println(k);
       
       
       
       int a=2;
    //   Integer b=new Integer(a);
       Integer c=a;
   //    int d= c.intValue();
       int d=c;
       System.out.println(d);
       
       String name="200";
       int ii=Integer.parseInt(name);
       System.out.println(ii);
       
	}

}

