public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        // volume = volume + 1;
        volume++;
        System.out.println("Aumentar Volume: " + volume);
    }

    public void diminuirVolume() {
        // volume = volume - 1;
        volume--;
        System.out.println("Diminuir volume: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

}
