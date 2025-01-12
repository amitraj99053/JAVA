import java.util.*;

public class Method_pj5 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        String m;
        int Y = 0;
        int N=0;

       for (int i=0; i>=-1; i++) {
           System.out.println(" Enter value is:- ");
           m = scanner.nextLine();
           myMethod(m);

           System.out.print("Enter n for stop:-");
           Y = scanner.nextInt();

       }
    }

    static void myMethod(String name) {

            int k = 0;
            k = (name.length()) / 2;
            if (name.length() % 2 == 0) {
                System.out.println(" your mid variable =" + name.substring(k - 1, k + 1));
            } else {
                System.out.println(" your mid variable ="+name.substring(k, k + 1));
            }

    }
}
