import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Wildcards {
    public static void main(String[] args) {
        Set<A_> set = new HashSet<>();
        B_ b = new B_(1, 2);
        A_ a = new A_(1);
        Object o = new B_(1,1);
//        B_ bo = (B_) o;
//        set.add(o);
        set.add(a);
        set.add(b);
        Counter(set);
        System.out.println(set);
        System.out.println(set.size());
        List<? super Integer> list = new ArrayList<Number>();
        list.add(5);
//        Integer x = list.get(0); // ❓
    }

    public static void Counter(Set<? super A_> set){
        int count = 0;
        for(Object o : set){
            count++;
        }
        System.out.println("Number of elements: " + count);
    }





}

class A_{
    private int a;
    public A_(int a){
        this.a = a;
    }
}

class B_ extends A_{
    private int b;
    public B_(int a, int b){
        super(a);
        this.b = b;
    }
}


