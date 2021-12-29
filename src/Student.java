import java.util.Scanner;

public class Student {

        private String firstName;
        private String lastName;
        private String gradeYear;
        private String studentID;
        private String courses = null;
        private int tutionBalance = 0;
        private static  int costOfCourse = 600;
        private static  int id = 1000;

        //  Constructor: prompt user to enter student's name and year
             public Student (){
                 Scanner in = new Scanner(System.in);
                 System.out.println("Enter student first name : ");
                  this.firstName = in.nextLine();

                 System.out.println("Enter student last name : ");
                 this.lastName = in.nextLine();

                 System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n Enter student class level : ");
                 this.gradeYear = in.nextLine();

                 setStudentID();

              //   System.out.println(firstName + " " + lastName + " " + gradeYear + "" + studentID);


             }

             //  Genrate an  ID
             private void setStudentID(){
                 // Grade level  + Id
                 id++;
                 this.studentID =  gradeYear + " " + id;
             }
             //  Enroll an course
             public void enroll(){
                 // get inside a loop , user hits 0
                 do {
                     System.out.println("enter a course to enroll(Q to quit): ");
                     Scanner in = new Scanner(System.in);
                     String course = in.nextLine();
                     if (!course.equals("Q")) {
                         courses = courses + " \n " + course;
                         tutionBalance = tutionBalance + costOfCourse;
                     }
                     else{
                         break;
                     }
                 }while (1 != 0);
             //    System.out.println("ENROLLED IN : " + courses);
             //    System.out.println("TUTION BALANCE : " + tutionBalance);

             }
             //  View a balance
             public  void  viewBalance(){
                 System.out.println("your balance is :  RS"+tutionBalance);
             }
              //  Pay tution
             public void payTution(){
                 viewBalance();
                 System.out.print("enter your payment : RS");
                 Scanner in =new Scanner(System.in);
                 int payment = in.nextInt();
                 tutionBalance = tutionBalance - payment;
                 System.out.println("thank you for a payment of RS"+payment);
                 viewBalance();
             }
            //  Show status
             public  String toString(){
                 return "Name : " + firstName +" "+ lastName+
                         "\nGrade Level : "+gradeYear+
                         "\nStudent id : "+studentID+
                         "\nCourses Enrolled :" + courses +
                         "\nBalance :" + tutionBalance;
             }

}
