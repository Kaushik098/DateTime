import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class TimeBetween {


	public static void main(String args[]){
		
		  ZoneId date1 = ZoneId.of("Asia/Kolkata");
		  ZoneId date2 = ZoneId.of("Australia/North");
		 

		  LocalTime t1 = LocalTime.now(date1);
		  LocalTime t2 = LocalTime.now(date2);
		  
		  System.out.println("India time "+ t1);
		  System.out.println("Australia North time "+ t2);
		  
		  //time betwwen two zones
		  
		  long hours = ChronoUnit.HOURS.between(t1, t2);
		  
		  System.out.println("The difference between australian time and indian time :"+ hours);
		  
	 }
}
