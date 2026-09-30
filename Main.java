public class Main {
    public static void main(String[] args) {
        String text = "J@va the be$t!123";
        int length = text.length();
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        boolean result1 = Character.isLetter('J');
        boolean result2 = Character.isLetter('@');
        boolean result3 = Character.isLetter('v');
        boolean result4 = Character.isLetter('a');
        boolean result5 = Character.isLetter(' ');
        boolean result6 = Character.isLetter('t');
        boolean result7 = Character.isLetter('h');
        boolean result8 = Character.isLetter('e');
        boolean result9 = Character.isLetter(' ');
        boolean result10 = Character.isLetter('b');
        boolean result11 = Character.isLetter('e');
        boolean result12 = Character.isLetter('$');
        boolean result13 = Character.isLetter('t');
        boolean result14 = Character.isLetter('!');
        boolean result15 = Character.isLetter('1');
        boolean result16 = Character.isLetter('2');
        boolean result17 = Character.isLetter('3');
        if (result1 == true) {
        left = 0;
        }
        else {
            continue;
        }
        if (result2 == true) {
        left = 1;
        }
        else {
            continue;
        }


        while (left < right) {
            char tmp = chars[left];     // меняем местами края
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }

        System.out.println(new String(chars));

        System.out.println(result1);
        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//        System.out.println(result5);
//        System.out.println(result6);
//        System.out.println(result7);
//        System.out.println(result8);
//        System.out.println(result9);
//        System.out.println(result10);
//        System.out.println(result11);
//        System.out.println(result12);
//        System.out.println(result13);
//        System.out.println(result14);
//        System.out.println(result15);
//        System.out.println(result16);
//        System.out.println(result17);
        }
}