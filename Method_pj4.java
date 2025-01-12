import java.util.*;
public class Method_pj4 {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String m;
        int k = 0;
        System.out.print(" Enter value is:- ");
        m= scanner.nextLine();
        k = (m.length()) / 2;
        if (m.length() % 2 == 0) {
            System.out.println(" your mid variable =" + m.substring(k - 1, k + 1));
        } else {
            System.out.println(m.substring(k, k + 1));


        }
    }
}
