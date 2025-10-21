package academy.hugaodev.desafios.SistemaGestaoRecursosHumanos.teste;

import academy.hugaodev.desafios.SistemaGestaoRecursosHumanos.domain.Desenvolvedor;
import academy.hugaodev.desafios.SistemaGestaoRecursosHumanos.domain.Gerente;

public class MainTeste {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("hugo", 54, 2300, "Java");
        Gerente gerente = new Gerente("Marcos", 23, 4500, 10);

        desenvolvedor.exibirDetalhes();
        desenvolvedor.calcularSalarioTotal();
        gerente.exibirDetalhes();
        gerente.calcularSalarioTotal();


    }
}
