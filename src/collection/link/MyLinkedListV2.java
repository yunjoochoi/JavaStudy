package collection.link;

public class MyLinkedListV2 {
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
    public void add(int index, Object e){
        Node newNode=new Node(e);
        if(index==0){
            newNode.next=first;
            first=newNode;
        } else{
            Node prev=getNode(index-1);
            newNode.next=prev.next;
            prev.next=newNode;
        }
        size++;
    }
    public Object remove(int index){
        Node indexNode=getNode(index);
        Object tmp=indexNode.item;
        if(index==0){
            first=first.next;
        } else{
            Node prev=getNode(index-1);
            prev.next=prev.next.next;
        }
        indexNode.next=null;
        indexNode.item=null;
        size--;

        return tmp;

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
