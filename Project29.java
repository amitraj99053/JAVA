

import java.util.Scanner;

public class Project29 {
    public static void main(String[] args) {


        Scanner scanner;
        scanner=new Scanner(System.in);

        String inp_1;
        String data="nitesh";

        System.out.println("Enter your friend name:- ");
        inp_1=scanner.nextLine();



        if ("nitesh".equals(data)){
            System.out.println("You are a good friend ");

        }
        else {
            System.out.println("Sorry your name is note in database ");
        }

    }
}
