package com.java.looping;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// row
		for (int i = 1; i <= 5; i++)// 1 2 3 4 5
		{
			// column
			for (int j = 1; j <= i; j++)// 1 2 3 4 5
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		// row
		for (int i = 1; i <= 5; i++)// 1 2 3 4 5
		{
			// column
			for (int j = 1; j <= i; j++)// 1 2 3 4 5
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		// row
		for (int i = 1; i <= 5; i++)// 1 2 3 4 5
		{
			// column
			for (int j = 1; j <= i; j++)// 1 2 3 4 5
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
