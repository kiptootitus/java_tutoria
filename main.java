import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //shopping cart
        Scanner scanner = new Scanner(System.in);
        String item;
        Double price;
        Integer quantity;

        // Create a shopping cart
        System.out.println("enter the number of items in the cart");
        item = scanner.nextLine();
        System.out.println("enter the price of the item");
        price = scanner.nextDouble();
        System.out.println("enter the quantity of the item");
        quantity = scanner.nextInt();


        double total = price * quantity;
        System.out.println("The total price of " + item + " is: " + total);



        scanner.close();
    }
}
