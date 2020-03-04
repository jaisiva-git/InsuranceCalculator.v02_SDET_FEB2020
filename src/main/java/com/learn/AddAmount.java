package com.learn;

public class AddAmount {
	
	int amount = 50;
	
	public AddAmount() {
		
	}
	public AddAmount(int amount) {
	 this.amount= this.amount + amount;
	}
	
	public int getCurrentAmount() {
		return amount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AddAmount Am = new AddAmount();
       AddAmount Am2 = new AddAmount(50);
       
		System.out.println("Piggee Bank:" + Am.getCurrentAmount());
		System.out.println("Piggee Bank:" + Am2.getCurrentAmount());

       
	}

}
