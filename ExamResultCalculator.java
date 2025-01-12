
    import java.util.Scanner;

    public class ExamResultCalculator {
        public static void main(String[] args) {
            char operator;
            double number1, number2, result;

            // Create an object of Scanner class
            Scanner input = new Scanner(System.in);

            // Ask users to enter the operator
            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);

            // Ask users to enter the numbers
            System.out.println("Enter the first number:");
            number1 = input.nextDouble();
            System.out.println("Enter the second number:");
            number2 = input.nextDouble();

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            // Close the input scanner
            input.close();
        }
    }


