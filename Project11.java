import java.util.Scanner;

public class Project11 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner=new Scanner(System.in);

        int num,total=0;
        int i=0;
        while (i<5){
            System.out.print("Enter number :- ");
            num=scanner.nextInt();
            total=total+num;
            System.out.println("Total number are "+total+'\n');
            i++;
        }


    }
}
