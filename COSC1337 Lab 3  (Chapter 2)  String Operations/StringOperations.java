/**
 * @(#)StringOperations.java
 *
 *
 * @Nathan Young
 * @version 1.00 2015/9/17
 */
import javax.swing.JOptionPane;


public class StringOperations {

    public static void main(String[] args)
    {
    	String name;
    	String nameUpper;
    	String nameLower;
    	int nameLength;
    	// Get the name from user
    	name = JOptionPane.showInputDialog("Please enter your name.");
    	// Figure out how long it is
    	nameLength = name.length();
    	// make it all lowercase
    	nameLower = name.toLowerCase();
    	// make it all uppercase
    	nameUpper = name.toUpperCase();
    	// Display results
    	JOptionPane.showMessageDialog(null, "You input: " + name +
    		"\nLength: " + nameLength + "\nLowercase: " + nameLower +
    			"\nUppercase: " + nameUpper);
    	// Quitting
    	System.exit(0);

    }


}