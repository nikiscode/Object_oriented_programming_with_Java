import java.util.Scanner;

/**
 * A simple program to demonstrate:
 * 1. Finding the second largest number in a 1D array.
 * 2. Adding two 2D matrices together.
 */

public class Arrayimplementation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --- PART 1: SECOND LARGEST IN 1D ARRAY ---

        System.out.println("--- 1D Array: Find Second Largest ---");

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }

            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }

        // --- PART 2: MATRIX ADDITION (2D ARRAY) ---

        System.out.println("\n--- 2D Array: Matrix Addition ---");

        System.out.print("Enter rows and columns (e.g., 2 2): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input Matrix A
        System.out.println("Enter elements for Matrix A:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter elements for Matrix B:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Matrix Addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Display Result
        System.out.println("Resulting Matrix (A + B):");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
