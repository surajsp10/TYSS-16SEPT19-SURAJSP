class Bmi
{
public static void main(String[] ar)
{
	double weight = 68,height = 1.69;
	double bmi = (weight/(height*height));
	if(bmi>=29.9)
	{
	System.out.println("You are in Obese range");
	}
	else if(bmi>=25)
	{
	System.out.println("You are in overweight range");
	}
	else if(bmi>=18.5)
	{
	
	System.out.println("You are in healthy weight range");
	}


	else if(bmi<18.5)
	{System.out.println("You are in underweight range");
	}
	

}
}