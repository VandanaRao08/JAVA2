package javaConcepts;
class A
{
   String color="RED";
}

class SuperKeyword1 extends A
{
   String color="WHITE";

   void showColor()
  {
   System.out.println(color);
   System.out.println(super.color);
  }
}


public class SuperKeyword{
public static void main(String[] args) 
   {
	 SuperKeyword1 obj=new SuperKeyword1();
	 obj.showColor();
   }
}
