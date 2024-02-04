package demo;

interface Ridable
{
	abstract void ride();
	final int book = 90;//final and static
	default void display()
	{
		System.out.println("dsiplayable");
	}
}
class Car implements Ridable
{
	public void ride()
	{
		System.out.println("you are riding a car");
	}
}
class Bike implements Ridable
{
	public void ride()
	{
		System.out.println("you are riding a bike");
	}
}
class Mechanic
{
	void check(Ridable v)
	{
		System.out.println("Checkiing");
		v.ride();
	}
}
public class Interface {
	public static void main(String[] args) {
		
		Mechanic m = new Mechanic();
		Car c = new Car();
		Bike b=new Bike();
		m.check(c);
		c.display();
		m.check(b);
		Ridable r4 = new Ridable()//anonymus class for one method
				{
					public void ride()
					{
						System.out.println("a vintage car");
					}
				};
				r4.ride();
		
		Ridable r3 = () -> System.out.println(" it s a ridable");//lambda expression
		r3.ride();
	}

}
