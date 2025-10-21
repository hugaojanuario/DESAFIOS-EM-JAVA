package academy.hugaodev.desafios.SistemaGestaoRecursosHumanos.domain;

public class ContadorFuncionarios {
    private static int totalFuncionarios = 0;

    public static void incrementarContador(){
        totalFuncionarios++;
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }
}
