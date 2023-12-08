package MyPkg;

import java.util.function.BiPredicate;

public class BetterString {
    public static String betterStringFunction(String str1, String str2, BiPredicate<String, String> biPredicate) {
        if (biPredicate.test(str1, str2)) {
            return str1;
        } else {
            return str2;
        }
    }
}
