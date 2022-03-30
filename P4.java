import java.util.*;

class Shape {
	double dim1;
	double dim2;
	Shape(double a, double b) {
		dim1 = a;
		dim2 = b;
		}
	
	double area() {
		System.out.println("Area for Figure is undefined.");
		return 0;
		}
	}

class Rectangle extends Shape {
	Rectangle(double a, double b) {
		super(a, b);}
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
		}
	}

class Triangle extends Shape {
	Triangle(double a, double b) {
		super(a, b);
		}
	double area() {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
		}
	}

class Circle extends Shape {
	Circle(double a, double b) {
		super(a, b);}
	double area() {
		System.out.println("Inside Area for Circle.");
		return dim1 * dim2 * dim2;
		}
	}

class P4 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Circle c = new Circle(3.142, 4);
		Shape figref;
		figref = r;
		System.out.println("Area is " + figref.area());
		figref = t;
		System.out.println("Area is " + figref.area());
		figref = c;
		System.out.println("Area is " + figref.area());
		}
		
		}
	
