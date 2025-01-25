public class Main {
    public static void main(String[] args) {
        HavaDurumu havaDurumu = new HavaDurumu(); // Hava durumu sistemi oluştur

        Kullanici kullanici1 = new Kullanici("Işıkay");
        Kullanici kullanici2 = new Kullanici("Ali");

        havaDurumu.gozlemciEkle(kullanici1); // Kullanıcıları abone yap
        havaDurumu.gozlemciEkle(kullanici2);

        havaDurumu.durumAyarla("Güneşli");
        // Çıktı:
        // Işıkay hava durumu güncellendi: Güneşli
        // Ali hava durumu güncellendi: Güneşli

        havaDurumu.gozlemciKaldir(kullanici2); // Ali'yi abonelikten çıkar
        havaDurumu.durumAyarla("Yağmurlu");
        // Çıktı:
        // Işıkay hava durumu güncellendi: Yağmurlu
    }
}