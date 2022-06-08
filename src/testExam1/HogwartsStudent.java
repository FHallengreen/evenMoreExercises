package testExam1;

import java.util.ArrayList;
import java.util.Collections;

public class HogwartsStudent implements Comparable<HogwartsStudent> {

    private String firstName;
    private String lastName;
    private HogwartsHouse house;

    public HogwartsStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setHouse(HogwartsHouse house) throws Exception {
        if (house == HogwartsHouse.GRYFFINDOR || house == HogwartsHouse.HUFFLEPUFF ||
                house == HogwartsHouse.RAVENCLAW || house == HogwartsHouse.SLYTHERIN) {
            this.house = house;
        } else throw new Exception("Ugyldigt valg");
    }

    public String toString() {
        if (house == null) {
            return firstName + " " + lastName + " (No House yet)";
        } else return firstName + " " + lastName + " " + house;
    }

    public static void main(String[] args) throws Exception {
        HogwartsStudent student = new HogwartsStudent("Frederik", "Hansen");
        HogwartsStudent student2 = new HogwartsStudent("Bob", "Larsen");
        HogwartsStudent student3 = new HogwartsStudent("Erik", "Andersen");
        try {
            student.setHouse(HogwartsHouse.GRYFFINDOR);
            student2.setHouse(HogwartsHouse.SLYTHERIN);
        } catch (Exception e) {
            System.out.println("Ugyldigt valg");
        }

        ArrayList<HogwartsStudent> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);

    }

    @Override
    public int compareTo(HogwartsStudent o) {
        return this.lastName.compareTo(o.lastName);
    }
}
