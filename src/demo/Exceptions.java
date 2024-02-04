package demo;

public class Exceptions {
	public static void main(String[] args) {
		 int a=10,b=0;
		 int c =0;
		 try{
			  c = a/b;
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 System.out.println(c);
		 System.out.println("end the program");
	}

}
