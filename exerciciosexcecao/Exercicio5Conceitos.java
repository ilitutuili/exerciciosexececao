public class Exercicio5Conceitos {
    public static void main(String[] args) {
        System.out.println("1. Exception representa condições que uma aplicação pode tratar; Error indica falhas graves da JVM ou do ambiente, normalmente não recuperáveis.");
        System.out.println("2. Exceções checked são verificadas pelo compilador: devem ser capturadas ou declaradas com throws. Exemplos: IOException e SQLException.");
        System.out.println("3. Um return em finally pode substituir o valor retornado pelo try/catch e até suprimir uma exceção pendente; por isso, deve ser evitado.");
        System.out.println("4. Em geral, não é boa prática capturar Throwable: isso inclui Error, que normalmente não deve ser tratado como uma exceção comum. Capture tipos específicos.");
    }
}
