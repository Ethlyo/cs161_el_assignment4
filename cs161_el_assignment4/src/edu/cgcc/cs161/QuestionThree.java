package edu.cgcc.cs161;
//Header
//Program Name: Sum of first ten natural numbers
//Author: Ethan Lyons
//Class: CS161
//Date: 1/31/2021
//Description: Prints the sum of the first ten natural numbers using a loop.

public class QuestionThree {
	
	static int g = 1;
	static int h = 0;
	
	public static void main(String[] Args) {
		
		loop();
		System.out.print(h);
	}
	
	public static void loop() {
		
		for( g = 1 ; g < 11; g++ ) {
			h = g + h;
		}
	} 
	
}
/* FOOTER
55
*/
