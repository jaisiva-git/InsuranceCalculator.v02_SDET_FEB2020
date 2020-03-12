package com.learn;

public class IfElse2 {
	
	public void printGreatestValue( int x , int y) {
		if(x>y) {
			System.out.println("Result:" +x+ " is greater than "+y );
		}else {
			System.out.println("Result:" +y+ " is greater than" +x);
		}
			
	}
    public void printTotalCost(int numberOfUnits) {
    		int unitprice = 100;
    		int discountPercent = 10;
    		int totalCost = numberOfUnits * unitprice;
    		
    		if(totalCost > 1000) {
    			totalCost = totalCost * (100 - discountPercent)/100;
    		}
    		
    		System.out.println("total cost is: " + totalCost);
    		
    }
    public void employeeBonus(int salary, int yearsOfService) {
    	
    		if(yearsOfService >= 5  ) {
    			System.out.println("Your Bonus is :" + (salary * 5/100));
    		}else {
    			System.out.println("Your Bonus is :" + "No bonus");
    		}

    }
    
	public void gradingSys(int marks) {	
		
		if(marks<=25) {
			System.out.println("Enter grade is:" + "F");
		}
		else if(marks>=25 && marks<=45) {
		System.out.println("Enter grade is:" + "E");
		}
		else if(marks>=45 && marks<=50) {
		System.out.println("Enter grade is:" + "D");
		}
		else if(marks>=50 && marks<=60) {
		System.out.println("Enter grade is:" + "C");
		}
		else if(marks>=60 && marks<=80) {
		System.out.println("Enter grade is:" + "B");
		}
		else if(marks>=80) {
			System.out.println("Enter grade is:" + "A");

		}

		
	}
	
	public void findOldAndYoungest(int age1, int age2, int age3) {

		if( age1 < age2 && age1<age3){
			System.out.println("age1:" + age1 + " is the Youngest");

		}
		else if(age2<age1 && age2<age3) {
			System.out.println("age2: "+ age2 +" is the Youngest");

		}
		else if(age3<age1 && age3<age2) {
			System.out.println("age3: "+ age3 +" is the Youngest");

		}
	    if( age1 > age2 && age1>age3){
			System.out.println("age1: "+ age1+" is the Oldest");

		}
	    else if(age2>age1 && age2>age3) {
		System.out.println("age2:  "+ age2 +" is the Oldest");

	    }
	    else if(age3>age1 && age3>age2) {
		System.out.println("age3:"+ age3 +" is the Oldest");
		}
	} 
	
	public void absoluteValue(int num) {
		
		int output = Math.abs(num);
		System.out.println("INPUT: " + num +" ;    OUTPUT: " + output +"");
	}
    
	public void checkStudentInClass(double numOfClassHeld, double numOfClassesAttended) {
		
		double percentageOfClass = (numOfClassesAttended/ numOfClassHeld)*100;
		
		if(percentageOfClass >= 75) {
			System.out.println("Student is allowed in the exam: "+percentageOfClass +"");
		}
		else
			System.out.println("Student is not allowed in the exam:" +percentageOfClass+"");

			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElse2 a = new IfElse2();
		a.printGreatestValue(10,20);
		
		System.out.println("\n");
		
		IfElse2 b = new IfElse2();
		b.printTotalCost(12);
		
		System.out.println("\n");
		
		IfElse2 c = new IfElse2();
		c.employeeBonus(5000, 4);
		
		System.out.println("\n");
		
		IfElse2 d = new IfElse2();
		d.gradingSys(90);
		
		System.out.println("\n");
		
		IfElse2 e = new IfElse2();
		e.findOldAndYoungest(25, 35, 45);
		
		System.out.println("\n");
		
		e.findOldAndYoungest(95, 92, 90);
		
		System.out.println("\n");
		
		IfElse2 f = new IfElse2();
		f.absoluteValue(1);
		f.absoluteValue(-1);
		
		System.out.println("\n");

		IfElse2 g = new IfElse2();
		g.checkStudentInClass(50, 45);
		g.checkStudentInClass(180, 120);
	}

}
