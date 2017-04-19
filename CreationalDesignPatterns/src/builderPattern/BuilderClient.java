package builderPattern;

public class BuilderClient {
	
	public static void main(String[] args) throws Exception {
		// ToyMaker.DOG_TOY means the type of available toys.
		// further toymaker class is used to make the object of selected toy. 
		// and this object is made through the BuildAnimalToy class. 
		// Which is an abstract class, and will call the implementation of its methods based on the object of toy selected. 
		AnimalToy dogToy = ToyMaker.makeToy(ToyMaker.DOG_TOY);
		System.out.println(dogToy);
		AnimalToy catToy = ToyMaker.makeToy(ToyMaker.CAT_TOY);
		System.out.println(catToy);
		
	}
}
