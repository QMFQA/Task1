package task;

public abstract class Figure {
	

	public Figure() {
	}

	public abstract double perimeter();

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	
}
