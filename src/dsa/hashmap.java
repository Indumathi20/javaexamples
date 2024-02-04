package dsa;
import java.util.*;
public class hashmap {
public static void main(String[] args) {
	HashMap<String,Integer> maps = new HashMap<>();
	maps.put("indu", 2009);
	maps.put("nithu", 2873);
	maps.put("hina", 7346);
	System.out.println(maps);
	System.out.println(maps.get("indu"));//to get the value
	System.out.println(maps.containsKey("indu"));
	System.out.println(maps.containsValue(2009));
	maps.put("indu", 23455);//over write the current value and update the new
	System.out.println(maps);
	maps.replace("indu", 1234);
	System.out.println(maps);//will overwrite the value
	//only can replace the existing values pairs
	maps.putIfAbsent("meena", 6374);//if the value is absent update like this
	System.out.println(maps);
	maps.remove("indu");//it will remove the value
	System.out.println(maps);
}
}
