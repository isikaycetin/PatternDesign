class Kullanici implements Gozlemci {
    private String isim;

    public Kullanici(String isim) {
        this.isim = isim;
    }

    @Override
    public void guncelle(String mesaj) {
        System.out.println(isim + " hava durumu güncellendi: " + mesaj);
    }
}