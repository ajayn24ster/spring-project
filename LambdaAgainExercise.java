package com.example.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaAgainExercise {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person(1, "Payal", "kop"), new Person(2, "Ajay", "Pune"),
				new Person(3, "Vivan", "kop"));
		Collections.sort(personList, ( p1, p2)->p1.getName().compareTo(p2.getName()));
		personList.forEach((p)->{printPerson((p1)->p1.getName().startsWith("A"),(p1)->System.out.println(p1.getName()),p);});
		
	}
	public static void printPerson(Predicate<Person> p,Consumer<Person> c,Person pe){
		if(p.test(pe)) {
			c.accept(pe);
		}
	}
}
