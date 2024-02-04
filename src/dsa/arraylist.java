package dsa;
import java.util.*;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<String>  arrlist = new ArrayList<String>();
		arrlist.add("indu");//to add a StackTraceElement
		arrlist.add("hina");
		arrlist.add("rina");
		arrlist.add("tina");
		arrlist.add("sindu");
		//to find the length for araylist it is arrlist.size()
		for(int i=0;i < arrlist.size();i++)
		{
		   System.out.println(arrlist.get(i));//arrlist.get(index) for getting the value
		   
		}
		arrlist.set(2,"meenu");//arrlist.set(index,value) for changing the new value
		arrlist.remove(3);//to remove a element
		arrlist.clear(); //clears the whole array
		}

}
