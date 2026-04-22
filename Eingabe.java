import java.util.Scanner;

public class Eingabe {

    public static int leseZahl() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Ausgabe.zahlEingeben();
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                Ausgabe.keineZahl();
            }
        }
    }

    public static int leseHoelzer() {
        while (true) {
            int zahl = leseZahl();
            if (zahl >= 1 && zahl <= 3) {
                return zahl;
            } else {
                Ausgabe.zahlNichtImBereich();
            }
        }
    }
}