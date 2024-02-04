package busReserv;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,43));
		buses.add(new Bus(3,true,65));
		
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		
		
		int useropt=1;
		Scanner sc=new Scanner(System.in);
		for(Bus b:buses)
		{
			b.displayBusInfo();
		}
		
		while(useropt==1)
		{
			System.out.println("enter 1 to book 2 to exit");
			useropt=sc.nextInt();
			if(useropt==1)
			{
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses))
				{
					bookings.add(booking);
					System.out.println("booking is confirmed");
				}else
				{
					System.out.println("sorry booking is full.");
				}
			}
		}
	}

}
