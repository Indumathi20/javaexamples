package demo;

enum level
{
	BEGINNER("B"),INTERMEDIATE("I"),ADVANCED("A");

	String abbr;
	level(String ab) {
		abbr = ab;
	}
	public String getabbr()
	{
		return abbr;
	}
	
}
public class Enum {

	public static void main(String[] args) {
		level l1 = level.ADVANCED;
		System.out.println(l1);
		System.out.println(l1.getabbr());
		
	}
}
