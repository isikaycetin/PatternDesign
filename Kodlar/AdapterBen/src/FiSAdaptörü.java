// Adaptör: 3 uçlu fişi 2 uçlu priza uyumlu hale getirir
class FiSAdaptörü implements Priz {
    private UcUcluCihaz ucUcluCihaz;

    public FiSAdaptörü(UcUcluCihaz ucUcluCihaz) {
        this.ucUcluCihaz = ucUcluCihaz;
    }

    @Override
    public void fişiTak(String cihazAdi) {
        // 3 uçlu fişi uyumlu hale getirir
        ucUcluCihaz.fişiTak3Uclu(cihazAdi); // Eski cihazın 3 uçlu fişi takılır
    }
}
