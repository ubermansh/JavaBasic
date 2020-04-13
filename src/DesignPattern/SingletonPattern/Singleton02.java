package DesignPattern.SingletonPattern;

public class Singleton02 {

    private Singleton02(){} // 생성자 외부 호출 안되게

    private static class LazyHolder {
        private static final Singleton02 instance = new Singleton02();
    }

        // getInstance 메소드를 실행하면 LazyHolder라는 클래스가 JVM에 올라간다.
        //  LazyHolder라는 클래스에서 멤버 변수 instance에 new Singleton02 연산이 실행되어 바인딩 된다.
    public static Singleton02 getInstance(){
        return LazyHolder.instance;
    }


}
