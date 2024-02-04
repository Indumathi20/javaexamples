package dsa;

public class recursion {
	public static void main(String[] args) {
		int pow = power(2,3);
		System.out.println(pow);
	}

	private static int power(int base, int expo) {
		// TODO Auto-generated method stub
		if(expo < 1)
			return 1;
		return base * power(base,expo - 1) ;
	}
}
