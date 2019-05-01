package com.classObeject;


class Point1 {
	double x;
	double y;
	double z;
	
	Point1(double _x, double _y, double _z) {
		x = _x;
		y = _y;
		z = _z;
	}
	
	void setX(double _x) {
		x = _x;
	}
	void setY(double _y) {
		y = _y;
	}
	void setZ(double _z) {
		z = _z;
	}
	
	double getDistance(Point1 p) {
		return (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y) +(z-p.z)*(z-p.z);
	}	

}

public class TestPoint{
	public static void main(String[] args) {
		Point1 p = new Point1(1.0,2.0,3.0);
		Point1 p1 = new Point1(0.0,0.0,0.0);
		System.out.println(p.getDistance(p1));
		
		p.setX(5.0);
		System.out.println(p.getDistance(new Point1(1.0,1.0,1.0)));
	}
}
