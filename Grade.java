import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner variable;
        variable= new Scanner(System.in);
        double m,s;

        System.out.print("Enter the value of marks:- ");
        m = variable.nextDouble();

        if(m<50){
            System.out.println("grade is f");
        }if (m>=50&&m<60){
            System.out.println("garde is d");
        }if(m>=60&&m<70){
            System.out.println("grade is c");
        }if(m>=70&&m<80){
            System.out.println("grade is b");
        }if(m>=80&&m<90){
            System.out.println("grade is a");
        }if(m>=90&&m<=100){
            System.out.println("grade is a+");
        }if(m>100){
            System.out.println("Not valid");
        }



    }
}
