/**
 * @(#)TrailerPanel.java
 *
 *
 * @author Nathan Young
 * @version 1.00 2015/11/24
 */

import javax.swing.*;
import java.awt.*;

public class TrailerPanel extends JPanel
{
	public final double ZERO_AXLES = 0.0;
	public final double ONE_AXLE = 0.1;
	public final double TWO_AXLES = 0.15;
	public final double THREEPLUS_AXLES = 0.25;

	private JRadioButton noAxles;
	private JRadioButton oneAxle;
	private JRadioButton twoAxles;
	private JRadioButton threePlusAxles;
	private ButtonGroup bg;


	public TrailerPanel()
	{
		setLayout(new GridLayout(4, 1));

		noAxles = new JRadioButton("No Trailer", true);
		oneAxle = new JRadioButton("One Axle");
		twoAxles = new JRadioButton("Two AXles");
		threePlusAxles = new JRadioButton("Three + Axles");

		bg = new ButtonGroup();
		bg.add(noAxles);
		bg.add(oneAxle);
		bg.add(twoAxles);
		bg.add(threePlusAxles);


		setBorder(BorderFactory.createTitledBorder("Trailer Data"));

		add(noAxles);
		add(oneAxle);
		add(twoAxles);
		add(threePlusAxles);
	}

	public double getTrailerCost()
	{
		double trailerCost = 0.0;

		if (noAxles.isSelected())
		{
			trailerCost = ZERO_AXLES;
		}
		else if (oneAxle.isSelected())
		{
			trailerCost = ONE_AXLE;
		}
		else if (twoAxles.isSelected())
		{
			trailerCost = TWO_AXLES;
		}
		else if (threePlusAxles.isSelected())
		{
			trailerCost = THREEPLUS_AXLES;
		}

		return trailerCost;
	}
}
