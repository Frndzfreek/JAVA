public class NumberFormatExceptions {
//Thrown when trying to convert a string to a number and the format is invalid.
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}
