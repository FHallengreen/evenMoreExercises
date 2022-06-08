package exercise1;

import java.util.ArrayList;

public class Tekst {

    private ArrayList<String> textlines = new ArrayList<>();

    public void addText(String text){
        textlines.add(text);
    }

    public ArrayList<String> findUniques (){
        ArrayList<String> uniqueList = new ArrayList<>();

        for (int i = 0; i < textlines.size(); i++) {
            if (!(uniqueList.contains(textlines.get(i)))){
                uniqueList.add(textlines.get(i));
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        Tekst tekst = new Tekst();
        tekst.addText("Godmorgen");
        tekst.addText("Godaften");
        tekst.addText("Godaften");
        tekst.addText("Godformiddag");
        tekst.addText("Godaften");

        System.out.println(tekst.findUniques());
    }
}
