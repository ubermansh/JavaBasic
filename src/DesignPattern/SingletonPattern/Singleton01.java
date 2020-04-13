package DesignPattern.SingletonPattern;

public class Singleton01 {

    //인스턴스를 저장하기 위한 변수
    //  외부에서 직접 호출할 수 없도록 private로 선언
    private static Singleton01 uniqueInstance;

    // 생성자도 private로 선언하여 외부에서 호출할 수 없도록
    private Singleton01(){}

    // 클래스의 유일한 인스턴스를 반환하는 메서드
    public static Singleton01 getInstance(){
        if(uniqueInstance == null){ // 인스턴스가 존재하지 않는다면 생성
            uniqueInstance = new Singleton01();
        }
        return uniqueInstance;
    }

}
