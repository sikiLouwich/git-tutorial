import java.util.HashSet;
import java.util.Set;

public class Wildcards {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add("siki");
        Counter(set);
        System.out.println(set);
        System.out.println(set.size());

    }

    public static void Counter(Set<?> set){
        int count = 0;
        for(Object o : set){
            count++;
        }
        System.out.println("Number of elements: " + count);
    }
}
