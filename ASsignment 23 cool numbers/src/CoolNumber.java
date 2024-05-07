import static java.lang.System.*;
import java.util.Scanner;



public class CoolNumber {

	public static boolean isCoolNumber( int num )
	{
        if (num % 3 ==1 && num % 4 ==1 && num % 5 ==1 && num % 6 ==1){
		return true;
		}					
	else {				
		 return false;
	}
		

	}
	
	
	public int countCoolNumbers( int stop )
	{
	int count =0;
		for (int i =6; i <= stop; i++){
			if (isCoolNumber(i)){
				return count + 1;

			} else {
				return count ;
			}

		}
		
		

		



		
	}






}
