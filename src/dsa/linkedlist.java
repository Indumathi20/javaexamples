package dsa;
import java.util.*;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		/*linkedlist.push("A");
		linkedlist.push("B");
		linkedlist.push("C");
		linkedlist.push("D");
		linkedlist.push("E");
		System.out.println(linkedlist);
		String poped = linkedlist.pop();
		System.out.println(poped); //linked list implemented as stack 
		//otp is
		   [E, D, C, B, A]
			E
*/
		//linkedlist for queue
		linkedlist.offer("A");
		linkedlist.offer("B");
		linkedlist.offer("C");
		linkedlist.offer("D");
		linkedlist.offer("E");
		System.out.println(linkedlist);
		linkedlist.poll();
		System.out.println(linkedlist);
		linkedlist.offerFirst("I");
		System.out.println(linkedlist);
		linkedlist.offerLast("Z");
		System.out.println(linkedlist);
		linkedlist.add(4,"H");//adds in the particular index
		System.out.println(linkedlist);
		linkedlist.remove("E");//to remove the element
		System.out.println(linkedlist);
		System.out.println(linkedlist.indexOf("D"));
		System.out.println(linkedlist.peekFirst());//display the first element
		System.out.println(linkedlist.peekLast());//display the last element
		String remfirst = linkedlist.removeFirst();
		System.out.println(remfirst+ "is removed first");
		String remlast = linkedlist.removeLast();
		System.out.println(remlast + "is removed last");
				}

}
