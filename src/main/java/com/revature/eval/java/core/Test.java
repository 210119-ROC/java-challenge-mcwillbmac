package com.revature.eval.java.core;

public class Test {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub double u = 3.3; long res =
		 * (long)(toMilesPerHour(u)); System.out.println(res);
		 */
		/*
		 * int t = 2500; System.out.println(printMegaBytesAndKiloBytes(t));
		 */
		int x = -1;
		boolean y = true;
		
		System.out.println(shouldWakeUp(y,x));
	
	}
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
	public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		// TODO Write an implementation for this method declaration
	    boolean getUp = false;
		if((isBarking == true) && (hourOfDay >= 0 || hourOfDay <=8 )) {
			getUp = true;
			System.out.println("The dog is barking. You have to get up and get him.");
			return getUp;
		}
		else if((isBarking == true) && (hourOfDay >= 23) || (hourOfDay <=24)) {
		getUp = true;
		System.out.println("The dog is barking. You have to get up and get him.");
		return getUp;
		}else if((hourOfDay < 0) || (hourOfDay > 24)) 
			getUp = false;
		System.out.println("Outside the lines.");
		    return getUp;
	}
}
