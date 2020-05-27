

public class Asdae {
    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
    public static void main(String[] args) {
        String asd="asdfghjkl";
        reverse(asd);
        System.out.println(asd);

    }
}
