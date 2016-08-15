/**
 * @(#)NathanCarClass_Test.java
 *
 *
 * @Author Nathan Young
 * @version 1.00 2015/10/29
 */

import java.util.*;

public class NathanCarClass_Test
{
	public static void main (String[] args)
	{
		// Setting Valid Parameters
		String make;
		int yearModel = 0;
		int carSpeed = 0;
		String direction = "north";

		// Testing

		NathanCarClass car1 = new NathanCarClass(2008, "Pontiac", 70, "north");

		make = car1.getMake();
		yearModel = car1.getYearModel();
		carSpeed = car1.getSpeed();
		direction = car1.getDirection();

		if (make.equals("Pontiac"))
		{
			System.out.println("Success setting make to valid value");
		}
		else
		{
			System.out.println("Failed to set make to valid value");
		}
		if (yearModel == 2008)
		{
			System.out.println("Success setting yearModel to valid value");
		}
		else
		{
			System.out.println("Failed to set yearModel to valid value");
		}
		if (carSpeed == 70)
		{
			System.out.println("Success setting carSpeed to valid value");
		}
		else
		{
			System.out.println("Failed to set carSpeed to valid value");
		}
		if (direction.equals("north"))
		{
			System.out.println("Success setting direction to valid value");
		}
		else
		{
			System.out.println("Failed to set direction to valid value");
		}

		// Testing acceleration and braking

		car1.accelerate();
		carSpeed = car1.getSpeed();
		if (carSpeed == 75)
		{
			System.out.println("Success accelerating");
		}
		else
		{
			System.out.println("Failed accelerating");
		}
		car1.brake();
		carSpeed = car1.getSpeed();
		if (carSpeed == 70)
		{
			System.out.println("Success braking");
		}
		else
		{
			System.out.println("Failed braking");
		}

		// Testing Directions

		car1.rightTurn();
		direction = car1.getDirection();
		if (direction.equals("east"))
		{
			System.out.println("Success turning right");
		}
		else 
		{
			System.out.println("Failed turning right");
		}
		car1.leftTurn();
		car1.leftTurn();
		direction = car1.getDirection();
		if (direction.equals("west"))
		{
			System.out.println("Success turning left");
		}
		else 
		{
			System.out.println("Failed turning left");
		}

		// Testing other methods 

		car1.setSpeed(-1);
		carSpeed = car1.getSpeed();
		if (carSpeed == 0)
		{
			System.out.println("setSpeed passed input validation");
		}
		else if (carSpeed == -1)
		{
			System.out.println("setSpeed failed input validation");
		}
		car1.setSpeed(4);
		carSpeed = car1.getSpeed();
		car1.brake();
		carSpeed = car1.getSpeed();
		if (carSpeed != 0)
		{
			System.out.println("setSpeed failed to handle number less than 5");
		}
		else
		{
			System.out.println("setSpeed success handling number less than 5");
		}

		car1.setMake("Test");
		make = car1.getMake();
		if (make.equals("Test"))
		{
			System.out.println("Success setting make");
		}
		else 
		{
			System.out.println("Failed to set make");
		}

		car1.setYearModel(20);
		yearModel = car1.getYearModel();
		if (yearModel != 2008)
		{
			System.out.println("Failed handling bad input for yearModel");
		}
		else
		{
			System.out.println("Success handling bad input for yearModel");
		}
		car1.setYearModel(2005);
		yearModel = car1.getYearModel();
		if (yearModel != 2005)
		{
			System.out.println("Failed setting yearModel");
		}
		else
		{
			System.out.println("Success setting yearModel");
		}

		car1.setDirection("south");
		direction = car1.getDirection();
		if (!direction.equals("south"))
		{
			System.out.println("Failed to set direction");
		}
		else 
		{
			System.out.println("Success setting direction");
		}

		car1.setDirection("imAnIdiot");
		direction = car1.getDirection();
		if (!direction.equals("south"))
		{
			System.out.println("Failed to handle bad input for setDirection");
		}
		else
		{
			System.out.println("Success handling bad input for setDirection");
		}
	}
}