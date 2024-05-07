import static java.lang.System.*;
import java.util.Scanner;


public class CoolNumberRunner {
    
public static void main(String[] args) throws Exception {
    Scanner keys = new Scanner(System.in);
    CoolNumber lib= new CoolNumber();
    
    System.out.println( "Enter another number starting from 6" );
    int stop = keys.nextInt();
        
            
    System.out.println("The Amount of Cool Numbers From 6-" + stop + " is " + lib.countCoolNumbers(stop) );





}
}
