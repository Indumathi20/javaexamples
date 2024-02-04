package dsa;
import java.util.*;

public class arrayindynamic {
	public static void main(String[] args) {
		/*DynamicArr darr = new DynamicArr(5);//if the no passed then capacity is 5
		System.out.println(darr.capacity);//it will print 10*/
		DynamicArr darr = new DynamicArr();
		darr.add("A");
		darr.add("B");
		darr.add("C");
		darr.add("D");
		System.out.println(darr);
		System.out.println("empty:"+darr.isEmpty());//displays empty:true when array is empty
		System.out.println("size:"+darr.size);
		System.out.println("capacity:"+darr.capacity); 
		darr.insert(3, "I");
		System.out.println(darr);
		darr.delete("C");
		System.out.println(darr);
		System.out.println(darr.search("B"));  

		
	}

}
