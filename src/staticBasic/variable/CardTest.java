package staticBasic.variable;

public class CardTest {

    public static void main(String [] args){

        System.out.println("클래스 변수를 인스턴스없이 사용");
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        System.out.println("-------------------------------");

        Card c1 = new Card();
        c1.kind="Heart";
        c1.number=7;

        Card c2 = new Card();
        c2.kind="Spade";
        c2.number=4;

        System.out.println("인스턴스 변수에 카드 종류와 숫자 넣어주기");
        System.out.println("c1은" +  c1.kind + c1.number + "이며, 크기는(" + c1.width + "," + c1.height + ")" );
        System.out.println("c2는" +  c2.kind + c2.number + "이며, 크기는(" + c2.width + "," + c2.height + ")" );
        System.out.println("-------------------------------");

        System.out.println("클래스변수 변경");
        c1.width = 50;
        c1.height = 80;
        System.out.println("c1은" +  c1.kind + c1.number + "이며, 크기는(" + c1.width + "," + c1.height + ")" );
        System.out.println("c2는" +  c2.kind + c2.number + "이며, 크기는(" + c2.width + "," + c2.height + ")" );


}

}
