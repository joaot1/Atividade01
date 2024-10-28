public class Exercicio3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Util.executarOperacao(i, 10, 20);
        }
    }
}

class Util {
    public static void executarOperacao(int numeroExecucao, int a, int b) {
        System.out.println("Execução número " + (numeroExecucao + 1));
        int resultado = somar(a, b);
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}