package org.howard.edu.hw2;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Assignment2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file = new File("src/main/resources/file.txt");//file to be read
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        //String fileName = "file.txt";
        //int wordCount = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {//takes in the file to be read
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Update the frequency of the word in the hash table
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);//adds word and frequency to the hash table
                }
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file " + file + ": " + e.getMessage());
        }
        
        //Print the entire hash table
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
    }
        
	}

