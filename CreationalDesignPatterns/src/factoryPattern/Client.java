package factoryPattern;

public class Client {

	public static void main(String[] args) {
		
		AnimalFactory animalFactory = new AnimalFactory();
		Animal animal = null;
		
		animal = animalFactory.getAnimal("Dog");
		animal.speak();
		
		animal = animalFactory.getAnimal("Cat");
		animal.speak();
		

	}

}
