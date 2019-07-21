package com.test.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	
	public static void main(String[] args) { 
		
		
		HashMap<String,Integer> colors = new  HashMap<String,Integer>();
		
		colors.put("Red", 1);
		colors.put("Blue", 5);
		colors.put("Green", 7);
		colors.put("Yellow", 10);
		colors.put("violet", 11);
		
		
		Set<Entry<String,Integer>> hmap = colors.entrySet();
		
		for(Entry<String,Integer> entry : hmap ){
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
}
