/**
 * @(#)TollCalculatorGUI.java
 *
 *
 * @author Nathan Young
 * @version 1.00 2015/11/24
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class TollCalculatorGUI extends JFrame
{
	private PassengerPanel passengers;
	private VehiclePanel vehicle;
	private TrailerPanel trailer;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;


	public TollCalculatorGUI()
	{
		setTitle("Toll Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		vehicle = new VehiclePanel();
		trailer = new TrailerPanel();
		passengers = new PassengerPanel();

		buildButtonPanel();

		add(vehicle, BorderLayout.WEST);
		add(trailer, BorderLayout.EAST);
		add(passengers, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	private void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		calcButton = new JButton("Calculate Toll");
		exitButton = new JButton("Exit");

		calcButton.addActionListener(new CalcButtonListener());
		exitButton.addActionListener(new ExitButtonListener());

		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}

	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double total = 0.0;

			total = vehicle.getVehicleCost() +
					trailer.getTrailerCost() +
					passengers.getPassengerCost();

			DecimalFormat dollar = new DecimalFormat("$0.00");

			JOptionPane.showMessageDialog(null, "Toll: " +
				dollar.format(total));
		}
	}

	private class ExitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
}