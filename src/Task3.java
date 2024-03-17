public class Task2 {
    public static void main(String[] args) {
        int x = 1020320010;
        String str = String.valueOf(x);
        int zero = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') {
                zero++;

            }

        }

        System.out.println("Кол-во нулей " + zero + " из числа " + x);


    }
}