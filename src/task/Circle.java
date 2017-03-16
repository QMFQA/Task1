package task;

public class Circle extends Figure{
	final double pi = Math.PI;
	private double radius;
	public Circle (double radius){
		this.radius = radius;
	}
   	public double perimeter(){
   		return 2 * pi * radius;
   		}

}
