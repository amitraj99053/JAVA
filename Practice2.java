import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner variable;
        variable = new Scanner(System.in);
        int age;

        System.out.println("Enter your age :- ");
        age = variable.nextInt();
        int n = age>=18?1:0;

        switch (n){
            case 1:
                System.out.println("You are eligible for vote");
                break;
            case 0:
                System.out.println("You are not eligible for vote");
            break;
            default:
                System.out.println("Enter only number's");



        }

    }
}
