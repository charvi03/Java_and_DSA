package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class sorting_arrlist {
    public static void main(String[] args) {
        //using collection class
        //ascending order
        ArrayList<Integer> list = new ArrayList<>();
        //adding
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);//ascending order
        System.out.println(list);
        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
