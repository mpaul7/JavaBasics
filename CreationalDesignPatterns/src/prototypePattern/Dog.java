package prototypePattern;

public class Dog implements Animal {
	
	private String name;
	private int age;
	private String color;
	private DogLegs dogleg;
	private DogEar dogear;
	private DogEye dogeye;
	private DogTail dogtail;
	
	
		
	public Dog(String name, int age, String color, DogLegs dogleg,
			DogEar dogear, DogEye dogeye, DogTail dogtail) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.dogleg = dogleg;
		this.dogear = dogear;
		this.dogeye = dogeye;
	}

	@Override
	public Animal clone() {
		// TODO Auto-generated method stub
		Dog dogObject = null;
		try{
			dogObject = (Dog) super.clone(); 
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return dogObject;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color + "]";
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public void setAge(int age) {
		this.age = age;
		
	}

	public void setColor(String color) {
		this.color = color;
		
	}

}
