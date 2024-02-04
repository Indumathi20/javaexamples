package dsa;
import java.util.*;

public class priorityqueue {
	public static void main(String[] args) {
		Queue<Double> queue = new PriorityQueue<>();//otp will be ascending order
		//Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());//if it is given like this then the otp will be reverse ordered
		queue.offer(3.5);
		queue.offer(5.7);
		queue.offer(2.6);
		queue.offer(3.8);
		queue.offer(1.2);
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());//to display and remove all the elements in the queue
		}//now the otp is in ascending order as it is a priority queue
		
	}

}
