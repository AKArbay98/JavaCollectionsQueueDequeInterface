package blockingdequeinterface;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		// constructor
		int capacity = 15;
		BlockingDeque<String> citiesOfUSA = new LinkedBlockingDeque<>(capacity);

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
		int lastCapacity = 3;
		BlockingDeque<String> moreCities = new LinkedBlockingDeque<>(lastCapacity);
		moreCities.add("Dallas");
		moreCities.add("San Antonio");
		moreCities.add("San Diego");
		citiesOfUSA.addAll(moreCities);
		System.out.println(citiesOfUSA);

		// addFirst
		citiesOfUSA.addFirst("Montgomery");
		System.out.println(citiesOfUSA);

		// addLast
		citiesOfUSA.addLast("Louisville");
		System.out.println(citiesOfUSA);

		// contains
		boolean isContainsCity = citiesOfUSA.contains("Dallas");
		System.out.println(isContainsCity);

		// containsAll
		int capacityOfNew = 2;
		BlockingDeque<String> citiesInTexas = new LinkedBlockingDeque<>(capacityOfNew);
		citiesInTexas.add("Houston");
		citiesInTexas.add("Austin");
		boolean isContainsAll = citiesOfUSA.containsAll(citiesInTexas);
		System.out.println(isContainsAll);

		// element
		String element = citiesOfUSA.element();
		System.out.println("Element is: " + element);

		// isEmpty
		boolean isEmpty = citiesOfUSA.isEmpty();
		System.out.println("Is Empty: " + isEmpty);

		// size
		int size = citiesOfUSA.size();
		System.out.println("Size: " + size);

		// hashCode
		int hashCode = citiesOfUSA.hashCode();
		System.out.println("HashCode: " + hashCode);

		// toArray
		Object[] array = citiesOfUSA.toArray();
		System.out.println("Array is: " + array);

		// toString
		String string = citiesOfUSA.toString();
		System.out.println("String is: " + string);

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
		boolean isOffer = citiesOfUSA.offer("Arlington");
		System.out.println(isOffer);
		System.out.println(citiesOfUSA);

		// peek
		String peekOfCities = citiesOfUSA.peek();
		System.out.println(peekOfCities);

		// poll
		String pollCities = citiesOfUSA.poll();
		System.out.println(pollCities);
		System.out.println(citiesOfUSA);

		// put
		int newCapacity = 5;
		BlockingQueue<String> moreCitiesOfUSA = new ArrayBlockingQueue<>(newCapacity);
		try {
			moreCitiesOfUSA.put("New York City");
			moreCitiesOfUSA.put("Los Angeles");
			moreCitiesOfUSA.put("Chicago");
			moreCitiesOfUSA.put("Houston");
			moreCitiesOfUSA.put("Phoenix");
			moreCitiesOfUSA.put("Philadelphia");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// getFirst
		String firstCitiesOfUSA = citiesOfUSA.getFirst();
		System.out.println("Get First: " + firstCitiesOfUSA);

		// getLast
		String lastCitiesOfUSA = citiesOfUSA.getLast();
		System.out.println("Get Last: " + lastCitiesOfUSA);

		// take
		String take = citiesOfUSA.take();
		System.out.println("Take: " + take);

		// takeFirst
		String takeFirst = citiesOfUSA.takeFirst();
		System.out.println("Take First: " + takeFirst);

		// takeLast
		String takeLast = citiesOfUSA.takeLast();
		System.out.println("Take Last: " + takeLast);

		// remainingCapacity
		int remainingCapacity = citiesOfUSA.remainingCapacity();
		System.out.println(remainingCapacity);

		// peekFirst
		String peekFirst = citiesOfUSA.peekFirst();
		System.out.println(peekFirst);

		// peekLast
		String peekLast = citiesOfUSA.peekLast();
		System.out.println(peekLast);

		// pollFirst
		String pollFirst = citiesOfUSA.pollFirst();
		System.out.println(pollFirst);

		// pollLast
		String pollLast = citiesOfUSA.pollLast();
		System.out.println(pollLast);

		// pop
		String pop = citiesOfUSA.pop();
		System.out.println(pop);

		// remove
		System.out.println(citiesOfUSA);
		String remove = citiesOfUSA.remove();
		System.out.println(remove);
		System.out.println(citiesOfUSA);

		// remove
		System.out.println(citiesOfUSA);
		citiesOfUSA.remove("Dallas");
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
