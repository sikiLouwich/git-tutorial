import java.util.ArrayList;

public class ListCollection {
    public static void main(String[] args) {
        //List
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        list.add(6); // increase size
        System.out.println(list);
        list.remove(2); //remove at index 2
        System.out.println(list.size()); // size back to 5
        System.out.println(list);
    }
}
