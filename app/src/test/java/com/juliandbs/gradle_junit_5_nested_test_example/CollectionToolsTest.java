package com.juliandbs.gradle_junit_5_nested_test_example;

import com.juliandbs.gradle_junit_5_nested_test_example.CollectionTools;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.NoSuchElementException;

@DisplayName("CollectionTools Test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CollectionToolsTest {

	@Nested
	@DisplayName("Integer Order Numbers From Least To Greastest Method")
	public class IntegerOrderNumbersFromLeastToGreastest {

		@Test
		@Order(1)
		@DisplayName("Order Numbers From Least To Greatest | Throws Exactly NullPointerException With Message Test")
		public void orderNumbersFromLeastToGreatestThrowsExactlyWMTest() {
			assertThrowsExactly(NullPointerException.class, () -> {
				List<java.lang.Integer> result = CollectionTools.orderNumbersFromLeastToGreatest(null);
			}, "Null method parameter");
		}

		@Test
		@Order(2)
		@DisplayName("Order Numbers From Least To Greastest | Throw Exactly NullPointerException Test")
		public void orderNumbersFromLeasttoGreastestThrowsExactlyTest() {
			List<java.lang.Integer> example = Stream.of(6, 4, 5, 1, null, 2).collect(Collectors.toList());
			assertThrowsExactly(NullPointerException.class, () -> {
				List<java.lang.Integer> result = CollectionTools.orderNumbersFromLeastToGreatest(example);
			});
		}

		@Test
		@Order(3)
		@DisplayName("Order Numbers From Least To Greatest | Does Not Throw Test")
		public void orderNumbersFromLeastToGreatestDoesNotThrowTest() {
			List<java.lang.Integer> example = Stream.of(6, 4, 5, 1, 3, 2).collect(Collectors.toList());
			assertDoesNotThrow( () -> {
				List<java.lang.Integer> result = CollectionTools.orderNumbersFromLeastToGreatest(example);
			});
		}

		@Test
		@Order(4)
		@DisplayName("Order Numbers From Least To Greatest | Not Null Test")
		public void orderNumbersFromLeastToGreatestNotNullTest() {
			List<java.lang.Integer> example = Stream.of(6, 4, 5, 1, 3, 2).collect(Collectors.toList());
			assertNotNull(CollectionTools.orderNumbersFromLeastToGreatest(example));
		}

		@Test
		@Order(5)
		@DisplayName("Order Numbers From Least To Greatest | Equals Test")
		public void orderNumbersFromLeastToGreatestEqualsTest() {
			List<java.lang.Integer> example = Stream.of(6, 4, 5, 1, 3, 2).collect(Collectors.toList());
			List<java.lang.Integer> result = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList());
			assertEquals(result, CollectionTools.orderNumbersFromLeastToGreatest(example));
		}

		@Test
		@Order(6)
		@DisplayName("Order Numbers From Least To Greatest | Iterable Equals Test")
		public void orderNumbersFromLeastToGreatestIterableEqualsTest() {
			List<java.lang.Integer> example = Stream.of(6, 4, 5, 1, 3, 2).collect(Collectors.toList());
			List<java.lang.Integer> result = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList());
			assertIterableEquals(result, CollectionTools.orderNumbersFromLeastToGreatest(example));
		}
	}

	@Nested
	@DisplayName("Integer Order Numbers From Greatest To Least Method")
	public class IntegerOrderNumbersFromGreatestToLeast {

		@Test
		@Order(1)
		@DisplayName("Order Numbers From Greatest To Least | Throws Exactly NullPointerException With Message Test")
		public void orderNumbersFromGreatestToLeastThrowsExactlyWMTest() {
			assertThrowsExactly(NullPointerException.class , () -> {
				List<java.lang.Integer> result = CollectionTools.orderNumbersFromGreatestToLeast(null);
			}, "Null method parameter");
		}

		@Test
		@Order(2)
		@DisplayName("Order Numbers From Greatest to Least | Throws Exactly NullPointerException Test")
		public void orderNumbersFromGreatestToLeastThrowsExactlyTest() {
			List<java.lang.Integer> example = Stream.of(6, 4, 5, 1, null, 2).collect(Collectors.toList());
			assertThrowsExactly(NullPointerException.class, () -> {
				List<java.lang.Integer> result = CollectionTools.orderNumbersFromGreatestToLeast(example);
			});
		}

		@Test
		@Order(3)
		@DisplayName("Order Numbers From Greatest to Least | Does Not Throw Test")
		public void orderNumbersFromGreatestToLeastDoesNotThrowTest() {
			List<java.lang.Integer> example = Stream.of(6, 4, 5, 1, 3, 2).collect(Collectors.toList());
			assertDoesNotThrow( () -> {
				List<java.lang.Integer> result = CollectionTools.orderNumbersFromGreatestToLeast(example);
			});
		}

		@Test
		@Order(4)
		@DisplayName("Order Numbers From Greatest To Least | Not Null Test")
		public void orderNumbersFromGreatestToLeastNotNullTest() {
			List<java.lang.Integer> example = Stream.of(6, 4, 5, 1, 3, 2).collect(Collectors.toList());
			assertNotNull(CollectionTools.orderNumbersFromGreatestToLeast(example));
		}

		@Test
		@Order(5)
		@DisplayName("Order Numbers From Greatest To Least | Equals Test")
		public void orderNumbersFromGreatestToLeastEqualsTest() {
			List<java.lang.Integer> example = Stream.of(1, 3, 2, 5, 4, 6).collect(Collectors.toList());
			List<java.lang.Integer> result = Stream.of(6, 5, 4, 3, 2, 1).collect(Collectors.toList());
			assertEquals(result, CollectionTools.orderNumbersFromGreatestToLeast(example));
		}
		@Test
		@Order(6)
		@DisplayName("Order Numbers From Greatest To Least | Iterable Equals Test")
		public void orderNumbersFromGreatestToLeastIterableEqualsTest() {
			List<java.lang.Integer> example = Stream.of(1, 3, 2, 5, 4, 6).collect(Collectors.toList());
			List<java.lang.Integer> result = Stream.of(6, 5, 4, 3, 2, 1).collect(Collectors.toList());
			assertIterableEquals(result, CollectionTools.orderNumbersFromGreatestToLeast(example));
		}
	}

	@Nested
	@DisplayName("Integer Get Least Number From List Method")
	public class IntegerGetLeastNumberFromListTest {

		@Test
		@Order(1)
		@DisplayName("Get Least Number From List | Throws Exatcly NullPointerException With Message Test")
		public void getLeastNumberFromListThrowsExactlyNullPointerExceptionTest() {
			assertThrowsExactly(NullPointerException.class, () -> {
				java.lang.Integer result = CollectionTools.getLeastNumberFromList(null);
			}, "Null method parameter");
		}

		@Test
		@Order(2)
		@DisplayName("Get Least Number From List | Throws Exactly NoSuchElementException Test")
		public void getLeastNumberFromListThrowsExactlyNoSuchElementExceptionTest() {
			List<java.lang.Integer> example = new LinkedList<>();
			assertThrowsExactly(NoSuchElementException.class, () -> {
				java.lang.Integer result = CollectionTools.getLeastNumberFromList(example);
			});
		}

		@Test
		@Order(3)
		@DisplayName("Get Least Number From List | Does Not Throw Test")
		public void getLeastNumberFromListDoesNotThrowTest() {
			List<java.lang.Integer> example = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList());
			assertDoesNotThrow( () -> {
				java.lang.Integer result = CollectionTools.getLeastNumberFromList(example);
			} );
		}

		@Test
		@Order(4)
		@DisplayName("Get Least Number From List | Not Null Test")
		public void getLeastNumberFromListNotNullTest() {
			List<java.lang.Integer> example = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList());
			assertNotNull(CollectionTools.getLeastNumberFromList(example));
		}

		@Test
		@Order(5)
		@DisplayName("Get Least Number From List | Equals Test")
		public void getLeastNumberFromListEqualsTest() {
			List<java.lang.Integer> example = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList());
			java.lang.Integer result = 1;
			assertEquals(result, CollectionTools.getLeastNumberFromList(example));
		}

	}

	@Nested
	@DisplayName("Integer Get Greatest Number From List Method")
	public class IntegerGetGreatestNumberFromListTest {

		@Test
		@Order(1)
		@DisplayName("Get Greatest Number From List | Throws Exactly NullPointerException Test")
		public void getGreatestNumberFromListThrowsExactlyNullPointerExceptionTest() {
			assertThrowsExactly(NullPointerException.class, () -> {
				java.lang.Integer result = CollectionTools.getGreatestNumberFromList(null);
			}, "Null method parameter");
		}

		@Test
		@Order(2)
		@DisplayName("Get Greatest Number From List | Throws Exactly NoSuchElementException Test")
		public void getGreatestNumberFromListThrowsExactlyNoSuchElementExceptionTest() {
			List<java.lang.Integer> example = new LinkedList<>();
			assertThrowsExactly(NoSuchElementException.class, () -> {
				java.lang.Integer result = CollectionTools.getGreatestNumberFromList(example);
			});
		}

		@Test
		@Order(3)
		@DisplayName("Get Greatest Number From List | Does Not Throw Test")
		public void getGreatestNumberFromListDoesNotThrowTest() {
			List<java.lang.Integer> example = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList());
			assertDoesNotThrow( () -> {
				java.lang.Integer result = CollectionTools.getGreatestNumberFromList(example);
			} );
		}

		@Test
		@Order(4)
		@DisplayName("Get Greatest Number From List | Not Null Test")
		public void getGreatestNumberFromListNotNullTest() {
			List<java.lang.Integer> example = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList());
			assertNotNull(CollectionTools.getGreatestNumberFromList(example));
		}

		@Test
		@Order(5)
		@DisplayName("Get Greatest Number From List | Equals Test")
		public void getGreatestNumberFromListEqualsTest() {
			List<java.lang.Integer> example = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList());
			java.lang.Integer result = 6;
			assertEquals(result, CollectionTools.getGreatestNumberFromList(example));
		}
	}
}
