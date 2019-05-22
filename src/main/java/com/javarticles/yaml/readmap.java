package com.javarticles.yaml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class readmap {
	public static void main(String[] args) throws FileNotFoundException {
	    Scanner scanner = new Scanner(new FileReader("/Users/praveena.c/Documents/praveenbhat/readfile.txt"));
	    Map<String, Person> personMap = new LinkedHashMap<String, Person>();
	    Map<String, Car> automobilMap = new LinkedHashMap<String, Car>();
	    String line;

	    while (scanner.hasNextLine()) {
	        line = scanner.nextLine();
	        if(line.equals("#Person")){
	            String primaryKey = scanner.nextLine().split("=")[1];
	            String sex = scanner.nextLine().split("=")[1];
	            String years = scanner.nextLine().split("=")[1];
	            String name = scanner.nextLine().split("=")[1];
	            personMap.put(primaryKey, new Person(sex,years,name));
	        }
	        if(line.equals("#Automobil")){
	            String primaryKey = scanner.nextLine().split("=")[1];
	            String make = scanner.nextLine().split("=")[1];
	            String type = scanner.nextLine().split("=")[1];
	            automobilMap.put(primaryKey, new Car(make,type));
	        }

	    }

	    Set<String> personKeys = personMap.keySet();
	    Set<String> automobilKeys = automobilMap.keySet();

	    for(String k : personKeys){
	        System.out.println("Person: "+k);
	        System.out.println(personMap.get(k));
	    }

	    for(String k : automobilKeys){
	        System.out.println("Car: "+k);
	        System.out.println(automobilMap.get(k));
	    }
	}
}


