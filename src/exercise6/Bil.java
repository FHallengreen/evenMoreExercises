package exercise6;

public class Bil {
    private Trailer trailer;
    private int weight;

    public Bil(int weight) {
        this.weight = weight;
    }

    public Bil(int weight, Trailer trailer) {
        this.weight = weight;
        this.trailer = trailer;
    }

    public boolean totalWeight() {
        int totalWeight = 0;
        if ((this.trailer == null)) {
            totalWeight += this.weight;
            System.out.println(totalWeight);
        } else {
            totalWeight += this.weight + trailer.getWeight();
            System.out.println(totalWeight);
        }

        if (totalWeight > 3500) {
            return false;
        } else return true;
    }


    public static void main(String[] args) {
        Bil bil = new Bil(1000, new Trailer(2000));
        Bil bil2 = new Bil(3600);
//        System.out.println(bil.totalWeight());
        System.out.println(bil2.totalWeight());
    }
}