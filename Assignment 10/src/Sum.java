public class Sum
{
	//instance variables
	private double one, two, sum, dub, rem, thr, div;

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

    public void duble( )
    {
        dub = sum * 2;
        System.out.println(dub);
    
    }

    public void remain ()
    {
        rem = dub % 3;
        System.out.println(rem);

    }
    public void divide() {

        div= sum/thr;
        System.out.println(div);


    }

    


}
