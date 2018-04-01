import java.util.Random;

public class Leapyear {



	    static boolean checkYear(int year)
	    {
	        // If a year is multiple of 400, 
	        // then it is a leap year
	        if (year % 400 == 0)
	            return true;
	     System.out.println("point 1");
	        // Else If a year is muliplt of 100,
	        // then it is not a leap year
	        if (year % 100 == 0)
	            return false;
	     System.out.println("point2");
	        // Else If a year is muliplt of 4,
	        // then it is a leap year
	        if (year % 4 == 0)
	            return true;
	        return false;
	    }
	         
	    // Driver method
	    public static void main(String[] args) 
	    {
	       // int year = 1700;
	        System.out.println( checkYear(104)? "Leap Year" :
	                           "Not a Leap Year" );
	    }
	}
