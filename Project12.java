import java.util.Scanner;

public class Project12 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int num,total=0,check;
        int i = 0;
        System.out.print("Enter check limit num :- ");
        check=scanner.nextInt();

        while (i<check){

            System.out.print("Enter number :- ");
            num=scanner.nextInt();
            total=total+num;
            System.out.println("Total number are "+total+'\n');
            i++;
        }


    }
}
