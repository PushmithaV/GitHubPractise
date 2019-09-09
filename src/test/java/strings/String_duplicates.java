package strings;

import java.util.HashMap;
import java.util.Set;

public class String_duplicates {
public static void main(String[] args) {
	String str= "thisisjavaprogram";
	HashMap< Character, Integer> hmap=new HashMap<>();
	
	for(int i=0; i<str.length(); i++)
	{
		char c = str.charAt(i);
		if(hmap.containsKey(c))
		{
			hmap.put(c,hmap.get(c)+1);
		}
		else
		{
			hmap.put(c, 1);
		}
			
	}
	Set<Character> key = hmap.keySet();
	for(Character o:key)
	{
		if(hmap.get(o)>1)
		{
			System.out.println(o+"--------"+hmap.get(o));
		}                               
	}
	
	System.out.println(hmap);
	
}
}
