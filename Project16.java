import java.util.Scanner;

public class Project16 {
    public static void main(String[] args) {
        Scanner sc;
        sc=new Scanner(System.in);
        int i=0;


        do {
            System.out.println("Enter no. b/n 0 to 10 :- ");
            i=sc.nextInt();
            System.out.println("Result is :- "+i);

        }
        while (i<10 && i>0);
        System.out.println("Check input data ");

    }
}
