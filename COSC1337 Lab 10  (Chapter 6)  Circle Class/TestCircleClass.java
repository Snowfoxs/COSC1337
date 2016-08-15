/**
 * @(#)TestCircleClass.java
 *
 *
 * @Author Nathan Young
 * @version 1.00 2015/11/05
 */

import java.util.*;

public class TestCircleClass
{
	public static void main (String[] args)
	{
		// Setting Valid Data
		double radius = 1.0;
		double goodData = 10.0;
		double badData = -5.0;
		double circumference = 0.0;
		double area = 0.0;
		double diameter = 0.0;
		final double PI = 3.14159;

		// Testing
		CircleClass circle = new CircleClass(radius);

		radius = circle.getRadius();
		if (radius == 1.0)
		{
			System.out.println("Passed Setting Radius as argument");
		}
		else
		{
			System.out.println("Failed to set Radius as argument");
		}

		CircleClass noargCircle = new CircleClass();

		radius = noargCircle.getRadius();
		if (radius == 0.0)
		{
			System.out.println("Passed no-arg");
		}
		else 
		{
			System.out.println("Failed no-arg");
		}

		radius = 1.0;

		circle.setRadius(goodData);
		radius = circle.getRadius();
		if (radius == 10.0)
		{
			System.out.println("Passed setRadius");
		}
		else 
		{
			System.out.println("Failed setRadiys");
		}

		circle.setRadius(badData);
		radius = circle.getRadius();
		if (radius == 10.0)
		{
			System.out.println("Passed setRadius");
		}
		else 
		{
			System.out.println("Failed setRadius");
		}

		diameter = circle.getDiameter();
		if (diameter == 20)
		{
			System.out.println("Passed Diameter");
		}
		else 
		{
			System.out.println("Failed Diameter");
		}

		area = circle.getArea();
		if (area == PI * radius * radius)
		{
			System.out.println("Passed Area");
		}
		else
		{
			System.out.println("Failed Area");
		}

		circumference = circle.getCircumference();
		if (circumference == 2 * PI * radius)
		{
			System.out.println("Passed Circumference");
		}
		else 
		{
			System.out.println("Failed Circumference");
		}
	}
}