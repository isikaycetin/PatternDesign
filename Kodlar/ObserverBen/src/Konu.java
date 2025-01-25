interface Konu {
    void gozlemciEkle(Gozlemci gozlemci);    // Gözlemci ekle
    void gozlemciKaldir(Gozlemci gozlemci); // Gözlemci çıkar
    void bildirimGonder();                  // Gözlemcilere bildirim gönder
}