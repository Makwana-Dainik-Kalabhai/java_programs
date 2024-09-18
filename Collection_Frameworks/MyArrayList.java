package Collection_Frameworks;

import java.util.*;

class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // list.add method
        list.add(2);
        list.add(6);
        
        // list.add method with index
        list.add(0,5);
        list.add(2, 3);
        
        ArrayList<Integer> l1 = new ArrayList(4);
        l1.add(11);
        l1.add(12);

        // list.addAll method
        list.addAll(l1);
        

        for(int e: list)
        {
            System.out.println(e);
        }
    }
}
