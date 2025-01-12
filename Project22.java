import java.util.Scanner;

public class Project22 {
    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);

        double j=1,s, t, r = 1;



        while (j!=-1){
            System.out.println("Enter no. to multiply:- ");
            s = input.nextDouble();

            System.out.println("Enter no. to multiplying time's:- ");
            t = input.nextDouble();

            r=1;

            for (double i = 1; i <= t; i++) {
                r = r * s;
            }
            System.out.println("Result is :- " + r);

            System.out.println("Enter -1 for exit the code:- ");
            System.out.println("Enter any no. to continue:- ");
            j= input.nextDouble();


        }




        }


    }