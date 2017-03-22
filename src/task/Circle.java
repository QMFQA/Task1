package task;

public class Circle extends Figure{
	String figure = new String("Circle");
	final double pi = Math.PI;
	private double radius;
	public Circle (double radius){
		this.radius = radius;
	}
   	public double perimeter(){
   		return 2 * pi * radius;
   		}
   	@Override
   	public String toString () {
   		return getClass().getSimpleName();
   	}
}
