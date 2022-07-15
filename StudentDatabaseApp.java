import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        System.out.print("Enter # of new students to enroll: ");
        Scanner reader = new Scanner(System.in);
        int numberOf = reader.nextInt();
        Student[] students = new Student[numberOf];

        for (int n =0; n < numberOf; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n = 0; n < numberOf; n++) {
            System.out.println((students[n].toString()));
        }

    }
}
