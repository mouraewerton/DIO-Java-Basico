public class ExBreakContinue {
    public static void main(String[] args) throws Exception {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 5)
                // break;
                continue;
            System.out.println(numero);
        }
    }
}