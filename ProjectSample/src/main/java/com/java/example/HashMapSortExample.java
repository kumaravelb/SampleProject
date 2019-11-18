package com.java.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapSortExample {

	public static void main(String[] args) {
		Map<Integer, String> idNameMap = new HashMap<Integer, String>();
        
        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");
        
        List<Entry<Integer, String>> sorted = new LinkedList(idNameMap.entrySet());     
        Collections.sort(sorted, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});  
        
        
        
        Map<Integer, String> sortedIdNameMap = new LinkedHashMap<Integer, String>();
        for (Entry<Integer, String> entry : sorted) {
        	sortedIdNameMap.put(entry.getKey(), entry.getValue());
		}
        
        System.out.println("not sorted collection list==>"+ idNameMap);
        System.out.println("after sorted collection"+sortedIdNameMap);
        
         Map<Integer, String> sortedMap= idNameMap.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2)->e1,LinkedHashMap:: new));
         
        	
         System.out.println(sortedMap);
        
        
        
        

	}

}
