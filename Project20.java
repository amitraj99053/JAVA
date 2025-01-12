import java.util.Scanner;

public class Project20 {
    public static void main(String[] args) {
        Scanner variable;
        variable = new Scanner(System.in);

        double i,j,factorial = 1;

        System.out.println("Enter no. for find factorial :- ");
        j = variable.nextInt();

        for (i=1; i<=j; i++){

            factorial=factorial*i;
           // System.out.println(i);

        }
        System.out.println("Factorial of "+j+" = "+factorial);



    }
}
