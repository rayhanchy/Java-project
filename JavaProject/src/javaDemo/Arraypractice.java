package javaDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//List<String> names = new ArrayList<String>(); 
		Set<String>names = new LinkedHashSet<String>();
				
			
		names.add("Obama");
		names.add("Clinton");
		names.add("Muzib");
		names.add("Zia");
		names.add("Ershad");
		names.add("khaled");
		names.add("Faisal");
		names.add("Aziz");
		names.add("Nahyan");
		
		
		/*System.out.println(names);
		names.remove("Muzib");
		System.out.println(names);
		System.out.println(names.contains("rayhan"));
		*/
		
	for(String eachname : names) 
	{System.out.println(eachname);	}
	//names.clear();
	//System.out.println(names.isEmpty());
	
	
	
		
		}
	}
	


	 
	


