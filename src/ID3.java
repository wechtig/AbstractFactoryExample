public class ID3 implements Elektroauto{
    @Override
    public void aufladen() {
        System.out.println("Der VW ID3 wird an der nächsten Ladesäule aufgeladen");
    }

    @Override
    public void fahrenAutomatik() {
        System.out.println("Mit dem VW ID3 kann man ca. 250km fahren.");
    }
}
