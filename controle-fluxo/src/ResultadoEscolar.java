public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {

        int nota = 6;

        if (nota >= 7) // Retornar "True"
            System.out.println("Aprovado: " + nota);

        else if (nota >= 5 && nota < 7) // Retornar "True ou False"
            System.out.println("Exame");

        else
            System.out.println("Reprovado: " + nota);

        /*
         * Condição Ternária
         * int nota = 7;
         * 
         * String resultado = nota >=7 ? "Aprovado" : "Reprovado";
         * 
         * System.out.println(resultado);
         */

        /*
         * Condição Encadeada
         * int nota = 7;
         * 
         * String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Exame" :
         * "Reprovado";
         * 
         * System.out.println(resultado);
         * 
         */

    }
}
