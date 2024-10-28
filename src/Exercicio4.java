public class Exercicio4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int resultado = somar(10, 20);
            exibirResultado(i, resultado);
        }
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void exibirResultado(int numeroExecucao, int resultado) {
        System.out.println("Execução número " + (numeroExecucao + 1) + ": Resultado da soma = " + resultado);
    }
}