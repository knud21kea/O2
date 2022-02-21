package kea.exercises;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        // Oyster Challenge 2, is a string numeric?
        // There are 6 numeric data types; byte, short, int, long, float and double.
        // It looks like we only need to parse for long and double as they contain the others.

        Scanner sc = new Scanner(System.in);
        String isItANumber, result;
        boolean running = true;
        System.out.println("\nCheck if a string is numeric.");
        while (running)
        {
            System.out.print("Input a string: "); // User inputs a string to check
            isItANumber = sc.nextLine();
            if ("exit".equals(isItANumber))
            {
                running = false;
            } else
            {
                result = " is not numeric.";
                if (isLong(isItANumber) || isDouble(isItANumber))
                {
                    result = " is numeric.";
                }
                System.out.println(isItANumber + result);
            }
        }
    }

    // returns true if a long
    public static boolean isLong(String s)
    {
        if (s == null)
        {
            return false;
        }
        try
        {
            long l = Long.parseLong(s);
        } catch (NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    // returns true if a double
    public static boolean isDouble(String s)
    {
        if (s == null)
        {
            return false;
        }
        try
        {
            double d = Double.parseDouble(s);
        } catch (NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
