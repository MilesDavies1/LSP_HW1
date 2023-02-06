package org.howard.edu.hw2;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Assignment2 {
	  public static void main(String[] args) {
	    // Create a hash table to store words and their frequencies
	    HashMap<String, Integer> wordFrequency = new HashMap<>();
	    String fileName = "src/main/resources/file.txt";
	    
	    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	      String line;
	      while ((line = reader.readLine()) != null) {
	        // Split the line into words
	        String[] words = line.split("\\s+");
	        for (String word : words) {
	          // Normalize the word to lowercase and remove numbers and punctuation
	          word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
	          
	          // Update the frequency of the word in the hash table
	          wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
	        }
	      }
	    } catch (IOException e) {
	      System.out.println("Error");
	    }
	    
	    // Print the hash table
	    for (String word : wordFrequency.keySet()) {
	        System.out.println(word + " " + wordFrequency.get(word));
	    }
	  }
	}

