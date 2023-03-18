//Ameer Ahmed

public class Main {

    public static boolean checkEnding(String str1, String str2) {
        if(str1.endsWith(str2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkEnding("abc", "b"));

    }
}