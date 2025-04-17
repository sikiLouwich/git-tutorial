public class Final {
    public static void main(String[] args) {

    }

}

class Student {
    private final String name;
    private final int age;
    private final int[] arr;
    Student(String name, int age, int[] arr) {
        this.name = name;
        this.age = age;
        this.arr = arr;
    }

    public final String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int[] getArr() {
        return arr;
    }

    public void setArr(int num) {
        arr[10] = num;
    }
}

class StudentSon extends Student {
    public StudentSon(String name, int age, int[] arr) {
        super(name, age, arr);
    }
}

