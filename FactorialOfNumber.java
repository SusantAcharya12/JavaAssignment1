package AssignmentFirst;

import java.util.Scanner;

public class FactorialOfNumber {

    public void FactorialCalculation(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");

        int num = scanner.nextInt();

        int i = 1, fact=1;

        while(i<=num){
            fact = fact *i;
            i++;

        }

        System.out.println("Factorial of the number:"+fact);



    }

    public static void main(String[] args) {

        FactorialOfNumber fc = new FactorialOfNumber();
        fc.FactorialCalculation();

    }
}
