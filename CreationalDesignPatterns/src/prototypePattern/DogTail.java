package prototypePattern;

public class DogTail {
	private String tailLength;

	public String getTailLength() {
		return tailLength;
	}

	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	@Override
	public String toString() {
		return "DogTail [tailLength=" + tailLength + "]";
	}
	
}
