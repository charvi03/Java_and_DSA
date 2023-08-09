package Array_List;

import java.util.ArrayList;

public class Basic_prog {
    public static void main(String[] args) {
        //Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        //adding
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());

        //print the arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        list.add(1, 9); //o(n)

        //get operation
        int element = list.get(2);
        System.out.println(element);

        //delete
        list.remove(2);
        System.out.println(list);

        //set operation
        list.set(1, 10);
        System.out.println(list);

        //contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
