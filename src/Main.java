public class Main {
    public static void main(String[] args) {

        // Insert your Feet and Inches in the parenthesis
        // of the calcFeetAndInchesToCentimeters() Method
        // If the method returned -1 (an invalid inserted value)
        // the program prints "Invalid Value. Try again!" out

        double check = calcFeetAndInchesToCentimeters(255.98, 6700.56789);
        if (check >= 0) {
            System.out.println("Your result: " + check + " CM");
        } else {
            System.out.println("Invalid Value. Try again!");
        }
    }

    // A Method that converts the inserted
    // in the Main Method Feet and Inches into Centimeters

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        return (feet >= 0) || ((inches >= 0) && (inches <= 12)) ? (((feet * 12) +
                (calcFeetAndInchesToCentimeters(inches) * 12)) * 2.54d) : -1;
    }

    // An overloading Method for calculating feet

    public static double calcFeetAndInchesToCentimeters(double inches) {
        return (inches >= 0) ? inches / 12 : -1;
    }
}
