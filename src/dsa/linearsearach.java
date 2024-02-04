package dsa;

public class linearsearach {
public static void main(String[] args) {
	int[] array = {4,5,2,6,1,8,7,3,9};
	int index = linearsear(array,5);
	if(index != -1 )
	{
		System.out.println("value is there in the index"+" "+index);
	}
	else
	{
		System.out.println("value not there");
	}
}

private static int linearsear(int[] array, int value) {
	// TODO Auto-generated method stub
	for(int i = 0;i < array.length;i++)
	{
		if(array[i] == value)
			return i;
	}
	return -1;
}
}
