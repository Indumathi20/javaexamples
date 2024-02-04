package busReserv;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap)
	{
		this.busno = no;
		this.ac = ac;
		this.capacity = cap;
		
	}
	 void displayBusInfo()
	{
		System.out.println("busno:"+busno+"\tAC:"+ac+"\t total capacity:"+capacity);
	}
	public int getBusno()
	{
		return busno;
	}
	public boolean isAc()
	{
		return ac;
	}
	public void getAc(boolean val)
	{
		ac = val;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int cap)
	{
		capacity = cap;
	}

}
