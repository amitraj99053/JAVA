import java.util.Scanner;

public class dobWithCondation {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        int CY,CM,CD,BY,BM,BD,Y = 0,M = 0,D = 0;

        //input
        System.out.print("Enter current year:- ");
        CY=scanner.nextInt();
        System.out.print("Enter current month:- ");
        CM=scanner.nextInt();
        System.out.print("Enter current day:- ");
        CD=scanner.nextInt();

        System.out.print("Enter birth year:- ");
        BY=scanner.nextInt();
        System.out.print("Enter birth month:- ");
        BM=scanner.nextInt();
        System.out.print("Enter birth day:- ");
        BD=scanner.nextInt();

        //condition
        if ((CY<=9999)&&(CM<=12)&&(CD<=31)&&(BY<=9999)&&(BM<=12)&&(BD<=31)&&(BY<=CY)&&(BM<=CY)&&(BD<=CD)) {

            if (BD > CD) {
                D = (CD + 30) - BD;
                System.out.println("Birth Day:- " + D);
                CM = CM - 1;
                if (BM > CM) {
                    M = (CM + 12) - BM;
                    System.out.println("Birth Month:- " + M);
                    CY = CY - 1;
                    Y = CY - BY;
                    System.out.println("Birth Year:- " + Y);
                } else {
                    M = CM - BM;
                    System.out.println("Birth Month:- " + M);
                    Y = CY - BY;
                    System.out.println("Birth Year:- " + Y);
                }
            } else {
                D = CD - BD;
                System.out.println("Birth Day:- " + D);
                if (BM > CM) {
                    M = (CM + 12) - BM;
                    System.out.println("Birth Month:- " + M);
                    CY = CY - 1;
                    Y = CY - BY;
                    System.out.println("Birth Year:- " + Y);
                } else {
                    M = CM - BM;
                    System.out.println("Birth Month:- " + M);
                    Y = CY - BY;
                    System.out.println("Birth Year:- " + Y);
                }
            }
        }else {
            System.out.println("Check Your Details:- ");

        }
        System.out.println("You are " + D + " Days " + M + " Month " + Y + " Year old now ");

        }

    }

