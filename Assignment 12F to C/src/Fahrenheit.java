public class Fahrenheit
{
	private double fahrenheit, cel,  mul, sub, fah,div;

	public void getFahrenheit(double temp)
	{
        cel= temp;


	}

	public void getCelsius(double temp)
	{
        fah = temp;

		cel = ((fah - 32) *5.0)/ 9.0;
		
		System.out.println(cel);


	}

}