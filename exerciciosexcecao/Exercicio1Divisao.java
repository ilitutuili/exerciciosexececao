import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1Divisao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Digite o primeiro número: ");
                double primeiro = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double segundo = scanner.nextDouble();

                if (segundo == 0.0) {
                    throw new ArithmeticException("Não é possível dividir por zero.");
                }

                System.out.println("Resultado: " + (primeiro / segundo));
            } catch (ArithmeticException e) {
                System.out.println("Erro aritmético: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite números válidos.");
            } finally {
                System.out.println("O programa será finalizado!");
            }
        }
    }
}
