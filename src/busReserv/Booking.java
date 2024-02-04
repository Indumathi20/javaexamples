package busReserv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {

	String passengerName;
	int busno;
	Date date;
	
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter passenger name: ");
		passengerName = sc.nextLine();
		System.out.println("enter bus no:");
		busno = sc.nextInt();
		System.out.println("enter the date dd-mm-yyyy:");
		String dateInput = sc.next();
		SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-YYYY");
		try {
			date = sdt.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
	{
		int capacity = 0;
		for(Bus bus:buses)
		{
			if(bus.getBusno()== busno)
				capacity = bus.getCapacity();
		}
		int booked = 0;
		for(Booking b:bookings)
		{
			if(b.busno== busno && b.date.equals(date))
			{
				booked++;
			}
			
		}
		return booked<capacity?true:false; 
	}
	
}
