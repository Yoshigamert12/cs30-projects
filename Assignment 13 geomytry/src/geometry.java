
import java.util.Scanner;  
import java.lang.Math;

public class geometry{


    public static void main(String[] args) {
        Scanner inpt  = new Scanner(System.in);  
        MathforCalc calc = new MathforCalc();


        System.out.println("Enter the length");

        Double lenght = inpt.nextDouble();  
        System.out.println("Length is: " + lenght );  
        
        
         
        System.out.println("Enter the width");

        Double widht = inpt.nextDouble();  
        System.out.println("Width is: " + widht );  
        calc.perimeter (lenght, widht);
        
        System.out.println("    Enter the Side");

        Double sied = inpt.nextDouble();  
        System.out.println("Side is: " + sied ); 
        calc.surfaceArea (sied);

        System.out.println("    Enter the Radius");

        Double Raduis = inpt.nextDouble();  
        System.out.println("Length is: " + Raduis ); 
        calc.circleArea(Raduis);

        

    }


     
      







     
        


     

    









}



