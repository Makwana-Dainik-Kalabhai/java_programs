import java.util.*;

//! Important:-
//* List & Set both are interfaces
//* Collection is Parent interface of List(Ordered), Set(unordered,with unique values)
//* Where ArrayList & HashSet is a class
//* ArrayList implements List interface
//* HashSet implements Set interface

class ListSet {
    public static void main(String[] args)
    {
        //* ArrayList implements List interface
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(5);

        Set<Integer> set = new HashSet<Integer>();
        set.add(6);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("List Elements...");
        for(int e: list)
        {
            System.out.print(" "+e);
        }

        System.out.println("\nSet Elements...");
        for(int e: set)
        {
            System.out.print(" "+e);
        }
    }
}