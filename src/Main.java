public class Main {
    public static void main(String[] args) {

        //Exercicio numero 1
        for (int i = 0; i < 5; i++) {
            executarOperacao(i);
        }
    }

    public static void executarOperacao(int numeroExecucao) {
        System.out.println("Execução número " + (numeroExecucao + 1));
        int a = 10;
        int b = 20;
        int resultado = somar(a, b);
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}