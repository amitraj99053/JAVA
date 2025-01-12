
    import java.util.Scanner;

    public class GradeConverter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the numerical grade: ");
            double grade = sc.nextDouble();
            String letterGrade = getLetterGrade(grade);
            System.out.println("Letter grade: " + letterGrade);
        }

        public static String getLetterGrade(double grade) {
            if (grade >= 90 && grade <= 100) {
                return "A";
            } else if (grade >= 80) {
                return "B";
            } else if (grade >= 70) {
                return "C";
            } else if (grade >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    }


