import static java.lang.System.*;
import java.util.Scanner;


public class CoolNumberRunner {
    
public static void main(String[] args) throws Exception {
     Scanner keys = new Scanner(System.in);
        
     System.out.println("Enter a number to test");
        int nums = keys.nextInt();
        if (CoolNumber.isCoolNumber(nums)){
        System.out.println("Your number is a cool Number :D " + nums );
        } else {
            System.out.println("your number is not cool >:( " + nums);
        }

        
}
}
