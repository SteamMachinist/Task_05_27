package ru.vsu.cs.roschupkin_ya_a;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final int SNOWFLAKE_RAYS_COUNT = 3;

        int size = readSize();
        printSnowflake(size, calculateNumberOfLines(size), SNOWFLAKE_RAYS_COUNT);
    }

    static void printSnowflake(int size, int numberOfLines, int raysNumber)
    {
        System.out.println();

        printUpperPart(numberOfLines, raysNumber);
        printMiddlePart(size);
        printBottomPart(numberOfLines, raysNumber);
    }

    static int calculateNumberOfLines(int size)
    {
        return ( (size - 1) / 2);
    }

    static void printUpperPart(int numberOfLines, int raysNumber)
    {

        for (int lineNumber = numberOfLines ; lineNumber > 0; lineNumber--)
        {
            printLine(numberOfLines, lineNumber, raysNumber);
        }
    }

    static void printLine(int lengthOfInitialHalfLine, int lengthOfCurrentHalfLine, int raysNumber)
    {
        printSpacesInLineBeginning(lengthOfInitialHalfLine
                - lengthOfCurrentHalfLine);

        for (int printedRays = 0; printedRays < raysNumber; printedRays++)
        {
            System.out.print('*');
            for (int numberOfSpaces = (lengthOfCurrentHalfLine - 1); numberOfSpaces > 0; numberOfSpaces--)
            {
                System.out.print(' ');
            }
        }

        System.out.println();
    }

    static void printSpacesInLineBeginning(int numberOfSpaces)
    {
        for (; numberOfSpaces > 0; numberOfSpaces-- )
        {
            System.out.print(' ');
        }
    }

    static void printMiddlePart(int size)
    {
        for (int printed = 0; printed < size; printed++)
        {
            System.out.print('*');
        }
        System.out.println();
    }

    static void printBottomPart(int numberOfLines, int raysNumber)
    {

        for (int lineNumber = 1; lineNumber <= numberOfLines; lineNumber++)
        {
            printLine(numberOfLines, lineNumber, raysNumber);
        }
    }

    static int readSize()
    {
        System.out.print("Input snowflake size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        if (size < 5)
        {
            System.out.printf(
                    "%nInput problem: size of the shape should be decimal greater or equal to 5." +
                            " Please try again%n%n");

            return readSize();
        }

        else
        {
            return size;
        }
    }
}
