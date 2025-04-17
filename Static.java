public class Static {
    public static void main(String[] args) {
        Static2 s1 = new Static2("siki");
        s1.getName();                           //siki
        Static2 s2 = new Static2("koko");
//        Static2.getName();                      //koko
        s1.getName();                           //koko
        s2.getName();                           //koko

    }
}

class Static2 {
    public static String name;
    public static final String id = "id";

    Static2(String name) {
        Static2.name = name;
    }
    public void getName() {
        System.out.println(Static2.name);
    }

    public static void setName(String name) {
//        Static2.getName();
        Static2.name = name;
    }
}


