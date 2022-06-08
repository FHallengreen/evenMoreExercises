package exercise18;

public class Video extends Media{

    private String aspectRatio;

    public String getAspectRatio() {
        return aspectRatio;
    }

    public Video(String name, int duration, String aspectRatio) {
        super(name, duration);
        this.aspectRatio = aspectRatio;
    }
}
