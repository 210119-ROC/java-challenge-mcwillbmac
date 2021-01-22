package com.revature.eval.java.core;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub double u = 3.3; long res =
		 * (long)(toMilesPerHour(u)); System.out.println(res);
		 */
		/*
		 * int t = 2500; System.out.println(printMegaBytesAndKiloBytes(t));
		 */
		/*
		 * int x = -1; boolean y = true;
		 * 
		 * int d = 24; boolean u = true;
		 * 
		 * System.out.println(shouldWakeUp(y,x)); System.out.println(shouldWakeUp(u,d));
		 */
		/*
		 * areEqualByThreeDecimalPlaces(99,98); areEqualByThreeDecimalPlaces(999,999);
		 */
		/* hasTeen(isTeen(1),isTeen(15),isTeen(19)); */
		long y= 527040;
		 printYearsAndDays(y);
	}
		public static String printYearsAndDays(long minutes) {
		// TODO Write an implementation for this method declaration
			long hours = (minutes)/(60);
			System.out.println(hours);
			Math.round(hours);
			int days = (int) (hours / 24);
			System.out.println(days);
			int years = days / 365;
			System.out.println(years);
			System.out.println(minutes + " minutes is equal to "+ years + " year/s or "+ days + " day/s."); 
			/*
			 *   
			 * 
			 * return result;
			 */
			return null;
	}
	/*
	 * 
	 * public static boolean hasTeen(int x, int y, int z) { // TODO Write an
	 * implementation for this method declaration if((x<=12)||(x>=20)){
	 * System.out.println(x+" is not a teen"); if((y<=12)||(y>=20)) {
	 * System.out.println(y+" is not a teen"); if((z<=12)||(z>=20)){
	 * System.out.println(z+" is not a teen"); }else
	 * System.out.println(z+" is a teen"); }else System.out.println(y+" is a teen");
	 * } else System.out.println(x+" is a teen"); return true;
	 * 
	 * } public static int isTeen(int number) { // TODO Write an implementation for
	 * this method declaration if((number <=12)||(number>=20)) {
	 * System.out.println("No teen "); }
	 * 
	 * return number; }
	 */

	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 */
	/*
	 * public static boolean areEqualByThreeDecimalPlaces(double firstNum, double
	 * secondNum) { // TODO Write an implementation for this method declaration
	 * if(firstNum == secondNum) { System.out.println(firstNum + " is equal to "+
	 * secondNum + "."); return true; }
	 * System.out.println("Numbers do not match. ");
	 * 
	 * return false; }
	 */
	/*
	 * public static long toMilesPerHour(double kilometersPerHour) { // TODO Write
	 * an implementation for this method declaration long result =
	 * (long)(kilometersPerHour * 0.621371); return result; }
	 */
	/*
	 * public static String printMegaBytesAndKiloBytes(int kb) { // TODO Write an
	 * implementation for this method declaration
	 * 
	 * while(kb >= 0) { int mb = (int) (kb * 0.001); System.out.println(mb); int res
	 * = kb - (mb * 1000); String result = kb + " kiloBytes is equal to " + mb
	 * +" megaBytes and " + res + " kiloBites"; return result; } return
	 * "Error Try again";
	 * 
	 * }
	 */
	/*
	 * public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) { //
	 * TODO Write an implementation for this method declaration boolean getUp =
	 * false; if((hourOfDay < 0)||(hourOfDay >=24)) {
	 * System.out.println("Out of bounds. Try again");
	 * 
	 * }else if((isBarking == true) && (hourOfDay >= 0 && hourOfDay <=8 )) { getUp =
	 * true;
	 * System.out.println("The dog is barking. You have to get up and get him.");
	 * return getUp; } else if((isBarking == true) && (hourOfDay >= 23) &&
	 * (hourOfDay < 24)) { getUp = true;
	 * System.out.println("The dog is barking. You have to get up and get him.");
	 * return getUp; } return getUp = false; }
	 */
}
