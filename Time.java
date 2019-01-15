import java.time.LocalTime;
import java.util.*;

public class Time {
      
	public static void main(String args[]){
		
		 LocalTime time = LocalTime.now();
		 
		 System.out.println(time);
		 
		 //Methods
		 System.out.println(time.plusHours(2));
		 System.out.println(time.plusMinutes(120));
		 
		 System.out.println(time.minusHours(3));
		 System.out.println(time.minusMinutes(40));
		 
   //In Detail	
		 long mills = System.currentTimeMillis();
		 java.util.Date date1 = new java.util.Date(mills);
		 System.out.println(date1);

		 
	}
}
