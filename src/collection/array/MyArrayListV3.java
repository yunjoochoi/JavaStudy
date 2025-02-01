package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPASITY=5;

    private Object[] elementData;
    private int size=0;

    public MyArrayListV3(){
        elementData = new Object[DEFAULT_CAPASITY];
    }

    public MyArrayListV3(int initialCapasity){
        elementData=new Object[initialCapasity];
    }
    public int size(){
        return size;
    }

    public void add(Object ee){
        if(size==elementData.length){
            grow();
        }
        elementData[size++]=ee;
    }
    public void add(int index, Object ee){
        if(size==elementData.length){
            grow();
        }
        shiftRightFrom(index);
        elementData[index]=ee;
        size++;
    }
    public Object remove(int index){
        Object oldElement=elementData[index];
        shiftLeftFrom(index);
        size--;
        return oldElement;
    }
    private void shiftLeftFrom(int index){
        for (int i = index; i < size-1; i++) {
            elementData[i]=elementData[i+1];
        }
    }
    private void shiftRightFrom(int index){
        for (int i = size-1; i > index; i--) {
            elementData[i]=elementData[i-1];
        }
    }
    private void grow(){
        int newCapasity=size*2;
        elementData=Arrays.copyOf(elementData,newCapasity);
    }
    public Object get(int index){
        return elementData[index];
    }
    public Object set(int index,Object element){
        Object oldElement=elementData[index];
        elementData[index]=element;
        return oldElement;
    }
    public int indexOf(Object o){
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
