package Lab_Assignment_4_1_Association;

public class Person{
	private int age;
	private String name;
	
	
	Person(String _name, int _age)
	{
		name = _name;
		age = _age;
	}
	
	public  String getName()
	{
		return name;
	}
	public void getPersonDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
}
