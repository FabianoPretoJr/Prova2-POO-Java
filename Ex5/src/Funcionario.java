public abstract class Funcionario 
{ 
    private String nome, mail;

    public Funcionario(String nome, String mail) 
    { 
        setNome(nome);
        setMail(mail);
    }
    
    public void setNome(String nome) 
    { 
        this.nome = nome;
    }
    
    public String getNome() 
    { 
        return nome;
    }
    
    public void setMail(String mail) 
    { 
        this.mail = mail;
    }
    
    public String getMail() 
    { 
        return mail;
    }
    
    public void exibeDados() 
    { 
        System.out.printf("Nome: " + nome + "\n"); System.out.printf("Mail: " + mail + "\n");
    }
    
    public abstract float pagamento();
} 