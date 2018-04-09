package javaConcepts;

public interface DefaultInterface 
{
  void show();
  default void showDefault()
  {
	  System.out.println("Interface1 default method");
  }
}
