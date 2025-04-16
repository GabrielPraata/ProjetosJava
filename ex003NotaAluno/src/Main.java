import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Nota nota = new Nota();

        System.out.print("Nome do Aluno: ");
        nota.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        nota.n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        nota.n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        nota.n3 = sc.nextDouble();

        System.out.println("FINAL GRADE: " + nota.NotaFinal());
        System.out.println(nota.aprovado());


    }
}