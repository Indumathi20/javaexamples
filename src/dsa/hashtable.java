package dsa;
import java.util.*;
public class hashtable {
	
	public static void main(String[] args) {
	   //Hashtable<Integer,String> table = new Hashtable<>(10,0.5f);//here we are assigning 10 as capacity and 0.5 as load factor
	   //initial capacity and the load factor is 11 AND 0.75
	   //they will increase their capacity and load factor when needed
	   Hashtable<Integer,String> table = new Hashtable<>(10);
	   table.put(100,"indu");//to add an element
	   table.put(101,"ima");
	   table.put(102,"liya");
	   table.put(130,"hiya");
	   table.put(140,"siya");
	  System.out.println(table.get(100));//to display or get the element
	  //to display all the elements
	  table.remove(100);//to remove the key
	  for(Integer key: table.keySet())
	  {
	      System.out.println(key + " " + table.get(key));
	  }//keyset method take all of the keys and return a set
	   System.out.println("display the hashcode");
	  for(Integer key: table.keySet())
	  {
	      System.out.println(key.hashCode() % 10 + "\t"+key + " " + table.get(key));//to display the hashcode we put the .hashCode()
	  }
	  //if the datatype is a string we get a different hashcode
	  System.out.println("display the string hashcode");
	   Hashtable<String,String> tablee = new Hashtable<>(10);
	   tablee.put("100","indu");//to add an element
	   tablee.put("135","ima");
	   tablee.put("109","liya");
	   tablee.put("102","hiya");
	   tablee.put("156","siya");
	   for(String keyy: tablee.keySet())
	  {
	      System.out.println(keyy.hashCode() + "\t"+keyy + " " + tablee.get(keyy));
	  }   
	}
	
}
