package demo;

class Department
{
	int depid;
	String dname;
	Department(int depid,String dname)
	{
		this.depid = depid;
		this.dname = dname;
	}
}

class Student implements Cloneable
{
	int id;
	String name;
	Department dept;
	Student(int id,String name,Department dept)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}

public class ObjectCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
	Department d1 = new Department(1,"science");
	Student s1 = new Student(12,"ram",d1);
	Student s2 = (Student)s1.clone();
		
		 
		
	}

}
