package slo.controller;

import java.util.Scanner;

public class SLOController
{
		//Declaration
		//Class members private
		
		private Scanner mySLOInput;
		
		
		//Constructors go here

		public SLOController()
		{
			mySLOInput = new Scanner(System.in);
			
		}
		
		//Methods
		
		public void start()
		{
			questions();
		}
		private void questions()
		{
			System.out.println("What is your name?");
			String input;
			input = mySLOInput.nextLine();
			System.out.println("Hi my name is " + input +",");
			System.out.println("What is your name?");
			String fullName = mySLOInput.nextLine();
			System.out.println("My name is, " + fullName);
			System.out.println("your age please");
			int myAge = mySLOInput.nextInt();
			System.out.println("Wow " + input + " you are " + myAge + " years old.");
		}
}