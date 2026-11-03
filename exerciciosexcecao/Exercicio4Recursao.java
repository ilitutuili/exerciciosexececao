public class Exercicio4Recursao {
    // Exemplo propositalmente incorreto: não há condição de parada.
    // Não chame este método em uma execução normal: ele causa StackOverflowError.
    public static void recursaoSemParada() {
        recursaoSemParada();
    }

    // Versão corrigida: o caso-base interrompe a recursão.
    public static int contarAte(int atual, int limite) {
        if (atual >= limite) {
            return atual;
        }
        return contarAte(atual + 1, limite);
    }

    public static void main(String[] args) {
        System.out.println("Contagem recursiva corrigida: " + contarAte(1, 5));
        System.out.println("A versão sem parada está no método recursaoSemParada(), mas não foi chamada.");
    }
}
