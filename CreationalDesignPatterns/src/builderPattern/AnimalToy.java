package builderPattern;

public class AnimalToy {
	private String animalToyName;
	private String animalToyHead;
	private String animalToyBody;
	private String animalToyArms;
	private String animalToyLegs;
	private String animalToyTail;
	
	public String getAnimalToyName() {
		return animalToyName;
	}
	public void setAnimalToyName(String animalToyName) {
		this.animalToyName = animalToyName;
	}
	public String getAnimalToyHead(String animalToyHead) {
		return animalToyHead;
	}
	public void setAnimalToyHead(String animalToyHead) {
		this.animalToyHead = animalToyHead;
	}
	
	public String getAnimalToyBody(String animalToyBody) {
		return animalToyBody;
	}
	public void setAnimalToyBody(String animalToyBody) {
		this.animalToyBody = animalToyBody;
	}
	public String getAnimalToyArms(String animalToyArms) {
		return animalToyArms;
	}
	public void setAnimalToyArms(String animalToyArms) {
		this.animalToyArms = animalToyArms;
	}
	public String getAnimalToyLegs(String animalToyLegs) {
		return animalToyLegs;
	}
	public void setAnimalToyLegs(String animalToyLegs) {
		this.animalToyLegs = animalToyLegs;
	}
	public String getAnimalToyTail(String animalToyTail ) {
		return animalToyTail;
	}
	public void setAnimalToyTail(String animalToyTail) {
		this.animalToyTail = animalToyTail;
	}
	
	@Override
	public String toString() {
		return "AnimalToy [animalToyName=" + animalToyName + ", animalToyHead="
				+ animalToyHead + ", animalToyBody=" + animalToyBody
				+ ", animalToyArms=" + animalToyArms + ", animalToyLegs="
				+ animalToyLegs + ", animalToyTail=" + animalToyTail + "]";
	}
	
}
