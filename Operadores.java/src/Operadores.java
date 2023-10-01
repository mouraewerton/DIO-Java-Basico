public class Operadores {
    public static void main(String[] args) throws Exception {

        // classe Operadores em Java

        // Atribuição
        String nome = "Moura"; // a forma de atribuir um valor literal de texto é em String é utilizando as
                               // aspas " ".
        int idade = 28;
        double peso = 90.0; // Convenção americana representa o decimal com ., diferente da brasileira que
                            // representa em , .
        char sexo = 'M'; // Caracter utilizamos aspas simples ' ', com um unico caracter.
        boolean doadorOrgao = false; // valor lógico, sendo sempre False ou True.
        // Date dataNascimento = new Date(); // Criando um novo objeto na aplicação.

        // Aritméticos
        double soma = 10.5 + 15.7; // (+), quando utilizado em "String", realizará a "concatenação de textos".
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // Forma de verificar se a divisão vai resultar em numeros fracionados.
        double resultado = (10 * 7) + (20 / 4);

        // Exemplo de Concatenação
        String nomeCompleto = "Ewerton" + "Moura"; // Resultando em "EwertonMoura"
        System.out.println(nomeCompleto);

        // Concatenação misturando texto com numero

        // concatenacao = 1 + 1 + 1 + "1"; // concatenacao = "31", ocorreu de somar 1 +
        // 1 + 1 e transformar em texto o
        // ultimo 1.
        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + 1; // concatenacao = "1111", onde iniciou a soma
        // e transformou o restante em texto.
        // EX:
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = numero * -1; // Somente desta forma é possível inverter o valor aplicado acima de forma
                              // "unária".
        System.out.println(numero);

    }
}
