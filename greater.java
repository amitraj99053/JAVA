import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner variable;
                variable=new Scanner(System.in);

                int a,b,c;
                //taking value from user
                System.out.print("Enter value of a:- ");
                a=variable.nextInt();

                System.out.print("Enter value of b:- ");
                b=variable.nextInt();

                System.out.print("Enter value of c:- ");
                c=variable.nextInt();
                //conditions

        if(a>b){

            if(a>c){
                System.out.println("A is greater value "+a);

            }
            else {
                System.out.println("c is greater value "+c);
            }

        }
        else if(b>c){
            System.out.println("B is greater value "+b);

        }
        else{
            System.out.println("c is greater value "+c);
        }




    }
}
