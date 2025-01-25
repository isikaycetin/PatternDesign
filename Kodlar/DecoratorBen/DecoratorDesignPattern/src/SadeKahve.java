// Sade bir kahve sınıfı, temel kahve türümüz.
public class SadeKahve implements Kahve {

    @Override
    public String aciklama() {
        return "Sade Kahve";
    }

    @Override
    public double fiyat() {
        return 10.0;
    }
}
