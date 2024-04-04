//Q4:Write a Java Program to find the duplicate characters in a string.

package BasicProgram;

import java.util.Scanner;

public class DuplicateCharacter {
	
	    
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        String str = "";
	        System.out.println("enter String:");
	        str=sc.nextLine();
	        findDuplicateCharacters(str);
	    }
	    
	    public static void findDuplicateCharacters(String str) {
	       
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            int count = 0;
	            
	            
	            for (int j = 0; j < str.length(); j++) {
	                if (currentChar == str.charAt(j)) {
	                    count++;
	                }
	            }
	            
	            
	            if (count > 1) {
	                System.out.println(currentChar + " : " + count);
	            }
	        }
	    }
	}

