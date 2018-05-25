package complete_submit;

import java.util.Random;

/**
 * Created by user on 4/3/17 15:39.
 */
public class StringUtils {
    private static Random generate = new Random();

    public static String randomString(int length) {
        String charsList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        int charLen = charsList.length();
        StringBuilder rString = new StringBuilder();

        for (int i = 0; i < length; i++){
            char rChar = charsList.charAt(generate.nextInt(charLen));
            rString.append(rChar);
        }
        return rString.toString();
    }

    public static String randomString(int length, String chars) {
        int charLen = chars.length();
        StringBuilder rString = new StringBuilder();

        for (int i = 0; i < length; i++){
            char rChar = chars.charAt(generate.nextInt(charLen));
            rString.append(rChar);
        }
        return rString.toString();
    }

    public static String randomRangeNumber(int min, int max) {
        int rNumber = generate.nextInt(max - min + 1) + min;
        return String.valueOf(rNumber);
    }

    public static String randomItems(String[] strArray) {
        String rItem = strArray[generate.nextInt(strArray.length)];
        return rItem;
    }

    static String randomItems(int[] intArray) {
        int rItem = intArray[generate.nextInt(intArray.length)];
        return String.valueOf(rItem);
    }
}
