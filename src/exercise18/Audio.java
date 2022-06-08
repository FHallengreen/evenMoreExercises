package exercise18;

public class Audio extends Media {
    private String loudness;

    public String getLoudness() {
        return loudness;
    }

    public Audio(String name, int duration, String loudness) {
        super(name, duration);
        this.loudness = loudness;
    }
}
