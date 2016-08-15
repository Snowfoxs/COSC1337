/**
 * @(#)TollFees.java
 *
 *
 * @author Nathan Young
 * @version 1.00 2015/9/17
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TollFeesRedux {
    final double twoVehAxles = 0.25;
    final double threeVehAxles = 0.30;
    final double fourVehAxles = 0.45;
    final double fiveVehAxles = 1.00;
    final double oneTrailerAx = 0.15;
    final double twoTrailerAx = 0.20;
    final double threeTrailerAx = 0.25;
    final double passengerFee = 0.05;

    public static void main(String[] args)
    {
    	new TollFeesRedux().calculateToll();
        System.exit(0);
    }

    /**
        The getVehAxles method gets the number of axles which the vehicle has
        from the user, and returns the user's input.
        @return returns the number of axles which the user entered.
    */
    public int getVehAxles()
    {
        int vehicleAxles = 0;

        while (vehicleAxles <= 1)
        {
            vehicleAxles = Integer.parseInt(JOptionPane.showInputDialog("How "+
                "many axles does your vehicle have? (Please enter " +
                    "a whole number greater than one)"));
        	if (vehicleAxles == 1)
        	{
        		System.out.println("This idiot must be on a segway.");
        	} else if (vehicleAxles < 0)
        	{
        		System.out.println("NO! NO NO NO NO. NO! Idiot.");
        	}
        }

        return vehicleAxles;
    }
    /**
        The getTrailerAxles method gets the number of axles which the trailer
        has, if there is no trailer, there should be 0 trailer axles.
        @return returns the number of trailer axles the user entered.
    */
    public int getTrailerAxles()
    {
        int trailerAxles = -1;

        while (trailerAxles < 0)
        {
            trailerAxles = Integer.parseInt(JOptionPane.showInputDialog("How "+
                "many axles does your trailer have? (Please enter " +
                    "a whole number greater than zero" +
                    " If you do not have a trailer, enter zero"));
        }

        return trailerAxles;
    }
    /**
        The getPassengers method gets the number of passengers in the vehicle
        and returns the value entered by the user.
        The value should include the driver of the vehicle. 
        @return returns the number of passengers in the vehicle.
    */
    public int getPassengers()
    {
        int passengers = 0;

        while (passengers <= 0)
        {
            passengers = Integer.parseInt(JOptionPane.showInputDialog("How "+
                "many passengers does your vehicle have? (Please include " +
                    "the driver."));
        }
        return passengers;
    }
    /**
        The calcPassengers method calculates the toll to be applied based on 
        the number of passengers returned by the getPassengers method, and 
        returns the toll for the passengers.
        @return returns the toll for the number of passengers entered.
    */
    public double calcPassengers()
    {
        double passengerToll = 0.00;
        int passengers = 0;
        passengers = getPassengers();
        passengerToll = (passengerFee*passengers);

        return passengerToll;
    }
    /**
        The calcVehicleToll method determines how much the user should pay based
        on the number of axles their vehicle has, as returned by getVehicleAxles
        @return returns the toll for the vehicle.
    */
    public double calcVehicleToll()
    {
        int axles = 0;
        double vehToll = 0.00;
        axles = getVehAxles();

        if (axles == 2)
        {
            vehToll = twoVehAxles;
        }
        else if (axles == 3)
        {
            vehToll = threeVehAxles;
        }
        else if (axles == 4)
        {
            vehToll = fourVehAxles;
        }
        else if (axles >= 5)
        {
            vehToll = fiveVehAxles;
        }

        return vehToll;
    }
    /**
        The calcTrailerToll method determines how much the user should pay based
        on the number of axles their trailer has, if they have a trailer.
        users should enter 0 if they do not have a trailer.
        @return returns the toll for the trailer.
    */
    public double calcTrailerToll()
    {
        int axles = 0;
        double trailerToll = 0.00;
        axles = getTrailerAxles();

        if (axles == 0)
        {
            trailerToll = 0.00;
        }
        else if (axles == 1)
        {
            trailerToll = oneTrailerAx;
        }
        else if (axles == 2)
        {
            trailerToll = twoTrailerAx;
        }
        else if (axles >= 3)
        {
            trailerToll = threeTrailerAx;
        }

        return trailerToll;
    }

    /**
        The calculateToll method calculates the toll by combining the return
        values of calcVehcileToll, calcTrailerToll, and calcPassengers.
    */
   	public void calculateToll()
    {
        double vehToll = 0.00;
        double trailerToll = 0.00;
        double passengerToll = 0.00;

        vehToll = calcVehicleToll();
        trailerToll = calcTrailerToll();
        passengerToll = calcPassengers();

        printToll(vehToll, trailerToll, passengerToll);
    }

    /**
        The printToll method is called by the calculateToll method.
        The printToll method accepts vehicle toll, trailer toll, and 
        passenger toll, and adds them to create a final toll, and then
        prints the result for the user.
        @param vehicle toll
        @param trailer toll
        @param passenger toll
    */

    public void printToll(double vehToll, double trailerToll, double passFee)
    {
        DecimalFormat formatter = new DecimalFormat("$0.00");
        double totalToll = 0.00;
        totalToll = (vehToll+trailerToll+passFee);

        JOptionPane.showMessageDialog(null, "Vehicle Toll: " + vehToll +
            "\nTrailer Toll: " + trailerToll + "\nPassenger Toll: " +
            passFee + "\nTotal Due: " + totalToll);
    }
}