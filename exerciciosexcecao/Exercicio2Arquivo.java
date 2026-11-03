import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio2Arquivo {
    public static void abrirArquivo(String caminho) throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        }
    }

    public static void main(String[] args) {
        String caminho = args.length > 0 ? args[0] : "exemplo.txt";
        try {
            abrirArquivo(caminho);
        } catch (IOException e) {
            System.out.println("Não foi possível abrir ou ler o arquivo: " + e.getMessage());
        }
    }
}
