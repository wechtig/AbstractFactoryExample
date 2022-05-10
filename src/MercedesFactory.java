public class MercedesFactory implements CarAbstractFactory{

    @Override
    public Verbrennerauto verbrennerErstellen() {
        return new AMG();
    }

    @Override
    public Elektroauto elektroErstellen() {
        return new EQS();
    }
}
