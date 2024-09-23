package queueinterface;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		Queue<String> citiesOfUSA = new ArrayDeque<>();

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

		// contains
		boolean isContainsCity = citiesOfUSA.contains("Dallas");
		System.out.println(isContainsCity);

		// containsAll
		String[] someCities = { "Houston", "Los Angeles" };
		boolean isContainsAll = citiesOfUSA.containsAll(Arrays.asList(someCities));
		System.out.println(isContainsAll);

		// element
		String element = citiesOfUSA.element();
		System.out.println(element);

		// isEmpty
		boolean isEmpty = citiesOfUSA.isEmpty();
		System.out.println(isEmpty);

		// size
		int size = citiesOfUSA.size();
		System.out.println(size);

		// hashCode
		int hashCode = citiesOfUSA.hashCode();
		System.out.println(hashCode);

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

		// peek
		String peekOfCities = citiesOfUSA.peek();
		System.out.println(peekOfCities);

		// poll
		String pollCities = citiesOfUSA.poll();
		System.out.println(pollCities);
		System.out.println(citiesOfUSA);

		// remove
		System.out.println(citiesOfUSA);
		citiesOfUSA.remove("Dallas");
		System.out.println(citiesOfUSA);

		// remove
		citiesOfUSA.remove();
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
