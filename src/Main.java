import Ascii.AsciiVideo;
import Ask.AskMe;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        String audio = "src/media/audio.wav";

        System.out.println(new File(audio).getAbsolutePath());
        System.out.println("File esiste? " + new File(audio).exists());

        Music.playASY(audio);
        AsciiVideo video = new AsciiVideo(90,45,1.5,5,100);

        AskMe askMe = new AskMe(video);
        askMe.helloHuman();
    }
}