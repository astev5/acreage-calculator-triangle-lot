package cstevens_week2_revised;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 2 - Java Data & Operators
 * @Date: May 23, 2021
 * @Description: Write a program that will determine acreage of a triangular lot
 */
// Imports
import static java.lang.Math.*;
import java.util.Scanner;

// Begin Class Main
public class Main {

    // Begin Main Method
    public static void main(String[] args) {

        // Define variable types
        String name;

        // Since sideA and sideB can be entered as integer or double, and 
        // since output of sideC is double, sideA and sideB are float
        float sideA;
        float sideB;
        double sideC;

        // Acre is a constant denoted by 'final'
        // Since total acreage output is double, Acre must be float
        final double ACRE = 43560;
        double total_Acres;

        // Scanner obj allows user input to be read
        Scanner obj = new Scanner(System.in);

        // Introduction
        System.out.println("Hi there. What is your name?");

        // Get input for name
        name = obj.nextLine();
        System.out.println("Welcome to my triangle lot acreage calculator "
                + name + ".\n");

        System.out.println("Please enter the length of Side A of your lot in "
                + "feet:");

        // Get input for Side A
        sideA = obj.nextFloat();
        System.out.println("Thank you.");
        System.out.println("Please enter the length of Side B of your lot in "
                + "feet:");

        // Get input for Side B
        sideB = obj.nextFloat();

        // Calculate and print the length of Side C (hypotenuse)
        // Formula: sqrt(A squared + B squared)
        sideC = sqrt(pow(sideA, 2) + pow(sideB, 2));
        System.out.println("Excellent.");
        System.out.println("Side C (hypotenuse) of your triangle lot is: " 
                + sideC + " feet.\n");
        System.out.println("Pretty AWESOME stuff right?!");

        // Pause program, wait for enter from user to continue
        System.out.println("Press enter to reveal your lot's acreage.");
        try {
            System.in.read();
        } catch (Exception e) {
        }

        // Calculate and print the total acreage:
        // Formula: ((A*B)/2)/Acre
        total_Acres = ((sideA * sideB) / 2) / ACRE;
        System.out.print("The total acreage of your triangle lot is: ");
        System.out.println(total_Acres + " acres.\n");

        // Closing
        System.out.println("Thank you for using my triangle lot acreage "
                + "calculator. Ciao!");

    } // End Main Method

} // End Class Main

/* INSTRUCTOR FEEDBACK */
//Prof. Hickey:
//Per your feedback I have:
//1. Removed unused imports.
//2. Deleted 'Math.' from the pow and sqrt operators.
//3. Dialed back the extras.
//-Chad
//Chad Stevens , May 25 at 3:58am
//Chad:
//I may have missed a few last time so just keep these in mind moving forward.
//Final variables should be in all caps. Compound words use an underscore. 
// Example: final float ACRE = 43560; final float MY_ACRE = 43560;
//I would also use a double in place of float on that one.
//Formatting is slightly off. Don't forget to format the code. Source -> Format.
//Steven
//Steven Hickey , May 25 at 4:31pm

/* FOR LATER REFERENCE: ASSIGNMENT DETAILS

/* ASSIGNMENT
 *      Write a program that will:
 *          1. Ask the user to input Side A (base) and Side B (height)
 *          2. Determine the acreage
 *          3. Inform the user (output):
 *              a. The length of Side C (hypotenuse)
 *              b. The total acreage
 *          4. Use Input and Output methods
 */

 /* REQUIRED INPUT
 *      Side A and Side B
 */

 /* EXPECTED OUTPUT
 *      Your output should look similar to the following:
 *          run:
 *          Please enter Side A in feet: 300
 *          Please enter Side B in feet: 400
 *          Side C is equal to 500.0 feet.
 *          The total acreage is: 1.3774104683195592 acres.
 *          BUILD SUCCESSFUL (total time: 4 seconds)
 */

 /* HINTS
 *      > An acre of land = 43,560 sqft. This value cannot be changed.
 *      > A right triangle's area is defined as 1/2 the Base*Height
 *      > The way to determine the hypotenuse of a right triangle is by the
 *          Pythagorean Theorem -> A squared + B squared = C squared
 *      > In Java, we can manipulate this formula and use the MAth class API to
 *          determine the hypotenuse of a right triangle given the base and the
 *          height.. With this in mind, consider the use of sqrt (square root)
 *          and pow (power) methods that are available within the Math class.
 */

 /* DELIVERABLES
 *      Please zip your program and submit the zip file by the due date listed
 *          in the requirements.
 */
