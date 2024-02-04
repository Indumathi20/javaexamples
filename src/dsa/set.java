package dsa;
import java.util.*;
public class set {
/**
 * @param args
 */
public static void main(String[] args) {
	Set<String> name =new HashSet<>();//set implements hashset
	name.add("hello");
	name.add("you");
	name.add("pretty");//to add an element
	name.add("pretty");//set by default do not allow duplicates
	//so pretty is displayed only once
	name.remove("you");//to remove a set
	System.out.println(name);
	System.out.println(name.size());//returns the size of the set
	System.out.println(name.contains("you"));
	System.out.println(name.isEmpty());
	name.clear();//removes all the element
	Set<String> names =new TreeSet<>();//they will be ordered naturally like in alphabetical order
	names.add("hello");
	names.add("you");
	names.add("pretty");
	System.out.println(names);
	//hashset is very faster than treeset
	Set<String> namess =new LinkedHashSet<>();//maintains the insertion order
	//prints them in exact same order that they were given as input
	
	 
}
}
