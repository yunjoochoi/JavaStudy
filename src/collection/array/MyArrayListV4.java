package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPASITY=5;

    private Object[] elementData;
    private int size=0;

    public MyArrayListV4(){
        elementData = new Object[DEFAULT_CAPASITY];
    }

    public MyArrayListV4(int initialCapasity){
        elementData=new Object[initialCapasity];
    }
    public int size(){
        return size;
    }

    public void add(E ee){
        if(size==elementData.length){
            grow();
        }
        elementData[size++]=ee;
    }
    public void add(int index, E ee){
        if(size==elementData.length){
            grow();
        }
        shiftRightFrom(index);
        elementData[index]=ee;
        size++;
    }
    public E remove(int index){
        E oldElement=get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size]=null;
        return oldElement;
    }
    private void shiftLeftFrom(int index){
        for (int i = index; i < size-1; i++) {
            elementData[i]=elementData[i+1];
        }
    }
    private void shiftRightFrom(int index){
        for (int i = size; i > index; i--) {
            elementData[i]=elementData[i-1];
        }
    }
    private void grow(){
        int newCapasity=size*2;
        elementData=Arrays.copyOf(elementData,newCapasity);
    }
    @SuppressWarnings("unchecked")
    public E get(int index){
        return (E) elementData[index];
    }
    public E set(int index,E element){
        E oldElement=get(index);
        elementData[index]=element;
        return oldElement;
    }
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData,size))+ " size=" + size + ", capacity=" + elementData.length;  
    }
}
