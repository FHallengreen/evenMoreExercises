package exercise16;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class examQuestion {

    private int number;
    private char grade;

    public examQuestion(int number) {
        this.number = number++;
    }

    public void setGrade (){
        Random random = new Random();
        int number = random.nextInt(1,7);
        switch (number){
            case 1 -> this.grade = 'A';
            case 2 -> this.grade = 'B';
            case 3 -> this.grade = 'C';
            case 4 -> this.grade = 'D';
            case 5 -> this.grade = 'E';
            case 6 -> this.grade = 'F';
        }
    }

    public String toString(){
        return "Nr. " + number + ", Grade: " + grade + " | " ;
    }

    public static void main(String[] args) {


        ArrayList<examQuestion> examList = new ArrayList<>();

        for (int i = 0; i < 14; i++) {
            examQuestion examQuestion = new examQuestion(i+1);
            examQuestion.setGrade();
            examList.add(examQuestion);

        }
        System.out.println(examList);

        try {
            PrintStream out = new PrintStream("grade.txt");
            for (examQuestion q: examList) {
                out.println(q.grade);
            }
        }catch (FileNotFoundException fnfe){
            fnfe.getMessage();
        }

    }

}
