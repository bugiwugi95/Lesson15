import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] gb = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        System.out.println("Введите слово ");
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++)
            for (int j = 0; j < gb.length; j++) {
                if (ch[i] == gb[j] && str.charAt(0) == gb[j]) {
                    System.out.println("Первая гласная буква : " + gb[j]);
                }
            }


    }
}