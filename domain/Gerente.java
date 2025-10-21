package academy.hugaodev.desafios.SistemaGestaoRecursosHumanos.domain;

public class Gerente extends Funcionario{
    private int numEquipe;

    public Gerente(String nome, int matricula, double salarioBase, int numEquipe) {
        super(nome, matricula, salarioBase);
        this.numEquipe = numEquipe;
        ContadorFuncionarios.incrementarContador();
    }

    @Override
    public double calcularSalarioTotal() {
        salarioBase += 100 * numEquipe;
        System.out.println("Salario apos os bunos: "+ salarioBase);
        return super.calcularSalarioTotal();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("---GERENTE---");
        super.exibirDetalhes();
        System.out.println("Numero de membros em sua equipe: "+ numEquipe);

    }
}

