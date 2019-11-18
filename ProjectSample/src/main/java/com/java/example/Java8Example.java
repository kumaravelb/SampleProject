package com.java.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Example {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Charlie");
		names.add("Douglas");
		names.add("Sundaraman");
		names.add("Charlie");
		names.add("Yuki");
		names.set(1, "Kumaravel");
		names.forEach(s -> {
			System.out.println(s);
		});
		
		long cout=names.stream().filter(s->s.length()<6).count();
		System.out.println("cout-->"+cout);
	
		names.stream().distinct().forEach(System.out::println);
		
		List<Integer> sample = Arrays.asList(4, 2, 8, 9, 5, 6, 7);
		Stream<Integer> s = sample.stream().filter(ss -> ss < 5);
		s.forEach(System.out::println);
		
		List<String> alphabets = Arrays.asList("A","B","C");
		//list 2
		List<String> namess = Arrays.asList("Sansa","Jon","Arya");
		
		Stream<String> als=Stream.concat(alphabets.stream(), namess.stream());
		List<String> dis=als.collect(Collectors.toList());
		dis.forEach(System.out::println);
		
		List<String> result=dis.stream().filter(d->!d.equals("A")).collect(Collectors.toList());
		result.forEach(dd->{
			System.out.println(dd);
		});
		
		String f="I Love Java 8 Stream!";
		String [] g=Arrays.stream(f.split("\\s+")).map(String::toUpperCase).toArray(String[]::new);
		for(String ddd:g) {
			System.out.println(ddd);
			
		}
		
		
		
		
		
		

	}

}
