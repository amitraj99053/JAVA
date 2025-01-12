import java.util.Scanner;

public class Project6 {
    public static void main(String[] args) {
        Scanner variable;
        variable = new Scanner(System.in);
        int ui;
        System.out.println("Enter wind speed:- ");
        ui = variable.nextInt();

        if (ui>=74 && ui<=95){
            System.out.println("Category is 1");
        }
        else if (ui>=96 && ui<=110) {
            System.out.println("Category is 2");
        }
        else if (ui>=111 && ui<=130){
            System.out.println("Category is 3");
        } 
        else if (ui>=131 && ui<=155) {
            System.out.println("Category is 4");
            
        } else if (ui>155) {
            System.out.println("Category is 5");
        }

    }
}
