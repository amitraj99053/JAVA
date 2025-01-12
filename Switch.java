import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int a,b;
        String r;

        System.out.println("Enter value of a:- ");
        a=scanner.nextInt();

        System.out.println("Enter value of b :- ");
        b=scanner.nextInt();

        System.out.println("Enter condition :- ");
        r=scanner.next();

        switch ("+"){
            case "+":
                System.out.println("addition of a&b is :- " +(a+b));
                break;
            case "-":
                System.out.println("subtraction of a&b is :- "+(a-b));
                break;
            case "*":
                System.out.println("Multiplication of a&b is :- "+(a*b));
                break;
            case "/":
                System.out.println("Division of a&b is :- "+(a/b));
                break;
            default:
                System.out.println("Sorry i can't do anything 😁");

        }
    }
}
