import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
     public static void main(String args[]){
    	 
    	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    	 LocalDateTime todayDate = LocalDateTime.now();
    	 System.out.println(dtf.format(todayDate));
    	 
    	 System.out.println("Day:"+ todayDate.getDayOfMonth());
    	 System.out.println("Month:"+todayDate.getMonthValue());
    	 System.out.println("Year:"+ todayDate.getDayOfYear());
    
   //Methods
    	 System.out.println(todayDate.plusDays(2));
    	 System.out.println(todayDate.plusMonths(3));
    	 
    	 System.out.println(todayDate.minusDays(4));
    	 System.out.println(todayDate.minusMonths(2));
     }
}
