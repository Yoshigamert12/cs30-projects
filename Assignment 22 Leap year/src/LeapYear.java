import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	public static boolean isLeapYear( int year )
	{
		

		if (year % 400 == 0 ){
		return true;

		}




		else if (( year % 4 == 0) && ( year %100 !=0 )) {
			return true;
		}
		



		return false;
	}



}

