/**
 * @(#)WeightConversion.java
 *
 *
 * @author Nathan Young
 * @version 1.00 2015/11/12
 */

import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
   The WeightConversion class displays a JFrame that
   lets the user enter a weight in pounds. When
   the Calculate button is clicked, a dialog box is
   displayed with the weight converted to the form the user chooses.
*/

public class WeightConversion extends JFrame
{
   private JPanel panel;
   private JLabel messageLabel;
   private JTextField poundsTextField;
   private JButton calcOunceButton;
   private JButton calcKiloButton;
   private JButton calcGrainsButton;
   private JButton exitButton;
   private final int WINDOW_WIDTH = 400;
   private final int WINDOW_HEIGHT = 170; 

   /**
      Constructor
   */

   public WeightConversion()
   {
      setTitle("Weight Conversion");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buildPanel();
      add(panel);
      setVisible(true);
   }

   /**
      The buildPanel method adds a label, text field, and
      and buttons to a panel.
   */

   private void buildPanel()
   {
      messageLabel = new JLabel("Enter a weight " +
                                "in pounds");

      poundsTextField = new JTextField(10);

      calcOunceButton = new JButton("Calculate Ounces");
      calcKiloButton = new JButton("Calculate Kilograms");
      calcGrainsButton = new JButton("Calculate Grains");
      exitButton = new JButton("Exit");

      calcOunceButton.addActionListener(new calcOunceButtonListener());
      calcKiloButton.addActionListener(new calcKiloButtonListener());
      calcGrainsButton.addActionListener(new calcGrainsButtonListener());
      exitButton.addActionListener(new exitButtonListener());

      panel = new JPanel();

      panel.add(messageLabel);
      panel.add(poundsTextField);
      panel.add(calcOunceButton);
      panel.add(calcKiloButton);
      panel.add(calcGrainsButton);
      panel.add(exitButton);
   }

   /**
   exitButtonListener is an action listener class for the exit button.
   */

   private class exitButtonListener implements ActionListener
   {
         /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
         */

         public void actionPerformed(ActionEvent e)
         {
            System.exit(0);
         }
   }

   /**
      calcOunceButtonListener is an action listener class for
      the Calculate Ounces button.
   */

   private class calcOunceButtonListener implements ActionListener
   {
      /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
      */

      public void actionPerformed(ActionEvent e)
      {
         final double CONVERSION = 16;
         String input; 
         double ounces;
         DecimalFormat formatter = new DecimalFormat("0.0000");

         input = poundsTextField.getText();
         
         System.out.println("Reading " + input +
                            " from the text field.");
         System.out.println("Converted value: " +
                            Double.parseDouble(input));

         ounces = Double.parseDouble(input) * CONVERSION;

         if (ounces <= 0)
         {
            JOptionPane.showMessageDialog(null, "Input must be above 0");
         }
         else
         {
         JOptionPane.showMessageDialog(null, input +
                  " pounds is " + formatter.format(ounces) + " ounces.\n" +
                  "Using 1 pound = 16 ounces");
         }

         System.out.println("Ready");
      }
   }


   /**
      calcKiloButtonListener is an action listener class for
      the Calculate Kilograms button.
   */

     private class calcKiloButtonListener implements ActionListener
   {
      /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
      */

      public void actionPerformed(ActionEvent e)
      {
         final double CONVERSION = 0.453592;
         String input;
         double kilos;
         DecimalFormat formatter = new DecimalFormat("0.0000");

         input = poundsTextField.getText();
         
         System.out.println("Reading " + input +
                            " from the text field.");
         System.out.println("Converted value: " +
                            Double.parseDouble(input));

         kilos = Double.parseDouble(input) * CONVERSION;

         if (kilos <= 0)
         {
            JOptionPane.showMessageDialog(null, "Input must be above 0");
         }
         else
         {
         JOptionPane.showMessageDialog(null, input +
                  " pounds is " + formatter.format(kilos) + " kilograms.\n" +
                  "Using 1 pound = 0.453592 Kilograms");
         }

         System.out.println("Ready");
      }
   }

   /**
      calcGrainsButtonListener is an action listener class for
      the Calculate Grains button.
   */

     private class calcGrainsButtonListener implements ActionListener
   {
      /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
      */

      public void actionPerformed(ActionEvent e)
      {
         final double CONVERSION = 7000;
         String input;
         double grains;
         DecimalFormat formatter = new DecimalFormat("0.0000");

         input = poundsTextField.getText();

         System.out.println("Reading " + input +
                            " from the text field.");
         System.out.println("Converted value: " +
                            Double.parseDouble(input));

         grains = Double.parseDouble(input) * CONVERSION;

         if (grains <= 0)
         {
            JOptionPane.showMessageDialog(null, "Input must be above 0");
         }
         else
         {
         JOptionPane.showMessageDialog(null, input +
                  " pounds is " + formatter.format(grains) + " grains.\n" +
                  "Using 1 pound = 7000 grains");
         }

         System.out.println("Ready");
      }
   }

   /**
      The main method creates an instance of the
      KiloConverter class, which displays
      its window on the screen.
   */

   public static void main(String[] args)
   {
      new WeightConversion();
   }
}