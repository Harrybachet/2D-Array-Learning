/**
 *File: [Array_2D_MultipleDataTypes_RonakBasnet].
 * By: [Ronak Basnet]
 * Date: [3/9/2024]
 * Description: [This program prints 2d Multiple data types array]
 *
 */

import java.util.Scanner;

public class Array_2D_MultipleDataTypes_RonakBasnet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] rowOne = new int[3];
        System.out.print("Row 1 | Please enter 3 Integers:    ");
        for (int i = 0; i < rowOne.length; i++)
            rowOne[i] = input.nextInt();

        char[] rowTwo = new char[3];
        System.out.print("Row 2 | Please enter 3 Characters:  ");
        for (int i = 0; i < rowTwo.length; i++)
            rowTwo[i] = input.next().charAt(0);

        String[] rowThree = new String[3];
        System.out.print("Row 3 | Please enter 3 Strings:     ");
        for (int i = 0; i < rowThree.length; i++)
            rowThree[i] = input.next();

        System.out.print("Row 4 | 1 Int, 1 Char, 1 String:    ");
        int rowFourColOne = input.nextInt();
        char rowFourColTwo = input.next().charAt(0);
        String rowFourColThree = input.next();

        System.out.println("\nYour 2D array of multiple data types: \n");

        Object[][] inputDatabase = new Object[4][3];

        inputDatabase[0][0] = rowOne[0];
        inputDatabase[0][1] = rowOne[1];
        inputDatabase[0][2] = rowOne[2];

        inputDatabase[1][0] = rowTwo[0];
        inputDatabase[1][1] = rowTwo[1];
        inputDatabase[1][2] = rowTwo[2];

        inputDatabase[2][0] = rowThree[0];
        inputDatabase[2][1] = rowThree[1];
        inputDatabase[2][2] = rowThree[2];

        inputDatabase[3][0] = rowFourColOne;
        inputDatabase[3][1] = rowFourColTwo;
        inputDatabase[3][2] = rowFourColThree;

        System.out.println("- Data Type View:");
        for (int i = 0; i < inputDatabase.length; i++) {
            System.out.print("               ");
            for (int j = 0; j < inputDatabase[i].length; j++) {
                String dataType = inputDatabase[i][j].getClass().getSimpleName();
                System.out.printf("%-30s", dataType);


            }
            System.out.println();
        }

        System.out.println("\n- Data Value View:");
        for (int i = 0; i < inputDatabase.length; i++) {
            System.out.print("               ");
            for (int j = 0; j < inputDatabase[i].length; j++) {
                System.out.printf("%-30s", inputDatabase[i][j]);
            }
            System.out.println();
        }
    }
}

