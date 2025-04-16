import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("What is the dollar price? ");
        Converter.price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        Converter.dolar = sc.nextDouble();
        System.out.println("Amount to be in reais = " + Converter.Calc());

        sc.close();
    }
}