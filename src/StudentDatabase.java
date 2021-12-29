import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        // ask how many student we want to add
        System.out.println("enter no. of students to enroll -");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[]students = new Student[numOfStudents];

        //create n no. of new student
        for(int n =0;n<numOfStudents;n++){
            students[n]= new Student();
            students[n].enroll();
            students[n].payTution();

        }
        for(int n =0;n<numOfStudents;n++){
            System.out.println(students[n].toString());
        }


    }
}
