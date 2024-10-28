public class Exercicio2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        for (int i = 0; i < 5; i++) {
            calculadora.executarOperacao(i, 10, 20);
        }
    }
}

class Calculadora {
    public void executarOperacao(int numeroExecucao, int a, int b) {
        System.out.println("Execução número " + (numeroExecucao + 1));
        int resultado = somar(a, b);
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
    }

    public int somar(int a, int b) {
        return a + b;
    }
}