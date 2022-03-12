package delta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("(ax^2 + bx + c = 0) -> Enter  a, b, c: ");
            int a = scanner.nextInt(), b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.printf(
                    "%sx^2 %s %dx %s %d = 0%n",
                    a == 1 ? "" : String.valueOf(a),
                    b < 0 ? "-" : "+",
                    b < 0 ? (-1 * b) : b,
                    c < 0 ? "-" : "+",
                    c < 0 ? (-1 * c) : c
            );
            double delta = Math.pow(b, 2) - (4 * a * c);
            System.out.println("delta = " + delta);
            if (delta < 0) {
                System.out.println("The Equation has no real answer because Delta is negative.");
            } else if (delta == 0) {
                System.out.println("X = " + (-1 * b / (2 * a)));
            } else {
                double x1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                System.out.println("X1 = " + x1 + ", X2 = " + x2);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Entered!");
        }
    }

}
