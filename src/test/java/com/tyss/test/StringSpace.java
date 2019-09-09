package com.tyss.test;

public class StringSpace {
public static void main(String[] args) {
	String str="This is java";
	//String sb= str.re
	int index=0;
	
	while((index = str.indexOf(" ", index))!=-1)
	{
		System.out.println(index);
		index++;
	}
	
	//System.out.println(index);
}
}
