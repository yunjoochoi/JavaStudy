package collection.link;

public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size=0;

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString(){
            Node x=this;
            StringBuilder sb=new StringBuilder( );
            sb.append("[");
            while(x!=null){
                sb.append(x.item);
                if(x.next!=null){
                    sb.append("->");
                }
                x=x.next;
            }
            sb.append("]");

            return sb.toString();
        }
    }
    public void add(E e){
        Node<E> NewNode=new Node<>(e);
        if(first==null){
            first=NewNode;
        } else{
            Node<E> lastNode=getLastNode();
            lastNode.next=NewNode;
        }
        size++;
    }
    public void add(int index, E e){
        Node<E> newNode=new Node<>(e);
        if(index==0){
            newNode.next=first;
            first=newNode;
        } else{
            Node<E> prev=getNode(index-1);
            newNode.next=prev.next;
            prev.next=newNode;
        }
        size++;
    }
    public E remove(int index){
        Node<E> indexNode=getNode(index);
        E tmp=indexNode.item;
        if(index==0){
            first=first.next;
        } else{
            Node<E> prev=getNode(index-1);
            prev.next=prev.next.next;
        }
        indexNode.next=null;
        indexNode.item=null;
        size--;
        
        return tmp;

    }
    private Node<E> getLastNode(){
        Node<E> x=first;
        while(x.next!=null){
            x=x.next;
        }
        return x;
    }
    public E set(int index, E element){
        Node<E> x=getNode(index);
        E oldValue=x.item;
        x.item=element;
        return oldValue;
    }
    public E get(int index){
        return getNode(index).item;
    }
    private Node<E> getNode(int index){
        Node<E> x=first;
        for (int i = 0; i < index; i++) {
            x=x.next;
        }
        return x;
    }
    public int indexOf(E o){
        int index=0;
        for (Node<E> i = first; i !=null; i=i.next) {
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
