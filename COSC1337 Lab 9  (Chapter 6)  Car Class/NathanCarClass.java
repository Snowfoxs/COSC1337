/**
 * @(#)NathanCarClass.java
 *
 *
 * @Author Nathan Young
 * @version 1.00 2015/10/29
 */


public class NathanCarClass
{
	// Fields
	private int yearModel = 0; // Car's Year Model
	private String make = " "; // Car's Make
	private int carSpeed = 0; // Car's Current Speed
	private String direction = "north"; // Car's human-readable direction


	/**
	Constructor which accepts values as arguments and assigns them to the 
	corresponding fields.
	@param passedYearModel int value for the year model provided
	@param passedMake String value for the make provided
	@param passedSpeed double value for the speed provided
	@param passedDirection String value for car's direction
	*/
	public NathanCarClass(int passedYearModel, String passedMake,
		int passedSpeed, String passedDirection)
	{
		yearModel = passedYearModel;
		make = passedMake;
		carSpeed = passedSpeed;
		direction = passedDirection;
	}

	/**
	Data Setter for make
	*/
	public void setMake(String passedMake)
	{
		make = passedMake;
	}

	/**
	Data Setter for yearModel
	*/
	public void setYearModel(int passedYearModel)
	{
		if (passedYearModel < 1886)
		{
			System.out.println("The first gasoline car was invented in 1886!");
		}
		else 
		{
			yearModel = passedYearModel;
		}
	}

	/**
	Data Setter for direction
	*/
	public void setDirection(String passedDirection)
	{
		if (passedDirection.equals("north"))
		{
			direction = "north";
		}
		else if (passedDirection.equals("east"))
		{
			direction = "east";
		}
		else if (passedDirection.equals("south"))
		{
			direction = "south";
		}
		else if (passedDirection.equals("west"))
		{
			direction = "west";
		}
		else 
		{
			System.out.println("Invalid direction");
		}
	}

	/**
	Data Setter for car's speed
	*/
	public void setSpeed(int passedSpeed)
	{
		carSpeed = passedSpeed;
		if (carSpeed < 0)
		{
			System.out.println("You cannot have a negative speed!");
			carSpeed = 0;
		}
	}

	/**
	rightTurn changes the direction one compass point to the right.
	@param direction is the parameter passed in for direction.
	*/
	public void rightTurn()
	{
		if (direction.equals("north"))
		{
			direction = "east";
		}
		else if (direction.equals("east"))
		{
			direction = "south";
		}
		else if (direction.equals("south"))
		{
			direction = "west";
		}
		else if (direction.equals("west"))
		{
			direction = "north";
		}
		else
		{
			System.out.println("INVALID DIRECTION!");
		}
	}

	/**
	leftTurn changes the direction one compass point to the left.
	@param direction is the parameter passed in for direction.
	*/
	public void leftTurn()
	{
		if (direction.equals("north"))
		{
			direction = "west";
		}
		else if (direction.equals("west"))
		{
			direction = "south";
		}
		else if (direction.equals("south"))
		{
			direction = "east";
		}
		else if (direction.equals("east"))
		{
			direction = "north";
		}
		else
		{
			System.out.println("INVALID DIRECTION!");
		}
	}

	/**
	accelerate adds 5 to the speed every time it is called
	@param is the current speed
	*/
	public void accelerate()
	{
		getSpeed();
		carSpeed = carSpeed + 5;
		setSpeed(carSpeed);

	}

	/**
	brake subtracts 5 to the speed every time it is called
	@param is the current speed
	*/
	public void brake()
	{
		if (carSpeed > 5)
		{
			carSpeed -= 5;
		}
		else if (carSpeed <= 5)
		{
			carSpeed = 0;
		}
	}

	/**
	Data Accessor for yearModel
	@return 
	*/
	public int getYearModel()
	{
		return yearModel;
	}

	/**
	Data Accessor for car's make
	@return make returns car's make
	*/
	public String getMake()
	{
		return make;
	}

	/**
	Data Accessor for car's direction
	@return direction returns the direction
	*/
	public String getDirection()
	{
		return direction;
	}

	/**
	Data Accessor for car's speed
	@return returns the car's speed
	*/
	public int getSpeed()
	{
		return carSpeed;
	}
}