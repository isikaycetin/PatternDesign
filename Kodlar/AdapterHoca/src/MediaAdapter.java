//3. ADAPTER SINIFI

public class MediaAdapter implements MediaPlayer {

    private VLCPlayer vlcPlayer;
    private WindowsMediaPlayer windowsMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("mp4")){
            windowsMediaPlayer = new WindowsMediaPlayer();
        }else if (audioType.equalsIgnoreCase("mov")){
            vlcPlayer = new VLCPlayer();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")){
            windowsMediaPlayer.playMediaPlayer(fileName);
        }else if (audioType.equalsIgnoreCase("mov")){
            vlcPlayer.playVLCPlayer(fileName);
        }
    }
}
