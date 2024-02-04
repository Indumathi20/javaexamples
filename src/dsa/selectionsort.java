package dsa;

public class selectionsort {
	
	    public static void main(String args[]){   

	    	int[] array = {8,4,6,9,1,7,2,3};
	    	selectSort(array);
	    	for(int i : array)
	    	{
	    		System.out.println(i);
	    	}
	    }

		private static void selectSort(int[] array) {
				for(int i=0;i<array.length-1;i++)
				{
					int min = i;
					for(int j = i+1;j < array.length;j++)
					{
						if(array[min] > array[j])
						{
							min = j;	
						}
					}
					int temp = array[i];
					array[i] = array[min];
					array[min] = temp;
				}
				
		}

}
