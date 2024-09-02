package section1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class Q3DuplicateCharacter {

	public static void main(String x[]) {
		
//		Scanner k=new Scanner(System.in);
//		System.out.println("Enter String:- ");
//		String str=k.next();
		
		String str="Chandrashekhar";
		System.out.println("input string:- "+str);
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			
			hm.put(ch[i], hm.getOrDefault(ch[i], 0)+1);
		}
		
		Set<Map.Entry<Character, Integer>> st=hm.entrySet();
		for(Map.Entry<Character, Integer> val:st) {
			if(val.getValue()>1) {
				System.out.println("dupicate Character :- "+val.getKey());
			}
		}
	}
	
}
