import java.util.Scanner;

public class StringChange {
    static Scanner scn = new Scanner(System.in);


    public static void main(String[] args) {
        StringChange.scennerInput();

    }

    private static void scennerInput() {
        System.out.println("enter your first String ->");
        String str1 = scn.next();
        System.out.println("enter your first String ->");
        String str2 = scn.next();
        isRotation(str1, str2);
    }

    private static boolean isRotation(String str1, String str2) {
        System.out.println((str1 + str1).contains(str2));
        return (str1.length() == str2.length()) && ((str1.concat(str1)).contains(str2));
    }
}
