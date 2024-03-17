import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число ");
        String strD = sc.nextLine();
        char[] ch = new char[strD.length()];
        int index1 = 0;
        for (int i = 0; i < ch.length; i++) {
            if (strD.charAt(i) == '.' ) {
                index1 = i;
                System.out.println(index1);
            }
        }
        char[] ch2 = new char[strD.length()-index1-1];
        int index2 = 0;
        for (int i = index1+1;i<strD.length();i++){
            ch2[index2] = strD.charAt(i);
            index2++;
        }
        System.out.println(ch2);

    }
}