package generic.test.ex2;

public class Pair <K,V>{
    private K key;
    private V val;

    public void setFirst(K key){
        this.key=key;
    }
    public void setSecond(V val){
        this.val=val;
    }

    public K getFirst(){
        return key;
    }
    public V getSecond(){
        return val;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", val=" + val +
                '}';
    }
}
