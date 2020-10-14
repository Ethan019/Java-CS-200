//****************************************************************************************
// NAME: Ethan Massingill
// DATE: 9/25/2020
// HOURS: About 30 minutes
// CLASS: CSCI 200 Fall 2020
// ASSSIGNMENT: mini program-chap03
//****************************************************************************************

import java.util.Scanner;
public class CubeSum
{
	public static void main(String[] args)
	{
		int a, b;
		double c, d;
		int answer;

		Scanner scan = new Scanner (System.in);

		System.out.print("Enter integer 1: ");
		a = scan.nextInt();

		System.out.print("Enter integer 2: ");
		b = scan.nextInt();

		c = Math.pow(a, 3);
		d = Math.pow(b, 3);
		answer = (int)(c+d);

		System.out.println("The sum of the cubes of these numbers is: "+(answer));
  }
}
