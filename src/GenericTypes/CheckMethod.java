package GenericTypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CheckMethod {
    public static void main(String[] args) {
        List data =new ArrayList();
        data.add(12);
        data.add(125);
        data.add(1);
        data.add("hello");
        data.add(2);
        data.add(10);

        iterater(data);
     }

    private static<T extends Collection> void iterater(T data) {
        Iterator<Integer> ch=data.iterator();
        while (ch.hasNext())
        {
            System.out.println(ch.next());
        }
    }
}
