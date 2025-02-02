package collection.link;

public class MyLinkedListV1 {
    private Node first;
    private int size=0;

    public void add(Object e){
        Node NewNode=new Node(e);
        if(first==null){
            first=NewNode;
        } else{
            Node lastNode=getLastNode();
            lastNode.next=NewNode;
        }
        size++;
    }
    private Node getLastNode(){
        Node x=first;
        while(x.next!=null){
            x=x.next;
        }
        return x;
    }
    public Object set(int index, Object element){
        Node x=getNode(index);
        Object oldValue=x.item;
        x.item=element;
        return oldValue;
    }
    public Object get(int index){
        return getNode(index).item;
    }
    private Node getNode(int index){
        Node x=first;
        for (int i = 0; i < index; i++) {
            x=x.next;
        }
        return x;
    }
    public int indexOf(Object o){
        int index=0;
        for (Node i = first; i !=null; i=i.next) {
            if(o.equals(i.item)){
                return index;
            }
            index++;
        }
        return -1;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
