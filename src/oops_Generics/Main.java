package oops_Generics;

public class Main {
    public static void main(String[] args) {
        GenericArrayList_Custom<Integer> list = new GenericArrayList_Custom<>();

        list.add(2);
        list.add(5);
        list.add(8);
        list.add(11);
        list.add(14);

        System.out.println(list);

        WildCardExample<Integer> list2 = new WildCardExample<>();



//        WildCardExample<String> = new WildCardExample<>();  /// It is a wildCArd restricted ton Number class only
//        // so String array list initialization is impossible.

    }
}
