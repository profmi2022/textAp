import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Введите текст: ");
        String text = scanner.next();

        TextWork textWork = new TextWork(text);

//      TextWork textWork = new TextWork("the quick brown fox jumps over the lazy dog");

        textWork.printMap();
    }
}