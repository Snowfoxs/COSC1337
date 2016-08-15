/**
 * @(#)TaxCalculator.java
 *
 *
 * @Nathan Young
 * @version 1.00 2015/9/10
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TaxCalculator {

    public static void main(String[] args)
    {
    	int acres;
    	double taxRate, appraisedValue, totalTax, taxPerAcre;

    	// Initialize scanner
    	Scanner keyboard = new Scanner (System.in);

    	// Prompt for acres
    	System.out.println("Please enter the number of acres");
    	acres = keyboard.nextInt();
    	System.out.println(acres + " Acres");

    	// Prompt for tax rate
    	System.out.println("Please enter the tax rate");
    	taxRate = (keyboard.nextDouble() * 0.01);
    	System.out.println(taxRate + " Tax Rate");

    	//Prompt for Appraised Value
    	System.out.println("Please enter the appraised value");
    	appraisedValue = keyboard.nextDouble();
    	System.out.println(appraisedValue + " Appraised Value");

    	//Calculate Outputs
    	totalTax = (taxRate * appraisedValue);
    	taxPerAcre = (totalTax / acres);

    	// Generate Output
    	JOptionPane.showMessageDialog(null, "Acres: " + acres +
    		"\nTax Rate: " + taxRate + "\nAppraised Value: " + appraisedValue +
    			"\nTotal Tax: " + totalTax + "\nTax Per Acre: " + taxPerAcre);
    }


}