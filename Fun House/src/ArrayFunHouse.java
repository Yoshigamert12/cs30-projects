import java.lang.System;
import java.lang.Math;

public class ArrayFunHouse
{
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
        int Sum=0;
		for (int i =start; i <=stop; i++){
			Sum+=numArray[i];

		}
		return Sum; 
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		 int cout=0;
		for (int i = 0 ; i< numArray.length; i++){

		
			if (numArray[i] == val){
			cout++;
		}
		
		
		}
		
		
		
		return cout;
		}
	

	public static int[] removeVal(int[] numArray, int val)
	{
			
		for (int i = 0 ; i< numArray.length; i++){

		
			if (numArray[i] == val){
				numArray[i]=0;
		}
		
		
		}
			return numArray;
			
	}
}
