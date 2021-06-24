package Lab_3;

import java.time.*;
import java.util.*;

public class Date_Time {  
   public static void main(String[] args)
    {
        LocalDate pdate = LocalDate.of(2017,10,15);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}
