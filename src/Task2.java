import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        System.out.println("Введите 5 слов: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();

        }

        for (String s : str) {
            System.out.print(s.charAt(0));
        }


    }
}