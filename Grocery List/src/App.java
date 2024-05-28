import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner keys = new Scanner (System.in);
    
        String [] item = {};
        int added;
        System.out.println("what would you like to add to your list");
        added = keys.nextInt();
        System.out.println("Your list " + item[added]);
    }

}
