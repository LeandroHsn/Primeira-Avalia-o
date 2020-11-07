public class Academia {

    // ************************************** Atributos da classe ************************************** //
    private String nomeAcademia;
    private double rendaMensal;
    private double despesas;
    private int qntAlunos;
    private double valorMensalidade;
    private double valorTotal;

    // ************************************** Métodos construtores ************************************** //

    public Academia(String nomeAcademia, double rendaMensal, double despesas, int qntAlunos){
        this.rendaMensal = rendaMensal;
        this.nomeAcademia = nomeAcademia;
        this.despesas = despesas;
        this.qntAlunos = qntAlunos;
        this.valorMensalidade = 70;
    }

    // ************************************** Métodos especificos ************************************** //

    private void validadeMensalidade(){
        this.valorTotal = (this.valorMensalidade * this.qntAlunos);   
    }

    public void ReceitaMensal(){
        validadeMensalidade();
        System.out.println("O valor arreacadado pela academia com as mensalidades foi de: " + this.valorTotal);
    }

    public void Metas(){
        System.out.println("O valor da meta mensal do mês seguinte é no valor de: " + (this.rendaMensal * 2));
    }


    // ************************************** Métodos gettes e setter ************************************** //

    public double getRendaMensal(){
        return this.rendaMensal;
    }

    public String getNome(){
        return this.nomeAcademia;
    }
   
    public double getDespesas(){
        return this.despesas;
    }

    public int getQntAlunos(){
        return this.qntAlunos;
    }

    public void setNome(String nomeAcademia){
        this.nomeAcademia = nomeAcademia;
    }

    public void setRendaMensal(double rendaMensal){
        this.rendaMensal = rendaMensal;
    }

    public void setDespesas(double despesas){
        this.despesas = despesas;
    }

    public void setQntAlunos(int qntAlunos){
        this.qntAlunos = qntAlunos;
    }
    
}
