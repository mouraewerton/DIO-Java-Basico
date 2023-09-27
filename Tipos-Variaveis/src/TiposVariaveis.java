public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        double salarioMinimo = 2500; // Forma correta de definir um salario.

        ////////////////////////////////
        // Peculariedades de tipos de dados
        // byte idade = 123;
        // short ano = 2023;
        // int cep = 11349340; // Se começar com zero, talvez necessite de outro tipo de
        //////////////////////////////// dado (string)
        // long cpf = 98765432109L; // Se começar com zero, talvez necessite de outro
        //////////////////////////////// tipo de dado. (L para identificar do tipo
        //////////////////////////////// LONG).
        // float pi = 3.14F; // Tipo float precisa de um F no fim, upper ou lower case,
        //////////////////////////////// senão ele entende como double.
        // double salario = 2500.50;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

    }
}
