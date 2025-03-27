package oops_Generics;

import java.util.Arrays;

public class GenericArrayList_Custom<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public GenericArrayList_Custom(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        for (int i =0;i<size;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed =(T) data[--size];  //// data is of Object type so we are casting it into a smaller type T

        return removed;
    }

    private boolean isfull() {
        return size == data.length;
    }

    public T getIndex(int index){
        return ((T)data[index]);
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public int size(){
        return size;
    }


    public String toString(){
        return "CustomArrayList: {" + " data="+
                Arrays.toString(data)+", " +
                "size: "+size+ "}";
    }
}
