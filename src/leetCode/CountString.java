package leetCode;

public class CountString {


    public static void main(String[] args) {
        String check = "acb, ddfg,dfrfg ";
        int count = 0;
        for (int i = 0; i < check.length(); i++) {
            //      System.out.println(i +" "+check.charAt(i));
            if (check.charAt(i) == ',' || check.charAt(i) == ' ') {
                System.out.print(check.charAt(i));
                count++;
            } else {
                System.out.print(check.charAt(i));
            }


        }
        System.out.print(check.length() - count);
    }
}
