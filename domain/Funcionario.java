package academy.hugaodev.desafios.SistemaGestaoRecursosHumanos.domain;

public class Funcionario {
    private String nome;
    private int matricula;
    protected double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal(){
        return this.salarioBase;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Numero Matricula: "+this.matricula);
        System.out.println("Salario base: "+this.salarioBase);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
