package org.howard.edu.lsp.assignment4;

import javax.print.PrintException;

public class Driver {
    public static void main(String[] args) {
        // create two IntegerSet objects
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // add elements to set1
        set1.add(1);
        set1.add(3);
        set1.add(5);
        System.out.println("set1: " + set1.toString());

        // add elements to set2
        set2.add(2);
        set2.add(4);
        set2.add(6);
        System.out.println("set2: " + set2.toString());

        // test length() method
        System.out.println("set1 length: " + set1.length());
        System.out.println("set2 length: " + set2.length());

        // test contains() method
        System.out.println("set1 contains 3: " + set1.contains(3));
        System.out.println("set2 contains 3: " + set2.contains(3));

        // test smallest() and largest() methods
        try {
			System.out.println("smallest value in set1: " + set1.smallest());
		} catch (PrintException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			System.out.println("largest value in set2: " + set2.largest());
		} catch (PrintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // test union() method
        set1.union(set2);
        System.out.println("union of set1 and set2: " + set1.toString());

        // test intersect() method
        set1.intersect(set2);
        System.out.println("intersection of set1 and set2: " + set1.toString());

        // test diff() method
        set1.diff(set2);
        System.out.println("set1 - set2: " + set1.toString());

        // test clear() method
        set1.clear();
        System.out.println("set1 after clear: " + set1.toString());

        // test isEmpty() method
        System.out.println("is set1 empty? " + set1.isEmpty());
        System.out.println("is set2 empty? " + set2.isEmpty());
    }
}
