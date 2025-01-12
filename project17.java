import java.util.Scanner;

public class project17 {
    public static void main(String[] args) {
        Scanner variable;
        variable=new Scanner(System.in);


        int i,table,var = 0;
        System.out.println("Enter no.");
        var=variable.nextInt();


        for (i=1;i<=10;i++){

            table=var*i;
            System.out.println("Table of "+var+" :- "+table);


        }
    }
}
