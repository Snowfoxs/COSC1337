/**
 * @(#)VehiclePanel.java
 *
 *
 * @author Nathan Young
 * @version 1.00 2015/11/24
 */

import javax.swing.*;
import java.awt.*;

public class VehiclePanel extends JPanel
{
	public final double TWO_AXLES = 0.2;
	public final double THREE_AXLES = 0.35;
	public final double FOUR_AXLES = 0.55;
	public final double FIVEPLUS_AXLES = 1.0;

	private JRadioButton twoAxles;
	private JRadioButton threeAxles;
	private JRadioButton fourAxles;
	private JRadioButton fivePlusAxles;
	private ButtonGroup bg;

	public VehiclePanel()
	{
		setLayout(new GridLayout(4,1));
		twoAxles = new JRadioButton("Two Axles", true);
		threeAxles = new JRadioButton("Three Axles");
		fourAxles = new JRadioButton("Four Axles");
		fivePlusAxles = new JRadioButton("Five + Axles");

		bg = new ButtonGroup();
		bg.add(twoAxles);
		bg.add(threeAxles);
		bg.add(fourAxles);
		bg.add(fivePlusAxles);

		setBorder(BorderFactory.createTitledBorder("Vehicle Data"));

		add(twoAxles);
		add(threeAxles);
		add(fourAxles);
		add(fivePlusAxles);
	}

	public double getVehicleCost()
	{
		double vehicleCost = 0.0;

		if (twoAxles.isSelected())
		{
			vehicleCost = TWO_AXLES;
		}
		else if (threeAxles.isSelected())
		{
			vehicleCost = THREE_AXLES;
		}
		else if (fourAxles.isSelected())
		{
			vehicleCost = FOUR_AXLES;
		}
		else if (fivePlusAxles.isSelected())
		{
			vehicleCost = FIVEPLUS_AXLES;
		}

		return vehicleCost;
	}
}