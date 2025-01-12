import java.util.Scanner;

public class Project15 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int i = 0;
        int total = 0;

        System.out.print("Enter value :- ");
        i = scanner.nextInt();

        while (i!=-1){
            total=i+total;
            System.out.println("Total's are :- "+total);

            System.out.print("Enter value :- ");
            i=scanner.nextInt();


        }



    }
}

