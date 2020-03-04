package com.learn;

public class Rectangle {

	int length, breadth, Area;

	public Rectangle() {
		
	}
	
    public Rectangle( int length, int breadth) {
    		this.length = length;
    		this.breadth = breadth;
    		
    }
    
    public Rectangle( int val) {
    	this.length = val;
    	this.breadth = val;
    }

   public int calArea(){
    	return length* breadth;
    	
    }
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(10,20);
		Rectangle rec3 = new Rectangle(30);
		
		rec1.calArea();
		rec2.calArea();
		System.out.println("Area of rectangle:" + rec1.calArea());
		System.out.println("Area of rectangle:" + rec2.calArea());
		System.out.println("Area of rectangle:" + rec3.calArea());

 
	}

}
