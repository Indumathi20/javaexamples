package dsa;

public class insertionsort {
		    public static void main(String args[]){   

		    	int[] array = {8,4,6,9,1,7,2,3};
		    	insertSort(array);
		    	for(int i : array)
		    	{
		    		System.out.println(i + " ");
		    	}
		    }

			private static void insertSort(int[] array) {
				for(int i = 1 ;i < array.length;i++)//we are leaving one element in the left to compare so i = 1
				{
					int temp = array[i];
					int j = i-1; //those left numbers
					while(j >= 0 && array[j] > temp)
					{
						while(j >= 0 && array[j] > temp)
						{
							array[j+1] = array[j];
							j--;
						}
						array[j+1] = temp;
					}
					
				}
				
			}
}
