package exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Raflebæger {

    private int dices;
    private int[] shakeDices;

    public Raflebæger(int dices) {
        this.dices = dices;
    }

    public int shake(){
        shakeDices = new int[dices];
        Random random = new Random();
        int total = 0;
        for (int i = 0; i < shakeDices.length; i++) {
            shakeDices[i] = random.nextInt(1,6);
            total += shakeDices[i];
        }
        return total;
    }

    public int[] see(){
        return shakeDices;
    }

    public static void main(String[] args) {

        Raflebæger raflebæger = new Raflebæger(4);
        raflebæger.shake();
        System.out.println(Arrays.toString(raflebæger.see()));
    }

}
