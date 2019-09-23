package com.faith.test;

public class Main {
	public static void main(String[] args){
		SalesData objSalesData=new SalesData();
		Third objSalesData1=new Third();
		System.out.println("Hello UST");
		displayGreetings();
		objSalesData.display();
		objSalesData1.print();
	}
	private static void displayGreetings(){
		System.out.println("Welcome to sales report");
	}
}
