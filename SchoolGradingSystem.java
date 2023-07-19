package AssignmentFirst;
import java.util.Scanner;

public class SchoolGradingSystem {

    public static void gradingSystem(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your obtained number: ");

        int marks = scanner.nextInt();
        String grade = "";

        if(marks<25){
            grade="F";
            System.out.println("The obtained grade is "+ grade);
        }
        else if(marks>=25&&marks<45){
            grade = "E";
            System.out.println("The obtained grade is "+ grade);

        }

        else if(marks>=45 && marks<50){
            grade = "D";
            System.out.println("The marks obtained is "+grade);

        }
        else if(marks>=50&&marks<60){
            grade = "C";
            System.out.println("The marks obtained is "+ grade);


        }

        else if (marks>=60 && marks<80){

        }

        else{
            System.out.println("The obtained grade is F");
        }

    }


    public static void main(String[] args) {

        SchoolGradingSystem.gradingSystem();

    }
}
