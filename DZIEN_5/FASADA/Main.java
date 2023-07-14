import fascade.VideoConverssionFascade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
       VideoConverssionFascade converter = new VideoConverssionFascade();
        File mp4video = converter.convertingVideo("youtubevideo.ogg","mp4");
    }
}
