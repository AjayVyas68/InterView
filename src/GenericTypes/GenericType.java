package GenericTypes;

public class GenericType<T> {
    T obj;

    public GenericType(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        GenericType<Integer> data=new GenericType<>(15);
        System.out.println(data.obj);
    }
}
