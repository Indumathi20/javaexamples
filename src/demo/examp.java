package demo;
import java.lang.reflect.*;

class Employee
{
	int name;
	Employee()
	{
		System.out.println("the name is");
	}
	public void display()
	{
		System.out.println("display");
	}
}
public class examp
{
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		Class cls = e.getClass();
		
		System.out.println(cls.getName());
		Method[] methods = cls.getMethods();
		for(Method m:methods)
		{
			System.out.println(m.getName());
		}
		
		try {
			
			System.out.println(methods[0].invoke(e, null));
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}