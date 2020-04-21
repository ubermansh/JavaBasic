package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// iterator 안에는 3가지 메소드( hasNext, next, remove)

public class IteratorDemo {

    public static void main(String[] args){

        //HashSet은 컬렉션 인터페이스를 구현하고 있는 클래스이기 때문에 iterator라는 메소드를 사용할 수 있다.
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);

        Iterator hi = A.iterator(); // 1,2,3을 갖고있는 A.iterator의 리턴값은 Iterator 데이터타입을 갖고 있는 hi라는 객체 반환
        while(hi.hasNext()){ // hi 안에 들어가있는 값들이 '존재'하는지 확인 (1,2,3이 들어가있기때문에 true)
            System.out.println(hi.next()); // hi.next() 들어가있는 값중에 하나를 리턴 해준다. 리턴해주면서 hi안에 있던 값(실제 데이터X)은 사라진다.
        }


        ArrayList<Integer> B = new ArrayList<Integer>();
        B.add(1);
        B.add(2);
        B.add(3);

        Iterator hi1 = A.iterator();
        while(hi1.hasNext()){
            System.out.println(hi1.next());
        }

        // new ArrayList, new Hashset 둘다 가능
        // 해쉬셋이나 어레이리스트나 똑같이 Collection이라고하는 인터페이스를 구현하고 있고
        // 이 인터페이스에는 Iterator라는 공통적인 API가 존재하기 때문에 데이터 타입을 Collection으로 사용 가능
        Collection<Integer> C = new ArrayList<Integer>(); // new HashSet으로 바꿔도 똑같음.
        C.add(1);
        C.add(2);
        C.add(3);

        Iterator hi2 = C.iterator();

        while(hi2.hasNext()){
            System.out.println(hi2.next());
        }

    }

}
