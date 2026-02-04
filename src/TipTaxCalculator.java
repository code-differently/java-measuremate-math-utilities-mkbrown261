import java. util.Scanner;
public class TipTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user input defined
        System.out.println(" Enter your Bill amount: ");
      double billamount = scanner.nextDouble();
        System.out.println(" Enter your tax rate (%): ");
        double taxrate = scanner.nextDouble();

        System.out.println(" Enter your tip rate (%): ");
        double tiprate = scanner.nextDouble();

        double tax = calculatetax(billamount, taxrate);
        double tip =calculatetip(billamount, tiprate);
        double total = calculatetotal(billamount, tip, tax);
        double roundedtotal = totaltoround(total);


        System.out.println(" Bill amount: " + " " + billamount);
        System.out.println(" Tax amount: " + " " + tax);
        System.out.println(" Tip amount: " + " " + tip);
        System.out.println(" Total (raw): " + total);
        System.out.println(" Total (Rounded) " + roundedtotal );
    }
    //methods
    public static double calculatetax(double bill, double taxrate) {
        return bill * (taxrate / 100);
    }
    public static double calculatetip(double bill,double tiprate) {
        return bill * (tiprate / 100);
    }
        public static double calculatetotal(double bill, double tax, double tip) {
            return bill + tax + tip;
        }
        public static long totaltoround(double roundedtotal) {
            return  Math.round(roundedtotal);
            }
        }

