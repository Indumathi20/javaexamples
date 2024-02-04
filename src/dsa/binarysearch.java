package dsa;
import java.util.Arrays;
import java.util.*;

public class binarysearch {
public static void main(String[] args) {
	int array[] = {23,8,45,25,98,24,67,6,5,90};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the element to be found");
	int target = sc.nextInt();
	for(int i =0;i < array.length;i++)
	{
		array[i] = i;
	}
	//int index = Arrays.binarySearch(array, target);//pass the array and the key//it is an inbuilt method that returns the ans
	int index = binarySearch(array,target);
	if(index == -1)
		System.out.println("number not found");
	else
		System.out.println("number is found at the index of ");
}

private static int binarySearch(int[] array, int target) {
	// TODO Auto-generated method stub
	int low = 0;
	int high = array.length-1;
	while(low <= high)
	{
		int middle = (low + high) / 2;
		int value = array[middle];
		if(value < target)
			low = middle + 1;
		else if(value > target)
			high = middle - 1;
		else
			return middle;
	}
	return -1;
}
}
