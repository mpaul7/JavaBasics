package abstractFactoryPattern;

public class LandAnimalFactory extends AnimalFactory {

	@Override
	public Animal getAnimal(String AnimalType) {
		Animal animal = null;
		if("Dog".equals(AnimalType)){
			animal = new Dog();
		} else if ("Cat".equals(AnimalType)){
			animal = new Cat();
		} else if ("Lion".equals(AnimalType)){
			animal = new  Lion();
		}
		return animal;
	}

}
