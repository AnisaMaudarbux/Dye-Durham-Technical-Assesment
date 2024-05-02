package com.example;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class nameSorter {

    private String fullName;

    public static void sortLast(ArrayList<String> fullName ) {
		//comparing 2 values
        fullName.sort((o1, o3) -> {
            String[] split1 = o1.split(" ");
            String[] split3 = o3.split(" ");
            //splitting the array to find the first name and second name
            String lastName1 = split1[1];
            String lastName2 = split3[1];
            //comparing lasts name to find alphabetical order
            if (lastName1.compareTo(lastName2) > 0) {
                return 0;
            } else {
                return -1;
            }
        });
  }
    //array
    private static ArrayList<String> getStrings() {
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
        sortLast(fullName);
        return fullName;
    }

    public void printer() {
        ArrayList<String> fullName = getStrings();
        System.out.println("Sorted using Last Name");
        System.out.println(fullName);
        //Text file output
        try (PrintWriter out = new PrintWriter("sorted-names-list.txt")) {
            out.println(fullName);
            out.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    }