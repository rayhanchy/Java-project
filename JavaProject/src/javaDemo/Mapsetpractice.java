package javaDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mapsetpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<String,Double> dd = new LinkedHashMap <String, Double>();
		Map<String, Double> dd = new TreeMap<String, Double>();
		
		dd.put("Obama    "  ,5000.07);
		dd.put("Clinton   ", 3000.10);
		dd.put("Boris   ",   2000.15);
		dd.put("Moris   ",   60002.37);
		dd.put("Trump   ",   7000.40);
		dd.put("Modi   ",    6000.20);
		
		for(Entry<String, Double>eachdd : dd.entrySet()) 
		{System.out.println(eachdd.getKey()+ "------" + eachdd.getValue());}
		
		System.out.println(dd.containsKey("Obama  "));
		System.out.println(dd.containsValue(2000.15));
		System.out.println(dd.get("Trump"));
		
	}

}
