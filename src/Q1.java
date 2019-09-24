import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        System.out.println("Student Marks");
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.askUserForNoOfStudents();
        studentMarks.askUserForGrades();
        System.out.println("Thank you for your input");
    }

}

class StudentMarks {
    private int numberOfStudents = 0;
    private int[] stuGrades;

    StudentMarks() {
    }

    private void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
        stuGrades = new int[numberOfStudents];
    }

    private int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setStuGrades(int[] stuGrades) {
        this.stuGrades = stuGrades;
    }

    void askUserForNoOfStudents(){
        boolean done = false;
        while (!done) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("No. of students: ");
                int N = sc.nextInt();
                if (N < 0) {
                    System.out.print("Invalid no of students");
                } else {
                    this.setNumberOfStudents(N);
                    done = true;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Try again!");
            }
        }
    }

    void askUserForGrades(){
        for (int i = 0; i < getNumberOfStudents(); i++) {
            boolean done = false;
            while (!done) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Grade for student "+ (i+1) +": ");
                    int grade = sc.nextInt();
                    if (grade < 0 || grade>100) {
                        System.out.print("Invalid grade for student "+(i+1));
                    } else {
                        stuGrades[i] = grade;
                        done = true;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Try again!");
                }
            }
        }

    }
}
