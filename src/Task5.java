import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово ");
        String str = sc.nextLine();
        char[] gb = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++)
            for (int j = 0; j < gb.length; j++) {
                if (ch[i] == gb[j]) {
                    count++;

                }
            }

        System.out.println("Кол-во согласных букв: " + count);
    }
}