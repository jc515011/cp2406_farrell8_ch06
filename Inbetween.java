/**
 * Coded by Yating Lei on the tiring Monday 19/04/2020.
 */
import java.util.Scanner;
public class Inbetween {
    public static void main(String[] args)
    {
        // Declare Variables
        int myNumOne=0, myNumTwo=0;
        Scanner keyboard = new Scanner(System.in);
        // Display Request for user to enter numbers
        while(myNumOne==myNumTwo)
        {
            System.out.println("Enter a whole number to check:");
            myNumOne = keyboard.nextInt();
            System.out.println("Enter a second whole number to check:");
            myNumTwo = keyboard.nextInt();
            // Display Error message
            if (myNumOne == myNumTwo) {
                System.out.println("No Ints between " + myNumOne + " , and " + myNumTwo + " ");
                keyboard.nextByte();
            }
        }
        // Swap numbers if first is larger
        if(myNumOne>myNumTwo){int temp=myNumOne;myNumOne=myNumTwo;myNumTwo=temp;}
        for(int i=myNumOne+1;i<myNumTwo;i++)
        {
            // Display output on number count
            System.out.println(i + " , ");
        }
    }
}