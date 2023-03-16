package org.howard.edu.assignment5;

import java.util.ArrayList;
import java.util.List;

import javax.print.PrintException;

public class IntegerSet2 {
	private List<Integer> set;

	public IntegerSet2() {
		set = new ArrayList<Integer>();
	}

	public void clear() {
		set.clear();
	}

	public int length() {
		return set.size();
	}

	public boolean equals(IntegerSet2 b) throws PrintException{
		if (set.size() != b.length())
			return false;

		for (int i = 0; i < set.size(); i++) {
			if (!b.contains(set.get(i)))
				return false;
//			else {
//				throw new PrintException("error");
//			}
		}

		return true;
	}

	public boolean contains(int value) {
		return set.contains(value);
	}

	public int largest() throws PrintException {
		if (set.isEmpty())
			throw new PrintException("The set is empty!");

		int max = set.get(0);

		for (int i = 1; i < set.size(); i++) {
			if (set.get(i) > max)
				max = set.get(i);
		}

		return max;
	}

	public int smallest() throws PrintException {
		if (set.isEmpty())
			throw new PrintException("The set is empty!");

		int min = set.get(0);

		for (int i = 1; i < set.size(); i++) {
			if (set.get(i) < min)
				min = set.get(i);
		}

		return min;
	}

	public void add(int item) {
		if (!set.contains(item))
			set.add(item);
	}

	public void remove(int item) {
		set.remove(new Integer(item));
	}

	public void union(IntegerSet2 intSetb) throws PrintException{
		for (int i = 0; i < intSetb.length(); i++) {
			int item = intSetb.set.get(i);

			if (!set.contains(item))
				set.add(item);
//			else {
//				throw new PrintException("error");
//			}
		}
	}

	public void intersect(IntegerSet2 intSetb) throws PrintException{
		List<Integer> intersection = new ArrayList<Integer>();

		for (int i = 0; i < set.size(); i++) {
			if (intSetb.contains(set.get(i)))
				intersection.add(set.get(i));
//			else {
//				throw new PrintException("error");
//			}
		}

		set = intersection;
	}

	public void diff(IntegerSet2 intSetb) throws IntegerSetException{
		for (int i = 0; i < intSetb.length(); i++) {
			int item = intSetb.set.get(i);

			if (set.contains(item))
				set.remove(new Integer(item));
			else {
				throw new IntegerSetException("error");
			}
		}
	}

	public boolean isEmpty() {
		return set.isEmpty();
	}

	public String toString() {
		String result = "{";

		for (int i = 0; i < set.size(); i++) {
			result += set.get(i);

			if (i < set.size() - 1)
				result += ", ";
		}

		result += "}";

		return result;
	}
}
