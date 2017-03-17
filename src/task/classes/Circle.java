package task.classes;
import java.lang.Math;

public class Circle extends Figure{
			
	private double radius;
	
	public Circle (double radius) {
		if (radius<=0){
			throw new IllegalArgumentException("Radius must be greater than 0");
		} 
		this.radius=radius;
	}
	
	@Override
	public double perimeter (){
		return 2*Math.PI*radius;
	}
		
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}