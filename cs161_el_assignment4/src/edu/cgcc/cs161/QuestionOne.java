package edu.cgcc.cs161;
//Header
//Program Name: Count to ten 1
//Author: Ethan Lyons
//Class: CS161
//Date: 1/31/2021
//Description: Counts from 1 to ten using for, while, and do while loops

public class QuestionOne {

	static int g=0;
	
	public static void main(String[] Args) {
	
		forCount();
		whileCount();
		doWhileCount();
		
	}
	
	private static void forCount() {
		System.out.print("for: ");
		
		for( g = 0 ; g < 10; g = g + 1) {
			

			System.out.print(g + 1 + " ");
			
		}
		reset();
	}
	
	private static void whileCount() {
		System.out.print("while: ");
		
		while( g < 10) {
			g = g + 1;
			System.out.print(g + " ");
		}
		reset();
	}
	
	private static void doWhileCount() {
		System.out.print("do while: ");
		
		do {
			g = g + 1;
			System.out.print(g + " ");
		}
		while( g < 10);
		reset();
	}
	
	private static void reset() {
		g = 0;
		
		System.out.println();
	}
}
/* FOOTER
for: 1 2 3 4 5 6 7 8 9 10 
while: 1 2 3 4 5 6 7 8 9 10 
do while: 1 2 3 4 5 6 7 8 9 10 
*/