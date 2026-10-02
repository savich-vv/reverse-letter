public class Main {
    public static void main(String[] args) {
        String text = "J@va the be$t!123";
        int length = text.length();
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char c = text.charAt(left);

            if (Character.isLetter(c)) {
                char tmp = chars[left];
                chars[left] = chars[right];           // меняем местами края
                chars[right] = tmp;
                left++;                               // сдвигаем указатели навстречу
                right--;

                System.out.println("Буква: " + c);

            } else {
                continue;
//                System.out.println("Не буква: " + c);
            }
        }
        System.out.println(new String(chars));
    }
}