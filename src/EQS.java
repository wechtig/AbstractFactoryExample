public class EQS implements Elektroauto{
    @Override
    public void aufladen() {
        System.out.println("Der EQS wird bei der Mercedes-Werkstatt geladen");
    }

    @Override
    public void fahrenAutomatik() {
        System.out.println("Mit dem EQS fahren wir mit automatik ca. 300km");
    }
}
