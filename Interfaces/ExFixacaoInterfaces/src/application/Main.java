package application;

import entities.Contract;
import entities.Installment;
import services.ContractServices;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato:");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(numero,date,totalValue);

        System.out.print("Entre com o numero de parcelas:");
        int n = sc.nextInt();

        ContractServices contractServices = new ContractServices(new PaypalService());

        contractServices.processContract(contract, n);

        System.out.println("Parcelas:");
        for (Installment installment: contract.getInstallments()) {
            System.out.println(installment);
        }
        sc.close();
    }
}