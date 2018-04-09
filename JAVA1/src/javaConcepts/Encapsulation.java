package javaConcepts;

class Student
{
    private int age;
    private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
    
    
}

public class Encapsulation {

	public static void main(String[] args) 
	{
               Student s=new Student();
               s.setAge(5);
               s.setName("TOM");
             //  System.out.println(s.getAge()+"   "+s.getName());
               System.out.println(s);
	}

}
