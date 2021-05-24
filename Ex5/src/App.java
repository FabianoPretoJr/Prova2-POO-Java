import java.util.Scanner; 
public class App {
    public static void main(String args[]) {
        final int FUNCIONARIOS = 5;

        Scanner floatInput = new Scanner(System.in); 
        Scanner stringInput = new Scanner(System.in); 
        Scanner intInput = new Scanner(System.in);

        Funcionario array[] = new Funcionario[FUNCIONARIOS];

        String nome, mail, linguagem, disciplina; 
        float salario, valorHoraAula;
        int tipo, horasMensais;

        for (int i = 0; i < FUNCIONARIOS; i++) 
        {
            System.out.printf("\n\nDigite o nome do funcionario: "); 
            nome = stringInput.nextLine();

            System.out.printf("Digite o mail do funcionario: "); 
            mail = stringInput.nextLine();
            
            System.out.printf("Digite o tipo do funcionario - (1) programador; (2) instrutor: ");
            tipo = intInput.nextInt();

            if (tipo == 1) 
            {
                System.out.printf("Digite a linguagem do programador: "); 
                linguagem = stringInput.nextLine();

                System.out.printf("Digite o salario do programador: "); 
                salario = floatInput.nextFloat();
                    
                Programador funcionario = new Programador(nome, mail, linguagem); 
                funcionario.setSalario(salario);

                array[i] = funcionario;
            }
            else if (tipo == 2) 
            {
                System.out.printf("Digite a disciplina do instrutor: "); 
                disciplina = stringInput.nextLine();

                System.out.printf("Digite o valor da hora aula do instrutor: "); 
                valorHoraAula = floatInput.nextFloat();

                System.out.printf("Digite a quantidade de horas mensais do instrutor: "); 
                horasMensais = intInput.nextInt();

                Instrutor funcionario = new Instrutor(nome, mail, disciplina); 
                funcionario.setValorHoraAula(valorHoraAula); 
                funcionario.setHorasMensais(horasMensais);

                array[i] = funcionario;
            }
        }

        for (int i = 0; i < FUNCIONARIOS; i++) 
        {
            System.out.printf("\n\nFuncionario %d:\n", i + 1); array[i].exibeDados();
        }

        floatInput.close();
        stringInput.close();
        intInput.close();
    }
}