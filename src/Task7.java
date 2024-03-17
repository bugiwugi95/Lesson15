import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово ");
        String str = sc.nextLine();
        char[] gb = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++){
            for (char c : gb) {
                if (ch[i] == c) {
                    ch[i] = 'у';
                    break;
                }
            }
        }
           for (char s:ch){
               System.out.print(s);
           }


    }
}