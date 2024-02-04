package dsa;

public class stringbuilder {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("indu");
	System.out.println(sb.capacity());//to know the capacity of string buffer
	//that is 16 characters
	System.out.println(sb.length());//length of the string
	sb.append("mathi");//appends with the string
	System.out.println(sb);
	sb.replace(0, 4,"riya");//replace the string(start,end,replace)
	System.out.println(sb);
	System.out.println(sb.substring(0,4));//prints the substring (start,end-1)
	System.out.println(sb.delete(0, 5));//delete the string(start,end-1)
	 //Stringbuffer helps in string mutability
	//they are thread safe not affect the working of multiple threads
	//stringbuilder is also same as string buffer but they dont havethread safe and synchronisation
	
}
}
