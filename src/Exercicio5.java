public class Exercicio5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int[] valores = definirValores();
            int resultado = somar(valores[0], valores[1]);
            System.out.println("Execução número " + (i + 1) + ": A soma de " + valores[0] + " e " + valores[1] + " é: " + resultado);
        }
    }

    public static int[] definirValores() {
        int a = 10;
        int b = 20;
        return new int[] {a, b};
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}