import java.util.Scanner;

public class Project21 {
    public static void main(String[] args) {

        Scanner variable;
        variable=new Scanner(System.in);
        
        double s,t,r = 1;
        System.out.println("Enter no. to multiply :- ");
        s= variable.nextInt();

        System.out.println("Enter no. to multiplying time :-");
        t= variable.nextInt();
        
        for (double i=1; i<=t; i++){

            r=r*s;

        }

        System.out.println("Result is :- "+r);
    }
}
