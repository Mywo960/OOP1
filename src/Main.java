import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = new ArrayList<>();

        // Ввод строк до ввода пустой строки
        System.out.println("Введите строки. Для завершения введите пустую строку:");

        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            strings.add(input);
        }

        // Проверка, что введены хотя бы какие-то строки
        if (strings.isEmpty()) {
            System.out.println("Вы не ввели ни одной строки.");
            return;
        }

        // Вычисление средней длины
        int totalLength = strings.stream().mapToInt(String::length).sum();
        double averageLength = (double) totalLength / strings.size();

        // Вывод строк с длиной меньше средней и их длины
        System.out.println("\nСтроки с длиной меньше средней:");
        for (String str : strings) {
            if (str.length() < averageLength) {
                System.out.println(str + " - длина: " + str.length());
            }
        }

        scanner.close();
    }
}
