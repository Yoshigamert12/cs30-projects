import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner (System.in);
        Random rand = new Random();
        int [] outcomes = new int[13];
        int numRolls;
        int result;

        System.out.print("Haw many rolls (max 13)? ");
        numRolls = keys.nextInt();


        if (numRolls>113){
            numRolls = 13;



        }
        else if ( numRolls <0){
            numRolls = 1;
        }

            for (int roll = 0; roll< numRolls; roll++){
                result = ( rand.nextInt(6) +1 ) + ( rand.nextInt(6) +1 );
                outcomes[roll] = result;
                System.out.println("Roll number "+ " is " + outcomes[roll]);
            }


            }
}
