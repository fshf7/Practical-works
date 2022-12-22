public class Task3<T extends String, V extends Animal, K extends Number>{
    private T t;
    private V v;
    private K k;

    public Task3(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void show(){
        System.out.println("Object of T type: " + t.getClass().getName() + "   value: " + t);
        System.out.println("Object of V type: " + v.getClass().getName() + "   value: " + v.getName());
        System.out.println("Object of K type: " + k.getClass().getName() + "   value: " + k);
    }

    public static void main(String[] args){
        Task3<String, Cat, Integer> task3 = new Task3<>("Hello",new Cat("Jonny"), 87);
        task3.show();
        System.out.println();
        System.out.println(task3.t.compareTo("Java"));
    }
}