package Ascii;

import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

public class AsciiRenderer {
    /*
        questa classe permette di ridimensionare, controllare luminosità/contrasto, mappare pixel;
        trasforma ogni frame video dell'oggetto Mat in un array di stringhe ASCII;
        Mat è una classe base di OpenCV per rappresentare immagini/video frame, matrice di pixel, dove ogni pixel può contenere tre canali(RGB) :3.
     */

    private final int width;
    private final int height;
    private final double alpha;
    private final double beta;
    private final double gamma;
    private final String pattern;


    public AsciiRenderer(int width, int height, double alpha, double beta, double gamma, String pattern) {
        this.width = width;
        this.height = height;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.pattern = pattern;
    }

    public String[] convertMatToAscii(Mat mat) {
        //questo metodo è l'anima della festa, indispensabile
        Mat resizedMat = new Mat();
        Imgproc.resize(mat,resizedMat, new Size(width, height));

        //contrasto/luminosità
        Mat control = new Mat();
        resizedMat.convertTo(control, -1, alpha, beta);

        String[] ascii = new String[height];
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < width; j++) {
                double[]rgb = control.get(i, j);
                double b=rgb[0],g=rgb[1],r=rgb[2];

                if(isGreen(r,g,b)){
                    line.append(" ");//il verde lo evitiamo che non ci piace
                }else {
                    int brightness =(int)((r+g+b)/3); //calcolo la luminosità dei pixel
                    int index=(j %pattern.length()); //utilizzo la posizione orizzontale del pixel per scegliere quale carattere utilizzare del pattern.
                    line.append(pattern.charAt(index));
                }
            }
            ascii[i] = line.toString();
        }
        return ascii;
    }

    private boolean isGreen(double r,double g,double b) {
        //calcolo la distanza RGB tra il pixel e il colore
        double dr=r-0;
        double dg=g-255;
        double db=b-0;
        double dist = Math.sqrt(dr*dr+dg*dg+db*db);
        return dist<gamma;
    }
}
