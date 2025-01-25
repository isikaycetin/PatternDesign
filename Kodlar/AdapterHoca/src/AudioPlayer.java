//4. CLIENT (İSTEMCİ) SINIFI

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);

        }else if (audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("mov")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Unsupported audio type: " + audioType +
                    " format not supported");
        }
    }
}
