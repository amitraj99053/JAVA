

    import java.util.Scanner;

    public class GradeConverterSwitch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the numerical grade: ");
            int score = sc.nextInt();
            String letterGrade = findGrade(score);
            System.out.println("Letter grade: " + letterGrade);
        }

        public static String findGrade(int score) {
            switch (score / 10) {
                case 10:
                case 9:
                    return "A";
                case 8:
                    return "B";
                case 7:
                    return "C";
                case 6:
                    return "D";
                default:
                    return "F";
            }
        }
    }


