import java.util.Scanner;
public class CtoFConverter {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.print("Enter a temperature value in degree Celsius: ");
            if (in.hasNextDouble()) {
                double tempC = in.nextDouble();
                in.nextLine();
                double tempF = (tempC * 9 / 5) + 32;
                System.out.println(tempC + "'C in degree Fahrenheit is " + tempF + "'F.");
                loop = false;
            }
            else {
                String trash = in.nextLine();
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
        while(loop);
    }
}