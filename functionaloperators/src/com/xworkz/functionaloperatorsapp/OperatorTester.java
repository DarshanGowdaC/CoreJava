package com.xworkz.functionaloperatorsapp;

public class OperatorTester {

	public static void main(String[] args) {
		
		Addition add = (a,b) ->{
		System.out.println("Start of Additon Method");
		System.out.println(a+b);
		
		System.out.println("End Of Addition Method");
		};
		add.add(200,300 );
		
		System.out.println("Start Of Subtraction Method");
		Subtraction sub = (a,b) -> System.out.println(a-b);
		sub.sub(275,400);
		System.out.println("End Of Subtraction Method");
		
		System.out.println("Start Of Multiplication Method");
		Multiply multy = (a,b) ->System.out.println(a*b);
		multy.multi(180,180);
		System.out.println("End Of Multiplication Method");
		
		System.out.println("Start Of Division Method");
		Division div = (a,b) -> System.out.println(a/b);
		div.div(800,300);
		System.out.println("End Of Division Method");
	}
	
}


