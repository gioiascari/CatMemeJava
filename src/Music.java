import javax.sound.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music {
    private Clip clip;

    public static void load(String filePath) throws Exception {
        new Thread(() ->{
            try {
            File fa = new File(filePath);
            AudioInputStream as = AudioSystem.getAudioInputStream(new File(filePath));
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start();
            } catch (Exception e) {
                throw new RuntimeException(e);

            }
        }).start();
    }

    public void play() {
        if(clip!=null){
            clip.start();
        }else{
            System.out.println("No clip loaded");
        }
    }
    public void stop() {
        if(clip!=null && clip.isRunning()){
            clip.stop();
        }
    }
    public void close() {
        if(clip!=null){
            clip.close();
        }
    }

}
