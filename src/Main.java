
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");
        double buyingPrice = input.nextDouble();

        int day = 1;
        double closingPrice;
        while (true) {
            System.out.println("Enter the closing price for day " + day + " any negative value to leave: ");
            closingPrice = input.nextDouble();
            if (closingPrice < 0.0) {
                break;
            }

            double earnings = closingPrice - buyingPrice;
            if (earnings > 0.0) {
                System.out.println("After day " + day + " you earned " + earnings
                        + " per share.");
            } else if (earnings < 0.0) {
                System.out.println("After day " + day + " you lost " + (-earnings)
                        + " per share.");
            }else{
                System.out.println("After day "+day+", you have "+"no earning per share ");
            }
            day+=1;

        }
        input.close();

    }

}
