package task;

public class Circle extends Figure{
	private float Radius;
		public Circle( float Radius) {
		this.Radius = Radius;
	}

	double perimeter()
	{
		return 2*Math.PI*Radius;
	}
	
}
