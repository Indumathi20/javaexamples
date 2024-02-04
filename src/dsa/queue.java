package dsa;

import java.util.*;

public class queue {
public static void main(String[] args) {
	//we cannot instantiate a queue as it is a interface
	//so we are going to do it with a linkedlist
	//Queue<string> queue = new Queue<String>();as it can't be instantiated we are going to write it as
	Queue<String> queue = new LinkedList<String>();
	queue.offer("maya");
	queue.offer("lina");
	queue.offer("tina");
	queue.offer("safia");
	System.out.println(queue);
	System.out.println(queue.peek());
	queue.poll();
	System.out.println(queue);
	String out = queue.poll();
	System.out.println(out);
	System.out.println(queue);
	//the queue class extends the collection class 
	//some of the methods inside them are
	System.out.println(queue.isEmpty());//return true or false
	System.out.println(queue.size());//checks the size of the queue
	System.out.println(queue.contains("tina"));//to check whether a object is present or not//return true or false 
	//these 3 methos inherted from the container class
	
}
}
