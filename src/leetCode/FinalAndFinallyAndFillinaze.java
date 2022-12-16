package leetCode;

public class FinalAndFinallyAndFillinaze {
    public void checkFinal()
    {
        int a= 5;
        final int b =6;
        a++;
        System.out.printf("a ->" +a);
    }

    public static void main(String[] args) {
        new FinalAndFinallyAndFillinaze().checkFinal();
    }
}
 class aa
{
   final boolean chekc(){
        return true;
    }

}
class bb extends aa{
//    boolean chekc(){  // get a compile  time  error can't extend since  it is final
//        return  true;
//    }

}
final class G {

    // by default it is final.
    void h() {}

    // by default it is not final.
    static int j = 30;

    public static void main(String[] args)
    {
        // See modified contents of variable j.
        j = 36;
        System.out.println(j);
    }
}
