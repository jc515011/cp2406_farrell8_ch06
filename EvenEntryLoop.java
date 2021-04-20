/**
 * Created by Yating Lei date 19/04/2020.
 */
import javax.swing.JOptionPane;
public class EvenEntryLoop {
    public static void main(String[] args)
    {
        // Declare Variables
        int myNumber=0;
        // Display Request for user to enter number
        do {
            myNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a whole number to check:", "Enter an Even number, or 999 to exit", JOptionPane.INFORMATION_MESSAGE));
            if((myNumber%2)==0){JOptionPane.showMessageDialog(null,"Good job!", "Enter an Even number, or 999 to exit" ,JOptionPane.PLAIN_MESSAGE);}
            if((myNumber%2)==1 && myNumber!=999){JOptionPane.showMessageDialog(null,"Error, " + myNumber + " is not an Even number", "Enter an Even number, or 999 to exit" ,JOptionPane.PLAIN_MESSAGE);}
        }while(myNumber!=999);
    }
}