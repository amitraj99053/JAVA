import java.util.Scanner;

public class Project9 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        int num1,num2,num3,sum;

        System.out.println("Enter 1'st number :- ");
        num1 = scanner.nextInt();
        System.out.println("Total number are :- "+num1);
        System.out.println("Enter 2nd number :- ");
        num2 =  scanner.nextInt();
        System.out.println("Total number are :- "+(num1+num2));
        System.out.println("Enter 3rd number :- ");
        num3 = scanner.nextInt();
        System.out.println("Total number's are :- "+(num1+num2+num3));

        sum = num1+num2+num3;
        System.out.println("Sum of total 3 number's "+sum);

    }
}
