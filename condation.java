import java.util.Scanner;

public class condation {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        int a,b;
        System.out.print("Value of a is ");
        a=scanner.nextInt();


        System.out.print("Value of b is ");
        b=scanner.nextInt();

        if(a>b){
        System.out.println("greater value " +a);}

        else{
            System.out.println("greater value "+b);
        }



    

    }
}
