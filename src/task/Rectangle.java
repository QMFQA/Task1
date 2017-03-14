package task;

public class Rectangle extends Figure {
	double width;
    double height;
    
    Rectangle (double w, double h) {
    	if ((w>0) && (h>0)) {
    	width = w;
        height = h;
    	}
    	else System.out.println("Building was not successful");
    }
    
    @Override
	double perimeter() {
		return (2*(width+height));
	}

}
