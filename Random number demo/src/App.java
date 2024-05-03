import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    Scanner keys = new Scanner(System.in);


    // System.out.println("enter an integer; ");
    // int int1= keys.nextInt();

    // System.out.println("enter another integer: ");
    // int int2 = keys.nextInt();

    // System.out.println("enter a decimal: ");
    // double dbl1 = keys.nextDouble();

    System.out.println("enter another decimal; ");
    double dbl2 = keys.nextDouble();


    for (int i =0; i < 10; i++)
    System.out.println("the number is: " + rdInt(100,10) );
        
    



    }



    public static double rdDbl1(double max){
        double gen = Math.random()*max;

        return gen;



    }








    public static int rdInt(int min, int max ) {
        double gen = Math.random() * (max - min) + min;

        return (int) gen;


    }
    




}

