package com.juliandbs.gradle_junit_5_nested_test_example;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.Collections;

import java.lang.NullPointerException;
import java.util.NoSuchElementException;

public class CollectionTools {

	public static List<Integer> orderNumbersFromLeastToGreatest(List<Integer> numberList) throws NullPointerException {
		if (numberList == null)
			throw new NullPointerException("Null method parameter");
		return numberList.stream().sorted().collect(Collectors.toCollection(LinkedList<Integer>::new));
	}

	public static List<Integer> orderNumbersFromGreatestToLeast(List<Integer> numberList) throws NullPointerException {
		if (numberList == null)
			throw new NullPointerException("Null method parameter");
		return numberList.stream().sorted().sorted(Collections.reverseOrder()).collect(Collectors.toCollection(LinkedList<Integer>::new));
	}

	public static Integer getLeastNumberFromList(List<Integer> numberList) throws NullPointerException, NoSuchElementException {
		if (numberList == null)
			throw new NullPointerException("Null method parameter");
		return numberList.stream().mapToInt(n -> n).min().orElseThrow(NoSuchElementException::new);
	}

	public static Integer getGreatestNumberFromList(List<Integer> numberList) throws NullPointerException, NoSuchElementException {
		if (numberList == null)
			throw new NullPointerException("Null method parameter");
		return numberList.stream().mapToInt(n -> n).max().orElseThrow(NoSuchElementException::new);
	}
}
