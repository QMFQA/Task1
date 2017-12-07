package task;

public abstract class Figure {
	
	private final String name;

	public Figure(String name) {
		this.name = name;
	}

	public abstract double perimeter();

	@Override
	public String toString() {
		return this.name;
	}
	
}
