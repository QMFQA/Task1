package task;

public class Square extends Rectangle {
	public Square (double side){
		super (side,side);
		}
	@Override
   	public String toString () {
   		return getClass().getSimpleName();
	}
}
	

