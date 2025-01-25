// Kahveye süt ekleyen dekoratör.
public class SutDecorator extends KahveDecorator {

    public SutDecorator(Kahve kahve) {
        super(kahve);
    }

    @Override
    public String aciklama() {
        return kahve.aciklama() + ", Süt";
    }

    @Override
    public double fiyat() {
        return kahve.fiyat() + 3.0;
    }
}