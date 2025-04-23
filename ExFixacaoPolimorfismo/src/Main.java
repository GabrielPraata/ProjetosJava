import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of prodocts: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + "data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if ( ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else if (ch == 'i') {
                System.out.print("Custom fee:" );
                double customFee = sc.nextDouble();
                Product pro = new ImportedProduct(name, price, customFee);
                list.add(pro);
            } else {
                Product pro = new Product(name, price);
                list.add(pro);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}