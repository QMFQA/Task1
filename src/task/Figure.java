package task;

public abstract class Figure {
	
	public abstract double perimeter();
	
	public String toString(){
		
	   return this.getClass().getSimpleName();
		
	}
}
