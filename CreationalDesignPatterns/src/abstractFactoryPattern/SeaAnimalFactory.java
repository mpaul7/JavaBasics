package abstractFactoryPattern;

public class SeaAnimalFactory extends AnimalFactory {

	@Override
	public Animal getAnimal(String AnimalType) {
		// TODO Auto-generated method stub
		Animal animal = null;
		if("Octopus".equals(AnimalType)){
			animal = new Octopus();
		} else if ("Shark".equals(AnimalType)){
			animal = new Shark();
		} 
		return animal;
	}

}
