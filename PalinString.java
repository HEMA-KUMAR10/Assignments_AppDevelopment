package com.Array;

public class PalinString {
	static boolean palinCheck(String str){
	       int i =0, j=str.length()-1;
	       while(i<j) {
	    	    if(str.charAt(i)!=str.charAt(j)) {
	    	    	 return false;
	    	    }
	    	    i++;
	    	    j--;
	       }
	       return true;
	}
	
	
	
	

	public static void main(String[] args) {
		String[] words = {"abc","bcd","aba","cfg","madam"};
		int len = words.length;
		for(int i=0; i<len; i++) {
			 if(palinCheck(words[i]) == true) {
				  System.out.println("The First Palindrome is: " + words[i]);
				  break;
			 }
			 
		}
		

	}

}
