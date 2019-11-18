package com.java.example;

public class PalindromExamplr {

	public static void main(String[] args) {

		  String str = "geeks"; 
		 
       boolean d= isPalindrome(str);
       
	}

	private static boolean isPalindrome(String str) {
		System.out.println(str);
		 int i=0,j=str.length()-1;   
		 while (i<j) {
			  if(str.charAt(j)!=str.charAt(i)) {
				  return false; 
			  }
			  
			  i++;
			  j--;
			  
			  System.out.println(str.charAt(j)+""+str.charAt(i));
			
		}
		return true;
	}

}
