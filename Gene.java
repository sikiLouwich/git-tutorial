public class Gene {
    public static void main(String[] args) {
        Generics<Integer, String> generics_int = new Generics<>(7, "7");
        Generics<String, Integer> generics_string = new Generics<>("siki", 7);

        System.out.println(generics_int.getName());
        System.out.println(generics_string.getId());
    }

}


class Generics <T, X>{
    private T id;
    public X name;
    public Generics(T id, X name){
        this.id = id;
        this.name = name;
    }
    public T getId(){
        return id;
    }

    public X getName(){
        return name;
    }
}

class SonGene<T, X> extends Generics<T, X>{
    public SonGene(T id, X name){
        super(id, name);
    }
}

class anotherSonGene<T> extends Generics<T, Integer>{
    public anotherSonGene(T id, Integer name){
        super(id, name);
    }
}

