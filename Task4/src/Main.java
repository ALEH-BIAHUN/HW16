import java.util.Scanner;

public class Main {
    private static final String VALID_NUMBER = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String VALID_FORMAT_SHORT = "+7 ($1) $2 $3-$4";
    private static final String VALID_FORMAT_LONG = "+7 ($2) $3 $4-$5";
    public static final int THE_NUMBER_OF_DIGITS_IN_THE_NUMBER_1 = 10;
    public static final int THE_NUMBER_OF_DIGITS_IN_THE_NUMBER_2 = 11;

    public static void main(String[] args) {
        System.out.println("Введите номер своего телефона: ");
        String numberOfPhone = new Scanner(System.in).nextLine();

        numberOfPhone = numberOfPhone.replaceAll("\\D+", "");

        if (numberOfPhone.length() == THE_NUMBER_OF_DIGITS_IN_THE_NUMBER_1) {
            numberOfPhone = numberOfPhone.replaceAll(VALID_NUMBER, VALID_FORMAT_SHORT);
            System.out.println(numberOfPhone);
        } else if (numberOfPhone.length() == THE_NUMBER_OF_DIGITS_IN_THE_NUMBER_2) {
            numberOfPhone = numberOfPhone.replaceAll("(\\d)" + VALID_NUMBER, VALID_FORMAT_LONG);
            System.out.println(numberOfPhone);
        } else {
            System.out.println("Это не номер телефона");
        }
    }
}