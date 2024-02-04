package dsa;
import java.util.*;

public class list {

	public static void main(String[] args) {
	   List arraysaslist = Arrays.asList(1,5,4,3,7,null);//to create a list from arrays //allow to take null
	   //or
	   //List listof = list.of(7,6,4,8,9);//another way to create used in java9
	   //or
	   //basic way to create list
	   List list = new ArrayList();
	   list.add(2);
	   list.add(4);
	   list.add(8);
	   list.add(29);
	   //mutable-can we change
	   //array list is partially mutable that is we can change certrain fns
	   list.set(2,36);//to change the value
	   System.out.println(list);
	   // list.add(400);//it gives exception as it is partially mutable
	   //list.sort();
	   //list.replaceAll();
	   boolean b = list.contains(36);
	   System.out.println(b);
	}
}
