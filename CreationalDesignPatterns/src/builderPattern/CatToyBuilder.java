package builderPattern;

public class CatToyBuilder extends AnimalToyBuilder {

	@Override
	public void buildAnimalToyHead() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyHead("Cat head");
		System.out.println("Step 1: Cat head has been built");
	}

	@Override
	public void buildAnimalToyBody() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyBody("Cat body");
		System.out.println("Step 2: Cat body has been built");
	}

	@Override
	public void buildAnimalToyLegs() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyLegs("Cat legs");
		System.out.println("Step 3: Cat legs has been built");
	}

	@Override
	public void buildAnimalToyArms() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyArms("Cat Arms");
		System.out.println("Step 4: Cat arms has been built");
	}

	@Override
	public void buildAnimalToyTail() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyTail("Cat tail");
		System.out.println("Step 5: Cat tail has been built");
	}

	@Override
	public AnimalToy createAnimalToy() {
		// TODO Auto-generated method stub
		System.out.println("Create method from Cat");
		return new AnimalToy();
	}

	public void buildAnimalToyName() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyName("Cat");
		
	}

}
