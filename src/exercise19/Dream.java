package exercise19;

import java.util.ArrayList;
import java.util.Collections;

public class Dream {

    private String date;
    private int duration;
    private DreamType type;

    public Dream(String date, int duration, DreamType type) {
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public boolean isPleasant (){
        if (type == DreamType.NIGHTMARE){
            return false;
        }
        else if (type == DreamType.WET  && duration < 10){
            return true;
        }
        else return type == DreamType.DRY && duration > 10;
    }

    public String toString(){
        return "Date: " + date + ", Duration: " + duration + ". Dreamtype: " + type;
    }

    public String getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        ArrayList<Dream> dreamList = new ArrayList<>();
        Dream dream1 = new Dream("20/05/2022",10,DreamType.WET);
        Dream dream2 = new Dream("19/05/2022",7,DreamType.WET);
        Dream dream3 = new Dream("21/05/2022",15,DreamType.DRY);

        System.out.println(dream2.isPleasant());
        dreamList.add(dream1);
        dreamList.add(dream2);
        dreamList.add(dream3);

        System.out.println(dreamList);
        Collections.sort(dreamList,new ComparatorClass());
        System.out.println(dreamList);

    }

}
