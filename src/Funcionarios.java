public class Funcionarios {

    // ************************************** Atributos da classe ************************************** //

    private String nome;
    private double salario;
    private int idade;
    private double pagamento;
    private int dia;

    // ************************************** Métodos construtores ************************************** //

    public Funcionarios(String nome, double salario, int idade){
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;    
        this.dia = 1;
    }

    // ************************************** Métodos especificos ************************************** //

    private void pagamentoMensal(){
        this.pagamento = (this.pagamento + 1045.00);     
    }

    public void quintoDia(){
        if (dia == 1){
            pagamentoMensal();
            System.out.println(nome + " recebeu o seu salário de " + this.pagamento + "." );
        } else{
            System.out.println("Ainda não é dia do pagamento.");
        }
    }

    public void Metas (){
        System.out.println("Os funcionários receberam a bonificação referente as metas.");
    }


    // ************************************** Métodos gettes e setter ************************************** //

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    
}