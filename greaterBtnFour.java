import java.util.Scanner;

public class greaterBtnFour {
    public static void main(String[] args) {
        Scanner variable;
        variable=new Scanner(System.in);
        int a,b,c,d;

        //taking value from user
        System.out.print("Enter value of a:- ");
        a=variable.nextInt();
        System.out.print("Enter value of b:- ");
        b=variable.nextInt();
        System.out.print("Enter value of c:- ");
        c=variable.nextInt();
        System.out.print("Enter value of d:- ");
        d=variable.nextInt();

        //condition
        if(a>b){
            if (a>c){
                if(a>d){
                    System.out.println("a is greatest value:- "+a);
                }else{
                    System.out.println("d is greatest value:- "+d);
                }

            } else if (c>d){
                System.out.println("c is greatest value:- "+c);
            }else{
                System.out.println("d is greatest value:- "+d);
            }
        } else if(b>c) {
            if (b>d){
                System.out.println("b is greatest value:- "+b);
            }else {
                System.out.println("d is greatest value:- "+d);
            }
        }else if (c>d){
            System.out.println("c is greatest value:- "+c);
        }else{
            System.out.println("d is greatest value:- "+d);
        }
    }



    }

