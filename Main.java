/********************************************
*	AUTHOR:	
* COLLABORATORS: 
*	LAST MODIFIED:	
********************************************/

import org.checkerframework.common.returnsreceiver.qual.This;

/********************************************
*	Quipu
*********************************************
*	PROGRAM DESCRIPTION:
*	A user will enter a number between 0 and 999 and this program will display the number as a quipu.
*********************************************
*	ALGORITHM:
*	//math example
number is 352
hundred is 3: 352/100 = 3
ten is 5: 52/10 = 5 (352 % 100 = 52)
ones is 2: 2/1= = 2 (52 % 10 = 2)

//psuedocode
INPUT num //0-999
CALC hundredsPlace = num / 100
CALC remainder = num % 100
CALC tensPlace = remainder / 10
CALC onesPlace = remainder % 10
*********************************************/


public class Main
{

  /***** CONSTANT SECTION *****/
  public static final int QUIPU_WIDTH = 30;

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    int num, hundreds, tens, ones;
    char choice;

    /***** INITIALIZATION SECTION *****/
    
    /***** INTRO SECTION *****/
    System.out.println("\nHello! This program turns any whole number between 0 and 999 into a digital Quipu.");
    

    /***** INPUT SECTION *****/
     //(choice.equalsIgnoreCase("y"))
      do {
      //System.out.print("\nPlease enter a number between 0 and 999: ");
      num = UtilityBelt.readInt("\nPlease enter a number between 0 and 999: ", 0,999);

      while (num < 0 || num > 999){
        System.out.print("ERROR: please enter value between 0 - 999\n");
       //num = UtilityBelt.readInt("Please enter a number between 0 and 999: ", 0, 999);
     }


    /***** PROCESSING SECTION *****/
    
    //Main.printKnots(3);
    //          *
    //          *
    //          *
    hundreds = num / 100;
    int remainder = num % 100;
    tens = remainder / 10;
    ones = remainder % 10;


    /***** OUTPUT SECTION *****/
     System.out.println("Hundreds   = " + hundreds);
    System.out.println("Tens       = " + tens);
    System.out.println("Ones       = " + ones);

    System.out.println("\nYour quipu:");
    printQuipu(hundreds, tens, ones);

    // Ask to repeat
    choice = UtilityBelt.readChar("Would you like to make another quipu? [Y/N]: ", "YyNn");

  } while (choice == 'y' || choice == 'Y');

  System.out.println("\nGoodbye!\n");
}

  
  /***** STATIC METHODS *****/
  public static void printKnots(int numKnots){
    for (int i = 0; i < numKnots; i++){
      UtilityBelt.printCentered(QUIPU_WIDTH, "*");
    }
  
  }

  public static void printQuipu(int hundreds, int tens, int ones){
    UtilityBelt.printCentered(QUIPU_WIDTH, "---");
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");
    Main.printKnots(hundreds);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");
    Main.printKnots(tens);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");
    Main.printKnots(ones);
    UtilityBelt.printCentered(QUIPU_WIDTH, "-");
  

    
  }
}