import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner variable;
        variable = new Scanner(System.in);
        int n;


        System.out.println("Enter a number :- ");
        n = variable.nextInt();
        int c = n>0?1:0;

       switch (c){
           case 1:
               System.out.println("Your entered number is positive");
               break;
           case 0:
               int d = n<0?1:0;
               switch (d){
                   case 1:
                       System.out.println("Your entered number is negative");
                       break;
                   case 0:
                       System.out.println("Your entered number is equal to Zero");
                   break;

               }
           break;



       }


    }
}
