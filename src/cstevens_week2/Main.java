package cstevens_week2;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 2 - Java Data & Operators
 * @Date: May 23, 2021
 * @Description: Write a program that will determine acreage of a triangular lot
 */
 
// Imports

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
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
    final float Acre = 43560;   
    double totalAcres;
    
    // Scanner obj allows user input to be read
    Scanner obj = new Scanner(System.in);
    
        
    // Introduction
    System.out.println("Hi there. What is your name?");
    
    // Get input for name
    name = obj.nextLine();
    System.out.println("Nice to meet you " + name + ". I'm Dahc.");
    System.out.println("Welcome to my triangle lot acreage calculator!\n");
    
    System.out.print(name + ", Please enter the length of Side A of your lot ");
    System.out.println("in feet: ");
    
    // Get input for Side A
    sideA = obj.nextFloat();
    System.out.println("Excellent!");
    System.out.print("Now " + name + ", please enter the length of Side B ");
    System.out.println("of your lot in feet: ");
    
    // Get input for Side B
    sideB = obj.nextFloat();
    System.out.print("\nGREAT NEWS " + name + "! You qualify for the ");
    System.out.println("Hypotenuse Bonus!\n");
    
    // Pause program, wait for enter from user to continue
    System.out.println("Press enter to claim your bonus!");
    try{System.in.read();}
        catch(Exception e){}
    
    // Calculate and print the length of Side C (hypotenuse)
    // Formula: sqrt(A squared + B squared)
    sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    System.out.println("Side C of your triangle lot is: " + sideC + " feet.\n");
    
    // Set up for final ouput
    System.out.println("Pretty AWESOME stuff right?!");
    System.out.println("Okay... so without further ado.");
    System.out.println("The moment you've been waiting for...\n");
    
    // Pause program, wait for enter from user to continue
    System.out.println("Just press enter one more time to reveal your "
            + "acreage!");
    try{System.in.read();}
        catch(Exception e){}
    
    // Calculate and print the total acreage:
    // Formula: ((A*B)/2)/Acre
    totalAcres = ((sideA*sideB)/2)/Acre;
    System.out.print("The total acreage of your triangle lot is: ");
    System.out.println(totalAcres + " acres.\n");
    
    // Closing
    System.out.println("Thank you for using my triangle lot acreage "
            + "calculator.");
    System.out.println("Have a Super Fantastic day " + name + "! Ciao.\n");
     
    } // End Main Method

} // End Class Main










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