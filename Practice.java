import java.util.Scanner;


public class Practice {
    public static void main(String[] args) {
        Scanner variable;
        variable = new Scanner(System.in);

        int m;

        System.out.println("Enter month number:- ");
        m=variable.nextInt();

        switch (m) {
            case 1 -> {
                System.out.println("JANUARY is a Winter season also it have 31 day's. In this season temperature b/w 5・ to 25・");
            }
            case 2 -> {
                System.out.println("FEBRUARY is a Winter season also it have 28 day's. In this season temperature b/w 5・ to 25・ ");
            }
            case 3 -> {
                System.out.println("MARCH is a Spring season also it have 31 day's. In this season temperature b/n 20・ to 25・");
            }
            case 4 -> System.out.println("APRIL is a Spring season also it have 30 day's. In this season temperature b/n 20・ to 25・ ");
            case 5 -> System.out.println("MAY is a Summer season also it have 31 day's. In this season temperature b/n 25・ to 45・ ");
            case 6 -> System.out.println("JUNE is a Summer season also it have 30 day's. In this season temperature b/n 25・ to 45・ ");
            case 7 -> System.out.println("JULY is a Monsoon season also it have 31 day's. In this season temperature b/n 30・ to 35・");
            case 8 -> System.out.println("AUGUST is a Monsoon season also it have 31 day's. In this season temperature b/n 30・ to 35・");
            case 9 -> System.out.println("SEPTEMBER is a Autumn season also it have 30 day's. In this season temperature b/n 20・ to 30・ ");
            case 10 -> System.out.println("OCTOBER is a Autumn season also it have 31 day's. In this season temperature b/n 20・ to 30・ ");
            case 11 -> System.out.println("NOVEMBER is a Autumn season also it have 30 day's. In this season temperature b/n 20・ to 30・ ");
            case 12 -> System.out.println("DECEMBER is a Winter season also it have 31 day's. In this season temperature b/n 5・ to 20・ ");
            default -> System.out.println("Enter Correct month number:- ");
        }

    }
}
