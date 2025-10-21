package academy.hugaodev.desafios.SistemaGestaoRecursosHumanos.domain;

public class Desenvolvedor extends Funcionario{
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, int matricula, double salarioBase, String linguagemPrincipal) {
        super(nome, matricula, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        ContadorFuncionarios.incrementarContador();
    }



    @Override
    public double calcularSalarioTotal() {
        salarioBase += 500;
        System.out.println("Salario apos o bonus: "+ salarioBase);
        return super.calcularSalarioTotal();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("---DESENVOLVEDOR---");
        super.exibirDetalhes();
        System.out.println("Linguagem Principal: "+this.linguagemPrincipal);
    }
}
