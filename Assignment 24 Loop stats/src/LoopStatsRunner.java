import static java.lang.System.*;

import java.util.Scanner;

public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		Scanner keys = new Scanner(System.in);
        LoopStats lib = new LoopStats();

        System.out.println("Enter your first number: ");
        int start=keys.nextInt();

        System.out.println("Enter Your Second Number: ");
        int stop = keys.nextInt();


        System.out.println(" Number of Even Numbers: " + lib.getEvenCount());
        System.out.println(" Number of Odd Numbers: " + lib.getOddCount());

	}
}