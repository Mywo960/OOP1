import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        String[] words = input.toLowerCase().split("\\s+");


        boolean is_words = false;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isReverse(words[i], words[j])) {
                    System.out.println(words[i] + " и " + words[j]);
                    is_words = true;
                }
            }
        }
        if(!is_words) {
            System.out.print("Нет таких слов");
        }

    }

    public static boolean isReverse(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(word2.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}