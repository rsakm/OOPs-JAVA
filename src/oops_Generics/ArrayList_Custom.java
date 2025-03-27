package oops_Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Custom {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public ArrayList_Custom(){
        this.data = new int[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size == data.length;
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;

    }

    private void resize() {
        int[] temp = new int[data.length*2];
        for(int i =0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }


    public  int remove(){
        int removed = data[--size];
        return removed;
    }

    public int getIndex(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public void display(){
        for (int i = 0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }

    public String toString(){
        return "CustomArrayList: {" + " data="+
                Arrays.toString(data)+", " +
                "size: "+size+ "}";
    }
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();

        ArrayList_Custom list = new ArrayList_Custom();
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(7);
        list.display();
        System.out.println();
        System.out.println(list);
        
    }
}
