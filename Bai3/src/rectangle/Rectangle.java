package rectangle;

public class Rectangle {

	double width, height;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
	    return this.width * this.height;
	}

	public double getPerimeter() {
	    return (this.width + this.height) * 2;
	}

	public String display() {
	    return "Rectangle{" + "width=" + width + ", height=" + height + "}";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
	

}
