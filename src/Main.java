public class Main
{
    public static void main(String[] args)
    {
        double purchase = 10.45;
        double salesTax = purchase * 0.05;
        double price = purchase + salesTax;
        double roundTax = Math.round(salesTax * 100)/100D;
        double roundPrice = Math.round(price * 100)/100D;

        System.out.println("Your price is: $" + purchase);
        System.out.println("Sales tax is: $" + roundTax);
        System.out.println("Total price: $" + roundPrice);
    }
}