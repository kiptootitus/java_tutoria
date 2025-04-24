import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //shopping cart
        Scanner scanner = new Scanner(System.in);

        Integer num;
        System.out.print("Enter the number: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        int result = num % 2;
        System.out.printf("The result is: %d\n", result);

        scanner.close();
    }
}
