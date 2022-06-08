package exercise18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public abstract class Media {

    private String name;
    private int duration;

    public Media(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }


    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.add(new Audio("Højtaler",1000,"100 Db"));
        mediaList.add(new Audio("Headset",1000,"100 Db"));
        mediaList.add(new Video("Tv",10000,"16:4"));
        mediaList.add(new Video("Skærm",1000,"4:3"));


        try {
            PrintStream out = new PrintStream("mediafile.txt");
            for (Media m: mediaList) {
                if (m instanceof Audio){
                    out.println("Name: " + m.getName() + ", Duration: " + m.duration + ", Loudness: " + ((Audio) m).getLoudness());
                }
                else out.println("Name: " + m.getName() + ", Duration: " + m.duration + ", aspectRatio: " + ((Video) m).getAspectRatio());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(mediaList);
    }
}
