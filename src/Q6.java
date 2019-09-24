import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Consecutive or not!");
        int[] ints = getInts();
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < 7; i++) {
            for (int j = i+1; j < 7; j++) {
                if (ints[j] < ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        int previous = ints[0] - 1;
        boolean isConsecutive = true;
        for (int anInt : ints) {
            if (!(anInt - previous == 1)) {
                isConsecutive = false;
                break;
            }
            previous = anInt;
        }
        if(isConsecutive){
            System.out.println("Consecutive numbers");
        } else {
            System.out.println("Not consecutive numbers");
        }
    }

    private static int[] getInts() {
        boolean done = false;
        int[] result = new int[7];
        while (!done) {
            boolean error = false;
            Scanner sc = new Scanner(System.in);
            System.out.print("Input: ");
            String[] input = sc.nextLine().split(",");
            if (input.length == 7) {
                for (int i = 0; i < 7; i++) {
                    try {
                        int number = Integer.parseInt(input[i]);
                        result[i] = number;
                    } catch (Exception ex) {
                        System.out.println("Invalid input!");
                        error = true;
                    }
                }
                if (!error) {
                    done = true;
                }
            } else {
                System.out.println("Please enter 7 numbers");
            }
        }
        return result;
    }
}
