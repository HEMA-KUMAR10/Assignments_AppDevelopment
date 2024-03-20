package com.Array;

public class CheckX {
       static boolean check(String str) {
    	   char x = 'a';
    	    for(int i=0;i<str.length();i++) {
    	    	 if(str.charAt(i) == x) {
    	    		  return true;
    	    	 }
    	    }
    	    return false;
       }	
	
	
	public static void main(String[] args) {
		String[] words = { "abc","bcd","aaaa","cbc"};
		for(int i=0; i<words.length; i++) {
			if(check(words[i])==true) {
				 System.out.print(i + " ");
			}
			 
		}

	}

}
