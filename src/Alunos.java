public class Alunos {

    // ************************************** Atributos da classe ************************************** //

    private String nomeAluno;
    private int matriculaAluno;
    private int idadeAluno;
    private int validade;

    // ************************************** Métodos construtores ************************************** //

    public Alunos(String nomeAluno, int matriculaAluno, int idadeAluno){
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.idadeAluno = idadeAluno;
        this.validade = 30;
    }

    // ************************************** Métodos especificos ************************************** //

    private void validadeMensalidade(){
        this.validade -= 5;     
    }

    public void Dias(){
        if (validade <= 0){
            System.out.println(nomeAluno + " renove sua mátricula!");
        } else{
            validadeMensalidade();
        System.out.println("O aluno " + nomeAluno + " tem " + validade + " dias de validade.");
        }
    }

    public void Metas (){
        System.out.println("O (a) aluno (a) " +nomeAluno+ " cumpriu a meta do mês, parabéns!");
    }


    // ************************************** Métodos gettes e setter ************************************** //

    public String getNomeAluno(){
        return this.nomeAluno;
    }

    public double getMatriculaAluno(){
        return this.matriculaAluno;
    }

    public int getidadeAluno(){
        return this.idadeAluno;
    }

    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public void setMatriculaAluno(int matriculaAluno){
        this.matriculaAluno = matriculaAluno;
    }

    public void setIdadeAluno(int idadeAluno){
        this.idadeAluno = idadeAluno;
    }
    
}
