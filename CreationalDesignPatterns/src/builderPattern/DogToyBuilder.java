package builderPattern;

public class DogToyBuilder extends AnimalToyBuilder {

	@Override
	public void buildAnimalToyHead() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyHead("Dog head");
		System.out.println("Step 1: Dog head has been built");
	}

	@Override
	public void buildAnimalToyBody() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyBody("Dog body");
		System.out.println("Step 2: Dog body has been built");
	}

	@Override
	public void buildAnimalToyLegs() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyLegs("Dog legs");
		System.out.println("Step 3: Dog legs has been built");
	}

	@Override
	public void buildAnimalToyArms() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyArms("Dog arms");
		System.out.println("Step 4: Dog Arms has been built");
	}

	@Override
	public void buildAnimalToyTail() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyTail("Dog tail");
		System.out.println("Step 5: Dog tail has been built");
	}

	@Override
	public AnimalToy createAnimalToy() {
		// TODO Auto-generated method stub
		System.out.println("Create method from Dog");
		return new AnimalToy();
	}

	public void buildAnimalToyName() {
		// TODO Auto-generated method stub
		getAnimalToy().setAnimalToyName("Dog");
		
	}

}
