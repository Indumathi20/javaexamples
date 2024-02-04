package dsa;
import java.util.*;

public class DynamicArr {
	int size;
	int capacity=10;
	Object[] array;
	public DynamicArr()
	{
		this.array = new Object[capacity];
		
	}
	public DynamicArr(int capacity)
	{
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	public void add(Object data)
	{
		if(size >= capacity)
			grow();
		array[size] = data;
		size++;
		
	}
	public void insert(int index,Object data)
	{
		if(size >= capacity)
		{
			grow();
		}
		for(int i = size;i > index;i--)
		{
			array[i] = array[i-1];
			
		}
		array[index] = data;
		size++;
	}
	public void delete(Object data)
	{
		for(int i =0 ;i<size;i++)
		{
			if(array[i] == data)
			{
				for(int j=0;j<(size-i-1);j++)
				{
					array[i+j] = array[i+j+1];
				}
				array[size - 1] = null;
				size--;
				if(size <= (capacity/3))
				{
					shrink();
				}
				break;
				
			}
		}
	}
	public int search(Object data)
	{
		for(int i = 0;i < size;i++)
		{
			if(array[i] == data)
			{
				return i;
			}
		}
		return -1; 
		
	}
	private void grow()//to expand the size of an array 
	{
		int newcapacity = (int)capacity * 2;
		Object[] newarray = new Object[newcapacity];
		for(int i = 0;i < size;i++)
		{
			newarray[i] = array[i];
		}
		capacity = newcapacity;
		array = newarray;
	}
	private void shrink()//to reduce the array
	{
		int newcapacity = (int)capacity / 2;
		Object[] newarray = new Object[newcapacity];
		for(int i = 0;i < size;i++)
		{
			newarray[i] = array[i];
		}
		capacity = newcapacity;
		array = newarray;
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public String toString()
	{
		String str = "";
		for(int i=0;i<size;i++)
		{
			str = str + array[i] + ",";
		}
		if(str != "")
		{
			str = "["+str.substring(0,str.length()-1)+"]";
		}
		else
			str = "[]";//prints [] for an empty array
		return str;
	}
	
}
