package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

    public static void main(String[] args){

        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(3);
        // ArrayList라면 add한 것은 다나옴 ex 1 2 2 2 2 3
        // HashSet은 123

        Iterator hi = (Iterator) A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B)); // false
        System.out.println(A.containsAll(C)); // true
    }

}