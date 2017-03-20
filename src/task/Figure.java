package task;

public abstract class Figure {

	public abstract double perimeter();
	
	@Override
	public String toString(){
		return this.getClass().getSimpleName();
	}

}
