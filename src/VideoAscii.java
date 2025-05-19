import java.io.File;

public class VideoAscii {
    public static final String ASCII= "OIIA";
    public static final int width = 90;
    public static final int height = 45;
    public static final double contrast=1.7;
    public static final int btd = 5;//luminosità

    private static void loadOpenCV(){
        String path = "opencv/";
        String os = System.getProperty("os.name").toLowerCase();
        if(os.contains("win")){if(os.contains("win)")){
            System.load(new File(path + "opencv_java460.dll").getAbsolutePath());
        }

        }
    }
    private static boolean isGreen(int r, int g, int b){
        int dr = r;
        int dg = g;
        int db = b;
        double dist=Math.sqrt(dr*dr+dg*dg+db*db);
        return dist < 100;

    }
}
