package task;

public class Square extends Figure {
	private double side;
	public Square (double side){
		this.side = side;
		}
   	public double perimeter(){
   		return 4*side;
   		}
}	

