public class SistemaMedida {
    public static void main(String[] args) throws Exception {
        String sigla = "A"; // Não muito viável utilizar neste caso.
        switch (sigla) {

            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }

    }
}
