import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Faturamento {
    public static void main(String[] args){
        // Questao 4 Faturamento

        double SP = 67.83643;
        double RJ = 36.67866;
        double MG = 29.22988;
        double ES = 27.16548;
        double outros = 19.84953;
        double total = 0;

        // calculando o total do faturamento

        total = (SP + RJ + MG + ES + outros);

        // Calculando percentual de cada estado

        double Psp = ((SP/total)*100);
        double Prj = ((RJ/total)*100);
        double Pmg = ((MG/total)*100);
        double Pes = ((ES/total)*100);
        double Poutros = ((outros/total)*100);

        NumberFormat formatter = new DecimalFormat("#0.00");

        System.out.println("A Porcentagem de SP é: " + formatter.format(Psp));
        System.out.println("A Porcentagem de RJ é: " + formatter.format(Prj));
        System.out.println("A Porcentagem de MG é: " + formatter.format(Pmg));
        System.out.println("A Porcentagem de ES é: " + formatter.format(Pes));
        System.out.println("A Porcentagem de Outros é: " + formatter.format(Poutros));






    }
}
