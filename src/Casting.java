import javax.swing.*;

public class Casting {
    public static int getInt(String message) {
        int number = 0;
        try {
            number = Integer.parseInt(message);
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Insert a valid integer!");
        }
        return number;
    }

    public static void main(String[] args) {
        String myString1 = "10";

        int myInt = Integer.parseInt(myString1);
        System.out.println(myInt);

        long myLong = Long.parseLong(myString1);
        System.out.println(myLong);

        float myFloat = Float.parseFloat(myString1);
        System.out.println(myFloat);

        double myDouble = Double.parseDouble(myString1);
        System.out.println(myDouble);

        String myString2 = "OOP";
        System.out.println(getInt(myString2));
    }
}
