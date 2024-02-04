package dsa;
	import java.util.*;

public class arraylist2d {
	public static void main(String[] args) {
			   ArrayList<ArrayList<String>> grocery = new ArrayList();
			ArrayList<String>  veg = new ArrayList();
			veg.add("tomato");
			veg.add("potato");
			veg.add("carrot");
			//System.out.println(veg);//otp as [tomato, potato, carrot]
			ArrayList<String>  fruit = new ArrayList();
			fruit.add("papaya");
			fruit.add("grape");

			ArrayList<String>  choco = new ArrayList();
			choco.add("eclairs");
			choco.add("dairy milk");

			grocery.add(veg);
			grocery.add(fruit);
			grocery.add(choco);
			System.out.println(grocery);
			System.out.println(grocery.get(0));//to reterive the first list
			System.out.println(grocery.get(0).get(1));//to reterive element in 0,1 index in 2d

			}
	}

