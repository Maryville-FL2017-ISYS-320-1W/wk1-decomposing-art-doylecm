/*
  	ISYS 320
  	Name(s): Chris Doyle
  	Date: 11/2/2017
*/

// 4. Your pseudocode algorithm for how to break down the figure
// First I wrote out each line of asterisks as individual println.
// Then I broke the pieces down into three methods based on pattern structures.
// Finally, I made three additional methods to remove redundancy.


public class StarFigures {

	public static void main(String[] args) {
		drawset1();
		drawset2();
		drawset3();
	}
	
	public static void figure1() {
		System.out.println("*****");
		System.out.println("*****");
	}
	public static void figure2() {
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}
	
	public static void figure3() {
		System.out.println("  *  ");
		System.out.println("  *  ");
		System.out.println("  *  ");
		
	}
	
	public static void drawset1() {
		figure1();
		figure2();
		System.out.println();
		System.out.println();
	}
	
	public static void drawset2() {
		figure1();
		figure2();
		figure1();
		System.out.println();
		System.out.println();
	}
	
	public static void drawset3() {
		figure3();
		figure1();
		figure2();
	}
}
	

