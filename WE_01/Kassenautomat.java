import java.util.*;

public class Kassenautomat {

    private static final double
        PREIS_ERWACHSENE        = 5.00,
        PREIS_KINDER            = 3.50,
        TAGESPREIS_ERWACHSENE   = 7.00,
        TAGESPREIS_KINDER       = 4.50;

    private static double dauer;
    private static int erwachsene, kinder;

    private static String input(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextLine();
    }

    private static double berechnePreis(int anzahlErwachsene, int anzahlKinder, boolean tageskarte) {
        
        if(tageskarte) {
            return TAGESPREIS_KINDER * anzahlKinder + TAGESPREIS_ERWACHSENE * anzahlErwachsene;
        }

        return PREIS_KINDER * anzahlKinder + PREIS_ERWACHSENE * anzahlErwachsene;
    }

    private static void automateneingabe() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kartenatomat Schwimmbad");
        System.out.println("=======================\n");
        System.out.print("\nBitte Aufenthaltsdauer eingeben: ");
        dauer       = scanner.nextDouble();
        System.out.print("\nBitte Anzahl erwachsener Personen eingeben: ");
        erwachsene  = scanner.nextInt();
        System.out.print("\nBitte Anzahl Kinder eingeben: ");
        kinder      = scanner.nextInt();
    }

    public static void main(String[] args) {
        automateneingabe();

        double gesamtpreis = 0;
        if(dauer < 3.0) gesamtpreis = berechnePreis(erwachsene, kinder, false);
        else            gesamtpreis = berechnePreis(erwachsene, kinder, true);

        System.out.println("\nDie Karte kostet " + gesamtpreis + " EUR für " + dauer + " Stunden.");
    }

}
