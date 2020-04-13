package staticBasic.reference;

import jdk.nashorn.internal.codegen.CompilerConstants;

class CallMember {
// 클래스 멤버와 인스턴스 멤버간 참조와 호출
//  같은 클래스에 속한 멤버들간에는 별도 인스턴스를 생성하지 않고도 서로 참조 또는 호출이 가능하다
//      단, 클래스 멤버가 인스턴스 멤버를 참조 또는 호출하고자 하는 경우엔 인스턴스를 생성해야 한다.
//          이유는 인스턴스멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만,
//              클래스 멤버가 존재하는 시점에 인스턴스 멤버가 항상 존재한다는 것을 보장할 수 없기 때문이다.

    int iv = 10;
    static int cv = 20;

    int iv2 = cv; // 인스턴스 변수는 클래스 변수를 사용 가능
//  static int cv2 = iv; // 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음.
    static int cv2 = new CallMember().iv; // 굳이 사용하려면 이처럼 객체를 생성해야 함

    static void classMethod1(){
        System.out.println(cv);
//        System.out.println(iv); //에러. 클래스(static)메서드에서 인스턴스 변수를 바로 사용할 수 없음
        CallMember c = new CallMember();
        System.out.println(c.iv); // 객체를 생성 후에 인스턴스 변수의 참조가 가능
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv); // 인스턴스 메소드에서는 인스턴스 변수 바로 사용 가능
    }

    static void calssMethod2(){
        classMethod1();
//        instanceMethod1(); // 에러. 클래스 메소드에서는 인스턴스 메소드 바로 호출 불가능
        CallMember c = new CallMember();
        c.instanceMethod1(); // 인스턴스를 생성 후에 인스턴스 메소드 호출 가능
    }

    void instanceMethod2(){
        classMethod1();
        instanceMethod1();
        // 인스턴스 메소드에서는 인스턴스 메소드와 클래스 메소드 모두 인스턴스 객체 생성 없이 사용 가능
    }





}
