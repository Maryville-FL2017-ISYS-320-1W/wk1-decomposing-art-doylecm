/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 
 * writes "Done with Main"
 * writes "This is Message1"
 * writes "This is Message2" many times
 * then it gets a StackOverflowError because the method keeps calling itself until it runs out of memory.
 * */

 

public class Tricky {
	   public static void main(String[] args) {
	        message1();
	        message2();
	        System.out.println("Done with main.");
	    }
	    
	    public static void message1() {
	        System.out.println("This is message1.");
	    }
	    
	    public static void message2() {
	        System.out.println("This is message2.");
	        message1();
	        System.out.println("Done with message 2.");
	    }
}

// 3. I was not correct. I really thought I had it, but it doesn't have any runtime errors. It reads the main string, writes
// message 1, then goes to message2, writes message2, then writes message1 again, completes message2 and then completes 
// the main string.
 
 

