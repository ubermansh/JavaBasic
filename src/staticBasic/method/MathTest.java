package staticBasic.method;

public class MathTest {

    public static void main(String[] args){

        // 클래스 메서드 호출
        System.out.println("클래스 메서드 호출");
        System.out.println(Math.add(200L,100L));
        System.out.println(Math.substract(200L,100L));
        System.out.println(Math.multiply(200L,100L));
        System.out.println(Math.divide(200L,100L));
        System.out.println("----------");

        // 인스턴스 메서드 호출

        Math math = new Math();
        math.a=200L;
        math.b=100L;
        System.out.println("인스턴스 메소드 호출");
        System.out.println(math.add());
        System.out.println(math.subtract());
        System.out.println(math.multiply());
        System.out.println(math.divide());
        System.out.println("----------");

    }

}
