import Ascii.AsciiVideo;
import Ask.AskMe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        String audio = "audio.wav";

        Music.playASY(audio);
        AsciiVideo video = new AsciiVideo(90,45,1.5,5,100);

        AskMe askMe = new AskMe(video);
        askMe.helloHuman();

    }
}