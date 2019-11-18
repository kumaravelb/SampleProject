package com.java.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>(2);
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Bangalore");
        cityList.add("Istanbul");
        cityList.add("Delhi");
        cityList.add("Houston");
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Bangalore");
        cityList.add("Istanbul");
        cityList.add("Delhi");
        cityList.add("Houston");
        System.out.println("Original List- ");
        cityList.removeAll(cityList);
        System.out.println("Original List- "+cityList.size());
	}

}
