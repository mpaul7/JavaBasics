package builderPattern;

public class ToyMaker {
	// by declaring constant, it shows the type of available toys. 
	public final static String DOG_TOY = "Dog";
	public final static String CAT_TOY = "Cat";
	
	public static AnimalToy makeToy(String toyType) throws Exception{
		
		AnimalToyBuilder animalToyBuilder = null;
		
		if(toyType.equals(DOG_TOY)){
			animalToyBuilder = new DogToyBuilder();
		}else if (toyType.equals(CAT_TOY)){
			animalToyBuilder = new CatToyBuilder();
		}else {
			System.out.println("Sorry we can not make :" + toyType );
			throw new Exception("Sorry we can not make: " + toyType);
		}
		// This is the beauty
		// the reference of the super class will call its concrete method and
		// will also call the implemented abstract methods from the sub-class.   
		return animalToyBuilder.buildAnimalToy();
		}
	}
