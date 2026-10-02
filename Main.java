public class Main {
    public static void main(String[] args) {
        String text = "J@va the be$t!123";
        int length = text.length();
//        System.out.println(length);
        char[] chars = text.toCharArray();
//        System.out.println(chars);
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                char tmp = chars[left];
                chars[left] = chars[right];           // меняем местами края
                chars[right] = tmp;
                left++;
                right--;                              // сдвигаем указатели навстречу
            } else {
                if (!Character.isLetter(chars[left])) {
                    left++;
                }
                if (!Character.isLetter(chars[right])) {
                    right--;
                }
            }
        }
        System.out.println(new String(chars));
    }
}