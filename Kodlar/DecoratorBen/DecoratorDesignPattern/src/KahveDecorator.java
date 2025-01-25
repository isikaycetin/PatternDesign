// KahveDecorator, Kahve arayüzünü uygular ve Kahve nesnesini sarar.
public abstract class KahveDecorator implements Kahve {
    protected Kahve kahve;  // Temel kahve nesnesi.

    public KahveDecorator(Kahve kahve) {
        this.kahve = kahve;
    }

    @Override
    public String aciklama() {
        return kahve.aciklama();
    }

    @Override
    public double fiyat() {
        return kahve.fiyat();
    }
}
