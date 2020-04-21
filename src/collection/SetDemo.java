package collection;

import java.util.HashSet;
import java.util.Iterator;

// Set은 중복되면 안되고, 순서가 없다.

public class SetDemo {

    public static void main(String[] args){

        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
//        A.add(2);
//        A.add(2);
//        A.add(2);
        A.add(3);
        // ArrayList라면 add한 것은 다나옴 ex 1 2 2 2 2 3
        // HashSet은 123

//        Iterator hi = (Iterator) A.iterator();
//        while(hi.hasNext()){
//            System.out.println(hi.next());
//        }

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        // A = 1,2,3    B=1,2 A안에 B가 일부(3)들어있긴 하지만 전체가 들어가 있진 않다. B는 A의 부분집합이 아니다.
        // A = 1,2,3    C=1,2 A안에 C(1,2) 전체가 들어가 있다. C는 A의 부분집합니다.
        System.out.println(A.containsAll(B)); // false
        System.out.println(A.containsAll(C)); // true

        // A라는 집합에 B라는 집합의 내용을 합쳐서 A와 B를 합쳐서 A를 만든다. B 전체를 A에 add 한다. "합집합"
        //A.addAll(B);

        // 집합 A에도 있고 집합 B에도 있는 원소(값)을 A에다가 담겠다. "교집합"
        //A.retainAll(B);

        // 차집합
        A.removeAll(B);




        Iterator hi = (Iterator) A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }

}
