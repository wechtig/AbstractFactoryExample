public class Golf implements Verbrennerauto{
    @Override
    public void tanken() {
        System.out.println("Wir tanken mit dem Golf ca. 50 Liter Diesel");
    }

    @Override
    public void fahrenGangschaltung() {
        System.out.println("Wir fahren mit dem Golf mit 5 Gänge und 4,5l Verbrauch.");
    }
}
