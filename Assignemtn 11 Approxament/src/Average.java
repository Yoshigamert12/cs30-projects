public class Average
{
	//instance variables
	private double one, two, sum, thr;

	public void setNums(double num1, double num2, double num3)
	{
		one=num1;
		two=num2;
		thr=num3;



	}

	public void sum( )
	{
		sum= one + two;
		



	}
	public void print( )
	{
		System.out.println(sum);
		


	}
	public void average( ){

		double ave= sum / thr;
		System.out.println(ave);


	}
	
}