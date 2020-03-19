package com.example.demos;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		
		System.out.println(sortString("When not studying nuclear physics, Bambi likes to play beach volleyball."));
		    
	}
	
	static char[] sortString(String inputString) {
		 
		// remove punctuation

		String  stringWithoutPunc = inputString.replaceAll("\\p{Punct}", "");
		    
	    //remove whitespace
		String  stringWithoutWhiteSpace = stringWithoutPunc.replaceAll("\\s+", "");
		   
		 //change to lowercase

		String  stringWithLowercase = stringWithoutWhiteSpace.toLowerCase();

		 // sort string alphabetically

		  char[] arr = stringWithLowercase.toCharArray();
		    
		  Arrays.sort(arr);
		  
		  return arr;
		
	}

}
