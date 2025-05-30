import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();
        for (int i=1; i<n; i++) {
            System.out.print("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Anual income:");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures:");
                Double healthExpenditures = sc.nextDouble();
                Individual individual = new Individual(name, anualIncome, healthExpenditures);
                list.add(individual);
            } else {
                System.out.print("Number of employees:");
                Integer numberEmployees = sc.nextInt();
                Company company = new Company(name, anualIncome, numberEmployees);
                list.add(company);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer: list) {
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f",taxPayer.tax()));
        }
        double sum = 0.0;
        for (TaxPayer taxPayer: list) {
            sum += taxPayer.tax();
            System.out.println("TOTAL TAXES: $ " + String.format("%.2f",sum));
        }
        sc.close();
    }
}