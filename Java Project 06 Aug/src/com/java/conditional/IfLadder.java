package com.java.conditional;

public class IfLadder {

	public static void main(String[] args) {
		
		int mark=18219;
		
		if(mark==35)
		{
			System.out.println("Just Pass");
		}
		
		
		else if(mark>90 && mark<=100)
		{
			System.out.println("S Grade");
		}
		
		
		else if(mark<35 && mark>=0)
		{
			System.err.println("Fail");
		}
		
		else if(mark>35 && mark<=50)
		{
			System.out.println("D grade");
		}
		
		else if(mark>50 && mark<=70)
		{
			System.out.println("C Grade");
		}
		
		else if(mark>70 && mark<=80)
		{
			System.out.println("B Grade");
		}
		
		else if(mark>80 && mark<=90)
		{
			System.out.println("A Grade");
		}

		
		
		
		else
		{
			System.out.println("Not a mark...");
		}
		
	}

}
