package dsa;

import java.util.Stack;

public class stack {
public static void main(String[] args) {
	Stack<String> stack = new Stack<String>();
	stack.push("hi");
	stack.push("hello");
	stack.push("how");
	stack.push("are");
	stack.push("you");
	System.out.println(stack.empty());//to see if a stack is empty returns true or false
	System.out.println(stack);//displays the stack
	stack.pop();
	System.out.println(stack);
	//to display the poped stack assign it to something the display
	String myfav = stack.pop();
	System.out.println(myfav);
	System.out.println(stack);
	System.out.println(stack.peek());//displays the above element
	//peek looks at the top object without removing it
	System.out.println(stack);
	System.out.println(stack.search("how"));//in which position from the top it is there will be displayed
	System.out.println(stack.search("me"));//if the ans is not there it will display -1
}
}
