public class Main {

    private static Funcionario fun = new Funcionario();

    private static Estudante est = new Estudante();


    public static void main(String[] args){

        preencherEstudante();
        exibirEstudante();

        preencherFuncionario();
        exibirFuncionario();


        exibirPessoa(est);

        exibirPessoa(fun);

    }

    public static void exibirPessoa(Pessoa pes){
        System.out.println("nome = " + pes.getNome());
        System.out.println("\n");
    }

    private static Estudante preencherEstudante() {
        est.setNome("Radmila");
        est.setEndereco("Rua: Olavo Job, 121");
        est.setIdade(31);
        est.setRa(367890876);
        est.setCurso("Matemática");
        return est;
    }

    private static void exibirEstudante() {
        System.out.println("nome = " + est.getNome());
        System.out.println("endereco = " + est.getEndereco());
        System.out.println("idade = " + est.getIdade());
        System.out.println("ra = " + est.getRa());
        System.out.println("curso = " + est.getCurso());
        System.out.println("\n");
    }

    private static Funcionario preencherFuncionario() {
        final Setor set = new Setor();
        set.setCodigo("E1");
        set.setNome("Escola");

        fun.setNome("Paulo");
        fun.setEndereco("Rua: China, 101");
        fun.setIdade(50);
        fun.setFuncao("Professor");
        fun.setMatricula(3542);
        fun.setSetor(set);
        return fun;
    }

    private static void exibirFuncionario() {
        System.out.println("nome = " + fun.getNome());
        System.out.println("endereco = " + fun.getEndereco());
        System.out.println("idade = " + fun.getIdade());
        System.out.println("funcao = " + fun.getFuncao());
        System.out.println("matricula = " + fun.getMatricula());
        System.out.println("\n");

    }

}