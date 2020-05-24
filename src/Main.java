public class Main {
    public static void main(String[] args) {

        // Insert your Feet and Inches in the parenthesis
        // of the calcFeetAndInchesToCentimeters() Method
        // If the method returned -1 (an invalid inserted value)
        // the program prints "Invalid Value. Try again!" out
        // The inserted number of inches must be in a range between 0 and 12

        double check = calcFeetAndInchesToCentimeters(5, 16);
        if (check >= 0.0) {
            System.out.println("The result of conversion into centimeters: " + check + " CM");
        } else if (check == -1) {
            System.out.println("Invalid Value. Try again!");
        }
    }

    // A Method that converts the inserted
    // in the Main Method Feet and Inches into Centimeters

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        System.out.println("You have inserted " + feet + " Feet and " + inches + " Inches");
        return ((feet >= 0) && (inches >= 0)) && (inches <= 12) ? (((feet * 12) +
                (calcFeetAndInchesToCentimeters(inches) * 12)) * 2.54d) : -1;

    }

    // An overloading Method for calculating feet

    public static double calcFeetAndInchesToCentimeters(double inches) {
        return (inches >= 0) ? inches / 12 : -1;
    }
}
