package oop;


public class Stack {

	int arr[] = new int[10];
	int tos;
	Stack()
	{
		tos = -1;
	}
	void push(int item)
	{
		if(tos==9)
				System.out.println("stack is full");
		else
			arr[++tos] = item;
	}
	int pop()
	{
		if(tos>=0)
			
			return arr[tos--];
		else
			System.out.println("stack is empty");
		return -1;
	}
}
  