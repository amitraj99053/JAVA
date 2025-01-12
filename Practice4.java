import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner variable;
        variable = new Scanner(System.in);
        int value;

        System.out.println("Enter rating for my code😊 b/n 1 to 5");
        value = variable.nextInt();

        switch (value){
            case 1:
                System.out.println("Bad experience in this application, Because of it's UI.");
            break;

            case 2:
                System.out.println("Good experience in this application.");
            break;

            case 3:
                System.out.print("very good experience in this application, Because it's provided a UI to look\n");
                System.out.println("attractive & easy to use the function of the application.");
            break;

            case 4:
                System.out.print("Amazing experience in this application, Because it have the facility to\n");
                System.out.println("complete our task in a low time period with best case.");
            break;

            case 5:
                System.out.print("Excellent experience in this application, Because it have lot's of facility\n");
                System.out.print("to explore things in a short time of period. It help user to save our important\n");
                System.out.println("time & complete the work with better quality.");
            break;

            default:
                System.out.println("Please give us rating b/n 1 to 5.");




        }
    }
}
