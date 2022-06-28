package Collection_Framework_Addvanced_Java;

import java.util.LinkedList;
import java.util.LinkedList;
public class s_92_Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1=  new LinkedList<Integer>();
        //Add elements into the Array
        l1.add(5);
        l1.add(8);
        l1.add(9);
        l1.add(2);
        l1.add(2,6) ;//Add 6 at Index 2
        System.out.println(l1);
        l1.addLast(256);
        System.out.println(l1);

        l1.addFirst(349);
        System.out.println(l1);


        System.out.println(l1.getFirst());
        l1.add(0,556);
        System.out.println(l1.removeFirst());

        l1.toArray();
        System.out.println(l1);
    }
    }

