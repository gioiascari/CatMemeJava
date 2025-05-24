package Ask;

import Ascii.AsciiVideo;

import java.util.Scanner;

public class AskMe {
//in realtà questa parte era per un altro progetto, però l'idea ci sta

    private final Scanner sc = new Scanner(System.in);
    private final AsciiVideo av;

    public AskMe(AsciiVideo av) {
        this.av = av;
    }


    public void helloHuman() throws InterruptedException {
        System.out.println("Hi!:)");
        while(true){
            System.out.println("I've a gift for you! Do you wanna see it? :)");
            String inp = sc.nextLine().trim().toLowerCase();
            if(inp.equals("ok")){
                System.out.println("Perfect :3");
                av.play("video.mp4");
                break;
            }else if(inp.equals("no")){
                whyNo();
                System.out.println("None of my business.");
            }
            else{
                excusmeSir();
                System.out.println("I SAID");
            }


        }

    }
    public void whyNo() throws InterruptedException {
        String [] frames = { "⣴⡿⠶⠀⠀⠀⣦⣀⣴⠀⠀⠀⠀\n" +
                "⣿⡄⠀⠀⣠⣾⠛⣿⠛⣷⠀⠿⣦\n" +
                "⠙⣷⣦⣾⣿⣿⣿⣿⣿⠟⠀⣴⣿\n" +
                "⠀⣸⣿⣿⣿⣿⣿⣿⣿⣾⠿⠋⠁\n" +
                "⠀⣿⣿⣿⠿⡿⣿⣿⡿⠀⠀⠀⠀\n" +
                "⢸⣿⡋⠀⠀⠀⢹⣿⡇⠀⠀⠀⠀\n" +
                "⣿⡟⠀⠀⠀⠀⠀⢿⡇⠀⠀⠀⠀\n" +
                "⠉⠁⠀⠀⠀⠀⠀⠸⠇⠀⠀⠀⠀",};
        for (String frame : frames) {
            clearConsole();
            System.out.println(frame);
            Thread.sleep(500);
        }
    }

    public void excusmeSir() throws InterruptedException {
        String [] frames = { "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠁⣠⣴⣄⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁⢀⣴⣿⣿⣿⣿⡆⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠉⠀⣠\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⢀⣠⣶⣿⡟\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⠁⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠉⠉⠙⠛⠛⠛⠿⠋⠀⣀⣴⣿⣿⣿⠋⣰\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⡀⢠⣿⣿⣿⣿⣿⣿⣿⣿⡏⣩⣤⠄⣠⣶⣶⡶⢀⣤⡀⠀⣠⣾⣿⣿⣿⡿⢃⣼⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠐⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⣴⣿⢃⣾⣿⣿⢋⣴⣿⠟⣠⣿⣿⣿⣿⣿⣿⠁⠾⠿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⠸⣿⢃⣾⣿⣿⢃⣾⣿⠏⣴⣿⣿⣿⣿⣿⣿⣿⣴⠋⣠⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠉⠉⠀⣠⣿⣿⣿⣿⣿⠿⢿⣿⣿⣿⣿⣦⣠⣾⣿⣿⣧⡘⠿⠋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡙⣿\n" +
                "⣿⣿⣿⣿⣿⡟⠁⠀⠈⠉⠛⠏⠀⣴⣤⣴⣿⣿⣿⡿⠋⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣌\n" +
                "⣿⣿⡿⠋⠉⠁⢀⣿⡃⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⠁⠀⠀⠀⠀⢸⣿⣿⠿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠁⠀⠉⠙⢿⣿⣿⣿⣿⣿\n" +
                "⣿⠋⠀⣠⣶⣷⣾⣿⣿⣿⣄⠲⣤⣀⠀⠈⠙⠿⣿⡀⠀⠀⠀⣠⡞⣩⣴⣾⣿⣿⣿⣶⣬⣛⢿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿\n" +
                "⡇⠀⣴⣿⡿⠉⠉⠉⠻⣿⣿⣇⠠⢉⠻⢦⣄⠀⠈⠻⢷⣶⣿⡏⣾⡀⠿⣿⡿⠻⣿⣿⣿⠛⣧⡹⣿⣇⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿\n" +
                "⡇⠀⣿⣿⠀⠀⠀⠀⠀⢻⣿⡿⢸⣷⣬⡂⢍⠻⢶⣄⡀⠉⠛⢷⣿⣷⣦⣤⣴⣦⣈⣉⣁⣠⣾⡇⣿⣿⣦⣀⠀⠀⢀⣠⣿⣿⣿⣿⣿⣿\n" +
                "⡇⠀⣿⣿⣆⠀⠀⠀⣠⣿⣿⣧⢸⣿⣿⣿⣷⣬⣐⣬⡙⠢⠀⠀⠈⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⡇⠀⣿⣿⣿⣿⠿⢿⡿⠿⠿⠟⢼⣿⣿⣿⣿⣿⣿⣿⣿⣶⠀⣷⠀⡄⠀⠈⠛⠛⠛⠛⠿⠿⣫⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⡇⠀⣿⡛⢹⣇⠀⣠⡏⢘⣿⣿⣶⣌⠙⠻⢿⣿⣿⣿⣿⣿⠀⣿⠀⡇⢰⡆⣄⠀⠀⢤⡀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⡇⠀⢻⣷⣤⣙⣛⣋⣴⣿⠿⠟⣿⣿⢸⠀⡆⢈⢙⠻⢿⣿⠀⠿⠀⣿⢸⡇⣿⠀⣆⢠⣈⠃⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣇⠀⠀⢉⠛⠛⠛⠛⠋⠁⠤⡀⠈⠙⠘⠆⡇⢸⠈⣷⣦⣍⡀⠄⡀⠉⠈⠃⢿⠀⣿⢸⣭⣷⣦⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣦⣄⣀⠀⠁⠀⠀⠀⠀⠀⠀⠉⠢⢄⡀⠀⠙⠀⢿⣿⣿⣿⣷⣤⣁⠢⠀⡀⠀⠙⢸⣿⣿⣿⡄⠀⢿⣿⣿⣿⡿⣿⣿⣿⣿⡿⠿⠿⠛\n" +
                "⣿⣿⣿⣿⣷⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠂⢄⡀⠈⠙⠻⢿⣿⣿⣿⣶⣬⣑⠀⠸⢿⣿⣿⡇⠀⢸⡛⣿⣿⣷⢠⡉⠻⢿⠇⢠⣦⣴\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠂⠀⠀⠉⠉⠙⠛⠿⢿⣿⣶⣦⣌⡉⠃⠀⠈⣿⣦⣍⣫⣾⣿⣷⣤⣴⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⣰⣿⣿⣿⣷⣦⡀⢠⣴⣾⣿⣿⡿⣷⣶⣶⣤⡀⠈⠙⣿⣿⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⢀⣿⣿⣿⣿⣿⣿⠀⣾⣿⣿⡿⣫⣾⣿⣿⣿⣿⣿⣷⣄⠈⠙⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣬⣙⠻⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⠀⠹⣿⢿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀",}
                ;
        for (String frame : frames) {
            clearConsole();
            System.out.println(frame);
            Thread.sleep(500);
        }
    }

    //per pulire il terminale, un senso di pace
    private void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
