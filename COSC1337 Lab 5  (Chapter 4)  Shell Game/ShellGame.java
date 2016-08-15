/**
 * @(#)ShellGame.java
 *
 *
 * @Nathan Young
 * @version 1.00 2015/10/1
 */
import java.util.Random;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ShellGame {

    public static void main(String[] args)
    {
    	int randShell = 1; // Random shell
    	int gameNumber = 0; // Self explanitory
		int numWon = 0;
		int numLost = 0;
    	int shell = 0; // The shell the user picks
    	double winnings = 0.00; // The user's winnings
    	boolean correct = false; // User input check
    	boolean userWin = false; // Check if user won
    	Random rand = new Random();

    for(gameNumber = 0; gameNumber < 5; gameNumber++)
    {
    	while (correct == false) // Begin picking shell
    	{
    		shell = pickShell();
    		System.out.println(shell);
    		if (shell > 0 && shell < 4)
    		{
    			correct = true;
    		}
    	} // End picking shell

    	randShell = randomize();
    	userWin = checkShell(shell, randShell);
    	winnings = winnings + checkWin(userWin);

    	if (userWin == true)
    	{
    		numWon++;
    	}
    	else
    	{
    		numLost++;
    	}
    	// Reset values
    	randShell = 1;
    	shell = 0;
    	correct = false;
    }
    displayTotals(numWon, numLost, winnings);
    System.exit(0);
    }

    public static int randomize()
    {
    	int shell = 0;
      	Random rand = new Random();
      	shell = rand.nextInt(3) + 1;
      	System.out.println(shell + " is the random shell");
      	return shell;
    }

    public static int pickShell()
    {
    	int shellPicked = 0;
    	shellPicked = Integer.parseInt(JOptionPane.showInputDialog(
    	"Which shell do you pick?\nPlease enter either 1, 2 or 3"));
    	return shellPicked;
    }
    public static boolean checkShell(int pickedShell, int randShell)
    {
    	if (pickedShell == randShell)
    	{
    		return true;
    	} else
    	{
    		return false;
    	}
    }
    public static double checkWin(boolean didWin)
    {
    	double winnings = 0.00;
    	if (didWin == true)
    	{
    		winnings = 1.00;
    		JOptionPane.showMessageDialog(null, "Congratulations, you won! " +
    			"$1.00 has been added to your winnings.");
    	} else
    	{
    		JOptionPane.showMessageDialog(null, "Uh-oh, you picked the wrong " +
    			"shell. You owe $2.00!");
    		winnings = -2.00;
    	}
    	return winnings;
    }
    public static void displayTotals(int numWon, int numLost, double winnings)
    {
    	DecimalFormat formatter = new DecimalFormat("$0.00");
    	JOptionPane.showMessageDialog(null, "Winnings: " +
    		formatter.format(winnings) +
    		"\nNumer Won: " + numWon + "\nNumber Lost: " + numLost);
    }
}
