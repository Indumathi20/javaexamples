package demo;

public class Main{
			
    public static void main(String args[]){   

    	int[] array = {8,4,6,9,29,45,23,34};
    	bubbleSort(array);
    	for(int i : array)
    	{
    		System.out.println(i+ " ");
    	}
    	
    	
  
    }

	private static void bubbleSort(int[] array) {
		// TODO Auto-generated method stub
		for(int i = 0;i < array.length-1;i++)
		{
			for(int j = 0;j < array.length - i - 1;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1]= temp;
				}
				
			}
		}
		
	}
}

