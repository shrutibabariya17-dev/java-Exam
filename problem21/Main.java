import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String keyword = sc.nextLine();

        String trimmed = sentence.trim();
        String[] words = trimmed.split(" +");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(words[i].toLowerCase());
        }

        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        int wordCount = words.length;
        String shortestWord = words[0].toLowerCase();
        int keywordCount = 0;
        int vowelCount = 0;

        for (String word : words) {
            String lowerWord = word.toLowerCase();

            if (lowerWord.length() < shortestWord.length()) {
                shortestWord = lowerWord;
            }

            if (lowerWord.equals(keyword.toLowerCase())) {
                keywordCount++;
            }
        }

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Sentence: " + sb);
        System.out.println("Words: " + wordCount);
        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Vowels: " + vowelCount);

        sc.close();
    }
}