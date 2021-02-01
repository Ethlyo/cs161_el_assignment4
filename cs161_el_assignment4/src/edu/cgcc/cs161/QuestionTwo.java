package edu.cgcc.cs161;
//Header
//Program Name: Count to ten 2
//Author: Ethan Lyons
//Class: CS161
//Date: 1/31/2021
//Description: Counts from 1 to ten, using continue to skip 4 and 7.

public class QuestionTwo {
	static int g=1;
	
	public static void main(String[] Args) {
		countBreak();
	}
		private static void countBreak() {
	
			
			for( g = 1 ; g < 11; g++ ) {
				
				if(g == 4 || g == 7) {
					continue;
				}
				
				System.out.print(g + " ");
				
			}
			reset();
		}
		
		private static void reset() {
			g = 0;
			
			System.out.println();
		}
}
/* FOOTER
1 2 3 5 6 8 9 10 
*/
