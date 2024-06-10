import java.util.Scanner;

public class Main {
    private static final String VALID_REGEX = "((([А-я]+)|([А-я-]+))\\s){2}(([А-я]+)|([А-я-]+))";
    private static final String FAMILIYA_REGEX = "Фамилия: ";
    private static final String IMIA_REGEX = "Имя: ";
    private static final String OTCHESTVO_REGEX = "Отчество: ";

    public static void main(String[] args) {
        System.out.println("Введите ФИО");
        String fio = new Scanner(System.in).nextLine();

        if(fio.matches(VALID_REGEX)) {
            String[] words = fio.split(" ");
            System.out.println(FAMILIYA_REGEX + words[0]);
            System.out.println(IMIA_REGEX + words[1]);
            System.out.println(OTCHESTVO_REGEX + words[2]);

        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}