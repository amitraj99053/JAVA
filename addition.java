import java.util.*;
public class addition {
    public static void main(String[] args) {
        float add,num1=4,num2=3;


        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        add=Scanner.nextInt();


        if(add==1){
            System.out.println("for addition click 1:- "+(num1+num2));
        }else if (add==2){
            System.out.println(num1-num2);
        }else{
            System.out.println("invalid choice");
        }
    }
}
