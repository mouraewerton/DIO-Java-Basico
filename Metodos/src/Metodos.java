public class Metodos {
    public static void main(String[] args) throws Exception {
        /*
         * Métodos - Exemplos para nomenclatura de métodos
         * somar(int n1, int n2){}
         * 
         * abrirConexao(){}
         * 
         * concluirProcessamento(){}
         * 
         * findById(int id){} // normalmente encontraremos vários metodos em outra
         * lingua.
         * 
         * calcularImprimir(){} // há algo errado neste método, ou ele conclui uma ação
         * ou outra, não há como calcular e imprimir no mesmo método.
         * 
         * Caso o método não retorne nenhum valor, ele será representado pela
         * palavra-chave "void".*
         * Quais os parametros serão necessários para execução do método?
         * O metodo possui o risco de apresentar alguma exceção?
         * Qual a visibilidade do método?
         * EXERCITANDO: CRIANDO UMA SMART TV COM ALGUMAS CARACTERISTICAS
         */

        SmartTV smartTV = new SmartTV();
        System.out.println("A TV está ligada ? " + smartTV.ligada);
        System.out.println("Qual o Canal Atual ? " + smartTV.canal);
        System.out.println("Qual o Volume Atual ? " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Status da TV => ? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Status da TV => ? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        smartTV.diminuirVolume();

        smartTV.mudarCanal(3);
        System.out.println("Canal Atual : " + smartTV.canal);
    }
}
