public class Task<T, V, K> {
    private T t;
    private V v;
    private K k;

    public Task(T t, V v, K k) {
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

    public void display(){
        System.out.println("Object of T type: " + t.getClass().getName() + "   value: " + t);
        System.out.println("Object of V type: " + v.getClass().getName() + "   value: " + v);
        System.out.println("Object of K type: " + k.getClass().getName() + "   value: " + k);
    }

    public static void main(String[] args){
        Task<Integer, Boolean, String> task = new Task<>(20, true,"Java");
        task.display();
    }
}
