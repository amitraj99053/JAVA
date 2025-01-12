import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        int a,b,add,sub,mul,div,rem;
        float rema;

        System.out.print("Enter value of a ");
        a=scanner.nextInt();
        System.out.print("Enter value of b ");
        b=scanner.nextInt();

        add=a+b;

        System.out.println("Addition of "+a+" & "+b+" is:- "+add);

        sub=a-b;
        System.out.println("Subtraction of "+a+" & "+b+" is:- "+sub);

        mul=a*b;
        System.out.println("Multiply of "+a+" & "+b+" is:- "+mul);

        div=a/b;
        System.out.println("Division of "+a+" & "+b+" is:- "+div);

        rem=a-(div*b);
        System.out.println("Reminder of "+a+" & "+b+" is:- "+rem);

        rema=(float) a% (float) b;
        System.out.println("Division of "+a+" & "+b+" is:- "+rema);
        System.out.println(a+b);




    }
}
