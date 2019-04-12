package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog1 = new Animal("Tom", 4);
		Animal dog2 = new Animal("Biscuit", 4);
		Animal dog3 = new Animal("Cookies", 4);
		Animal dog4 = new Animal("Cookies", 4);
		Animal dog5 = new Animal("Biscuit", 4);
		
		ArrayList<Animal> dogList = new ArrayList<Animal>(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
		
		//store inside array
		Animal[] shahsPet = {dog2, dog3};
		
		//store inside an arraylist
		List<Animal> shahsPet2 = new ArrayList<Animal>();
		shahsPet2.add(dog2);
		shahsPet2.add(dog3);
		shahsPet2.add(dog4);
		
		//short cut to add to an arraylist
		List<Animal> shahsPet3 = new ArrayList<Animal>(Arrays.asList(dog1, dog3, dog4));
		
		//enhanced for loop
		for(Animal animal: shahsPet3) { //"animal" - any variable
			System.out.println(animal.name);
		}	
		//looking for cookies amongst shahsPet3
		String animalName = "Cookies";
		Animal animal = null;
		
//		ArrayList<Animal> aList = new ArrayList<>();
		
		for (int i = 0; i < shahsPet3.size(); i++) {
			if(!shahsPet3.get(i).name.equals(animalName)) {
				continue;
			}else {
				shahsPet3.remove(shahsPet3.get(i)); // number of times 
				
				
			}
		}	System.out.println("No. of shahsPet3 is:  " +shahsPet3.size());
		
		//add tom to doglist if tom is not there
		
		System.out.println("Here are our available dogs: ");
		for(Animal dog: dogList) {
			System.out.println(dog.name);
		}
	
		//print out distinct names - create new list and only add if it doesn't already exit.
		
		ArrayList<Animal> distinct = new ArrayList<Animal>();
		distinct.add(dog1);
		boolean unique = true;
		for (int i = 0; i < dogList.size(); i++) {
			for(int j = 1; j<distinct.size()-2; j++) {
				if (dogList.get(i).name == (distinct.get(j).name)) {
					unique = false;
					break;
				}else {distinct.add(dogList.get(i));}		
			}
		}
		
		System.out.println("No. of distinct is: " + distinct.size());
		
		for(Animal disDog: distinct) {
			System.out.println(disDog.name);
		}

	}

}
