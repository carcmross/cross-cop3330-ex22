package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright Marc-Anthony Cross
 */

/*
 * Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.
 *
 * Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not
 * different, then exit the program. Otherwise, display the largest number of the three.
 * Example Output
 *
 * Enter the first number: 1
 * Enter the second number: 51
 * Enter the third number: 2
 * The largest number is 51.
 *
 * Constraint
 *
 *     Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
 *
 * Challenges
 *
 *     Modify the program so that all entered values are tracked and the user is prevented from entering a number
 *     that’s already been entered.
 *     Modify the program so that it asks for ten numbers instead of three.
 *     Modify the program so that it asks for an unlimited number of numbers.
 *
 */

public class App {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String num1 = getFirstNum();
        String num2 = getSecondNum();
        String num3 = getThirdNum();
        String outputString = "";
        int[] nums = {Integer.parseInt(num1), Integer.parseInt(num2), Integer.parseInt(num3)};
        if (numsAreDiff(nums)) {
            outputString = generateOutput(nums);
            System.out.println(outputString);
        }
    }

    public static String generateOutput(int[] nums) {
        return String.format("The largest number is %d.", findLargest(nums));
    }

    public static int findLargest(int[] nums) {
        int max = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    public static String getFirstNum() {
        System.out.print("Enter the first number: ");
        return in.nextLine();
    }

    public static String getSecondNum() {
        System.out.print("Enter the second number: ");
        return in.nextLine();
    }

    public static String getThirdNum() {
        System.out.print("Enter the third number: ");
        return in.nextLine();
    }

    public static boolean numsAreDiff(int[] nums) {
        if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2])
            return false;
        return true;
    }
}
