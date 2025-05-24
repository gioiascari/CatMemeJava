import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music {
    private Clip clip;

    public boolean load(String filePath) {
        try {
            File af = new File(filePath);
            AudioInputStream as = AudioSystem.getAudioInputStream(af);
            clip = AudioSystem.getClip();
            clip.open(as);
            return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
        }

    }

    public static void playASY(String filePath) throws Exception {

        new Thread(() -> {
            Music m = new Music();
            if(m.load(filePath)) {
                m.play();
            }

        }).start();
    }

    public void play() {
        if(clip!=null){
            clip.start();
        }else{
            System.out.println("Bad clip request");
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
