package factoryPattern;

public class AnimalFactory {
	Animal animal = null;
	
	public Animal getAnimal(String AnimalType){
		if ("Dog".equals(AnimalType)){
			animal = new Dog();
		} if ("Cat".equals(AnimalType)){
			animal = new Cat();
		}
		return animal;
		
	}

}
