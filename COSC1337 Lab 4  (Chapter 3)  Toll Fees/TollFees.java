/**
 * @(#)TollFees.java
 *
 *
 * @Nathan Young
 * @version 1.00 2015/9/17
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TollFees {

    public static void main(String[] args)
    {
    	String vehicleType;
    	int trailerYesNo = 1;
    	int vehicleAxles = 2;
    	int trailerAxles = 0;
    	double trailerToll = 0.00;
    	double vehicleToll = 0.00;
    	double totalToll = 0.00;
    	final double twoVehAxles = 0.25;
    	final double threeVehAxles = 0.30;
    	final double fourVehAxles = 0.45;
    	final double fiveVehAxles = 1.00;
    	final double oneTrailerAx = 0.15;
    	final double twoTrailerAx = 0.20;
    	final double threeTrailerAx = 0.25;


    	// Get vehicle info
    	vehicleType = JOptionPane.showInputDialog("Just a vehicle? or" +
    		" trailer too? (enter \"vehicle\" for vehicle only" +
    			"\nor \"trailer\" for a vehicle and trailer)");
    	vehicleType = vehicleType.toLowerCase();
    	System.out.println(vehicleType);

    	// figure out what they said
    	if (vehicleType.equals("vehicle"))
    	{
    		trailerYesNo = 1;
    	}
    	else if (vehicleType.equals("trailer"))
    	{
    		trailerYesNo = 2;
    	}
    	else
    	{
    		System.out.println("These guys are crazy." +
    			"Going with vehicle only.");
    		trailerYesNo = 1;
    	}
    	// Get axles
    	switch (trailerYesNo)
    	{
    		case 2:
    			System.out.println("User has trailer");
    			trailerAxles = Integer.parseInt(JOptionPane.showInputDialog(
    				"How many axles does your trailer have?"+
    					" (Please enter a whole number.)"+
    						"\nEnter 0 for no trailer"));
    			if (trailerAxles < 0)
    			{
    				JOptionPane.showMessageDialog(null, "Error: you may not" +
    					" have less than zero axles on your trailer.");
    					trailerAxles = 0;
    			}
    			System.out.println("Trailer Axles: " + trailerAxles);
    		default:
    			System.out.println("User hopefully has a vehicle");
    			vehicleAxles = Integer.parseInt(JOptionPane.showInputDialog(
    				"How many axles does your vehicle have?"+
    					" (Please enter a whole number."));
    			System.out.println("Vehicle Axles: " + vehicleAxles);
    			if (vehicleAxles < 2)
    			{
    				JOptionPane.showMessageDialog(null, "Error: you may not" +
    				" have less than two axles on your vehicle.");
    				vehicleAxles = 2;
    			}
    	}
    	// Calculate tolls

    	if (trailerAxles == 1)
    	{
    		trailerToll = oneTrailerAx;
    	}
    	else if (trailerAxles == 2)
    	{
    		trailerToll = twoTrailerAx;
    	}
    	else if (trailerAxles >= 3)
    	{
    		trailerToll = threeTrailerAx;
    	}
    	else
    	{
    		trailerToll = 0.00;
    	}
    	System.out.println("Trailer Toll: " + trailerToll);

    	if (vehicleAxles == 2)
    	{
    		vehicleToll = twoVehAxles;
    	}
    	else if (vehicleAxles == 3)
    	{
    		vehicleToll = threeVehAxles;
    	}
    	else if (vehicleAxles == 4)
    	{
    		vehicleToll = fourVehAxles;
    	}
    	else if (vehicleAxles >= 5)
    	{
    		vehicleToll = fiveVehAxles;
    	}
    	else
    	{
    		vehicleToll = twoVehAxles;
    	}
    	System.out.println("Vehicle Toll: " + vehicleToll);
    	totalToll = (vehicleToll + trailerToll);
    	System.out.println(totalToll);

    	DecimalFormat formatter = new DecimalFormat("$0.00");

    	JOptionPane.showMessageDialog(null,
    		"Trailer Axles: " + trailerAxles +
    		"\nVehicle Axles: " + vehicleAxles +
    		"\nTrailer Toll: " + formatter.format(trailerToll) +
    		"\nVehicle Toll: " + formatter.format(vehicleToll) +
    		"\nTotal Toll: " + formatter.format(totalToll));
    	System.exit(0);
    }
}