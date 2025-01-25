public class Main {
    public static void main(String[] args) {
        UcUcluCihaz eskiCihaz = new UcUcluCihaz();

        // Eski cihaz için adaptör oluşturuyoruz
        Priz prizAdaptoru = new FiSAdaptörü(eskiCihaz);

        // İstemci, sadece 2 uçlu fiş takıldığını varsayar
        prizAdaptoru.fişiTak("ABD Cihazı");
    }
}