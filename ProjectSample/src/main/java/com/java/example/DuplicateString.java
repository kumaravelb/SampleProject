package com.java.example;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "helloeh";
		
		char[] array = s.toCharArray();
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if(array[i] == array[j])
				{
					System.out.println("Duplicate - "+array[i]);
					break;
				}
			}
		}

	}

}
