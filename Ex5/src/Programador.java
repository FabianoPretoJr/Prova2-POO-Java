public class Programador extends Funcionario 
{ 
    private String linguagem;
    private float salarioMensal;
    
    public Programador(String nome, String mail, String linguagem) 
    { 
        super(nome, mail);
        setLinguagem(linguagem);
    }
    
    public void setLinguagem(String linguagem) 
    { 
        this.linguagem = linguagem;
    }
    
    public String getLinguagem() 
    { 
        return linguagem;
    }
    
    public void setSalario(float salario) 
    { 
        salarioMensal = salario;
    }
    
    public float pagamento() 
    { 
        return salarioMensal;
    }
    
    public void exibeDados() 
    { 
        super.exibeDados();
        System.out.printf("Linguagem: " + linguagem + "\n"); System.out.printf("Pagamento: R$ %.2f\n", pagamento());
    }
}   