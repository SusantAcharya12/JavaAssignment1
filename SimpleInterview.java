package AssignmentFirst;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterview {

    public void sampleDataStudent(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Full Name :");

        String name = scanner.nextLine();

        System.out.println("Please Enter Your Field of Interest: ");

        String fieldInterest = scanner.nextLine();

        System.out.println("Please enter your Roll No: ");

        int rollNo = scanner.nextInt();

        System.out.println("Hey, my name is "+ name +" "+ "and my roll number is "+" "+rollNo+". My field of intrest is "+" "+fieldInterest);




    }

    public static void main(String[] args) {

        SimpleInterview si = new SimpleInterview();
        si.sampleDataStudent();

    }
}
