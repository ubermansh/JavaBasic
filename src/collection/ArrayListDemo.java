package collection;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){

        // 배열
        String[] arrayObj = new String[2]; // 배열 방이 두개
        arrayObj[0] = "one";
        arrayObj[1] = "two";
//        arrayObj[2] = "three"; // 오류가 발생한다. // ArrayIndexOutOfBoundsException

        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }

        // Collection 중 하나인 ArrayList // 배열과 비슷한 일을 처리할 수 있다.
        // 배열과는 다르게 ArrayList를 생성할 때 몇개의 값을 만들지 지정하지 않아도 된다.
//        ArrayList al = new ArrayList();
//        al.add("one");
//        al.add("two");
//        al.add("three");
//        for(int i=0; i<al.size(); i++){
//            String value = (String)al.get(i); // "i"는 Object 타입이기때문에 String으로 형 변환
//            System.out.println(value);
//        }

        // 위는 옛날방식 아래것으로 사용
        ArrayList<String> al = new ArrayList();
        al.add("one");
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
            String value = al.get(i);
            System.out.println(value);
        }


    }

}
