##Method_overloading
  import java.util.Scanner;

public class ZomatoCheckout {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customerName = input.nextLine();

        System.out.print("Enter Food Item: ");
        String foodItem = input.nextLine();

        int itemPrice = 499;
        double gstRate = 0.18;

        double taxAmount = itemPrice * gstRate;
        double totalWithTax = itemPrice + taxAmount;

        int payableAmount = (int) totalWithTax;

        char currentTier = 'A';
        char upgradedTier = (char) (currentTier + 1);

        System.out.println("\n********** ZOMATO INVOICE **********");
        System.out.println("Customer: " + customerName);
        System.out.println("Item: " + foodItem);
        System.out.println("Base Price: Rs." + itemPrice);
        System.out.println("GST (18%): Rs." + taxAmount);
        System.out.println("Total Amount: Rs." + totalWithTax);
        System.out.println("Rounded Payable Amount: Rs." + payableAmount);
        System.out.println("------------------------------------");
        System.out.println("Loyalty Status: Upgraded to Tier " + upgradedTier);
        System.out.println("************************************");

        input.close();
    }
}
