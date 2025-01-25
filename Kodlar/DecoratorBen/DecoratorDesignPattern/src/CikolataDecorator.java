public class CikolataDecorator extends KahveDecorator {

    public CikolataDecorator(Kahve kahve) {
        super(kahve);
    }

    @Override
    public String aciklama() {
        return kahve.aciklama() + ", Çikolata";
    }

    @Override
    public double fiyat() {
        return kahve.fiyat() + 5.0;
    }
}