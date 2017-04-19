package abstractFactoryPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = null;
		AnimalFactory animalFactory = null;
		String speakFound = null;
		
		// Get Factory object by passing the facrtory type
		animalFactory = AnimalFactory.getAnimalFactory("Sea");
		System.out.println("Animal Factory Type: " + animalFactory.getClass().getName());
		
		System.out.println();
		
		// Get Animal object by passing the animal type
		animal = animalFactory.getAnimal("Shark");
		System.out.println("Animal Type: " + animal.getClass().getName());
		speakFound = animal.speak();
		System.out.println("Shark speaks " + speakFound);
		
		System.out.println();
		animal = animalFactory.getAnimal("Octopus");
		System.out.println("Animal Type: " + animal.getClass().getName());
		speakFound = animal.speak();
		System.out.println("Octopus speaks " + speakFound);
		
		
		animalFactory = AnimalFactory.getAnimalFactory("Land");
		System.out.println("Animal Factory Type: " + animalFactory.getClass().getName());
		
		System.out.println();
		
		// Get Animal object by passing the animal type
		animal = animalFactory.getAnimal("Dog");
		System.out.println("Animal Type: " + animal.getClass().getName());
		speakFound = animal.speak();
		System.out.println("Dog speaks " + speakFound);
		
		System.out.println();
		animal = animalFactory.getAnimal("Cat");
		System.out.println("Animal Type: " + animal.getClass().getName());
		speakFound = animal.speak();
		System.out.println("Cat speaks " + speakFound);

	}

}
