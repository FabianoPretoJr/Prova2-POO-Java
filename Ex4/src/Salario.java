public class Salario {
    public static double calcularMediaSalarios(int numTrabalhadores, double[] arrSalarios)
    {
        double total = 0;
        for (double salario : arrSalarios) 
        {
            total = total + salario;
        }
        return total / numTrabalhadores;
    }

    public static int calcularAcimaDaMedia(double media, double[] arrSalarios)
    {
        int cont = 0;
        for (double salario : arrSalarios) {
            if(salario > media)
                cont++;
        }
        return cont;
    }

    public static int calcularAbaixoDaMedia(double media, double[] arrSalarios)
    {
        int cont = 0;
        for (double salario : arrSalarios) {
            if(salario < media)
                cont++;
        }
        return cont;
    }
    public static int calcularNaMedia(double media, double[] arrSalarios)
    {
        int cont = 0;
        for (double salario : arrSalarios) {
            if(salario == media)
                cont++;
        }
        return cont;
    }
}