public class Instrutor extends Funcionario 
{ 
    private String disciplina;
    private int horasMensais; private float valorHoraAula;
    
    public Instrutor(String nome, String mail, String disciplina) 
    { 
        super(nome, mail);
        setDisciplina(disciplina);
    }
    
    public void setDisciplina(String disciplina) 
    { 
        this.disciplina = disciplina;
    }
    
    public String getDisciplina() 
    { 
        return disciplina;
    }
    
    public void setHorasMensais(int horas) 
    { 
        horasMensais = horas;
    }
    
    public void setValorHoraAula(float vlr) 
    {
        valorHoraAula = vlr;
    }
    
    public float pagamento() 
    {
        return valorHoraAula * horasMensais;
    }
    
    public void exibeDados() 
    { 
        super.exibeDados();
        System.out.printf("Disciplina: " + disciplina + "\n"); System.out.printf("Pagamento: R$ %.2f\n", pagamento());
    }
}    