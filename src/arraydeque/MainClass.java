package arraydeque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		ArrayDeque<Integer> plateCode = new ArrayDeque<>();

		// add
		System.out.println(plateCode);
		plateCode.add(77);
		plateCode.add(34);
		plateCode.add(36);
		plateCode.add(25);
		plateCode.add(11);
		plateCode.add(63);
		System.out.println(plateCode);

		// addFirst
		plateCode.addFirst(33);
		System.out.println(plateCode);

		// addLast
		plateCode.addLast(66);
		System.out.println(plateCode);

		// addAll
		List<Integer> newPlateCode = List.of(79, 80, 81);
		plateCode.addAll(newPlateCode);
		System.out.println(plateCode);

		// getFirst
		Integer firstElement = plateCode.getFirst();
		System.out.println(firstElement);

		// getLast
		Integer lastElement = plateCode.getLast();
		System.out.println(lastElement);

		// contains
		boolean isContainsPlateCode = plateCode.contains(36);
		System.out.println(isContainsPlateCode);
		System.out.println(plateCode);

		// containsAll
		List<Integer> contains = List.of(77, 34);
		plateCode.containsAll(contains);
		System.out.println(plateCode);

		// descendingIterator
		Iterator<Integer> descendingIterator = plateCode.descendingIterator();

		while (descendingIterator.hasNext()) {
			Integer next = descendingIterator.next();
			System.out.println(next);
		}

		// element
		Integer element = plateCode.element();
		System.out.println(element);
		System.out.println(plateCode);

		// forEach
		plateCode.forEach(plate -> plate.doubleValue());

		// isEmpty
		boolean empty = plateCode.isEmpty();
		System.out.println(empty);
		System.out.println(plateCode);

		// iterator
		Iterator<Integer> iteratorPlate = plateCode.iterator();

		while (iteratorPlate.hasNext()) {
			Integer next = iteratorPlate.next();
			System.out.println(next);
		}

		// offer
		boolean offer = plateCode.offer(44);
		System.out.println(offer);
		System.out.println(plateCode);

		// offerFirst
		boolean offerFirst = plateCode.offerFirst(23);
		System.out.println(offerFirst);
		System.out.println(plateCode);

		// offerLast
		boolean offerLast = plateCode.offerLast(14);
		System.out.println(offerLast);
		System.out.println(plateCode);

		// peek
		Integer peek = plateCode.peek();
		System.out.println(peek);
		System.out.println(plateCode);

		// peekFirst
		Integer peekFirst = plateCode.peekFirst();
		System.out.println(peekFirst);
		System.out.println(plateCode);

		// peekLast
		Integer peekLast = plateCode.peekLast();
		System.out.println(peekLast);
		System.out.println(plateCode);

		// poll
		Integer poll = plateCode.poll();
		System.out.println(poll);
		System.out.println(plateCode);

		// pollFirst
		Integer pollFirst = plateCode.pollFirst();
		System.out.println(pollFirst);
		System.out.println(plateCode);

		// pollLast
		Integer pollLast = plateCode.pollLast();
		System.out.println(pollLast);
		System.out.println(plateCode);

		// pop
		Integer pop = plateCode.pop();
		System.out.println(pop);
		System.out.println(plateCode);

		// push
		plateCode.push(5);
		System.out.println(plateCode);

		// remove
		Integer remove = plateCode.remove();
		System.out.println(remove);
		System.out.println(plateCode);

		// remove
		boolean remove2 = plateCode.remove(6);
		System.out.println(remove2);
		System.out.println(plateCode);

		// removeAll
		Integer[] elementsToRemove = { 34, 25, 63 };
		plateCode.removeAll(Arrays.asList(elementsToRemove));
		System.out.println(plateCode);

		// removeFirst
		Integer removeFirst2 = plateCode.removeFirst();
		System.out.println(removeFirst2);
		System.out.println(plateCode);

		// removeLast
		Integer removeLast2 = plateCode.removeLast();
		System.out.println(removeLast2);
		System.out.println(plateCode);

		// removeFirstOccurrence
		plateCode.removeFirstOccurrence(80);
		System.out.println(plateCode);

		// removeLastOccurrence
		plateCode.removeLastOccurrence(81);
		System.out.println(plateCode);

		// removeIf
		boolean removeIf = plateCode.removeIf(e -> e > 50);
		System.out.println(removeIf);
		System.out.println(plateCode);

		// size
		int size = plateCode.size();
		System.out.println(size);

		// stream
		Optional<Integer> firstFirst = plateCode.stream().findFirst();
		System.out.println(firstFirst);

		// toArray
		Object[] array = plateCode.toArray();
		System.out.println(array);

		// toString
		String string = plateCode.toString();
		System.out.println(string);

		// removeFirst
		Integer removeFirst = plateCode.removeFirst();
		System.out.println(removeFirst);
		System.out.println(plateCode);

		// removeLast
		if (!plateCode.isEmpty()) {
			Integer removeLast = plateCode.removeLast();
			System.out.println(removeLast);
			System.out.println(plateCode);
		} else {
			System.out.println("Deque is empty, cannot removeLast()");
		}

		// clear
		plateCode.clear();
		System.out.println(plateCode);

	}

}
