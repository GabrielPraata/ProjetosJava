public class Nota {
    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double NotaFinal() {
        return n1 + n2 + n3;
    }

    public String aprovado() {
        double notaFinal = NotaFinal();
        if (notaFinal >= 60.0) {
            return "PASS";
        } else {
            double missing = 60.0 - notaFinal;
            return "FAILED\nMISSING " + String.format("%.2f", missing) + " POINTS";
        }
    }
}
