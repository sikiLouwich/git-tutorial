public class EnumClass {
    public static void main(String[] args) {
        Days d = Days.Sunday;
        System.out.println("Enum name: " + d.name());
    }
}

enum Days {
    Sunday("sun"),
    Monday("mon"),
    Tuesday("tue");


    // Constructor
    Days(String day) {
        System.out.println("Constructor called for: " + this.name());
        System.out.println("Passed value: " + day);
    }
}


