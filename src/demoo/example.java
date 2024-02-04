package demoo;

import java.util.*;

public class example {
	static int minValue(int... vals)
	{
		int min=Integer.MAX_VALUE;
		for(int k:vals)
		{
			if(k<min)
				min = k;
		}
		return min;
	}
	public static void main(String[] args) {
		int m = minValue(3,4,1);
				System.out.println(m);
		int n = minValue(-2,3,6,-4);
				System.out.println(n);
	}
	
}
