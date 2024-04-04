//Q3:Write a Java Program to count the number of words in a string using HashMap.

package BasicProgram;

import java.util.HashMap;

public class Wordcount {
	
	    public static void main(String[] args) {
	        String text = "My name prashant demonstrate word count using HashMap in Java";

	        text = text.trim();

	        // Split the text into words using whitespace as delimiter
	        String[] words = text.split("\\s+");

	        HashMap<String, Integer> wordCountMap = new HashMap<>();

	      
	        for (String word : words) {
	           
	            word = word.toLowerCase();

	           
	            if (wordCountMap.containsKey(word)) {
	                int count = wordCountMap.get(word);
	                wordCountMap.put(word, count + 1);
	            }
	        
	            else {
	                wordCountMap.put(word, 1);
	            }
	        }

	   
	        System.out.println("Word Count:");
	        for (String word : wordCountMap.keySet()) {
	            System.out.println(word + ": " + wordCountMap.get(word));
	        }
	    }
	}



