class HavaDurumu implements Konu {
    private Gozlemci[] gozlemciler = new Gozlemci[10]; // Maksimum 10 gözlemci
    private int gozlemciSayisi = 0;
    private String durum;

    public void durumAyarla(String durum) {
        this.durum = durum;
        bildirimGonder(); // Durum değişince bildirim gönder
    }

    @Override
    public void gozlemciEkle(Gozlemci gozlemci) {
        if (gozlemciSayisi < gozlemciler.length) {
            gozlemciler[gozlemciSayisi++] = gozlemci;
        }
    }

    @Override
    public void gozlemciKaldir(Gozlemci gozlemci) {
        for (int i = 0; i < gozlemciSayisi; i++) {
            if (gozlemciler[i] == gozlemci) {
                gozlemciler[i] = gozlemciler[--gozlemciSayisi]; // Gözlemciyi çıkar
                break;
            }
        }
    }

    @Override
    public void bildirimGonder() {
        for (int i = 0; i < gozlemciSayisi; i++) {
            gozlemciler[i].guncelle(durum);
        }
    }
}
