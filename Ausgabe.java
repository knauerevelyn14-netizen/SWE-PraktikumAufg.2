public class Ausgabe {

    private static String schreibeHolz(int anzahl) {
        return anzahl == 1 ? "Holz" : "Hölzer";
    }

    private static String schreibeIst(int anzahl) {
        return anzahl == 1 ? "ist" : "sind";
    }

    public static void zahlEingeben() {
        System.out.println("Bitte gib die Anzahl der Streichhölzer ein, die du nehmen möchtest (1-3):");
    }

    public static void keineZahl() {
        System.out.println("Das ist keine gültige Zahl. Bitte versuche es erneut.");
    }

    public static void zahlNichtImBereich() {
        System.out.println("Die Zahl muss zwischen 1 und 3 liegen. Bitte versuche es erneut.");
    }

    public static void menschGewinnt() {
        System.out.println("Herzlichen Glückwunsch! Du hast gewonnen!");
    }

    public static void computerGewinnt() {
        System.out.println("Der Computer hat gewonnen. Versuche es beim nächsten Mal!");
    }

    public static void zugNichtMoeglich() {
        System.out.println("Dieser Zug ist nicht möglich. Es " + schreibeIst(0) + " nicht genug Hölzer übrig.");
    }

    public static void spielstand(int hoelzer) {
        System.out.println("Es " + schreibeIst(hoelzer) + " noch " + hoelzer + " " + schreibeHolz(hoelzer) + " auf dem Tisch.");
    }

    public static void menschZug(int gezogen, int verbleibend) {
        System.out.println("Du nimmst " + gezogen + " " + schreibeHolz(gezogen) + ". Es bleiben noch " + verbleibend + " " + schreibeHolz(verbleibend) + " übrig.");
    }

    public static void computerZug(int gezogen, int verbleibend) {
        System.out.println("Der Computer nimmt " + gezogen + " " + schreibeHolz(gezogen) + ". Es bleiben noch " + verbleibend + " " + schreibeHolz(verbleibend) + " übrig.");
    }
}

