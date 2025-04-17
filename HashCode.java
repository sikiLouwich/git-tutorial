import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Objects;

public class HashCode {
    public static void main(String[] args) {
        ArrayList<StudentHash> students = new ArrayList<>();
        StudentHash bob = new StudentHash(1222, "bob", "mail");
        StudentHash alice = new StudentHash(1222, "alice", "mail");
        StudentHash n_bob = bob;
        System.out.println(n_bob.hashCode());
        System.out.println(bob.hashCode());
        System.out.println(n_bob.equals(bob));
        System.out.println(n_bob.equals(alice));
        students.add(n_bob);
        students.add(alice);
        students.add(bob);
        System.out.println(students);
        System.out.println(students.contains(bob));
    }
}

class StudentHash {
    private final long id;
    private final String name;
    private final String email;
    StudentHash(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof StudentHash other)) {
            return false;
        }
        return this.id == other.id && this.name.equals(other.name) && this.email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}