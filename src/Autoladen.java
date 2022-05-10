public class Autoladen {
    public static void main(String[] args) {

        CarAbstractFactory abstractFactory;

        /* Eingabe */ String wunsch = "Mercedes";

        if(wunsch.equals("VW")) {
            abstractFactory = new VWFactory();
        } else {
            abstractFactory = new MercedesFactory();
        }

        // Produkt verwenden
        Verbrennerauto verbrennerauto = abstractFactory.verbrennerErstellen();

        elektroauto.aufladen();
        elektroauto.fahrenAutomatik();

        verbrennerauto.tanken();
        verbrennerauto.fahrenGangschaltung();
    }
}

