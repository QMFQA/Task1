package task.classes;

public class Rectangle extends Figure{
	
	private double side1;
	private double side2;
	
	public Rectangle(double side1, double side2) {
		if (side1 <= 0 || side2 <= 0){
			throw new IllegalArgumentException("Sides must be greater than 0");
			} 
		
		this.side1 = side1;
		this.side2 = side2;
	}
	
	@Override
	public double perimeter (){
		return 2*(side1 + side2);
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}