package prototypePattern;

import java.util.Hashtable;

public class AnimalCache {
	private static Hashtable<String , Animal> AnimalMap = new Hashtable<String, Animal>();
	public static Animal getAnimal (String animalType){
		Dog dog = (Dog) AnimalMap.get(animalType);
		if (dog== null)
		{
			DogLegs dogleg = new DogLegs();
			dogleg.setNumberOfLegs(4);
			
			DogEar dogear = new DogEar();
			dogear.setNumberOfEars(2);
			
			DogEye dogeye = new DogEye();
			dogeye.setNumberOfEyes(2);
			
			DogTail dogtail = new DogTail();
			dogtail.setTailLength("Long");
			
			dog = new Dog ("tommy", 3, "White", dogleg, dogear, dogeye, dogtail);
			AnimalMap.put("dog", dog);
			System.out.println("New dog object is created and returned\n");
			return dog;
			}
		System.out.println("\ncloned Dog object is created and returned\n");
		return dog.clone();
	} 

}
