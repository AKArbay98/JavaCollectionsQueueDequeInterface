package dequeinterface;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		Deque<String> citiesOfUSA = new ArrayDeque<String>();

		// add
		System.out.println(citiesOfUSA);
		citiesOfUSA.add("New York City");
		citiesOfUSA.add("Los Angeles");
		citiesOfUSA.add("Chicago");
		citiesOfUSA.add("Houston");
		citiesOfUSA.add("Phoenix");
		citiesOfUSA.add("Philadelphia");
		System.out.println(citiesOfUSA);

		// addAll
		String[] moreCities = { "Dallas", "San Antonio", "San Diego" };
		citiesOfUSA.addAll(Arrays.asList(moreCities));
		System.out.println(citiesOfUSA);

		// addFirst
		citiesOfUSA.addFirst("Oklohoma City");
		System.out.println(citiesOfUSA);

		// addLast
		citiesOfUSA.addLast("Seattle");
		System.out.println(citiesOfUSA);

		// contains
		boolean isContainsCity = citiesOfUSA.contains("Dallas");
		System.out.println(isContainsCity);

		// containsAll
		String[] someCities = { "Houston", "Los Angeles" };
		boolean isContainsAll = citiesOfUSA.containsAll(Arrays.asList(someCities));
		System.out.println(isContainsAll);

		// descendingIterator
		Iterator<String> descendingIterator = citiesOfUSA.descendingIterator();

		while (descendingIterator.hasNext()) {
			String next = descendingIterator.next();
			System.out.println(next);
		}

		// element
		String element = citiesOfUSA.element();
		System.out.println(element);

		// isEmpty
		boolean isEmpty = citiesOfUSA.isEmpty();
		System.out.println(isEmpty);

		// size
		int size = citiesOfUSA.size();
		System.out.println(size);

		// toArray
		Object[] array = citiesOfUSA.toArray();
		System.out.println(array);

		// toString
		String string = citiesOfUSA.toString();
		System.out.println(string);

		// forEach
		citiesOfUSA.forEach(city -> System.out.println(city));

		// stream
		Stream<String> cityStream = citiesOfUSA.stream();
		List<String> list = cityStream.filter(city -> city.startsWith("C")).toList();
		System.out.println(list);

		// getFirst
		String firstElement = citiesOfUSA.getFirst();
		System.out.println(firstElement);

		// getLast
		String lastElement = citiesOfUSA.getLast();
		System.out.println(lastElement);

		// iterator
		Iterator<String> iteratorOfCity = citiesOfUSA.iterator();

		while (iteratorOfCity.hasNext()) {
			String city = iteratorOfCity.next();
			System.out.println(city);
		}

		// offer
		boolean isOffer = citiesOfUSA.offer("Austin");
		System.out.println(isOffer);
		System.out.println(citiesOfUSA);

		// offerFirst
		citiesOfUSA.offerFirst("Detroit");
		System.out.println(citiesOfUSA);

		// offerLast
		citiesOfUSA.offerLast("Portland");
		System.out.println(citiesOfUSA);

		// peek
		String peekOfCities = citiesOfUSA.peek();
		System.out.println(peekOfCities);

		// peekFirst
		String peekFirst = citiesOfUSA.peekFirst();
		System.out.println(peekFirst);

		// peekLast
		String peekLast = citiesOfUSA.peekLast();
		System.out.println(peekLast);

		// poll
		String poll = citiesOfUSA.poll();
		System.out.println(poll);
		System.out.println(citiesOfUSA);

		// pollFirst
		citiesOfUSA.pollFirst();
		System.out.println(citiesOfUSA);

		// pollLast
		citiesOfUSA.pollLast();
		System.out.println(citiesOfUSA);

		// pop
		citiesOfUSA.pop();
		System.out.println(citiesOfUSA);

		// push
		citiesOfUSA.push("Boston");
		System.out.println(citiesOfUSA);

		// remove
		citiesOfUSA.remove();
		System.out.println(citiesOfUSA);

		// remove(Object o)
		System.out.println(citiesOfUSA);
		citiesOfUSA.remove("Dallas");
		System.out.println(citiesOfUSA);

		// removeFirst
		String removeFirst = citiesOfUSA.removeFirst();
		System.out.println(removeFirst);
		System.out.println(citiesOfUSA);

		// removeLast
		String removeLast = citiesOfUSA.removeLast();
		System.out.println(removeLast);
		System.out.println(citiesOfUSA);

		// removeFirstOccurrence
		boolean removeFirstOccurrence = citiesOfUSA.removeFirstOccurrence("Chicago");
		System.out.println(removeFirstOccurrence);
		System.out.println(citiesOfUSA);

		// removeLastOccurrence
		boolean removeLastOccurrence = citiesOfUSA.removeLastOccurrence("Portland");
		System.out.println(removeLastOccurrence);
		System.out.println(citiesOfUSA);

		// removeIf
		citiesOfUSA.removeIf(city -> city.startsWith("C"));
		System.out.println(citiesOfUSA);

		// removeAll
		citiesOfUSA.removeAll(citiesOfUSA.stream().filter(city -> city.startsWith("P")).toList());
		System.out.println(citiesOfUSA);

		// clear
		citiesOfUSA.clear();
		System.out.println(citiesOfUSA);

	}

}
