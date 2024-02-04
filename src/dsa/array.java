package dsa;

import java.util.Scanner;

class DynamicArray<T>
{
	private static final int initialcap = 16;
	private int arr[];
	private int size;
	private int capacity;
	
	 DynamicArray()
	 {
		 size = 0;
		 arr = new int[initialcap];
		 capacity = initialcap;			 
	 }
	 public void add(int val)
	 {
		 if(size == capacity)
			 expandArray();
		 arr[size] = val;
		 size++;
	 }
	private void expandArray()
	 {
		 capacity = capacity * 2;
		  arr = java.util.Arrays.copyOf(arr, capacity);
	 }
	 public void display()
	 {
		 System.out.println("the elements in the list are:");
		 for(int i=0;i<size;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
	 }
	 public void insertAtPos(int pos,int val)
	 {
		 if(size == capacity)
			 expandArray();
		 for(int i=size-1;i>=pos;i--)
		 {
			 arr[i+1] = arr[i];
		 }
		 arr[pos] = val;
		 size++;
	 }
	 public int length() {
		 return size;
	 }
	 public void deletePos(int pos)
	 {
		 for(int i = pos+1;i<size;i++)
		 {
			arr[i-1] = arr[i];  
			size--;
			
			if(capacity > initialcap && capacity > 3*size)
			{
				shrinkArray();
				
			}
		 }
	 }
	 public void shrinkArray()
	 {
		 capacity = capacity / 2;
		 arr = java.util.Arrays.copyOf(arr, capacity);
	 }
	 
}

public class array {
	public static void main(String[] args) {
		int val;
		int pos;
		DynamicArray<Integer> list = new DynamicArray<Integer>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("\nThe list menu");
		System.out.println("\n 1.insert at the end");
		System.out.println("\n 2. display the list");
		System.out.println("\n 3. insert at specific position");
		System.out.println("\n 4. delete from specified position");
		System.out.println("\n 5. exit");
		System.out.println("\n enter your choice:\t");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("enter the data");
			
			 val=sc.nextInt();
			 list.add(val);
			 break;
		case 2:
			list.display();
			break;
		case 3:
			System.out.println("enter the position which starts at 0:");
			pos = sc.nextInt();
			if(pos<0)
			{
				System.out.println("enter a valid position:");
				break;
			}
			System.out.println("enter the data:");
			val = sc.nextInt();
			list.insertAtPos(pos,val);
			break;	
		case 4:
			System.out.println("enter the position which starts at 0:");
			pos = sc.nextInt();
			if(pos<0)
			{
				System.out.println("enter a valid position:");
				break;
			}
			list.deletePos(pos);
			break;
		case 5:
			System.exit(0);
			break;
			
		default:
			System.out.println("invalid choice");
		}
		}
	}

}
