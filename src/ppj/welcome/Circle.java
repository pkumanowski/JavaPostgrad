package ppj.welcome;

public class Circle {

	private double radius;

//	public double area() {
//		return 3.141592 * radius * radius;
	
	int compare (double radius) {
		if (this.radius < radius) {
		return -1;
	}
	else if (this.radius > radius) {
		return 1;
	}
	else if (this.radius == radius) {
		return 0;
	}
		return 0;
	}
		

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
