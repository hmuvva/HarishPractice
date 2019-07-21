package com.test.prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolJava7 {
	
public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("harish","muvva",12),
				new Person("rakesh","LOki",18),
				new Person("poori","Cak",15),
				new Person("thor","Chris",16)
				);
		//sort List by LastName
		
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {

				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		//Create method prints all Elments in the list
		printAll(people);
		
		//Create method prints all elements last name with c
		printAllwithLastNameC(people);
	}

private static void printAll(List<Person> people){
	
	for(Person p: people){
		System.out.println(p);
	}
	
}
private static void printAllwithLastNameC(List<Person> people){
	
	for(Person p: people){
		if(p.getLastName().startsWith("C"))
		System.out.println("C Stuff ->"+p);
	}
}
}
