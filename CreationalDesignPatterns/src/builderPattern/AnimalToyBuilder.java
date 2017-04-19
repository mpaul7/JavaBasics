package builderPattern;

public abstract class AnimalToyBuilder {
	private AnimalToy animalToy;

	public AnimalToy getAnimalToy() {
		return animalToy;
	}

	public void setAnimalToy(AnimalToy animalToy) {
		this.animalToy = animalToy;
	}
	// Template method
	public final AnimalToy buildAnimalToy(){
		AnimalToy animalToy = createAnimalToy();
		setAnimalToy(animalToy);
		buildAnimalToyName();
		buildAnimalToyHead();
		buildAnimalToyBody();
		buildAnimalToyLegs();
		buildAnimalToyArms();
		buildAnimalToyTail();
		return animalToy;
		}
	public abstract void buildAnimalToyName();
	public abstract void buildAnimalToyHead();
	public abstract void buildAnimalToyBody();
	public abstract void buildAnimalToyLegs();
	public abstract void buildAnimalToyArms();
	public abstract void buildAnimalToyTail();
	public abstract AnimalToy createAnimalToy();

}
