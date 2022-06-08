package exercise12;

import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    public boolean validUserID(String userID) {
        int counter = 0;
        if (!(userID.length() == 8)) {
            return false;
        }
        for (int i = 0; i < userID.length(); i++) {
            if (Character.isLetter(userID.charAt(i)) && i < 4 || Character.isDigit(userID.charAt(i)) && i >= 4) {
                counter++;
            }
        }
        if (counter == 8) {
            return true;
        } else return false;
    }

    public String createUserID(String fullName) {
        String firstName = fullName.substring(0, 2).toLowerCase();
        int index = fullName.indexOf(" ");
        String lastName = fullName.substring(index + 1, index + 3).toLowerCase();

        Random random = new Random();

        int id = random.nextInt(1000, 9999);

        return userID = firstName + lastName + id;
    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.validUserID("frha0440".toLowerCase()));
        System.out.println(user.createUserID("Frederik Hansen"));

    }
}
