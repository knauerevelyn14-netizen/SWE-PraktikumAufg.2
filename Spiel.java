import java.util.Random;

public class Spiel {
    private int hoelzer;

    public Spiel(int anzahl) {
        this.hoelzer = anzahl;
        Ausgabe.spielstand(hoelzer);
        while (hoelzer > 0) {
            menschZiehen();
            if (hoelzer == 0) {
                Ausgabe.computerGewinnt();
                return;
            }
            computerZiehen();
            if (hoelzer == 0) {
                Ausgabe.menschGewinnt();
                return;
            }
        }
    }

    public void computerZiehen() {
        int zug = berechneComputerZug();
        hoelzer -= zug;
        Ausgabe.computerZug(zug, hoelzer);
    }

    public void menschZiehen() {
        while (true) {
            int zug = Eingabe.leseHoelzer();
            if (zug <= hoelzer) {
                hoelzer -= zug;
                Ausgabe.menschZug(zug, hoelzer);
                break;
            } else {
                Ausgabe.zugNichtMoeglich();
            }
        }
    }

    private int berechneComputerZug() {
        Random rand = new Random();
        return rand.nextInt(3) + 1;
    }
}


