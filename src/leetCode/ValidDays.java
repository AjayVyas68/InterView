package leetCode;

public class ValidDays {
    public static void main(String[] args) {
        boolean check = true;
        int days = 0;
        while (check) {

            if (days >= 3) {
                check = false;

            }
            days++;
            System.out.printf("Days ->" + days);
        }

    }
}
