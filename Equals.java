public class Equals {
    public static void main(String[] args) {

    }
}

class A {
    private int[] arr;
    public A(int[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof A) {
            A a = (A) obj;
            if (this.arr.length != a.arr.length) {
                return false;
            }
            for (int i = 0; i < this.arr.length; i++) {
                if (this.arr[i] != a.arr[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}