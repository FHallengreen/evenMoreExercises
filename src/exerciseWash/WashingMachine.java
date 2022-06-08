package exerciseWash;

import java.util.ArrayList;

public class WashingMachine {

    private int time;

    public void setWashingTime(int temperature, boolean isExpressWash) {
        if (isExpressWash) {
            this.time = 20;
        } else if (temperature < 45) {
            this.time = 45;
        } else if (temperature > 60) {
            this.time = 60;
        } else this.time = 120;
    }

    public int getTime() {
        return time;
    }

    public static void main(String[] args) {
        ArrayList<String> log = new ArrayList<>();
        WashingMachine wash = new WashingMachine();

        wash.setWashingTime(50,false);
        log.add("Date: 08/06/2022 " + ", Washing time: " + wash.getTime());
        wash.setWashingTime(120,true);
        log.add("Date: 08/06/2022 " + ", Washing time: " + wash.getTime());
        wash.setWashingTime(120,false);
        log.add("Date: 08/06/2022 " + ", Washing time: " + wash.getTime());

        System.out.println(log);

    }

}
