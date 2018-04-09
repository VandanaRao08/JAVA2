package javaConcepts;
class Values implements  Cloneable
{
	int i;
	int j;
	@Override
	public String toString() {
		return "Values [i=" + i + ", j=" + j + "]";
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}


public class CloneObj {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
        Values obj=new Values();
        obj.i=10;
        obj.j=20;
      
        //shallow
//        Values obj1=obj;
//        obj1.j=30;
//        System.out.println(obj1);
//        System.out.println(obj);
//        //deep
//        Values obj2=new Values();
//        obj2.i=obj.i;
//        obj2.j=obj.j;
//        System.out.println(obj2);
//        obj2.j=40;
//        System.out.println(obj);
        //clone
        Values obj3=(Values) obj.clone();
        
        System.out.println(obj3);
        obj3.j=40;
        System.out.println(obj);
	}

}
