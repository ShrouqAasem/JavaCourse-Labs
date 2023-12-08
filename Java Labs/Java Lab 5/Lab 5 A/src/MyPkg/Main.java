package MyPkg;


public class Main {
    public static void main(String[] args) {


        if (args.length != 2) {
            System.out.println("Please Enter Two Strings to Compare");
        } else {
            String str1 = args[0];
            String str2 = args[1];
            String longestString = BetterString.betterStringFunction(str1, str2, (s1, s2) -> s1.length() > s2.length());
            System.out.println("The Longest String is " + longestString);
            String firstString = BetterString.betterStringFunction(str1, str2, (s1, s2) -> true);
            System.out.println("The First String is " + firstString);
        }
    }


}