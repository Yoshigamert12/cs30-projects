import static java.lang.System.*; 
import java.util.Scanner;





public class LeapYearRunner {

    public static void main(String[] args) {
    

        LeapYear ly = new LeapYear();
    Scanner imp = new Scanner(System.in);

    System.out.println("Enter a Year ");
    int year= imp.nextInt();

    if (ly.isLeapYear (year)) {

        System.out.println("Leap Year!!!:D");

    }else {
        System.out.println("NOT A LEAP YEAR >:(");

    }


    }
}
