package Ascii;

import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

public class AsciiVideo {
    /*
    ogni frame del video viene convertito in una griglia di caratteri che vengono poi stampati in tempo reale nel terminale :3
     */
    private final int width;
    private final int height;
    private final double alpha;
    private final double beta;
    private final double gamma;
    private final String micio = "OIA";

    public AsciiVideo(int width, int height, double alpha, double beta, double gamma) {
        this.width = width;
        this.height = height;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
    }

    public void play(String videoPath){
        VideoCapture vc = new VideoCapture(videoPath);

        //premettendo eccezzioni non volute
        if(!vc.isOpened()){
            throw new RuntimeException("Video capture not opened");
        }
        //Oggetto Mat definito su classe AsciiRenderer
        Mat mat = new Mat();
        AsciiRenderer ar = new AsciiRenderer(width, height, alpha, beta, gamma, micio);

        while(vc.read(mat)){
            String[] asciiFrame = ar.convertMatToAscii(mat);
            printFrame(asciiFrame);
            sleep(40);//testing
        }
        vc.release();
    }

    private void printFrame(String[] asciiFrame){
        System.out.println("\033[H\033[2J");//questo pulisce il terminale ;)
        for(String line : asciiFrame){
            System.out.println(line);
        }
    }

    private void sleep(long millis){
        try{
            Thread.sleep(millis);
        }catch(InterruptedException e){}
    }

}
