/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/CheckCollinear.java
 *  Execution:    java -cp bin com.profound.util.CheckCollinear
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   19-08-2017
 *  Output:
 *	Enter the value of x1
 *	2
 *	Enter the value of y1
 *	4
 *	Enter the value of x2
 *	4
 *	Enter the value of y2
 *	6
 *	Enter the value of x3
 *	6
 *	Enter the value of y3
 *	8
 *	Checking collinearity using slope:true
 *	Checking collinearity using Area:true  
 ******************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class CheckCollinear{
	static int x1,x2,x3,y1,y2,y3;		//six variables to store the values of x and y of three points
	static double AB,BC,AC,area;		//three variables to store the slopes and an area variable to store the value of Area
	//method of boolean type to check the collinearity of points using slopes
	public static boolean checkCollinearUsingSlpoe(int x1,int y1,int x2,int y2,int x3,int y3){
		AB=(y2-y1)/(x2-x1);
		BC=(y3-y2)/(x3-x2);
		AC=(y3-y1)/(x3-x1);
		if(AB==BC && BC==AC && AB==AC)		// the value of slope of collinear points are same
			return true;
		else
			return false;
	}
	// method of boolean type to check collinearity of points using area
	public static boolean checkCollinearUsingArea(int x1,int y1,int x2,int y2,int x3,int y3){
		area=0.5*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2));

		if(area==0)			//if the area is 0 then the points are collinear
			return true;
		else
			return false;
	}
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x1");
		x1=sc.nextInt();
		System.out.println("Enter the value of y1");
		y1=sc.nextInt();
		System.out.println("Enter the value of x2");
		x2=sc.nextInt();
		System.out.println("Enter the value of y2");
		y2=sc.nextInt();
		System.out.println("Enter the value of x3");
		x3=sc.nextInt();
		System.out.println("Enter the value of y3");
		y3=sc.nextInt();
		System.out.println("Checking collinearity using slope:"+checkCollinearUsingSlpoe(x1,y1,x2,y2,x3,y3));
		System.out.println("Checking collinearity using Area:"+checkCollinearUsingArea(x1,y1,x2,y2,x3,y3));
	}
}