package testing;

import static org.junit.Assert.*;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

import org.junit.Test;

public class studentTest {

	@Test
	public void test() {
		Dictionary geek = new Hashtable();
		for(int i = 0; i < 10; i++){
	    	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    	System.out.println("Enter student name: ");
	//  
	    	String name = myObj.nextLine();
	      
	    	Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
	    	System.out.println("Enter result (1 = PASS, 2 = FAIL)");
	//  
	    	int val = myObj1.nextInt();
			geek.put(name,val);
		
		
		}
		
		StudentTesting test = new StudentTesting();
		String output = test.stdnt_result(geek);
		assertEquals("Bonus to Instructor", output);
	}
//	@Test
//	public void test2() {
//		
//	}

}
