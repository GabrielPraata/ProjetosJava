import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       CadastroConta cadastroConta;

       System.out.print("Enter account number: ");
       int number = sc.nextInt();
       System.out.print("Enter account holder: ");
       sc.nextLine();
       String holder = sc.nextLine();
       System.out.print("Is there na initial deposit (y/n): ");
       char response = sc.next().charAt(0);
       if (response == 'y'){
           System.out.print("Enter initial deposit value: ");
           double primeiroDeposito = sc.nextDouble();
           cadastroConta = new CadastroConta(number, holder, primeiroDeposito);
       } else {
           cadastroConta = new CadastroConta(number, holder);
       }

       System.out.println();
       System.out.println("Account data: ");
       System.out.println(cadastroConta);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        cadastroConta.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(cadastroConta);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        cadastroConta.deposit(depositValue);
        cadastroConta.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(cadastroConta);


       sc.close();
    }
}