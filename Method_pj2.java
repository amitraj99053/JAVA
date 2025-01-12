import java.util.Scanner;

public class Method_pj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value =0;
        System.out.print("Enter your age:- ");
        value = sc.nextInt();

        int a;
        System.out.println("Enter no 1 for max,min:- ");
        a=sc.nextInt();

        int b;
        System.out.println("Enter no 2 for max,min:- ");
        b=sc.nextInt();

        int c;
        System.out.println("Enter no 3 for max,min:- ");
        c= sc.nextInt();

        FirstMethod(value);
        SecoundMethod(a,b,c);
        ThirdMethod(a,b,c);

    }

    static void FirstMethod(int num){
        if(num>=18){
            System.out.println(num+"is eligible");
        }else {
            System.out.println("is not eligible");
        }

    }
    static void SecoundMethod(int a ,int b ,int c){
        if (a<b){
            if (a<c){
                System.out.println(a+ "is smaller");
            }else {
                System.out.println(c+ "is smaller");
            }
        }if (b<c){
            System.out.println(b+ "is smaller");
        }else {
            System.out.println(c+ "is smaller");
        }
    }

    static void ThirdMethod(int a,int b, int c){
        int sum= (a+b+c);
        int avg= sum/3;
        int Rem= sum%3;


        System.out.println("Average value :- "+avg);
        System.out.println("Remainder value :- "+Rem);
    }
}
