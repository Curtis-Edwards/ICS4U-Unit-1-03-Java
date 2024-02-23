/*
 * This is a program that calculates the total cook time based on
 * the lunch item and number of lunch items
 *
 * @author  Curtis Edwards
 * @version 1.0
 * @since   2024-02-22
 */

import java.util.Scanner;

/**
* This is the standard "LunchCookTime" program.
*/
final class LunchCookTime {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private LunchCookTime() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // constants & variables
        final int subCookTime = 60;
        final int pizzaCookTime = 45;
        final int soupCookTime = 105;
        final int lunchMax = 3;
        final int oneMinute = 60;
        final int lunchAmountInt; 
	final heatingAmountString = "How many are you heating? (Max 3): ";
        final String totalCookTimeString = "Total cook time:\n";
        final String minutesString = " minutes, ";
        final String secondsString = " seconds.";

        // input
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Are you heating sub, pizza, or soup? (lowercase): ");
        final String lunchType = scanner.nextLine();

        // process
        switch (lunchType) {
            case "sub":
                System.out.print(heatingAmountString);
                lunchAmountInt = Integer.parseInt(scanner.nextLine());
                // error check
                if (lunchAmountInt < 0 || lunchAmountInt > lunchMax) {
                    System.out.println("Invalid input.");
                } else {
                    // process & output
                    final float totalCookTime = (subCookTime / 2) + ((subCookTime / 2) * lunchAmountInt);
                    final float cookTimeSeconds = totalCookTime % oneMinute;
                    final double cookTimeMinutes = Math.floor(totalCookTime / oneMinute);
                    System.out.println(totalCookTimeString + cookTimeMinutes + minutesString + cookTimeSeconds + secondsString);
                }
                break;
            case "pizza":
                System.out.print(heatingAmountString);
                lunchAmountInt = Integer.parseInt(scanner.nextLine());
                // error check
                if (lunchAmountInt < 0 || lunchAmountInt > lunchMax) {
                    System.out.println("Invalid input.");
                } else {
                    // process & output
                    final float totalCookTime = (pizzaCookTime / 2) + ((pizzaCookTime / 2) * lunchAmountInt);
                    final float cookTimeSeconds = totalCookTime % oneMinute;
                    final double cookTimeMinutes = Math.floor(totalCookTime / oneMinute);
                    System.out.println(totalCookTimeString + cookTimeMinutes + minutesString + cookTimeSeconds + secondsString);
                }
                break;
            case "soup":
                System.out.print(heatingAmountString);
                lunchAmountInt = Integer.parseInt(scanner.nextLine());
                // error check
                if (lunchAmountInt < 0 || lunchAmountInt > lunchMax) {
                    System.out.println("Invalid input.");
                } else {
                    // process & output
                    final float totalCookTime = (soupCookTime / 2) + ((soupCookTime / 2) * lunchAmountInt);
                    final float cookTimeSeconds = totalCookTime % oneMinute;
                    final double cookTimeMinutes = Math.floor(totalCookTime / oneMinute);
		    System.out.println(totalCookTimeString + cookTimeMinutes + minutesString + cookTimeSeconds + secondsString);
                }
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        System.out.println("\nDone.");
    }
}

