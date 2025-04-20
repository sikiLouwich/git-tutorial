class Singleton {
    private static Singleton instance;
    private Singleton() {

    }
    public static Singleton get(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

class sss{
    private static int x;
    sss(int x){
        this.x = x;
    }

}