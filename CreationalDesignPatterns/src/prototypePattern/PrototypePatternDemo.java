package prototypePattern;

public class PrototypePatternDemo {
	public static void main (String[] args){
		Dog dog = (Dog) AnimalCache.getAnimal("dog");
		displayAnimalProperty(dog);
		
		Dog clonedog1 = (Dog) AnimalCache.getAnimal("dog");
		clonedog1.setName("Jonnie");
		clonedog1.setAge(4);
		clonedog1.setColor("Brown");
		displayAnimalProperty(clonedog1);
		
		Dog clonedog2 = (Dog) AnimalCache.getAnimal("dog");
		clonedog2.setName("Tony");
		clonedog2.setAge(5);
		clonedog2.setColor("Brown");
		displayAnimalProperty(clonedog2);
		
		Dog clonedog3 = (Dog) AnimalCache.getAnimal("dog");
		clonedog3.setName("Jimmy");
		clonedog3.setAge(3);
		clonedog3.setColor("Brown");
		displayAnimalProperty(clonedog3);
	}

	private static void displayAnimalProperty(Animal animal) {
		// TODO Auto-generated method stub	
		System.out.println(" From Display ");
		
		System.out.println(animal);
	}
}
