
    import java.util.Scanner;

    public class GeometricShapeCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Geometric Shape Area Calculator!");
            System.out.println("Choose a shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateRectangleArea();
                    break;
                case 2:
                    calculateSquareArea();
                    break;
                case 3:
                    calculateTriangleArea();
                    break;
                case 4:
                    calculateCircleArea();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        // Calculate the area of a rectangle
        private static void calculateRectangleArea() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            double area = length * width;
            System.out.println("Area of the rectangle: " + area);
        }

        // Calculate the area of a square
        private static void calculateSquareArea() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the side length of the square: ");
            double side = scanner.nextDouble();

            double area = side * side;
            System.out.println("Area of the square: " + area);
        }

        // Calculate the area of a triangle
        private static void calculateTriangleArea() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the base length of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();

            double area = 0.5 * base * height;
            System.out.println("Area of the triangle: " + area);
        }

        // Calculate the area of a circle
        private static void calculateCircleArea() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            double area = Math.PI * radius * radius;
            System.out.println("Area of the circle: " + area);
        }
    }

