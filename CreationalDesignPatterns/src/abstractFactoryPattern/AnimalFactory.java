package abstractFactoryPattern;

public abstract class AnimalFactory {
	
	public abstract Animal getAnimal(String AnimalType);
	
	public static AnimalFactory getAnimalFactory(String FactoryType){
		AnimalFactory animalFactory = null;
		if("Sea".equals(FactoryType)){
			animalFactory = new SeaAnimalFactory();
		}else{
			animalFactory = new LandAnimalFactory();
		}
		return animalFactory;
		
	}

}
