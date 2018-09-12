import java.util.Scanner;
import java.text.NumberFormat;

public class main {
    public static void main(String[] args) {
        double total1 = 1;
        double tx = 0.25;


        double totalWithTax = total1 + (total1 * tx );
        String totalCurrency;
        System.out.println("Total with Tax: " + totalWithTax);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double total2 = keyboard.nextDouble();

        System.out.println((total2 + total1));
        System.out.println((total2 + tx));

        NumberFormat numFor = NumberFormat.getCurrencyInstance();
        numFor.setGroupingUsed(true);
        numFor.setMaximumFractionDigits(2);
        numFor.setMinimumFractionDigits(2);
        totalCurrency = numFor.format(totalWithTax);

        System.out.println("Total: " + (totalCurrency + totalWithTax));
    }
}
