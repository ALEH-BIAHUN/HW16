import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        enteringEnglishText();
    }

    public static void enteringEnglishText() {
        System.out.println("Введите английский текст, не более 100 символов");
        String string = new Scanner(System.in).nextLine().trim();

        string = string.replaceAll("[,./%^?><{}]", "" );
        string = string.replaceAll("\\s+", "\n");
        System.out.println(string);
    }
}