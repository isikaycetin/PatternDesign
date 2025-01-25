public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "kayıtlar");
        audioPlayer.play("mp4","harry_potter_ve_sırlar_odası");
        audioPlayer.play("mov","yüzüklerin_efendisi_iki_kule");
        audioPlayer.play("webmp","erşan_kuneri");
    }
}