import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        Scanner variable;
        variable = new Scanner(System.in);
        int value,num;
        System.out.println("Enter the number b/n 1 to 100 ");
        num = variable.nextInt();

        if (num>0 && num<=100)
        switch (value=num/10){
            case 10:
                System.out.println("Your grade is excellent");
            break;

            case 9:
                System.out.println("Your grade is outstanding");
            break;

            case 8:
                System.out.println("Your grade is A+");
            break;

            case 7:
                System.out.println("Your grade is A");
            break;

            case 6:
                System.out.println("Your grade is B+");
            break;

            case 5:
                System.out.println("Your grade id B");
            break;

            case 4:
                System.out.println("Your grade is C");
            break;

            case 3:
                System.out.println("Your grade is D");
            break;

            case 2:
                System.out.println("Your grade is E");
            break;

            case 1:
            case 0:
                System.out.println("You are fail");



        }else {
            System.out.println("Enter number b/n 0 to 100 only");
        }


    }
}
