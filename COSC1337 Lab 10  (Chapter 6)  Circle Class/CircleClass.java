/**
 * @(#)CircleClass.java
 *
 *
 * @Author Nathan Young
 * @version 1.00 2015/11/05
 */
import java.text.DecimalFormat;

public class CircleClass
{
	// Fields
	private double radius;
	private final double PI = 3.14159;
	DecimalFormat formatter = new DecimalFormat("0.000");

	/**
	Constructor which accepts values as arguments and assigns them to the
	corresponding fields.
	@param passedRadius is the radius value for the circle
	*/
	public CircleClass(double passedRadius)
	{
		radius = passedRadius;
	}

	/**
	No-Arg Constructor that sets radius to 0.
	*/
	public CircleClass()
	{
		radius = 0.0;
	}

	/**
	Data setter for radius
	@param is the radius input, must be greater than 0.
	*/
	public void setRadius(double passedRadius)
	{
		if (passedRadius <= 0.0)
		{
			System.out.println("Declined user input radius: " + 
				formatter.format(passedRadius));
		}
		else 
		{
			radius = passedRadius;
			System.out.println("Accepted user input radius: " + 
				formatter.format(passedRadius));
		}
	}

	/**
	Data Accessor for Radius
	@return returns the radius
	*/
	public double getRadius()
	{
		return radius;
	}

	/**
	Data Accessor for Area
	Calculates and returns the area on-demand
	@return returns the area
	*/
	public double getArea()
	{
		double area = 0.0;
		area = PI * radius * radius;
		System.out.println("Caulculated area: "+ formatter.format(area));
		return area;
	}

	/**
	Data Accessor for Diameter
	Calculates and returns diameter on-demand
	@return returns diameter
	*/
	public double getDiameter()
	{
		double diameter = 0.0;
		diameter = radius * 2;
		System.out.println("Caulculated diameter: "+ 
			formatter.format(diameter));
		return diameter;
	}

	/**
	Data Accessor for Circumference
	Calculates and returns Circumference on-demand
	@return returns circumference
	*/
	public double getCircumference()
	{
		double circumference = 0.0;
		circumference = 2 * PI * radius;
		System.out.println("Caulculated circumference: "+ 
			formatter.format(circumference));
		return circumference;
	}
}