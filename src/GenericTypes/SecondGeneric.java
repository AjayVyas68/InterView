package GenericTypes;

public class SecondGeneric<T extends Number> {
    T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }




    public static void main(String[] args) {
        SecondGeneric<Integer> datya = new SecondGeneric<>();
        datya.setKey(02);
        System.out.println(datya.key);


    }

    private static void xyz(SecondGeneric<Integer> data) {
    }


}
