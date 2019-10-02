import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a length: ");
        double length = in.nextDouble();
        System.out.print("Enter a width: ");
        double width = in.nextDouble();

        double area = length*width;

        System.out.printf("\nThe area of a %.1f-by-%.1f rectangle is %.1f.", length, width, area);

        in.close();
    }
}