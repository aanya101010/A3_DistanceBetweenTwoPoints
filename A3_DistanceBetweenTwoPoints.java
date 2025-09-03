import java.util.Scanner;

public class A3_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get first point
        System.out.print("Enter the x value of your first point (Whole Number):\n");
        double x1 = input.nextDouble();

        System.out.print("Enter the y value of your first point (Whole Number):\n");
        double y1 = input.nextDouble();

        // Get second point
        System.out.print("Enter the x value of your second point (Whole Number):\n");
        double x2 = input.nextDouble();

        System.out.print("Enter the y value of your second point (Whole Number):\n");
        double y2 = input.nextDouble();

        // Calculate distance
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Display result with required formatting
        System.out.printf("%nThe distance between (%.2f,%.2f) and (%.2f,%.2f) is %.2f.%n",
                x1, y1, x2, y2, distance);

        input.close();
    }
}
