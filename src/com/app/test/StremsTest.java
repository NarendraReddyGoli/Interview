package com.app.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremsTest {
	public static void main(String[] args) {
		List<Student> studlist = new ArrayList<Student>();
		studlist.add(new Student(1, "John", "New York"));
		studlist.add(new Student(2, "Max", "California"));
		studlist.add(new Student(3, "Andrew", "Los Angeles"));
		studlist.add(new Student(4, "Michael", "New York"));
		studlist.add(new Student(5, "Sam", "California"));
		studlist.add(new Student(6, "Mark", "New York"));

		List<String> srlist = Arrays.asList("ram,seetha,lakshman,anjaneya".split(","));

		srlist.forEach(System.out::println);
		srlist.listIterator(3).forEachRemaining(System.out::println);

		Map<String, List<Student>> stuMap = studlist.stream().collect(Collectors.groupingBy(Student::getCource));

		System.out.println(stuMap);

		Stream<String> words = Stream.of("apple", "banana", "avocado", "berry", "cherry");

		Map<Character, List<String>> groupedByFirstLetter = words.collect(Collectors.groupingBy(s -> s.charAt(0)));
		System.out.println(groupedByFirstLetter);

		Stream<String> wordss = Stream.of("apple", "banana", "avocado", "berry", "cherry");

		Map<Boolean, List<String>> partitioned = wordss.collect(Collectors.partitioningBy(s -> s.length() > 5));

		System.out.println(partitioned);

	}
}
