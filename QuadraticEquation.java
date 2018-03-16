import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Quadratic Equation Resolver");
        System.out.println("Give a question as: 'a*x*x + b*x + c = 0', please enter your constant:");
        System.out.print("a= ");
        double a = input.nextDouble();
        System.out.print("b= ");
        double b = input.nextDouble();
        System.out.print("c= ");
        double c = input.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("Equation has countless solutions.");
                else System.out.println("Equation has no solution.");
            } else {
                double x = -c / b;
                System.out.println("Equation has only one solution: x= " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) System.out.println("Equation has no solution");
            else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Equation has 2 solutions, they are: " + x1 + " and " + x2);
            }

        }
    }
}
