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

        while(vc.read(mat)){


        }
    }

}
