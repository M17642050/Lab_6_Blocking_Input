import java.util.Scanner;
public class RectangleInfo {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        double recH = 0;
        double recW = 0;
        boolean loopH = true;
        boolean loopW = true;
        do {
            System.out.print("Enter the height of a rectangle: ");
            if (in.hasNextDouble()) {
                recH = in.nextDouble();
                in.nextLine();
                loopH = false;
            }
            else {
                String trashH = in.nextLine();
                System.out.println("Invalid Input. Please enter the height of the rectangle as a number.");
            }
        }
        while (loopH);
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                recW = in.nextDouble();
                in.nextLine();
                loopW = false;
            }
            else {
                String trashW = in.nextLine();
                System.out.println("Invalid Input. Please enter the width of the rectangle as a number");
            }
        }
        while (loopW);
        double recP = 2 * (recH + recW);
        double recA = recH * recW;
        double recD = Math.sqrt((recH * recH) + (recW * recW));
        System.out.println("Using your provided values:\n-The perimeter of the rectangle is " + recP + " units.\n-The area of the rectangle is " + recA + " square units.\n-The length of either of the diagonals of the rectangle is " + recD + " units.");
    }
}