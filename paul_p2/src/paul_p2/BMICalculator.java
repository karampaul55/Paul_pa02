// Karam Paul 2/1/2020

package paul_p2;
import java.util.* ;

public class BMICalculator {
	//Scanner made for the whole class
	Scanner scanner = new Scanner(System.in);
	
	//Instance Variables
	private int units;
	private double Weight;
	private double Height; 
	private double Bmi; 
	private String BmiCategory; 
	
	//This will allow the weight and height to be set by the user
	public void readUserData()
	{
		readUnitType();
		readMeasurementData();
	}
	
	//Instead of asking for a whole string in which users could make mistakes typing, I will use a flag (enter 1 or 2 in this case)
	private void readUnitType()
	{
		System.out.println("Please enter 1 for imperial units or 2 for metric units: ") ;
		units = scanner.nextInt() ;
		
		while (units != 1  && units != 2 )
			{
			System.out.println("Not valid. Please enter <1> or <2>: ") ;
			units = scanner.nextInt();
			}	
	}
	
	//Choosing which unit method to follow
	private  void readMeasurementData()
	{		
		if (units == 1)
		{
			readImperialData();
		}
		else 
		{
			readMetricData();
		}
	}
	
	//Provide metric weight and metric height
	private void readMetricData()
	{		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your height in meters: ");
		double height = scanner.nextFloat();
		System.out.println("Please enter your weight in kgs: ");
		double weight = scanner.nextFloat();
		setHeight(height);
		setWeight(weight);
	}
	
	//Provide imperial weight and imperial height
	private void readImperialData()
	{		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your height in inches: ");
		double height = scanner.nextFloat();
		System.out.println("Please enter your weight in lbs: ");
		double weight = scanner.nextFloat();
		setHeight(height);
		setWeight(weight);
	}
	
	//Using units as an instance variable, choose which equation should be used
	public void calculateBmi()
	{
		if (units == 1)
		{
			Bmi = ( 703*getWeight() ) / ( getHeight() * getHeight() ) ;
		}
		else 
		{
			Bmi = getWeight() / ( getHeight() * getHeight() ) ;
		}
		calculateBmiCategory();
	}
	
	//Pulled from National Heart, Lung and Blood Institute
	private void calculateBmiCategory()
	{
		if (Bmi < 18.5)
		{
			BmiCategory = "Underweight" ;
		}
		if (Bmi >= 18.5 && Bmi < 25)
		{
			BmiCategory = "Normal" ;
		}
		if (Bmi >= 25 && Bmi < 30)
		{
			BmiCategory = "Overweight" ;
		}
		if (Bmi > 30)
		{
			BmiCategory = "Obese" ;
		}
	}
	
	//Final Message
	public void displayBmi()
	{
		System.out.printf("BMI: %.2f" + "\nBMI Category: " + getBmiCategory(), getBmi() );
	}
	
	//Getters and Setters can be found below
	public double getWeight() 
	{
		return Weight;
	}

	public void setWeight(double weight) 
	{
		if (weight < 0)
		{
			System.out.println("Weight cannot be negative...Start Over");
			System.exit(0);
		}
		else
		{
			this.Weight = weight;
		}

	}

	public double getHeight() 
	{
		return Height;
	}

	public void setHeight(double height) 
	{
		if (height < 0)
			{
				System.out.println("Height cannot be negative...Start Over");
				System.exit(0);
			}
		else
			{
				this.Height = height;
			}	
	}
	

	public float getBmi() 
	{
		return (float) Bmi;
	}

	public String getBmiCategory() 
	{
		return BmiCategory;
	}
}
	
	

	
	

	

	
	
	
	
	
	
	
	
	
	
	
	


