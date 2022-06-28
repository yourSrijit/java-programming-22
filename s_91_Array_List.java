package Collection_Framework_Addvanced_Java;


import java.util.ArrayList;
import java.util.Collections;

public class s_91_Array_List {
    public static void main(String[] args) {
//        ArrayList<int> al = ArrayList<int>(); <---does not work
        ArrayList<Integer> l1 =new ArrayList<>();
        //Add elements into the Array
        l1.add(5);
        l1.add(8);
        l1.add(9);
        l1.add(2);
        l1.add(2,6) ;//Add 6 at Index 2
        System.out.println(l1);

        //Get Elements
        System.out.println(l1.get(2));

        //Remove elements
        l1.remove(2);
        System.out.println(l1 );

        //  Searchinf

        System.out.println(l1.contains(80));  //,-- It returns True or False

        //Sorting
        Collections.sort(l1);
        System.out.println(l1);



    }
}
