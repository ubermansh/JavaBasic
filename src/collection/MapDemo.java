package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    // KEY값 중복허용X, VALUE값 중복허용O

    public static void main(String [] args){
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("one", 1); // a라고 하는 map 컨테이너에 데이터를 추가하는데 "one" key값, 1 value 값
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));

        iteratorUsingForEach(a);
        iteratorUsingIterator(a);

    }


    //entrySet Set데이터 타입의 어떤 객체가 리턴되는데 entries에 담김
    static void iteratorUsingForEach(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()){
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
