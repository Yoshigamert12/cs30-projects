public class Sum
{
	//instance variables
	private double one, two, sum, dub, rem;

	public void setNums(double num1, double num2)
	{
        one=num1;
        two=num2;


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


}
