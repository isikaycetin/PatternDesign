public class SurupDecorator extends KahveDecorator {

    public SurupDecorator(Kahve kahve) {
        super(kahve);
    }

    @Override
    public String aciklama() {
        return kahve.aciklama() + ", Şurup";
    }

    @Override
    public double fiyat() {
        return kahve.fiyat() + 4.0;
    }
}