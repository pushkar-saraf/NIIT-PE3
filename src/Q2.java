import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Matrix addition");
        int rows = 0;
        int cols = 0;
        int[] first;
        int[] second;
        int size;
        int[] result;
        rows = scanInt(
                "Input number of rows of matrix: ",
                "Invalid no of rows",
                0,
                10
        );
        cols = scanInt(
                "Input number of columns of matrix: ",
                "Invalid no of columns",
                0,
                10
        );
        size = rows * cols;
        first = new int[size];
        second = new int[size];
        first = scanMatrix("Enter first matrix: ", size);
        second = scanMatrix("Enter second matrix: ", size);
        result = new int[size];
        System.out.println("Sum of matrices:");
        for (int i = 0; i < size; i++) {
            result[i] = first[i] + second[i];
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[rows*i+j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    private static int scanInt(
            String prompt,
            String error,
            int min,
            int max
    ) {
        boolean done = false;
        int result = 0;
        while (!done) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(prompt);
                int N = sc.nextInt();
                if (N < min || N > max) {
                    System.out.print(error);
                } else {
                    result = N;
                    done = true;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Try again!");
            }
        }
        return result;
    }

    private static int[] scanMatrix(
            String prompt,
            int size
    ) {
        boolean done = false;
        int[] result = new int[size];
        while (!done) {
            boolean error = false;
            Scanner sc = new Scanner(System.in);
            System.out.print(prompt);
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != size) {
                System.out.println("Invalid no. of arguments. Try again!");
                continue;
            }
            for (int j = 0; j < size; j++) {
                int n = 0;
                try {
                    n = Integer.parseInt(numbers[j]);
                } catch (Exception ex) {
                    System.out.println("Invalid input. Try again!");
                    error = true;
                }
                result[j] = n;

            }
            if(!error) {
                done = true;
            }
        }
        return result;
    }
}
