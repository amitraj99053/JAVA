import java.util.*;
public class conversion {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        double c,b,i;
        System.out.print("Enter value in cm:- ");
        c=scanner.nextInt();
        b=c*10;
        System.out.println("Result in mm is:- "+b);
        i=c*(1/2.54);
        System.out.print("Result is:- "+i);


    }
}
