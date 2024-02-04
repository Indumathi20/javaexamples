package demoo;

public class inheritance {

	public static void main(String[] args) {
		Employee e1 = new Employee("ram",2600);
		e1.raiseSalary(10);
		System.out.println(e1.getSalary());
		Manager m1 = new Manager("john",8700,0);
		System.out.println(m1.getSalary());
		m1.setBonus(340.0);
		System.out.println(m1.getSalary());
		
		Employee[] emp = new Employee[4];
		emp[0] = new Employee("hari",3400);
		emp[1] = new Employee("indu",3600);
		emp[2] = new Employee("neww",3800);
		emp[3] = new Manager("hindu",8769,0.0);
		emp[2].setSalary(20000);
		Manager m3 = (Manager)emp[3];
		m3.setBonus(300);
		Manager m4;
		if(emp[2] instanceof Manager)
			m4 = (Manager) emp[2];
			
		
		for(Employee e:emp)
		{
			System.out.println(e.getName()+ " "+e.getSalary());
		}
		
		
		
	}
}
class Manager extends Employee
{
	double bonus;
	Manager(String name,double salary,double bonus)
	{
		super(name,salary);
		this.bonus = bonus;
	}
	 void setBonus(double b)
	{
		 bonus = b;
	}
	 public double getSalary()
	 {
		 return super.getSalary()+bonus;
	 }
}
 class Employee
 {
	 private String name;
	 private  double salary;
	 Employee()
	 {
		 name = " ";
		 salary = 0.0;
	 }
	 Employee(String name,double salary)
	 {
		 this.name = name;
		 this.salary = salary;
	 }
	  String getName()
	 {
		 return name;
	 }
	   void setName(String n)
	  {
		  name = n;
	  }
	   double getSalary()
	   {
		   return salary;
	   }
	   void setSalary(double s)
	   {
		   salary = s;
	   }
	    void raiseSalary(double percent)
	   {
		   salary= salary + (salary * percent)/100;
	   }
 }