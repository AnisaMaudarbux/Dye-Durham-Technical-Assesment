package com.example;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class nameSorter {

    public static void sortLast(ArrayList<String> fullName ) {
		//comparing 2 values
        Collections.sort(fullName, (o1, o2) -> {
            String[] split1 = o1.split(" ");
            String[] split2 = o2.split(" ");
			//splitting the array to find the first name and second name
            String lastName1 = split1[1];
            String lastName2 = split2[1];
			//comparing lasts name to find alphabetical order
            if (lastName1.compareTo(lastName2) > 0) {
                return 0;
            } else {
                return -1;
            }
        });
		//Console output
        System.out.println(fullName);
		//Textfile output
		   try (PrintWriter out = new PrintWriter("sorted-names-list.txt")) {
			out.println(fullName);	
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
  }
//array
    public static void main(String[] args) {
        ArrayList<String> fullName = new ArrayList<String>();
        fullName.add("Janet Parsons");
        fullName.add("Vaugh Lewis");
        fullName.add("Adonis Julius Archer");
        fullName.add("Shelby Nathan Yoder");
		fullName.add("Marin Alvarez");
        fullName.add("London Lindsey");
        fullName.add("Beau Tristan Bentley");
        fullName.add("Leo Gardner");
		fullName.add("Hunter Uriah Mathew Clarke");
        fullName.add("Mikayla Lopez");
        fullName.add("Frankie Conner Ritter");
        System.out.println("Sorted using Last Name");
        sortLast(fullName);
    }
  }
