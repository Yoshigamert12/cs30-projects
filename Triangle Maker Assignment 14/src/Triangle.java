import java.util.Scanner; 
import java.lang.Math.*;
import  java.util.Formatter;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   
	//    perimeter=0;
	//    theArea=0;
	}

	public Triangle(int a, int b, int c)
	{
        

	}
	public void setSides(int a, int b, int c)
	{


        sideA=a;
        sideB=b;
        sideC=c;
        
	}

	public void calcPerimeter( )
	{
        
      perimeter=sideA + sideB+ sideC ;
	  
	}

	public void calcArea( )
	{
		double s = perimeter / 2;
        
        
        theArea= Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		System.out.printf("The Area Of The Triangle Is " + "'%5.0f'%n" , theArea);
	}

	public void print( )
	{
		
		
	}
}