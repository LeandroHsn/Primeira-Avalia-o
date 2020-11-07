public class Principal {
    public static void main(String[] args) throws Exception {
        
        // ************************************** Alunos ************************************** //

        System.out.println("\n\n");

        Alunos aluno = new Alunos("Leandro", 1587, 18);
        Funcionarios primeiro = new Funcionarios("João", 1045.00, 45);

        System.out.println("O (a) aluno (a) " + aluno.getNomeAluno() + " de matrícula " + aluno.getMatriculaAluno() + " tem " + aluno.getidadeAluno() + " anos.");
            aluno.setNomeAluno("Samara");
            aluno.setMatriculaAluno(1588);
            aluno.setIdadeAluno(23);
        System.out.println("O (a) aluno (a) " + aluno.getNomeAluno() + " de matrícula " + aluno.getMatriculaAluno() + " tem " + aluno.getidadeAluno() + " anos.");
            aluno.Dias();
            aluno.Metas();

        // ************************************ Funcionários ************************************ //
        System.out.println("\n\n");

        System.out.println("O(a) funcionário " + primeiro.getNome() + " com o salário de " + primeiro.getSalario() + " tem " + primeiro.getIdade() + " anos.");
            primeiro.setNome("Francisco");
            primeiro.setSalario(1045.00);
            primeiro.setIdade(35);
            System.out.println("O(a) funcionário " + primeiro.getNome() + " com o salário de " + primeiro.getSalario() + " tem " + primeiro.getIdade() + " anos.");
            primeiro.quintoDia();
            primeiro.Metas();

        // ************************************** Academia ************************************** //
       System.out.println("\n\n");

       Academia academia = new Academia("Not busy", 45000.00, 15000.00, 620);
        System.out.println("O valor arreacadado pela academia " + academia.getNome() + " foi de " + academia.getRendaMensal() + " R$ com uma quantidade de " + academia.getQntAlunos()+" alunos.");
            academia.Metas();;
            academia.ReceitaMensal(); 
            academia.setDespesas(14000.00);
            academia.setRendaMensal(60000.00);
            academia.setNome("Teodoro Company");
            academia.setQntAlunos(856);
            System.out.println("O valor arreacadado pela academia " + academia.getNome() + " foi de " + academia.getRendaMensal() + " R$ com uma quantidade de " + academia.getQntAlunos()+" alunos.");
            academia.Metas();;
            academia.ReceitaMensal();         
    }
        
}
