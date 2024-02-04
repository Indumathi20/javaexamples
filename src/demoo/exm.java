package demoo;
import java.util.*;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class exm {
	
	    public static void main(String[] args) {
	        String word = "PROGRAM";

	        for (int i = 0; i < word.length(); i++) {
	            for (int j = 0; j < word.length(); j++) {
	                if (i == j || i + j == word.length() - 1) {
	                    System.out.print(word.charAt(i));
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	    

}