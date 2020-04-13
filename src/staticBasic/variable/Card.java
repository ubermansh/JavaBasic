package staticBasic.variable;

public class Card {

    String kind; // 카드의 무늬 - 인스턴스 변수
    int number;  // 카드의 숫자 - 인스턴스 변수

    static int width = 100; // 카드의 폭 - 클래스 변수
    static int height = 250; // 카드의 높이 - 클래스 변수

    // Card 인스턴스는 자신만의 무늬, 숫자를 갖고 있어야 하므로 인스턴스 변수 선언
    // Card들의 폭, 높이는 모든 인스턴스가 공통적으로 같은 값을 유지해야하므로 클래스 변수 선언
    //  만약 카드 폭이나 높이가 변경 해야 할 때는
    //      모든 카드의 width, height를 변경하지 않고 하나의 카드 값만 변경해도 모든 카드의 width, height가 변경된다.

}
