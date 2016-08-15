/**
 * @(#)PassengerPanel.java
 *
 *
 * @author Nathan Young
 * @version 1.00 2015/11/24
 */

import javax.swing.*;
import java.awt.*;

public class PassengerPanel extends JPanel
{
	public final double PASSENGER_FEE = 0.05;

	private JTextField vehicleAxles;


	public PassengerPanel()
	{
		setLayout(new GridLayout(1, 1));

		vehicleAxles = new JTextField("Passengers");

		setBorder(BorderFactory.createTitledBorder("Passengers"));

		add(vehicleAxles);
	}

	public double getPassengerCost()
	{
		double passengerCost = 0.05;
		int numPassengers = Integer.parseInt(vehicleAxles.getText());
		System.out.println("PASSENGER INPUT: " + numPassengers);

		if (numPassengers >= 1)
		{
			passengerCost = numPassengers * 0.05;
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Invalid Entry!\n"+
				"Your vehicle must have at least one passenger (driver)");
		}
		return passengerCost;
	}
}
