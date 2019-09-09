package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Usingcollection {
public static void main(String[] args) {
	String str= "thisisjavaprogram";
	ArrayList list = new ArrayList<>();
	
	for(int i=0; i<str.length(); i++)
	{
		
			list.add(str.charAt(i));
	}
	HashMap set = new HashMap<>();
	
	
	for(Object o:list)
	{	
	set.put(o,Collections.frequency(list, o));
	}
	
	System.out.println(set);
	
	
//	HashSet set = new HashSet<>();
//	for(int i=0; i<str.length(); i++)
//	{
//		int count=1;
//		
//			if(!set.add(str.charAt(i)))
//			{
//				count++;
//			}
//			System.out.println(count  +"----------"+str.charAt(i));
//	}
//	
}
}
