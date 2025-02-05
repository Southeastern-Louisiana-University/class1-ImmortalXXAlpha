import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of grades:");
        int numGrades = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < numGrades; i++) {
            System.out.println("Enter grade " + (i + 1) + ":");
            sum += scanner.nextDouble();
        }

        double average = sum / numGrades;
        char letterGrade;

        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.printf("Average: %.2f%n", average);
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}
