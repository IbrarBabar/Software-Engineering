package testing;
import java.util.*;
public class StudentTesting {
	
	public String stdnt_result(Dictionary<String,String> geek ) {
		int get_count = 0;
		for (Enumeration i = geek.elements(); i.hasMoreElements();)
		{
			//System.out.println("Value in Dictionary : " + i.nextElement());
			int val = (int)i.nextElement();
		//	System.out.println(val);
			if(val == 1) {
				get_count++;
			//	System.out.println("Inside If");
			
		}
		}
		
		System.out.println("Summary of Student is here: ");
		System.out.println(geek);
	
	
	if(get_count >= 8) {
		//	
			System.out.println("Test Results : Bonus to Instructor");
			return "Bonus to Instructor";
		}
	else {
			System.out.println("No Bonus Available");
			return "No Bonus Avaialble";
	}
	
}

}
