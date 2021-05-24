import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int tamArray = 15;
        double[] arrSalarios = new double[tamArray];
        double mediaSalarios;

        Scanner inputDouble = new Scanner(System.in);

        System.out.println("<===== Calculadora de salários =====>\n\n");

        System.out.println("Por favor digite: \n");
        for(int i = 0; i < arrSalarios.length; i++)
        {
            System.out.print("Valor do " + (i + 1) + "º salário: ");
            arrSalarios[i] = inputDouble.nextDouble();
        }

        mediaSalarios = Salario.calcularMediaSalarios(tamArray, arrSalarios);
        System.out.printf("\n\nMédia salárial dos trabalhadores: R$ %.2f", mediaSalarios);
        System.out.printf("\nNº trabalhadores com salário acima da média: %d", Salario.calcularAcimaDaMedia(mediaSalarios, arrSalarios));
        System.out.printf("\nNº trabalhadores com salário abaixo da média: %d", Salario.calcularAbaixoDaMedia(mediaSalarios, arrSalarios));
        System.out.printf("\nNº trabalhadores com salário na média: %d\n\n", Salario.calcularNaMedia(mediaSalarios, arrSalarios));

        inputDouble.close();
    }
}